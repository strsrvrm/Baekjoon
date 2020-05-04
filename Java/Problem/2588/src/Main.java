import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = A * (B % 10);
        int D = A * ((B % 100) / 10);
        int E = A * (B / 100);
        int F = C + (D * 10) + (E * 100);

        System.out.println(String.format("%d\n%d\n%d\n%d", C, D, E, F));

    }

}