import java.util.Scanner;

public class problem_2 {
    public static void main(String[] args) {

        /*Problem-2: With a single integer as the input, generate the following until a = x [series of numbers as shown in below examples]
        Output:
        1) input a = 1, then output : 1
        2) input a = 2, then output : 1, 3
        3) input a = 3, then output : 1, 3, 5
        4) input a = 4, then output : 1, 3, 5, 7
        5) input a = x, then output : 1, 3, 5, 7*/

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int a = input.nextInt();

        for(int i = 1 ; i <= 2 * a ; i++){
            if(i % 2 == 0){
                continue;
            }
            else{
                System.out.print(i + " ");
            }
        }

    }
}
