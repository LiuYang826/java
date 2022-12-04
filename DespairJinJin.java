import java.util.Scanner;

public class DespairJinJin {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
		/*
		 a,b分别代表分别表示津津在学校上课的时间和妈妈安排她上课的时间
		 sum表示一天之内学习的时间总数
		 */
        while(scanner.hasNext()) {
            int a, b, sum = 0, max = 0, day = 0;
            for (int i = 1; i <= 7; i++) {
                a = scanner.nextInt();
                b = scanner.nextInt();
                sum = a + b;
                if (sum > max && sum > 8) {//在超过8小时且比之前几天都大的sum，将sum赋给最大值，并记录下津津的这天是哪一天
                    max = sum;
                    day = i;
                }
            }
            System.out.println(day);//由于day初始化值为0所以如果津津没有不高兴的一天就直接输出0
        }
    }
}
