/**@purpose Define what a Student Ticket consists of
 * @author Faye Landers
 * @date 11/21/22
 */
package Tickets;

import Movies.*;

public class Student implements Ticket {
    double price;
    MovieEvent movie;

    public Student(MovieEvent movie){
        this.movie = movie;
        this.price = 5;
    }

    public MovieEvent getMovie(){
        return movie;
    }

    public String getMovieTitle(){
        return this.movie.getTitle();
    }

    public String getMovieTime(){
        return this.movie.getMovieTime();
    }

    public void setPrice(double newPrice){
        this.price= newPrice;
    }

    public double getPrice(){
        return price;
    }
    
    public String toString(){
        return "This is a Student Ticket, with a price of $" + this.getPrice() + " for the movie, \"" + this.getMovieTitle() + "\" at " + this.getMovieTime();
    }

    public String getTicketInfo(){
        return "This is a Student Ticket, with a price of $" + this.getPrice() + " for the movie, \"" + this.getMovie();
    }
}
