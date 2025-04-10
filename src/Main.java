import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int random = new Random().nextInt(100);
        System.out.println(random);
        Scanner input = new Scanner(System.in);
        boolean win = false;
        int number;


        for (int i = 5; i > 0; i--) {
            System.out.println("Ingrese un número: (quedan "+i+" intentos)");
            number = input.nextInt();
            if (number > random) {
                System.out.println("El numero es menor\n");
            } else if (number < random) {
                System.out.println("El numero es mayor\n");
            }
            else {
                System.out.println("Ganaste!! Adivinaste en "+i+" intentos\n");
                win = true;
                break;
            }
        }
        if (!win) {
            System.out.println("Perdiste :(\nEl número era: "+random);
        }

    }
}