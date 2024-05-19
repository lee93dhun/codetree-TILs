import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        while(true){
            if( (n/i) <= 1){
                System.out.print(i);
                break;
            }
            n /= i;
            i++;
        }
    }
}