import  java.util.*;
public class Compute1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int i=0;
        String[] b={"1"};
        String[] a=new String[3];
        Scanner scan=new Scanner(System.in);
        while(i<3){
            a[i]=scan.next();
            i++;
        }
        if (a.length != 3) {
            System.out.println("数据无效");
            return;
        }
        int x = Integer.parseInt(a[0]);//强制类型转换
        int y = Integer.parseInt(a[2]);

        if (a[1].equals("+")) {
            System.out.println(x + y);
        } else if (a[1].equals("-")) {
            System.out.println(x - y);
        } else if (a[1].equals("*")) {
            System.out.println(x * y);
        } else {
            System.out.println(x / y);
        }

    }
}

