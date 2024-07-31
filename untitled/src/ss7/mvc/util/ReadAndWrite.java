package ss7.mvc.util;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static List<String> readFileCSVToListString(String pathFile) {
        List<String> stringList = new ArrayList<String>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = " ";
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        return stringList;
    }
    public static void writeFileCSVToListString(String pathFile, List<String> stringList) {
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String s : stringList) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}