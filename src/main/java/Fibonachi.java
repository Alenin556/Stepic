public class Fibonachi {
    public static void main(String[] args) {
        fibonachi(6);
    }

    public static void fibonachi(int number){
        int[] fibonachi = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
        System.out.println(fibonachi[number]);
    }
}
