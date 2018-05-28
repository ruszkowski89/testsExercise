package michal.ruszkowski89;

import java.io.*;
import java.util.ArrayList;

public class FileParser {
    private ArrayList<String[]> textLines = new ArrayList<String[]>();

    public ArrayList<String[]> parseFile(String filename){
        try (
            FileReader fileReader = new FileReader(new File(filename));
            BufferedReader reader = new BufferedReader(fileReader)
        ) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                textLines.add(splitLine(line));
            }
        } catch (Exception e) {
            System.out.println("File instructions.txt couldn't be read.");
        }
        return textLines;
    }

    public String[] splitLine(String line){
        return line.split(" ");
    }
}
