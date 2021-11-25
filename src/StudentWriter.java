import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class StudentWriter implements Runnable {
    private File file;
    private Writer output;


    public StudentWriter(String fileName) throws Exception{
        file = new File(fileName);
        file.createNewFile();
        output = new FileWriter(file, StandardCharsets.UTF_8);
    }

    public void saveList(ArrayList<Student> list) throws Exception{
        BufferedWriter bw = new BufferedWriter(output, 16384);
        StringBuilder sb = new StringBuilder();

        for(Student s : list){
            sb.append(s);
            sb.append("\n");
        }

        System.out.println(sb.toString().length());

        bw.write(sb.toString(),0, sb.toString().length());
        bw.close();
    }

    public void saveListSerialized(ArrayList<Student> list) throws Exception{
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        for(Student s : list){
            oos.writeObject(s);
        }

        oos.flush();
        oos.close();

    }

    public void run() {
        // to do
    }
}
