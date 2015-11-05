package mx.iteso.decorator;

public abstract class Taco {
    public static final String MINI = "mini";
    public static final String REGULAR = "regular";
    public static final String MEGA = "mega";
    public String description = "Any Taco";
    public String getDescription()throws RuntimeException{
        return description + " " + this.getSize();
    }
    public abstract double cost() throws RuntimeException;
    public String size = REGULAR;
    public String getSize(){
        return size;
    }
}
