package November.Experiments_Nov;

public class Exp004_FizzBuzz {
    public static void main(String[] args) {

        int fizzCount = 0;
        int buzzCount = 0;
        int fizzBuzzCount = 0;

        for (int i=1;i<=100;i++){
            if (i%3==0 && i%5==0 ){
                System.out.println("FizzBuzz");
                fizzBuzzCount++;
            } else if (i%3==0) {
                System.out.println("Fizz");
                fizzCount++;
            } else if (i%5==0) {
                System.out.println("Buzz");
                buzzCount++;
            }
            else {
                System.out.println(i);
            }
        }

        System.out.println("Count of Fizz is " +fizzCount);
        System.out.println("Count of Buzz is " +buzzCount);
        System.out.println("Count of FizzBuzz is " +fizzBuzzCount);
    }
}
