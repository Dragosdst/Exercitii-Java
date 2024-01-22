package Exercitii;

public class Motocicleta implements Exercitii.Vehicul {
    private boolean motorPornit;
    private int viteza;

    public Motocicleta(int viteza) {
        this.motorPornit = viteza > 0;
        this.viteza = viteza;
    }

    @Override
    public void porneste() {
        motorPornit = true;
        System.out.println("Motocicleta a pornit.");
    }

    @Override
    public void opreste() {
        motorPornit = false;
        viteza = 0;
        System.out.println("Motocicleta s-a oprit.");
    }

    @Override
    public void accelereaza() {
        if (motorPornit) {
            viteza += 5; // Motocicleta accelerează poate mai lent, doar ca exemplu
            System.out.println("Motocicleta accelerează. Viteza actuală: " + viteza + " km/h.");
        } else {
            System.out.println("Motorul nu este pornit!");
        }
    }

    @Override
    public void franeaza() {
        if (viteza > 0) {
            viteza -= 5; // Și franează diferit
            System.out.println("Motocicleta franează. Viteza actuală: " + viteza + " km/h.");
        } else {
            System.out.println("Motocicleta este deja oprită.");
        }
    }
}
