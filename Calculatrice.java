```java
import java.util.Scanner;

public class Calculatrice {

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    // Calculer la moyenne avec varargs
    public static double moyenne(int... valeurs) {
        if (valeurs.length == 0) {
            return 0;
        }

        int somme = 0;

        for (int valeur : valeurs) {
            somme += valeur;
        }

        return (double) somme / valeurs.length;
    }

    // Trouver le maximum avec varargs
    public static int maximum(int... valeurs) {
        if (valeurs.length == 0) {
            throw new IllegalArgumentException(
                "Le tableau ne doit pas être vide."
            );
        }

        int max = valeurs[0];

        for (int i = 1; i < valeurs.length; i++) {
            if (valeurs[i] > max) {
                max = valeurs[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int choix;

            do {
                System.out.println("\n=== MENU PRINCIPAL ===");
                System.out.println("1. Addition");
                System.out.println("2. Multiplication");
                System.out.println("3. Moyenne");
                System.out.println("4. Maximum");
                System.out.println("0. Quitter");
                System.out.print("Votre choix : ");

                choix = sc.nextInt();

                switch (choix) {
                    case 1:
                        System.out.print("Entrez deux entiers : ");
                        int a = sc.nextInt();
                        int b = sc.nextInt();

                        System.out.println(
                            "Résultat : " + addition(a, b)
                        );
                        break;

                    case 2:
                        System.out.print("Entrez deux entiers : ");
                        int c = sc.nextInt();
                        int d = sc.nextInt();

                        System.out.println(
                            "Résultat : " + multiplication(c, d)
                        );
                        break;

                    case 3:
                        System.out.print("Combien de valeurs ? ");
                        int n = sc.nextInt();

                        if (n <= 0) {
                            System.out.println(
                                "Le nombre doit être positif."
                            );
                            break;
                        }

                        int[] valeurs = new int[n];

                        for (int i = 0; i < n; i++) {
                            System.out.print(
                                "Valeur " + (i + 1) + " : "
                            );
                            valeurs[i] = sc.nextInt();
                        }

                        System.out.println(
                            "Moyenne : " + moyenne(valeurs)
                        );
                        break;

                    case 4:
                        System.out.print("Combien de nombres ? ");
                        int m = sc.nextInt();

                        if (m <= 0) {
                            System.out.println(
                                "Le nombre doit être positif."
                            );
                            break;
                        }

                        int[] nombres = new int[m];

                        for (int i = 0; i < m; i++) {
                            System.out.print(
                                "Nombre " + (i + 1) + " : "
                            );
                            nombres[i] = sc.nextInt();
                        }

                        System.out.println(
                            "Maximum : " + maximum(nombres)
                        );
                        break;

                    case 0:
                        System.out.println("Fin du programme.");
                        break;

                    default:
                        System.out.println("Option invalide !");
                }

            } while (choix != 0);

        } finally {
            sc.close();
        }
    }
}
```
