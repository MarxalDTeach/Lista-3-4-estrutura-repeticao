public class Umatemil {
    public static void main(String[] args) {
        System.out.println("multiplos de 1, 2, 3, 5: ");
        int mult2 = 2;
        int mult3 = 3;
        int mult5 = 5;
        for (int i = 0; i <= 1000; i++) {

            if (i % mult2  == 0) {
                System.out.println("multiplo de 2: " + i);

            }
            if (i % mult3 == 0) {
                System.out.println("multiplo de 3: " + i);

            }
            if (i % mult5 == 0) {
                System.out.println("multiplo de 5: " + i);

            }
        }
    }
}
