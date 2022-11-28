/**@purpose Create a restricted ticket (Ticket that requires an ID check due to a rating)
 * @author Faye Landers
 * @date 11/22/22
 * 
 */
package Tickets;

public class Restricted implements Ticket{

    Ticket movieTicket;
    String movie;
    double price;
    boolean idChecked;

    public Restricted(Ticket movieTicket){
        this.movieTicket = movieTicket;
        idChecked = checkGuestID();
        this.movie = movieTicket.getMovie();
        this.price = movieTicket.getPrice();
        
    }

    public void setPrice(double newPrice){
        this.price = newPrice;
    }

    public double getPrice(){
        return this.price;
    }

    public String getMovie(){
        return this.movie;
    }

    /**@purpose check a movie theater guest's ID to check if they are of age to see a movie with a specific rating
     * @return true, to show that the guest's ID has been checked/verified 
     */
    public boolean checkGuestID(){
        System.out.println("We are now checking your ID....");
        System.out.println("Your ID has been verified.");
        return true;
    }

    
    public String toString(){
        return "This is a Restricted Ticket, with a price of $" + this.getPrice() + " for the movie, \"" + this.getMovie();
    }

    public String getTicketInfo(){
        return "This is a restricted ticket, with a price of $" + this.getPrice() + " for the movie, \"" + this.getMovie();
    }
}
