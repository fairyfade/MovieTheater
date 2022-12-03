/**@purpose Define a movie event, there will be one movie event per movie showing
 * @author Chloe Jones
 * @date 11/23/22
 */
package Movies;

import java.util.ArrayList;
import java.util.List;

public class MovieEvent extends Observable<MovieEvent> {
    private String title;
    private boolean rRated;
    private Integer soldTix;
    private String time;
    private Room room;
    private boolean soldOut;
    private List<Observer> observers;


    /**@param title String, the movie title
     * @param rRated boolean, whether or not the movie is Rated R (true = rated R, false = not rated R)
     * @param soldTix Integer, the number of tickets that have been sold for this showing
     * @param time String, the time the movie showing is taking place
     * @param room Room, the room the MovieEvent is taking place in
     */
    public MovieEvent(String title, boolean rRated, Integer soldTix, String time, Room room){
        this.title = title;
        this.rRated = rRated;
        this.soldTix = soldTix;
        this.time = time;
        this.room = room;
        TicketBooth tb = TicketBooth.getTicketBooth();  //for selling tickets
        this.subscribe(tb);
        //As long as the number of sold tickets remains below the total seats in the room, keep selling tickets
        if(soldTix < room.getTotalSeats()) this.setSoldOut(false);
        else if(soldTix > room.getTotalSeats()) {
            System.out.println(title + " at "+ time +" has oversold!! Please set room to a larger room.");
        }
        else this.setSoldOut(true);
        this.observers = new ArrayList<Observer>();

        //is it bad practice to subscribe TicketBooth in the constructor?
    }

    public String getTitle(){
        return this.title;
    }

    public String getMovieTime(){
        return this.time;
    }


    public void setSoldOut(boolean newVal){
        this.soldOut = newVal;
        notifyAll("soldOut", newVal);
    }

    @Override
    public String toString() {
        return "MovieEvent{" +
                "title='" + title + '\'' +
                ", time='" + time + '\'' +
                ", rRated=" + rRated +
                ", soldTix=" + soldTix +
                ", room capacity=" +room.getTotalSeats() +
                ", room=" + room.getRoomNumber() +
                ", room type=" +room.getClass() +
                ", soldOut=" + soldOut +
                '}';
    }
}
