package Exercitii;

// Clasa IT care extinde Angajat
public class IT extends Exercitii.Angajat {
    public IT(String nume, double salariu) {
        super(nume, salariu);
    }

    @Override
    public double calculeazaBonus() {
        return getSalariu() * 0.1;  // bonus de 10% din salariu
    }
}
