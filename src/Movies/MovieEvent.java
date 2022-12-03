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


    public MovieEvent(String title, boolean rRated, Integer soldTix, String time, Room room){
        this.title = title;
        this.rRated = rRated;
        this.soldTix = soldTix;
        this.time = time;
        this.room = room;
        TicketBooth tb = TicketBooth.getTicketBooth();
        this.subscribe(tb);
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
