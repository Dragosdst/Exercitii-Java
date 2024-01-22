package Exercitii;

// Clasa abstractă Angajat
public abstract class Angajat {
    private String nume;
    private double salariu;

    public Angajat(String nume, double salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    public String getNume() {
        return nume;
    }

    public double getSalariu() {
        return salariu;
    }

    // Metodă abstractă care va fi implementată de fiecare tip de angajat
    public abstract double calculeazaBonus();
}
