package pl.sda.helloworld.OOP;

public class Engine {

    double engineCapacity;
    double horsePower;


    //constructors

    public Engine(double horsePower, double engineCapacity) {
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;

    }

    public Engine (double engineCapacity){

        this(engineCapacity * 200, engineCapacity);
    }

    public Engine(){

        this(1.8);
    }


    // getters and setters

    public double getEngineCApacity() {
        return engineCapacity;
    }

    public void setEngineCApacity(double engineCapacity)
    {
        this.engineCapacity = engineCapacity;
    }


    @Override
    public String toString() {
        return "Engine{" +
                "engineCapacity=" + engineCapacity +
                ", horsePower=" + horsePower +
                '}';
    }

    public double getHorsePower() {
        return horsePower;

    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    public String engineSound(){
        return "brum brum";
    }

}