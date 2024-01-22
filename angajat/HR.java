package Exercitii;

// Clasa HR care extinde Angajat
public class HR extends Exercitii.Angajat {
    public HR(String nume, double salariu) {
        super(nume, salariu);
    }

    @Override
    public double calculeazaBonus() {
        return getSalariu() * 0.05;  // bonus de 5% din salariu
    }
}
