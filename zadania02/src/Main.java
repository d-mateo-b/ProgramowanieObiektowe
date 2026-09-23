
void main() {


//zad1
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.print("Podaj liczbę całkowitą: ");
//            int liczba = scanner.nextInt();
//
//
//            if (liczba % 3 == 0) {
//                System.out.println("Liczba " + liczba + " jest podzielna przez 3.");
//            } else {
//                System.out.println("Liczba " + liczba + " nie jest podzielna przez 3.");
//            }
//
//            scanner.close();
//        }

//zad2
//
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("Podaj trzy długości boków:");
//
//    System.out.print("Bok a: ");
//    double a = scanner.nextDouble();
//
//    System.out.print("Bok b: ");
//    double b = scanner.nextDouble();
//
//    System.out.print("Bok c: ");
//    double c = scanner.nextDouble();
//
//
//    boolean czyMoznaZbudowac = (a + b > c) && (a + c > b) && (b + c > a) && (a > 0) && (b > 0) && (c > 0);
//
//    if (czyMoznaZbudowac) {
//        System.out.println("Tak, z podanych boków można zbudować trójkąt.");
//    } else {
//        System.out.println("Nie, z podanych boków nie można zbudować trójkąta.");
//    }
//
//    scanner.close();
//
//}


//zad3

    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj trzy długości boków:");

    System.out.print("Bok a: ");
    double a = scanner.nextDouble();

    System.out.print("Bok b: ");
   double b = scanner.nextDouble();

    System.out.print("Bok c: ");
    double c = scanner.nextDouble();


    boolean czyMoznaZbudowac = (a + b > c) && (a + c > b) && (b + c > a) && (a > 0) && (b > 0) && (c > 0);

  if (czyMoznaZbudowac) {
       System.out.println("Tak, z podanych boków można zbudować trójkąt.");
   } else {
        System.out.println("Nie, z podanych boków nie można zbudować trójkąta.");
    }

    scanner.close();

}

