
void main() {


//zad1
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Podaj dodatnią liczbę całkowitą: ");
//            int n = scanner.nextInt();
//
//            if (n <= 0) {
//                System.out.println("Liczba musi być dodatnia!");
//                return;
//            }
//
//            for (int i = 1; i <= n; i += 2) {
//                System.out.print(i);
//                if (i + 2 <= n) {
//                    System.out.print(", ");
//                }
//            }
//            System.out.println();
//
         //zad2

    Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj dodatnią liczbę całkowitą n: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Liczba musi być dodatnia!");
                return;
            }

            int potega = 1;
            while (potega <= n) {
                System.out.print(potega + " ");
                potega *= 2;
            }
            System.out.println();

}
