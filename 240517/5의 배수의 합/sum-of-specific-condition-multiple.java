import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(), b = sc.nextInt();
        int result = 0;
        for(int i=a; i<=b; i++){
            if(i%5==0){
                result +=i;
            }
        }
        System.out.print(result);
    }
}