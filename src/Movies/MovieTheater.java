package Movies;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import static java.lang.Integer.parseInt;

public class MovieTheater {
    private Hashtable<String, MovieEvent> schedule;
    //hard code in rooms
    private Room r1 = new NormalRoom(50, 1);
    private Room r2 = new NormalRoom(30, 2);
    private Room r3 = new NormalRoom(40, 3);
    private Room r4 = new NormalRoom(25, 4);
    private Room r5 = new ImaxRoom(60, 5);
    private Room r6 = new ImaxRoom(60, 6);
    private ArrayList<Room> rooms = new ArrayList<>(List.of(r1, r2, r3, r4, r5, r6 ));

    public MovieTheater(String filename) {
        MyFileReader fr = new MyFileReader();
        try {
            List<String> data = fr.readFile(filename);
            this.schedule = makeSchedule(data);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        //hard code in rooms
        /**
        Room r1 = new NormalRoom(50, 1);
        Room r2 = new NormalRoom(30, 2);
        Room r3 = new NormalRoom(40, 3);
        Room r4 = new NormalRoom(25, 4);
        Room r5 = new ImaxRoom(60, 5);
        Room r6 = new ImaxRoom(60, 6);
        this.rooms = new ArrayList<Room>(
                List.of(r1, r2, r3, r4, r5, r6 ));
         */

    }

    public Room assignRoom(int rNum){
        Room assignedRoom = null;
        for(Room r: rooms){
            if(r.getRoomNumber() == rNum) assignedRoom = r;
        }
        if(assignedRoom == null){
            throw new RuntimeException("Room Doesn't Exist");
        }
        return assignedRoom;
    }

    public Hashtable<String, MovieEvent> makeSchedule(List<String> data){
        Hashtable<String, MovieEvent> schedule = new Hashtable<String, MovieEvent>();
        for(String line:data){
            String[] information = line.split(",");
            //System.out.println(information[4]);
            Room r = assignRoom(parseInt(information[4]));
            boolean rRated = false;
            //System.out.println(information[1]);
            if(parseInt(information[1]) == 1) rRated = true;
            MovieEvent mv = new MovieEvent(information[0], rRated, parseInt(information[2]), information[3], r);
            schedule.put(information[0]+'_'+information[3], mv);
        }

        return schedule;
    }

    public Hashtable<String, MovieEvent> getSchedule() {
        return schedule;
    }

}
