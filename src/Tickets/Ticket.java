/**@purpose Define what a Ticket consists of
 * @author Faye Landers
 * @date 11/21/22
 */
package Tickets;

public interface Ticket{

    public double getPrice();

    public String getMovie();

    public void setPrice(double newPrice);
    
    public String getTicketInfo();

}