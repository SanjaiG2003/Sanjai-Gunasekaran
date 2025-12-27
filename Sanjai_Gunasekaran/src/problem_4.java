import java.util.Scanner;

/*Problem-4: Get the total count of number listed in the dictionary which is multiple of [1,2,3,4,5,6,7,8,9]
        (examples)
input: [1,2,8,9,12,46,76,82,15,20,30]
Output:
        {1: 11, 2: 8, 3: 4, 4: 4, 5: 3, 6: 2, 7: 0, 8: 1, 9: 1}*/

public class problem_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Size:");
        int size = input.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter input:");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        int[] output = new int[9];

        for (int num : arr) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    output[i - 1]++;
                }
            }
        }

        System.out.print("{");
        for (int i = 0; i < 9; i++) {
            System.out.print((i + 1) + ": " + output[i]);
            if (i < 8) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        input.close();
    }
}
