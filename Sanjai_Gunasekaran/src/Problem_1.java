import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {

//        Problem-1: Create a small calculator which performs operations such as Addition, Subtraction, Multiplication and Division using class.
//        Calculator inputs :> ‘a’, ‘b’ and ‘type of operation’
//        Datatype :> ‘a’ = double, ‘b’ = double, ‘type of operation’ = string

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the First number:");
        double a = input.nextDouble();
        input.nextLine();

        System.out.println("Enter the Operator(+,-,*,/):");
        String operator = input.nextLine();

        System.out.println("Enter the Second number:");
        double b = input.nextDouble();


        double result = 0;

        switch(operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if(b == 0){
                    System.out.println("Number cannot be divided using Zero");
                    return;
                }
                else{
                    result = a/b;
                    break;
                }
        }

        System.out.println("Value of a " + operator + " b : " + result);
        input.close();

    }

}
