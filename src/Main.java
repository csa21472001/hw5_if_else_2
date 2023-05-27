import java.util.concurrent.ThreadLocalRandom;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
    }
    public static void task6()
    {   System.out.println("Задача 6");
        //int age = (int) Math.floor(Math.random());
        int passenger = ThreadLocalRandom.current().nextInt(0,  150 + 1);
        if (passenger>0 && passenger<=60 ) {
            System.out.println("Вы счастливый пассажир номер "+passenger+" для вас есть сидячее место");
        } else if (passenger>60&&passenger<=102){
            System.out.println("Вы пассажир номер "+passenger+" для вас есть стоячее место");
        } else {
            System.out.println("Мест нет. Пожалуйста покиньте вагон");
        }
    }
}