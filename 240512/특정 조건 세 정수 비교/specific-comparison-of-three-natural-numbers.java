import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        int result1 = (a <= b && a <= c)? 1:0;
        int result2 = (a == b && b == c) ? 1:0;
        System.out.print(result1+" "+result2);
    }
}