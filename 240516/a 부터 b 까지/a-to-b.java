import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        for(int i=a; a<=b; i++){
            System.out.print(a+" ");
            if(i%2!=0) a *= 2;
            if(i%2==0) a += 3;
        }

        // 여기에 코드를 작성해주세요.
    }
}