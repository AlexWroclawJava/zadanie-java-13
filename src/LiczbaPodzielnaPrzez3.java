import java.util.Scanner;

public class LiczbaPodzielnaPrzez3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x = 0;
        int givenNumber;

        do {
            System.out.println("Podaj liczbę: ");
            givenNumber = input.nextInt();

                if ((givenNumber > 100) && (givenNumber < 200) && (givenNumber % 3 == 0)) {
                System.out.println("Podana liczba jest OK");
            } else if ((givenNumber > 100) && (givenNumber < 200) && (givenNumber % 3 != 0)) {
                System.out.println("podana liczba nie jest podzielna przez 3");
            } else if (givenNumber <= 100) {
                System.out.println("Liczba za mała");
            } else if (givenNumber >= 200) {
                System.out.println("Podana liczba jest za duza");
            }
        } while ((givenNumber < 100) || (givenNumber > 200) || (givenNumber % 3 != 0));
    }
}



