/**@purpose Create the ticket booth that will sell tickets and concessions to customers
 * @author Chloe Jones
 * @author Faye Landers
 * @date 12/03/22
 */
package Movies;

import java.util.Hashtable;
import java.util.Scanner;

public class TicketBooth implements Observer<MovieEvent> {
    private static final TicketBooth instance = new TicketBooth();

    private TicketBooth() {
    }

    public static TicketBooth getTicketBooth() {
        return instance;
    }

    @Override
    public void handle(PropertyChangedEvent args) {
        if (args.propertyName == "soldOut") {
            boolean newRating = ((Boolean) args.newValue).booleanValue();
            if (newRating == true) {
                //we can later agree on how we will handle a sold out movie.
                System.out.println("SOLD OUT! " +args.subject);
            }
        }
    }

    /**@purpose Talk to the customer about what they would like to purchase (Movie tickets and concessions)
     * 
    */
    public void ticketBoothWorker(){
        Scanner userInput = new Scanner(System.in);

        System.out.println("Welcome to the Movie Theater! We have a variety of movies to show. Would you like to see a movie? ");
        String userSays = userInput.nextLine();

        do{
            String filename = "D:\\OOD\\Projects\\Final\\MovieTheater\\src\\Movies\\default_schedule.txt"; //read in file
            MovieTheater mt= new MovieTheater(filename); //create theater
            Hashtable<String, MovieEvent> schedule = mt.getSchedule();  //create schedule

            System.out.println("\nHere is the Movie Schedule: ");
            displaySchedule(schedule);

            System.out.println("\nWhat would you like to purchase a ticket for (enter 1-5): ");
            userSays = userInput.nextLine();

            System.out.println("\nWould you like to purchase 1. a regular ticket or 2. a student ticket: ");
            String studentInfo = userInput.nextLine();
            boolean studentTrue = false;
            if(studentInfo.equals("1")){
                studentTrue = false;
            }
            else if(studentInfo.equals("2")){
                studentTrue = true;
            }
            else{
                studentTrue = false;
            }


            //find the movie event that matches that number and give it to the sell tickets function
            if(userSays.equals("1")){
                MovieEvent userChoice = schedule.get("Cinderella_4:30-6:15");
                sellTickets(userChoice, studentTrue);
            }
            else if(userSays.equals("2")){
                MovieEvent userChoice = schedule.get("Sorry To Bother You_10:35-12:10");
                sellTickets(userChoice, studentTrue); //make sure this is a restricted ticket automatically 
            }
            else if(userSays.equals("3")){
                MovieEvent userChoice = schedule.get("Cinderella_5:00-6:45");
                sellTickets(userChoice, studentTrue);
            }
            else if(userSays.equals("4")){
                MovieEvent userChoice = schedule.get("Fast and Furious_6-7:50");
                sellTickets(userChoice, studentTrue); //make sure this is a restricted ticket automatically
            }
            else if(userSays.equals("5")){
                MovieEvent userChoice = schedule.get("Shrek_11:15-1:10");
                sellTickets(userChoice, studentTrue);
            }
            else{
                System.out.println("\nPlease choose a valid schedule listing.");
            }

            //check if they would like to continue purchasing tickets
            System.out.println("\nWould you like to continue purchasing tickets? (y to continue, n to stop): ");
            userSays = userInput.nextLine();


        }while(userSays.equals("y"));

        //see what concessions the customer is interested in buying
        String continueConcessions = "y";
        do{
            System.out.println("\nOur Movie Theater proudly serves concessions for your convienience during the movie.");
            System.out.println("\nWould you like to purchase concessions (y for yes, n for no): ");
            String concessionsAnswer = userInput.nextLine();
            if(concessionsAnswer.equals("y")){
                displayConcessionsMenu(); //display concessions menu
                
                System.out.println("\nWould you like to purchase 1. Soda, 2.Candy, or 3.Popcorn: ");
                concessionsAnswer = userInput.nextLine();

                //sell the concession based on user input
                if(concessionsAnswer.equals("1")){
                    sellConcessions("Soda");
                }
                else if(concessionsAnswer.equals("2")){
                    sellConcessions("Candy");
                }
                else if(concessionsAnswer.equals("3")){
                    sellConcessions("Popcorn");
                }
                else{
                    System.out.println("\nPlease choose a valid concession. ");
                }
            }
            System.out.println("\nWould you like to buy more concessions (y = yes, n = no): ");
            continueConcessions = userInput.nextLine();

        }while(continueConcessions.equals("y"));

        //Now that the user has bought their tickets and concessions it is time to calculate their order
        System.out.println("\nYou have the following items in your cart: ");
        displayTotalOrder(); //display the receipt

        System.out.println("\nWould you like to pay now or upon arrival at the Movie Theater? (Please enter: now or later) ");
        String payChoice = userInput.nextLine();
        if(payChoice.equalsIgnoreCase("now")){
            System.out.println("Please enter your credit card number: ");
            String cardInfo = userInput.nextLine(); //this will not actually be used, but it would store card info if payment was actually needed
        }
        else if(payChoice.equalsIgnoreCase("later")){
            System.out.println("\nPlease refer to your order number to pick up your tickets at the movie theater");
        }
        else{
            System.out.println("Please enter a valid answer.");
        }

        System.out.println("Thank you for supporting your local movie theater.  We hope you enjoy your movie!");


        userInput.close();

    }

    /**@purpose Display the movie schedule
     * TODO can be changed to be displayed however
     * @param schedule Hashtable<String, MovieEvent> the movie schedule
     */
    public void displaySchedule(Hashtable<String, MovieEvent> schedule){
        System.out.println("Movie Schedule: ");
        int i = 1;
        for(MovieEvent mv: schedule.values()){
            System.out.println(i + "." + mv); //print schedule
            i++;
        }

    }

    /**@purpose Sell a ticket of a given movie
     * @param movie MovieEvent, a movie showing that a customer is attempting to buy a ticket of
     * @param studentTicket boolean, returns true if the customer indicated they would like to buy a student
     *                      ticket instead of a regular ticket
     * TODO
     */
    public void sellTickets(MovieEvent movie, boolean studentTicket){
        System.out.println("I sell tickets.");
    }

    /**@purpose display the concessions available for purchase
     * TODO
     */
    public void displayConcessionsMenu(){
        System.out.println("Here are the concessions");
    }

    /**@purpose Sell the concessiosn
     * @param concessionType String, the type of concession the customer would like to purchase ("Candy", "Popcorn", "Soda")
     * TODO
     */
    public void sellConcessions(String concessionType){
        System.out.println("I sell the concessions. ");

    }

    /**@purpose Display the customer's total order (with all concessions and tickets about to be purchased) 
     * TODO
    */
    public void displayTotalOrder(){
        System.out.println("Here is your total order");
        //Give it a fake order number on top of the receipt (I told them to look for order number to pick up tickets)

        //calculate final order price by adding together each of the items in list of tickets and list of concessions
        //all prices should be accessible
    }

    public static void main(String[]  args){
        //Demo ticketBooth
        TicketBooth tb = new TicketBooth();
        tb.ticketBoothWorker();
    }
}


/***
 * used this code to cast Object to boolean:
 * https://stackoverflow.com/questions/2206598/how-to-cast-object-to-boolean
 */