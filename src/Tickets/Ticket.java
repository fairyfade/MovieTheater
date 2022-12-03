/**@purpose Define what a Ticket consists of
 * @author Faye Landers
 * @date 11/21/22
 */
package Tickets;

import Movies.*;

public interface Ticket{

    public double getPrice();

    public MovieEvent getMovie();

    public String getMovieTitle();

    public String getMovieTime();

    public void setPrice(double newPrice);
    
    public String getTicketInfo();

}