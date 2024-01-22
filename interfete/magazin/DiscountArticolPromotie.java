package Exercitii;

public class DiscountArticolPromotie implements Exercitii.Discount {

    @Override
    public double calculeazaDiscount(double pretInitial) {
        return pretInitial * 0.8;  // 20% discount
    }

    @Override
    public String descriereDiscount() {
        return "Discount de 20% pentru articolele în promoție.";
    }

    @Override
    public boolean esteAplicabil(Exercitii.Client client, Exercitii.Articol articol) {
        return articol.esteInPromotie();
    }
}

