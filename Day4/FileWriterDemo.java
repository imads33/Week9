import java.io.*;

public class FileWriterDemo {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("imad.txt");
            fw.write("Wecome to file handling");
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        // try {
        // FileOutputStream fw = new FileOutputStream("xyz.txt");
        // String str = "Hello welcome ";
        // byte bytes[] = str.getBytes();

        // fw.write(bytes);
        // fw.close();
        // } catch (Exception e) {
        // System.out.println(e);
        // }
    }
}