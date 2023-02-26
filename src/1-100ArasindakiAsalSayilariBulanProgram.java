public class Main {
    public static void main(String[] args) {

        for (int prime = 2; prime <= 100; prime++) {
            int counter = 0;
            for (int i = 1; i <= prime; i++) {
                if (prime % i == 0) {
                    counter++;
                }
            }
            if (counter <= 2) {
                System.out.print(prime + " ");
            } else {
                System.out.print("");
            }
        }
    }
}
