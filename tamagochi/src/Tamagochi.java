import java.util.Scanner;

public class Tamagochi {
    private int hunger = 0; //Objekvariablen werden oben in der Klasse definiert und dsind standartäßig private
    private int langeweile = 0;
    private int muedigkeit = 0;
    private int punktestand = 0;

    private void tick() {
        hunger = hunger + 1;
        langeweile++; //Geht nur für +1 oder -- für -1
        muedigkeit++;

        if (hunger > 3) {
            System.out.println("Ich habe hunger!!!");

        }
        if (langeweile > 3) {
            System.out.println("Mir ist langweilig!!!");

        }
        if (muedigkeit > 3) {
            System.out.println("Ich bin müde!!!");

        }

    }

    public void iss() {
        System.out.println("Das Tamagochi isst...");
        hunger = 0;
        langeweile++;
        muedigkeit++;

    }

    private void schlaf() {
        System.out.println("Das Tamagochi schläft...");
        muedigkeit = 0;
        hunger++;

    }

    private void spiel() {
        System.out.println("Das Tamagochi spielt...");
        langeweile = 0;
        muedigkeit++;
        hunger++;

    }


    private void printPunktestand () {
        System.out.println("Zustand des Tamagochis:");
        System.out.println("Hunger:" + hunger);
        System.out.println("Langeweile:" + langeweile);
        System.out.println("Müdigkeit:" + muedigkeit);
    }

    private void getPunktestand () {


        if (hunger < 4) {
            punktestand++;
        }
        if (langeweile < 4) {
            punktestand++;
        }
        if (muedigkeit < 4) {
            punktestand++;
        }


        if (hunger >= 4) {
            punktestand= punktestand -2;
        }

        if (langeweile >= 4) {
            punktestand= punktestand -2;
        }

        if (muedigkeit >= 4) {
            punktestand= punktestand -2;
        }
        System.out.println("Punktestand:" + punktestand);

    }

    public void verarbeiteKommando (String kommando) {
        if (kommando.equals("Iss")){
            iss();
        }
        if (kommando.equals("Spiel")){
            spiel();
        }
        if (kommando.equals("Schlaf")){
            schlaf();
        }
        tick();
        printPunktestand();
        getPunktestand();









    }


}