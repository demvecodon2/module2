package ss16;

import java.io.*;

public class MyFile {
    public static final String PATH = "src/ss16/demo.csv";

    public static void main(String[] args) {
        File file = new File(PATH);
        String name = "co524i1";
        int ege = Integer.parseInt("23");
        try (
                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter bufferedWriter= new BufferedWriter(fileWriter)
        )
        {
            bufferedWriter.write(name);
            bufferedWriter.write(ege);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        }


