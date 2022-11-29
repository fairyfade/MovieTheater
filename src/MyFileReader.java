import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

class MyFileReader {

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
