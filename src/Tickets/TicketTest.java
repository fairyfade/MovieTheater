/**@purpose Test the Tickets and decorator pattern implementation
 * @author Faye Landers 
 * @author Chloe Jones
 * @date 12/03/22
 * @version 2
 * 
 */
package Tickets;

import java.util.Enumeration;
import java.util.Hashtable;
import Movies.*;

public class TicketTest {
    
    public static void main(String[] args){

        //Test Tickets All Individually and then Together 

        /**Used Chloe's Demo.java to make movie schedule */
        String filename = "D:\\OOD\\Projects\\Final\\MovieTheater\\src\\Movies\\default_schedule.txt";
        MovieTheater mt= new MovieTheater(filename);
        Hashtable<String, MovieEvent> schedule = mt.getSchedule();
        //for(MovieEvent mv: schedule.values()){
        //    System.out.println(mv);
       // } 
       //get Keys
       Enumeration enu = schedule.keys();
       System.out.println("The enumeration of keys are:");

       while (enu.hasMoreElements()) {
 
            // Displaying the Enumeration
            System.out.println(enu.nextElement());
        }

        MovieEvent cinderella_1 = schedule.get("Cinderella_4:30-6:15");
        MovieEvent sorry = schedule.get("Sorry To Bother You_10:35-12:10");

        //Individual Tickets
        Ticket regTicket = new Regular(cinderella_1); //make a regular ticket 
        System.out.println(regTicket);

        Ticket stTicket = new Student(sorry); //make a student ticket
        System.out.println(stTicket);

        //One decorator 
        Ticket imaxTicket = new Imax(regTicket); //make an Imax ticket
        System.out.println(imaxTicket);

        Ticket saleTicket = new Sale(stTicket, 0.5); //make a sale ticket
        System.out.println(saleTicket);

        Ticket rTicket = new Restricted(stTicket); //make a restricted ticket
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
