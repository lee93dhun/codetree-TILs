import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a_age = sc.nextInt();
        String a_gender = sc.next();
        int b_age = sc.nextInt();
        String b_gender = sc.next();
        if((a_age >= 19 && a_gender.equals("M")) || (b_age >= 19 && b_gender.equals("M")))
            System.out.print(1);
        else System.out.print(0);
    }
}