/**@purpose Define what a Regular Ticket consists of
 * @author Faye Landers
 * @date 11/21/22
 */
package Tickets;

import Movies.*;

public class Regular implements Ticket{

    double price;
    MovieEvent movie;

    public Regular(MovieEvent movie){
        this.movie = movie;
        this.price = 7;
    }

    public MovieEvent getMovie(){
        return this.movie;
    }

    public String getMovieTitle(){
        return this.movie.getTitle();
    }

    public String getMovieTime(){
        return this.movie.getMovieTime();
    }

    public void setPrice(double newPrice){
        this.price = newPrice;
    }

    public double getPrice(){
        return this.price;
    }
    
    public String toString(){
        return "This is a Regular Ticket, with a price of $" + this.getPrice() + " for the movie, \"" + this.getMovieTitle() + "\" at " + this.getMovieTime();
    }

    public String getTicketInfo(){
        return "This is a regular ticket, with a price of $" + this.getPrice() + " for the movie, \"" + this.getMovieTitle();
    }
}
