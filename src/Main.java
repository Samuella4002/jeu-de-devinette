//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        // Générer un nombre aléatoire entre 1 et 100
        int nombreSecret = (int)(Math.random() * 100) + 1;

        // Créer un Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        System.out.println("Devinez le nombre entre 1 et 100. Vous avez 10 essais.");

        // Créer une boucle qui demande à l'utilisateur de deviner un nombre
        for (int essai = 1; essai <= 10; essai++) {

            // Lire l'entrée de l'utilisateur
            System.out.print("Essai " + essai + " : ");
            int devine = scanner.nextInt();

            // Comparer au nombre aléatoire
            if (devine == nombreSecret) {
                System.out.println("Bravo ! Vous avez gagné en " + essai + " essai(s) !");
                return;
            } else if (devine < nombreSecret) {
                System.out.println("Trop petit !");
            } else {
                System.out.println("Trop grand !");
            }

            // Il a utilisé les 10 essais : fin de la boucle
            if (essai == 10) {
                System.out.println("Vous avez perdu ! Le nombre était : " + nombreSecret);
            }
        }

    }
}