package Request1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileRead {

    public static ArrayList<NameClass> fileRead(String fileName) {
        ArrayList<NameClass> listName = new ArrayList<>();

        File file = new File(fileName);
        String line = "";

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            br.readLine();
            while ((line = br.readLine()) != null) {
                String line3 = line.replaceAll(",", ";");
                addNameToList(line3, listName);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listName;
    }

    private static void addNameToList(String l, ArrayList<NameClass> list) {
        String[] nameElement = l.split(";");
        int year = Integer.parseInt(nameElement[0]);
        String gender = nameElement[1];
        String ethnicity = nameElement[2];
        String childsFirstName = nameElement[3].toUpperCase();
        int count = Integer.parseInt(nameElement[4]);
        int rank = Integer.parseInt(nameElement[5]);
        char letter = childsFirstName.charAt(0);

        NameClass nameClass = new NameClass(year, gender, ethnicity, childsFirstName, count, rank, letter);
        list.add(nameClass);

    }

}
