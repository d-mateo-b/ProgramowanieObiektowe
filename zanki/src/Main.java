//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {


//
//
//            Scanner scanner = new Scanner(System.in);
//
//
//            System.out.print("Podaj ciąg znaków: ");
//            String tekst = scanner.nextLine();
//
//
//            if (tekst.isEmpty()) {
//                System.out.println("Podany ciąg jest pusty!");
//            } else {
//                // 3. Pobranie ostatniego znaku ciągu
//                char ostatniZnak = tekst.charAt(tekst.length() - 1);
//                int licznik = 0;
//
//
//                for (int i = 0; i < tekst.length(); i++) {
//                    if (tekst.charAt(i) == ostatniZnak) {
//                        licznik++;
//                    }
//                }
//
//
//                System.out.println("Ostatni znak to: '" + ostatniZnak + "'");
//                System.out.println("Występuje on w ciągu " + licznik + " raz(y).");
//            }
//
//            scanner.close();

    //zad2

//
//
//                        Scanner scanner = new Scanner(System.in);
//
//                        System.out.print("Podaj ciąg znaków: ");
//                        String tekst_wejściowy = scanner.nextLine();
//
//
//                        String tekstOdwrócony = new StringBuilder(tekst_wejściowy).reverse().toString();
//
//
//                        System.out.println("Wynik: " + tekstOdwrócony);
//
//
//                        scanner.close();

        //zad3


                        Scanner scanner = new Scanner(System.in);


                        System.out.print("Wpisz tekst zawierający cyfry: ");
                        String tekst = scanner.nextLine();


                        int sumaPierwsza = 0;
                        for (int i = 0; i < tekst.length(); i++) {
                                char znak = tekst.charAt(i);

                                if (Character.isDigit(znak)) {
                                        sumaPierwsza += Character.getNumericValue(znak);
                                }
                        }

                        System.out.println("Suma cyfr znalezionych w tekście: " + sumaPierwsza);


                        int sumaKoncowa = 0;
                        int pomocniczaSuma = sumaPierwsza;

                        while (pomocniczaSuma > 0) {
                                sumaKoncowa += pomocniczaSuma % 10;
                                pomocniczaSuma /= 10;
                        }

                        System.out.println("Suma cyfr z otrzymanego wyniku: " + sumaKoncowa);

                        scanner.close();
                }









