import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String determine = "N";
        for(int i = 2; i<n; i++){
            if(n%i==0){
                determine = "C";
                break;
            }
        }
        System.out.print(determine);
        
    }
}