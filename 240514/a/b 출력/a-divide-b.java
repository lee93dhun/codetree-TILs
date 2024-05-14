import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();	
		
		String result = "";
		int i = 0;
		int c = a/b;
		result += c+".";
		
		a = a%b; 
		while( i < 20) {
			result += (a*10)/b;
			a = (a*10)%b;
			i++;
		}
        System.out.println(result);
    }
}