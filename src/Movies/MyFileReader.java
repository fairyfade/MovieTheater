/**@purpose Read in data from a file
 * @author Chloe Jones
 * @date 11/23/22
 */
package Movies;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

class MyFileReader {

    /**@purpose Read in file data
     * @param fileName String, the name of the file
     * @return a list of strings containing information from the file
     */
    public List<String> readFile(String fileName) throws Exception {

        String line = null;
        List<String> data = new ArrayList<String>();

        try {
            BufferedReader bfReader = new BufferedReader(new FileReader(fileName));

            while ((line = bfReader.readLine()) != null) {
                data.add(line);
            }
            bfReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return data;
    }
}
