package Exercitii;

// Clasa Vânzări care extinde Angajat
public class Vanzari extends Exercitii.Angajat {
    private double vanzari;

    public Vanzari(String nume, double salariu, double vanzari) {
        super(nume, salariu);
        this.vanzari = vanzari;
    }

    @Override
    public double calculeazaBonus() {
        return getSalariu() * 0.02 + 0.01 * vanzari;  // bonus de 2% din salariu + 1% din vânzări
    }
}
