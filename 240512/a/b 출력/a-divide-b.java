import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt() , b = sc.nextInt();
        String result = "0.";
        int i = 0;
		while( i < 20) {
			result += (a*10)/b;
			a = (a*10)%b;
			i++;
		}
        System.out.print(result);
        
    }
}