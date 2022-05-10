package tddClass;

public class Entry {

    private String title;
    private String date;
    private String body;

    public Entry(String title, String date, String body) {
        this.title = title;
        this.date = date;
        this.body = body;

    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}




