import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tamagochi tamagochi = new Tamagochi();
        Scanner eingabe = new Scanner(System.in);

        while (true){
        tamagochi.verarbeiteKommando(eingabe.next());

        }
    }
}
