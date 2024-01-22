package Exercitii;

public class Masina implements Exercitii.Vehicul {
    private boolean motorPornit;
    private int viteza;

    public Masina( int viteza) {
        this.motorPornit = viteza > 0;
        this.viteza = viteza;
    }

    public boolean isMotorPornit() {
        return motorPornit;
    }

    public void setMotorPornit(boolean motorPornit) {
        this.motorPornit = motorPornit;
    }

    public int getViteza() {
        return viteza;
    }

    public void setViteza(int viteza) {
        this.viteza = viteza;
    }

    @Override
    public void porneste() {
        motorPornit = true;
        System.out.println("Mașina a pornit.");
    }

    @Override
    public void opreste() {
        motorPornit = false;
        viteza = 0;
        System.out.println("Mașina s-a oprit.");
    }

    @Override
    public void accelereaza() {
        if (motorPornit) {
            viteza += 10;
            System.out.println("Mașina accelerează. Viteza actuală: " + viteza + " km/h.");
        } else {
            System.out.println("Motorul nu este pornit!");
        }
    }

    @Override
    public void franeaza() {
        if (viteza > 0) {
            viteza -= 10;
            System.out.println("Mașina franează. Viteza actuală: " + viteza + " km/h.");
        } else {
            System.out.println("Mașina este deja oprită.");
        }
    }
}

