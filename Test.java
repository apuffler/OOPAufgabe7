/*
Erste Überlegungen zur Herangehensweise sowie Diskussion über das Verständnis der Angabe erfolgten als Teamarbeit, sowie das Klassendiagramm.
Armin Puffler (1225268): Assertions in all Classes, Zimmerei.java, Bauholz.java, Kantholz.java, KantholzGehobelt.java, KantholzSaegerau.java
Stefan Buttenhauser (0926720): Test.java, Lager.java, RundholzGehobelt.java, RundholzSaegerau.java, Rundholz.java
Jovan Z. (1426514): Dachstuhl.java, Holzbau.java, Steinbau.java, Holznutzbau.java, SteinNutzbau.java, Holzwohnbau.java, SteinWohnbau.java


*/



public class Test {

    public static void main(String[] args) {

        RundholzSaegerau rhs = new RundholzSaegerau(100, 100, 10);
        RundholzGehobelt rhg = new RundholzGehobelt(125, 200, 10);

        KantholzSaegerau khs = new KantholzSaegerau(110, 100, 10, 10);
        KantholzGehobelt khg = new KantholzGehobelt(120, 200, 10, 10);

        Lager keller = new Lager();

        for (int i = 0; i < 10; i++){
            keller.add(rhs);
            keller.add(rhg);
            keller.add(khs);
            keller.add(khg);
        }

        keller.list();
        System.out.println("------");

        HolzNutzbau zuviel = new HolzNutzbau(250, 99); // 1) sollte nicht gemacht werden da zu groß und zu viel holz

        HolzNutzbau hnb = new HolzNutzbau(50, 19); // 2)  sollte fertig werden aber auch gehobeltes aufbrauchen
        HolzWohnbau hwb = new HolzWohnbau(50, 5); // 3) daher sollte dieser nicht fertig werden

        SteinNutzbau snb = new SteinNutzbau(50, 16); // 4) sollte gemacht werden aber auch gehobeltes brauchen
        SteinWohnbau swb = new SteinWohnbau(75, 5); // 5) sollte daher nicht mehr gebaut werden können

        Zimmerei z = new Zimmerei(keller);

        if(z.construct(zuviel)){
            System.out.println("1: Bauholz zu Holznutzbau hinzugefuegt.");
        }else{
            System.out.println("1: Kein passendes Bauholz gefunden.");
        }

        if(z.construct(hnb)){
            System.out.println("2: Bauholz zum Holznutzbau hinzugefuegt.");
        }else {
            System.out.println("2: Kein passendes Bauholz gefunden.");
        }

        if (z.construct(hwb)) {
            System.out.println("3: Bauholz zum Holzwohnbau hinzugefuegt.");
        }else {
            System.out.println("3: Kein passendes Bauholz gefunden.");
        }

        if(z.construct(snb)){
            System.out.println("4: Bauholz zum Steinnutzbau hinzugefuegt.");
        }else {
            System.out.println("4: Kein passendes Bauholz gefunden.");
        }

        if (z.construct(swb)) {
            System.out.println("5: Bauholz zum Steinwohnbau hinzugefuegt.");
        }else {
            System.out.println("5: Kein passendes Bauholz gefunden.");
        }

        System.out.println("----");

        System.out.print("1: ");
        zuviel.price();
        System.out.print("2: ");
        hnb.price();
        System.out.print("3: ");
        hwb.price();
        System.out.print("4: ");
        snb.price();
        System.out.print("5: ");
        swb.price();

    }

}
