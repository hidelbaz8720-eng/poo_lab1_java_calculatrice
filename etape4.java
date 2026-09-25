public class etape4 {
    public static void main(String[] args){
    switch (choix) {
    case 1:
        System.out.print("Entrez deux entiers : ");
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        System.out.println("Résultat : " + addition(a1, b1));
        break;

    case 2:
        System.out.print("Entrez deux entiers : ");
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        System.out.println("Résultat : " + multiplication(a2, b2));
        break;

    case 3:
        System.out.print("Combien de valeurs ? ");
        int n = sc.nextInt();
        int[] valeurs = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Valeur " + (i + 1) + " : ");
            valeurs[i] = sc.nextInt();
        }
        System.out.println("Moyenne : " + moyenne(valeurs));
        break;

    case 4:
        System.out.print("Combien de nombres ? ");
        int m = sc.nextInt();
        int[] entiers = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.print("Nombre " + (i + 1) + " : ");
            entiers[i] = sc.nextInt();
        }
        System.out.println("Maximum : " + maximum(entiers));
        break;

    case 0:
        System.out.println("Fin du programme.");
        break;

    default:
        System.out.println("Option invalide !");
}}
}
