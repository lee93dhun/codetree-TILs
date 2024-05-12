import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int midVal = (a>b && a<c) || (a>c && a<b) ? a : (b>a && b<c) || (b>c && b<a) ? b : c;
        System.out.print(midVal);
    }
}