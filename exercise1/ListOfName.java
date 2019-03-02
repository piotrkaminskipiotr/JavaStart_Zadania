package exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;


public class ListOfName {

    public static void main(String[] args) {

        ArrayList<NameClass> listName=FileRead.fileRead("E:/java/projects/src/Request1/Popular_Baby_Names.csv");

        Map<String,Integer> mapName= ToMapToList.addNameToMap(listName);
        Map<String,Integer> mapWomanName= ToMapToList.addNameToWomenMap(listName);
        Map<Character,Integer> mapNameLetter= ToMapToList.addNameLetterToMap(listName);
        ArrayList<NameClass> listNameSort=ToMapToList.fromMapToListString(mapName);
        ArrayList<NameClass> listNameWomanSort=ToMapToList.fromMapToListString(mapWomanName);
        ArrayList<NameClass> listNameLetterSort=ToMapToList.fromMapToListChar(mapNameLetter);
        Collections.sort(listNameSort, new NameClass());
        Collections.sort(listNameLetterSort, new NameClass());
        Collections.sort(listNameWomanSort, new NameClass());


        System.out.println("10 najpopularniejszych imion");
        for (int i = 0; i < 10; i++) {
            System.out.println(listNameSort.get(i).getChildsFirstName() );
        }
        System.out.println("Najpopularniejsze imię żeńskie");
        System.out.println(listNameWomanSort.get(0).getChildsFirstName());

        System.out.println("Imiona rozpoczynające się od następujących liter są najpopularniejsze");
        for (int i = 0; i < 3; i++) {
            System.out.println(listNameLetterSort.get(i).getLetter() + " " + listNameLetterSort.get(i).getCount());
        }

    }
}


