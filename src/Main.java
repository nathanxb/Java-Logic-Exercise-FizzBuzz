import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //FizzBuzz exercise
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int input = scanner.nextInt();
        //divisible by both, FizzBuzz
        if ((input % 5 == 0) && (input % 3 ==0)){
            System.out.println("FizzBuzz");
            //If number is divisible by 5 we get Fizz
        }else if(input % 5 == 0) {
            System.out.println("Fizz");
            //divisible by 3. we get buzz
        } else if (input % 3 == 0) {
            System.out.println("Buzz");
            //not divisible by either: the number typed in
        } else {
            System.out.println(input);
        }
    }
}
