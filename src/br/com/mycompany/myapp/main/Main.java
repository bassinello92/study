package br.com.mycompany.myapp.main;

import br.com.mycompany.myapp.model.Accent;
import br.com.mycompany.myapp.model.Car;
import br.com.mycompany.myapp.model.Motor;

public class Main {

    public static void main(String[] args){

        Accent accent= new Accent();
        accent.setTecido("Couro");
        accent.setBase("Aco");
        accent.setColor("RED");

        Motor motor = new Motor();
        motor.setPotency("108CV");
        motor.setMaxSpeed(300);
        motor.setTorch(80);
        motor.setTurbo(true);

        Car carro = new Car();
        carro.setColor("Red");
        carro.setManifacturer("Ferrai");
        carro.setModel("F40");
        carro.setYear(2000);
        carro.setMotor(motor);
        carro.setAccent(accent);

        System.out.println("Cor:" + carro.getColor());
        System.out.println("Fabricante:" + carro.getManifacturer());
        System.out.println("Modelo:" + carro.getModel());
        System.out.println("Ano:" + carro.getYear());

        System.out.println("Potencia: "+carro.getMotor().getPontency());
        System.out.println("Torque: "+carro.getMotor().getTorch());
        System.out.println("Velocidade : "+carro.getMotor().getMaxSpeed());
        System.out.println("Turbo: "+carro.getMotor().getTurbo());

        System.out.println("cor do banco "+carro.getAccent().getColor());
        System.out.println("Tecido "+carro.getAccent().getTecido());
        System.out.println("Tipo de Base "+carro.getAccent().getBase());
    }

}
