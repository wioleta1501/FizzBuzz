public class FizzBuzz {
    public static void main(String[] args){

        for (int i=1; i<=100; i++) {
            if (i % 15 == 0) System.out.printf("%d - FizzBuzz\n", i);
            else if (i % 5 == 0) System.out.printf("%d - Buzz\n", i);
            else if (i % 3 == 0) System.out.printf("%d - Fizz\n", i);
            else System.out.printf("%d\n", i);
        }

    }
}
