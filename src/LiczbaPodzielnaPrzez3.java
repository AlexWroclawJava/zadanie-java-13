import java.util.Scanner;

public class LiczbaPodzielnaPrzez3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x = 0;
        int wynikOK = 1;
        
        System.out.println("Podaj liczbę: ");
        int givenNumber = input.nextInt();

        if ((givenNumber > 100) && (givenNumber < 200) && (givenNumber % 3 == 0)) {
            System.out.println("Podana liczba jest OK");
            System.out.println(wynikOK);
            input.close();
        } else if ((givenNumber > 100) && (givenNumber < 200) && (givenNumber % 3 != 0)) {
            System.out.println("podna liczba nie jest podzielna przez 3");
        } else if (givenNumber < 100) {
            System.out.println("Liczba za mała");
        } else {
            System.out.println("Podana liczba jest za duza");
        }
    }
}


