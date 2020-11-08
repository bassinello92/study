package br.com.mycompany.myapp.model;

public class Car {

    private Accent accent;
    private Motor motor;
    public String color;
    private String model;
    protected String manifacturer;
    int year;

    public Car() {
    }

    public Car(String color, String model, String manifacturer, int year){
        this.color = color;
        this.model = model;
        this.manifacturer = manifacturer;
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManifacturer() {
        return manifacturer;
    }

    public void setManifacturer(String manifacturer) {
        this.manifacturer = manifacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMotor(Motor motor){
        this.motor = motor;
    }

    public Motor getMotor(){
        return this.motor;
    }
    public Accent getAccent(){
        return this.accent;
    }
    public void setAccent(Accent accent){
        this.accent = accent;
    }
}
