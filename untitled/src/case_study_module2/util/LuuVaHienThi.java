package case_study_module2.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LuuVaHienThi {

    public static List<String> readFileCSVToListString(String pathFile) {
        List<String> stringList = new ArrayList<>();
        File file = new File(pathFile);
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IO exception: " + e.getMessage());
        }
        return stringList;
    }

    public static void writeFileCSVToListString(String pathFile, List<String> stringList, boolean append) {
        File file = new File(pathFile);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, append))) {
            for (String s : stringList) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.err.println("IO exception: " + e.getMessage());
        }
    }
}

