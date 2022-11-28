/**@purpose Define what a Student Ticket consists of
 * @author Faye Landers
 * @date 11/21/22
 */
package Tickets;

public class Student implements Ticket {
    double price;
    String movie;

    public Student(String movie){
        this.movie = movie;
        this.price = 5;
    }

    public String getMovie(){
        return movie;
    }

    public void setPrice(double newPrice){
        this.price= newPrice;
    }

    public double getPrice(){
        return price;
    }
    
    public String toString(){
        return "This is a Student Ticket, with a price of $" + this.getPrice() + " for the movie, \"" + this.getMovie();
    }

    public String getTicketInfo(){
        return "This is a Student Ticket, with a price of $" + this.getPrice() + " for the movie, \"" + this.getMovie();
    }
}
