package Exercitii;

public class Client {
    private String nume;
    private boolean fidel;

    public Client(String nume, boolean fidel) {
        this.nume = nume;
        this.fidel = fidel;
    }

    public boolean esteFidel() {
        return fidel;
    }
}
