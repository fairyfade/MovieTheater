/**@purpose Define what a Sale Ticket consists of
 * @author Faye Landers
 * @date 11/21/22
 */
package Tickets;

public class Sale implements Ticket{
    
    Ticket movieTicket;
    String movie;
    double price;
    double saleDecimal; //sale "percentage off" in decimal for (for example 20% off would be represented as 0.2)

    public Sale(Ticket movieTicket, double saleDecimal){
        this.movieTicket = movieTicket;
        this.saleDecimal = saleDecimal;
        this.price = movieTicket.getPrice();
        this.price = setSalePrice(saleDecimal, price );
        this.movie = movieTicket.getMovie();
    }

    public String getMovie(){
        return this.movie;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double newPrice){
        this.price = newPrice;
    }

    /**@purpose Adjust ticket price based on the amount of the sale (for example 20% or 50% off)
     * @param saleDecimal double, the decimal representation of the percentage of a sale (for example 20% = 0.2)
     * @param price double, the price of the ticket before the sale
     * @return newPrice, the new price after it has been adjusted for the sale
     */
    public double setSalePrice(double saleDecimal, double price){
        double amountOff = saleDecimal * price; //multiply price by sale price to get percentage off of total
        double newPrice = price - amountOff; //find new price with sale 
        return newPrice;
    }

    public String toString(){
        return "This is a Sale Ticket, with a price of $" + this.getPrice() + " for the movie, \"" + this.getMovie();
    }

    public String getTicketInfo(){
        return "This is a Sale Ticket, with a price of $" + this.getPrice() + " for the movie, \"" + this.getMovie();
    }
}
