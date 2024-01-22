package Exercitii;

public interface Discount {
    double calculeazaDiscount(double pretInitial);
    String descriereDiscount();
    boolean esteAplicabil(Exercitii.Client client, Exercitii.Articol articol);
}

