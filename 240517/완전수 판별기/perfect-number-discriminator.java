import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        int n = sc.nextInt();
        for(int i=1; i<n; i++){
            if(n%i==0){
                sum += i;
            }
        }
        System.out.print( sum == n ? "P" : "N");
    }
}