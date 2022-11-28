/**@purpose Test the Tickets and decorator pattern implementation
 * @author Faye Landers
 * @date 11/22/22
 * 
 */
package Tickets;

public class TicketTest {
    
    public static void main(String[] args){

        //Test Tickets All Individually and then Together 

        //Individual Tickets
        Ticket regTicket = new Regular("Alice in Wonderland"); //make a regular ticket 
        System.out.println(regTicket);

        Ticket stTicket = new Student("Cloudy With a Chance of Meatballs"); //make a student ticket
        System.out.println(stTicket);

        //One decorator 
        Ticket imaxTicket = new Imax(regTicket); //make an Imax ticket
        System.out.println(imaxTicket);

        Ticket saleTicket = new Sale(regTicket, 0.5); //make a sale ticket
        System.out.println(saleTicket);

        Ticket rTicket = new Restricted(regTicket); //make a restricted ticket
        System.out.println(rTicket);

        //Two Decorators
        Ticket imaxSaleTicket = new Sale(imaxTicket, 0.5); //make a imax sale ticket
        System.out.println(imaxSaleTicket);

        Ticket rSaleTicket = new Restricted(saleTicket); //make a restricted sale ticket
        System.out.println(rSaleTicket);

        Ticket rImaxTicket = new Imax(rTicket); //make a restricted imax ticket
        System.out.println(rImaxTicket);

        //Three Decorators
        Ticket saleRImaxTicket = new Sale(rImaxTicket, 0.5); //Regular - sale, restricted, imax ticket
        System.out.println(saleRImaxTicket);

        //Student two decorator tickets
        Ticket stImaxTicket = new Imax(stTicket); //Student - imax ticket
        System.out.println(stImaxTicket);

        Ticket stSaleImaxTicket = new Sale(stImaxTicket, 0.5); //Student - Imax, sale ticket
        System.out.println(stSaleImaxTicket);

        //student three decorator ticket
        Ticket stRestrictSaleImaxTicket = new Restricted(stSaleImaxTicket); //Student - Imax, sale, restricted ticket
        System.out.println(stRestrictSaleImaxTicket);

        Ticket stRestrictImax = new Restricted(stSaleImaxTicket); //Student - Restricted, Imax ticket
        System.out.println(stRestrictImax);

    }
}
