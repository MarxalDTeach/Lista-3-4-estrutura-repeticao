public class Umatemil {
    public static void main(String[] args) {
        System.out.println("multiplos de 1, 2, 3, 5: ");
        int mult2 = 2;
        int mult3 = 3;
        int mult5 = 5;
        for (int i = 0; i <= 1000; i++) {

            if ((i % mult5)+(i % mult3)+(i % mult2)  == 0) {
                System.out.println(i);
            }
        }
    }
}
