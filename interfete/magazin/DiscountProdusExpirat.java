package Exercitii;

public class DiscountProdusExpirat implements Exercitii.Discount {

    @Override
    public double calculeazaDiscount(double pretInitial) {
        return pretInitial * 0.5;  // 50% discount
    }

    @Override
    public String descriereDiscount() {
        return "Discount de 50% pentru produse aproape de expirare.";
    }

    @Override
    public boolean esteAplicabil(Exercitii.Client client, Exercitii.Articol articol) {
        return articol.esteAproapeDeExpirare();
    }
}

