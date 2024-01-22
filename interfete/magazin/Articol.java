package Exercitii;

import java.time.LocalDate;
import java.time.Period;

public class Articol {
    private String nume;
    private double pret;
    private LocalDate dataExpirare;
    private boolean inPromotie;

    public Articol(String nume, double pret, LocalDate dataExpirare, boolean inPromotie) {
        this.nume = nume;
        this.pret = pret;
        this.dataExpirare = dataExpirare;
        this.inPromotie = inPromotie;
    }

    public boolean esteAproapeDeExpirare() {
        return Period.between(LocalDate.now(), dataExpirare).getDays() <= 7;
    }

    public boolean esteInPromotie() {
        return inPromotie;
    }

    public double getPret() {
        return pret;
    }
}
