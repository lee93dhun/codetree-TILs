import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt(), b = sc.nextInt();
        a+=b;
        b+=a;
        System.out.print(a+" "+b);
    }
}