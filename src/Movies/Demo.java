/**@purpose Create a test movie theater schedule from file input and display the movies given
 * @author Chloe Jones
 * @date 11/23/22
 */
package Movies;
import java.util.Hashtable;

public class Demo {
    public static void main(String[] args){
        String filename = "D:\\OOD\\Projects\\Final\\MovieTheater\\src\\Movies\\default_schedule.txt"; //read in file
        MovieTheater mt= new MovieTheater(filename); //create theater
        Hashtable<String, MovieEvent> schedule = mt.getSchedule();  //create schedule
        for(MovieEvent mv: schedule.values()){
            System.out.println(mv); //print schedule
        }
    }
}
