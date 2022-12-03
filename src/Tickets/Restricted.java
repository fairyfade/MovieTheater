/**@purpose Create a restricted ticket (Ticket that requires an ID check due to a rating)
 * @author Faye Landers
 * @date 11/22/22
 * 
 */
package Tickets;

import Movies.*;

public class Restricted implements Ticket{

    Ticket movieTicket;
    MovieEvent movie;
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

    public MovieEvent getMovie(){
        return this.movie;
    }

    public String getMovieTime(){
        return this.movie.getMovieTime();
    }
    public String getMovieTitle(){
        return this.movie.getTitle();
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
        return "This is a Restricted Ticket, with a price of $" + this.getPrice() + " for the movie, \"" + this.getMovieTitle() + "\" at " + this.getMovieTime();
    }

    public String getTicketInfo(){
        return "This is a restricted ticket, with a price of $" + this.getPrice() + " for the movie, \"" + this.getMovieTitle();
    }
}
