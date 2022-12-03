/**@purpose Define what an Imax Ticket consists of
 * @author Faye Landers
 * @date 11/21/22
 */
package Tickets;

import Movies.*;

public class Imax implements Ticket{
    Ticket movieTicket;
    double price;
    MovieEvent movie;
    
    public Imax(Ticket movieTicket){
        this.movieTicket = movieTicket;
        this.price = movieTicket.getPrice() + 5;
        this.movie = movieTicket.getMovie();
        
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

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double newPrice){
        this.price = newPrice;
    }

    public String toString(){
        return "This is an Imax Ticket, with a price of $" + this.getPrice() + " for the movie, \"" + this.getMovieTitle() + "\" at " + this.getMovieTime();
    }

    public String getTicketInfo(){
        return "This is an Imax ticket, with a price of $" + this.getPrice() + " for the movie, \"" + this.getMovieTitle();
    }
}
