package chapter9;

public class GeometricObj {
    private String color;
    private boolean filled;
    private final java.util.Date dateCreated = new java.util.Date();


    public GeometricObj(){

    }


    public GeometricObj( String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }



    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public java.util.Date getDateCreated(){
        return dateCreated;
    }

    public String toString(){
        return "created on "+ dateCreated +
                "\ncolor: "+ color + " and filled: "+ filled;
    }


}