package exercise1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ToMapToList {
    public static Map<String, Integer> addNameToMap(ArrayList<NameClass> list) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if (map.containsKey(list.get(i).getChildsFirstName())) {
                Integer sum = map.get(list.get(i).getChildsFirstName()) + list.get(i).getCount();
                map.put(list.get(i).getChildsFirstName(), sum);
            } else {
                map.put(list.get(i).getChildsFirstName(), list.get(i).getCount());
            }
        }
        return map;
    }

    public static Map<String, Integer> addNameToWomenMap(ArrayList<NameClass> list) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getGender().toUpperCase().equals("FEMALE")) {
                if (map.containsKey(list.get(i).getChildsFirstName())) {
                    Integer sum = map.get(list.get(i).getChildsFirstName()) + list.get(i).getCount();
                    map.put(list.get(i).getChildsFirstName(), sum);
                } else {
                    map.put(list.get(i).getChildsFirstName(), list.get(i).getCount());
                }
            }
        }
        return map;
    }

    public static Map<Character, Integer> addNameLetterToMap(ArrayList<NameClass> list) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if (map.containsKey(list.get(i).getLetter())) {
                Integer sum = map.get(list.get(i).getLetter()) + list.get(i).getCount();
                map.put(list.get(i).getLetter(), sum);
            } else {
                map.put(list.get(i).getLetter(), list.get(i).getCount());
            }
        }
        return map;
    }

    public static ArrayList<NameClass> fromMapToListString(Map<String, Integer> map) {
        ArrayList<NameClass> list = new ArrayList<>();
        for (Map.Entry<String, Integer> enty : map.entrySet()) {
            String name = enty.getKey();
            int count = enty.getValue();
            list.add(new NameClass(name, count));
        }
        return list;
    }

    public static ArrayList<NameClass> fromMapToListChar(Map<Character, Integer> map) {
        ArrayList<NameClass> list = new ArrayList<>();
        for (Map.Entry<Character, Integer> enty : map.entrySet()) {
            char letter = enty.getKey();
            int count = enty.getValue();
            list.add(new NameClass(letter, count));
        }
        return list;
    }
}
