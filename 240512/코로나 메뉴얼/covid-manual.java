import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a_symp = sc.next(); int a_BT = sc.nextInt();
        String b_symp = sc.next(); int b_BT = sc.nextInt();
        String c_symp = sc.next(); int c_BT = sc.nextInt();
        int emCnt=0;
        if(a_symp.equals("Y")){
            if(a_BT>=37) emCnt++; 
        }
        if(b_symp.equals("Y")){
            if(b_BT>=37) emCnt++; 
        }
        if(c_symp.equals("Y")){
            if(c_BT>=37) emCnt++; 
        }
        System.out.print(emCnt>=2?"E":"N");
    }
}