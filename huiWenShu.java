import java.util.Scanner;
public class huiWenShu {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        while (scann.hasNext()){
            String next = scann.next();
//            StringBuffer stringBuffer = new StringBuffer(next);
            String stringR=next + "";
            String s = new StringBuffer(stringR).reverse().toString();//StringBuffer可以储存和操作字符串
            if (next.equals(s)){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }
    }
}
