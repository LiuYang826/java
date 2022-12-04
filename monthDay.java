import java.util.Scanner;
public class monthDay {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            String y=scan.next();
            String y1[]=y.split("-");//提取“-”
            int [] year=new int[2];//年份和月份
            for (int x = 0; x < year.length; x++) {
                int number = Integer.parseInt(y1[x]);
                year[x] = number;
            }
            int day=0;
        switch (year[1]){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day=30;
                break;
            case 2:
                if ((year[0]%4==0)&&(year[0]%100!=0)||year[0]%400==0){
                    day=29;
                }else {
                    day=28;
                }
                break;
        }
        System.out.println(day);

    }
}
}
