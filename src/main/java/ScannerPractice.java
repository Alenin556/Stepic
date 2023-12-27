import java.text.DecimalFormat;
import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int number1 = scanner.nextInt();
//        int number2 = scanner.nextInt();
//        int number3 = scanner.nextInt();
//
//        System.out.println(number1 + " " + number2 + " " + number3);


        //Число Pi примерно равно 3,1415926. Вывести на экран это число с тремя цифрами в дробной части.

        double pi = scanner.nextDouble();
        double scale = Math.pow(10, 3);
        DecimalFormat decimalFormat = new DecimalFormat( "#.###" );
        String result = decimalFormat.format(pi);
        System.out.print(result);//34,767
        System.out.print(scale);//34,767


        //Составить программу вывода на экран числа, вводимого с клавиатуры. Выводимому числу должно предшествовать сообщение "Вы ввели число".

//        int number = scanner.nextInt();
//        System.out.println("Вы ввели число " + number);


        //Составить программу, которая запрашивает имя человека и повторяет его на экране.
//        String name = scanner.nextLine();
//        System.out.println("Привет, " + name + "!");

        //Напишите программу, в которую вводится целое число, после чего на экран выводится следующее и предыдущее целое число.

//        int number = scanner.nextInt();
//        int nextNumber = number + 1;
//        int previousNumber = number - 1;
//
//        System.out.println("Следующее за числом " + number+ " число - " + nextNumber);
//        System.out.println("Для числа " + number+ " предыдущее число - " + previousNumber);

        //Составить программу ввода на экран следующей информации:
        //
        //5 10
        //
        //7 см

//        int number1 = scanner.nextInt();
//        int number2 = scanner.nextInt();
//        int number3 = scanner.nextInt();
//        String sm = scanner.nextLine();
//
//        System.out.println(100 + " " + number1);
//        System.out.println(1949 + " " + number2);

    }
}
