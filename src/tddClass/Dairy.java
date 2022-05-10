package tddClass;

import java.util.ArrayList;
import java.util.Objects;

public class Dairy {

    private String name;
    private String password;
    private ArrayList<Entry> entries;

    public Dairy(String name, String password) {
        this.name = name;
        this.password = password;
        entries = new ArrayList<Entry>();
    }

    public void createEntry(String title, String date, String body) {
        Entry dairyEntry = new Entry(title, date, body);
        entries.add(dairyEntry);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getNumberOfEntry() {
        return entries.size();
    }

    public boolean findEntry(String Title) {
        for (int i = 0; i < entries.size(); i++) {
            Entry dairyEntry = entries.get(i);
            if (dairyEntry.getTitle().equals(Title)) {
                return true;
            }
        }
        return false;
    }

    public boolean deleteEntry(String title){
        for (int i = 0; i < entries.size(); i++) {
            Entry dairyEntry = entries.get(i);
            if (dairyEntry.getTitle().equals(title)){
                entries.remove(dairyEntry);
                return true;
            }

        }
        return false;
    }

    public boolean openDiary(String password){

        return Objects.equals(this.password, password);


    }

}




