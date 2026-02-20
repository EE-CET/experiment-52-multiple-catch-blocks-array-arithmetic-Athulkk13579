import java.util.Scanner;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            int index = scanner.nextInt();
            int divisor = scanner.nextInt();

            try {
                int result = arr[index] / divisor;
                System.out.println(result);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid Index");
            } catch (ArithmeticException e) {
                System.out.println("Divide by zero error");
            }
        }

        scanner.close();
    }
}
