package Request1;

import java.util.Comparator;

public class NameClass implements Comparator<NameClass> {
    private int yearOfBirth;
    private String gender;
    private String ethnicity;
    private String childsFirstName;
    private int count;
    private int rank;
    private char letter;

    public NameClass(){};

    public NameClass(String childsFirstName, int count){
        this.childsFirstName=childsFirstName;
        this.count=count;
    }
    public NameClass(char letter, int count){
        this.letter=letter;
        this.count=count;
    }
     NameClass(int yearOfBirth, String gender, String ethnicity, String childsFirstName, int count, int rank, char letter) {
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.ethnicity = ethnicity;
        this.childsFirstName = childsFirstName;
        this.count = count;
        this.rank = rank;
        this.letter=letter;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getChildsFirstName() {
        return childsFirstName;
    }

    public void setChildsFirstName(String childsFirstName) {
        this.childsFirstName = childsFirstName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    public int compare(NameClass d, NameClass b) {
        return (b.count) - (d.count);
    }

}
