public class Main {

    public static void main(String[] args) {
        System.out.println("Игра FizzBuzz ");
        int numbers = 100;
        SortingArray(numbers);
    }

    public static void SortingArray(int numbers) {
        for (int i = 1; i <= numbers; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}