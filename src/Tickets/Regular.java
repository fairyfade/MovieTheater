/**@purpose Define what a Regular Ticket consists of
 * @author Faye Landers
 * @date 11/21/22
 */
package Tickets;

public class Regular implements Ticket{

    double price;
    String movie;

    public Regular(String movie){
        this.movie = movie;
        this.price = 7;
    }

    public String getMovie(){
        return this.movie;
    }

    public void setPrice(double newPrice){
        this.price = newPrice;
    }

    public double getPrice(){
        return this.price;
    }
    
    public String toString(){
        return "This is a Regular Ticket, with a price of $" + this.getPrice() + " for the movie, \"" + this.getMovie();
    }

    public String getTicketInfo(){
        return "This is a regular ticket, with a price of $" + this.getPrice() + " for the movie, \"" + this.getMovie();
    }
}
