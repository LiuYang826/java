import java.util.Scanner;
public class SuShuNumber{
    public static void main(String args[]){
        Scanner IN=new Scanner(System.in);
        while(IN.hasNext()){
            int  num=(IN.nextInt());//输入一个数,对x进行赋值
            int sum=0,i,j;
            for (i = 2; i < num; i++) {
                boolean flag=true;
                for (j = 2; j <= Math.sqrt(i); j++) {
                    if (i%j==0){
                        flag=false;
                        break;
                    }
                }
                if (flag)
                    sum++;
            }
            System.out.println(sum);
            sum=0;
        }
    }
}
//第二种算法。时间复杂度更低
//import java.util.Scanner;
//public class Sushu {
//
//    public static int countPrimes(int n) {
//        if (n == 0 || n == 1)
//            return 0;
//        int[] primes = new int[n];
//        int res = n - 2;
//        primes[0] = 1;
//        primes[1] = 1;
//        for (int i = 2; i < n; i++) {
//            if (primes[i] == 0) {
//                for (int j = 2; i * j < n; j++) {
////                    [2,4,6,9,8]
//                    if (primes[i * j] != 1) {
//                        primes[i * j] = 1;
//                        res--;
//                    }
//                }
//            }
//        }
//        return res;
//    }
//
//    public static void main(String[] args) {
//        Scanner IN=new Scanner(System.in);
//        while(IN.hasNext()) {
//            int  N=(IN.nextInt());
//            int count = countPrimes(N);
//            System.out.println(count);
//        }
//    }
//}
