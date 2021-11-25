import java.io.*;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class StudentWriter {
    private File file;

    public StudentWriter(String fileName) throws Exception{
        file = new File(fileName);
        file.createNewFile();
    }

    synchronized void saveListSerialized(ArrayList<Student> list) throws Exception {
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        for(Student s : list){
            oos.writeObject(s);
        }

        oos.flush();
        oos.close();
    }
}
