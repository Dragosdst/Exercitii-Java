package Exercitii;

public class DiscountClientFidel implements Exercitii.Discount {

    @Override
    public double calculeazaDiscount(double pretInitial) {
        return pretInitial * 0.9;  // 10% discount
    }

    @Override
    public String descriereDiscount() {
        return "Discount de 10% pentru clienții fideli.";
    }

    @Override
    public boolean esteAplicabil(Exercitii.Client client, Exercitii.Articol articol) {
        return client.esteFidel();
    }
}

