public class Main {
    public static void main(String[] args) {
        // Problème 1
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number at index " + i + ": " + numbers[i]);
        }

        // Problème 2
        double result = calculateValue(5, 0);
        System.out.println("Result: " + result);

        // Problème 3
        int count = 1;
        while (count < 10) {
            System.out.println("Count: " + count);
            count += 2;
        }

        // Problème 4
        String message = "Bonjour";
        System.out.println("Longueur du message : " + message.length());
        char character = message.charAt(1);
        System.out.println("Caractère à l'indice 1 : " + character);

        // Problème 5
        String str1 = "Hello";
        String str2 = new String("Hello");
        System.out.println("Comparaison de chaînes : " + str1.equals(str2));

        // Problème 6
        Main mainObj = new Main();
        mainObj.method();
    }

    // Méthode pour le problème de division par zéro
    public static int calculateValue(int a, int b) {
        if (b == 0)
        {
        	System.out.println("Pas possible de diviser par 0");
        	return 0;
        }
    	return a / b;
    }

    // Méthode pour le problème d'utilisation incorrecte d'une méthode de classe
    public static void method() {
        System.out.println("Méthode appelée !");
        
    }
}
