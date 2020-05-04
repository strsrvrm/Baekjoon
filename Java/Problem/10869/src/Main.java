import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        System.out.println(String.format("%d\n%d\n%d\n%d\n%d", A + B, A - B, A * B, A / B, A % B));

    }

}