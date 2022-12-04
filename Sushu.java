public class Sushu {
    public static void main(String[] args){
        for (int i=2;i<100;i++){
            if (isPrime(i)){
                System.out.println(i+"是素数");
            }
        }

    }
    public static boolean isPrime(int i) {
        int s = (int) Math.sqrt(i);

        for (int j = 2; j <= s; j++) {
            if (i % j == 0)return false;
        }
            return true;
    }
}
