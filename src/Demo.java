import java.util.Hashtable;

public class Demo {
    public static void main(String[] args){
        String filename = "/Users/chloejones/OneDrive - New College of Florida/OOD/MovieTheater/src/default_schedule.txt";
        MovieTheater mt= new MovieTheater(filename);
        Hashtable<String, MovieEvent> schedule = mt.getSchedule();
        for(MovieEvent mv: schedule.values()){
            System.out.println(mv);
        }
    }
}
