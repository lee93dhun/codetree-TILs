import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt=0;
        int sum = 0;
        while(true){
            int age = sc.nextInt();
            if(age < 20 || age >= 30)
                break;
            sum += age;
            cnt++;
        }
        System.out.printf("%.2f",(double)sum/cnt);
    }
}