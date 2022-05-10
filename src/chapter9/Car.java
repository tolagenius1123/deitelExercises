package chapter9;

public class Car {
    private String color;
    private int noOfTyres;

    private Engine engine;

    public Car(String color, int noOfTyres, String engineType,
               String engineName, String enginePower) {
        this.engine = new Engine();
        engine.setEngineName(engineName);
        engine.setEnginePower(enginePower);
        engine.setEngineType(engineType);
        this.color = color;
        this.noOfTyres = noOfTyres;
    }

    public String getEngineType() {
        return engine.getEngineType();
    }

    public String getEngineName() {
        return engine.getEngineName();
    }

    public String getEnginePower() {
        return engine.getEnginePower();
    }


    public static void main(String[] args) {
        Car myCar = new Car("Black",3,"V8", "Toyota", "500hp" );
        myCar.getEngineName();
    }
}
