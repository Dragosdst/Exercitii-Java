package Exercitii;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Exercitii.Client client1 = new Exercitii.Client("Ion", true);
        Exercitii.Articol articol1 = new Exercitii.Articol("Lapte", 10, LocalDate.now().plusDays(5), false);
        Exercitii.Articol articol2 = new Exercitii.Articol("Cereale", 15, LocalDate.now().plusDays(30), true);

        Exercitii.Discount discountClientFidel = new Exercitii.DiscountClientFidel();
        Exercitii.Discount discountProdusExpirat = new Exercitii.DiscountProdusExpirat();
        Exercitii.Discount discountArticolPromotie = new Exercitii.DiscountArticolPromotie();

        System.out.println("Articol: Lapte");
        if(discountClientFidel.esteAplicabil(client1, articol1)) {
            System.out.println(discountClientFidel.descriereDiscount() + " Nou pret: " +
                    discountClientFidel.calculeazaDiscount(articol1.getPret()));
        } else if(discountProdusExpirat.esteAplicabil(client1, articol1)) {
            System.out.println(discountProdusExpirat.descriereDiscount() + " Nou pret: " +
                    discountProdusExpirat.calculeazaDiscount(articol1.getPret()));
        }

        System.out.println("Articol: Cereale");
        if(discountArticolPromotie.esteAplicabil(client1, articol2)) {
            System.out.println(discountArticolPromotie.descriereDiscount() + " Nou pret: " +
                    discountArticolPromotie.calculeazaDiscount(articol2.getPret()));
        }
    }
}
