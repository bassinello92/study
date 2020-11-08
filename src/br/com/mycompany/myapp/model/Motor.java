package br.com.mycompany.myapp.model;

public class Motor {

    private String pontency;
    private int torch;
    private int maxSpeed;
    private boolean turbo;

    public void setPotency(String pontency){
        this.pontency = pontency;
    }

    public String getPontency(){
        return this.pontency;
    }

    public int getTorch() {
        return torch;
    }

    public void setTorch(int torch) {
        this.torch = torch;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean getTurbo() {
        return this.turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

}
