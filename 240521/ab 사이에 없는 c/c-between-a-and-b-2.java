import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        String determine = "NO";
        for(int i = a; i<=b; i++){
            if(c%i==0){
                determine="YES";
                break;
            }
        }
        System.out.print(determine);
    }
}