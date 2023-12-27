import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        output1(number);
    }
    public static void output1(int number){
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (number % 3 == 0){
            System.out.println("Fizz");
        }else if (number % 5 == 0){
            System.out.println("Buzz");
        }else {
            System.out.println(number);
        }
    }
}
