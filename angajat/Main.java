package Exercitii;

// Clasa Main pentru a testa
public class Main {
    public static void main(String[] args) {
        Exercitii.Angajat angajatIT = new Exercitii.IT("Ana", 5000);
        Exercitii.Angajat angajatHR = new Exercitii.HR("Ion", 4500);
        // Clasă anonimă:
        // Aici, cream o instanță a clasei abstracte Angajat folosind o clasă anonimă.
        // În loc să definim o nouă subclasă a lui Angajat într-o altă parte a codului,
        // am furnizat direct implementarea metodei calculeazaBonus() aici.
        // Aceasta este o tehnică utilă atunci când avem nevoie de o implementare rapidă
        // sau de o singură utilizare a unei interfețe sau a unei clase abstracte fără
        // a crea o clasă separată.
        //NU PREA SE FOLOSESTE (eu nu am intalnit niciodata asa ceva)
        Exercitii.Angajat angajat = new Exercitii.Angajat("Fanel", 4000) {
            @Override
            public double calculeazaBonus() {
                return 0;
            }
        };
        Exercitii.Angajat angajatVanzari = new Exercitii.Vanzari("Maria", 4000, 100000);

        System.out.println(angajatIT.getNume() + " bonus: " + angajatIT.calculeazaBonus());
        System.out.println(angajatHR.getNume() + " bonus: " + angajatHR.calculeazaBonus());
        System.out.println(angajatVanzari.getNume() + " bonus: " + angajatVanzari.calculeazaBonus());
    }
}
