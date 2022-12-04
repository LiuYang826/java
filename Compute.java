import  java.util.*;
public class Compute {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        if (args.length != 3) {
            System.out.println("数据无效");
            return;
        }
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[2]);

        if (args[1].equals("+")) {
            System.out.println(x + y);
        } else if (args[1].equals("-")) {
            System.out.println(x - y);
        } else if (args[1].equals("*")) {
            System.out.println(x * y);
        } else {
            System.out.println(x / y);
        }

    }
}

