import java.util.Scanner;
public class jinzhi{
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
            int ten=scan.nextInt();
            if(ten>=0){
                int x=1, y=0;
                String two="";
                while(x!=0){
                    x=ten/2;
                    y=ten%2;
                    ten=x;
                    two+=y;
                }
                for(int i=two.length()-1;i>=0;i--){
                    System.out.print(two.charAt(i));//返回指定索引处的字符
                }
                System.out.println();
            }
        }
    }
}
