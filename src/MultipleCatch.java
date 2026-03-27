import java.util.Scanner;

public class MultipleCatch {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
        }

        int index = input.nextInt();
        int divisor = input.nextInt();

        try {
            int result = arr[index] / divisor;
            System.out.println(result);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index");
        } 
        catch (ArithmeticException e) {
            System.out.println("Divide by zero error");
        }

        input.close();
    }
}
