//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {


//zad1
//    int[] tablica1 = {1, 2, 3, 4, 5, 6};
//    String[] tablica2 = {"Ala", "Ola", "Jan", "Adam", "Ewa"};
//
//    System.out.println("Tablica pierwsza:");
//    for (int i = 0; i < tablica1.length; i += 2) {
//        System.out.println(tablica1[i]);
//    }
//
//    System.out.println("Tablica druga:");
//    for (int i = 0; i < tablica2.length; i += 2) {
//        System.out.println(tablica2[i]);
//
//        }

    //zad2

    int[] liczby = {12, 45, 7, 89, 23, 56};

    int max = liczby[0];

    for (int i = 1; i < liczby.length; i++) {
        if (liczby[i] > max) {
            max = liczby[i];
        }

    }
}
