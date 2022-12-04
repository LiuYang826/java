import java.util.Arrays;
import java.util.Scanner;

class RankScore implements Comparable{
    private int id;
    private  int num;
    private int time;

    public RankScore(int id, int num, int time) {
        this.id = id;
        this.num = num;
        this.time = time;
    }
    @Override
    public int compareTo(Object o){
        RankScore rs=(RankScore)o;

        if (this.num>rs.num){
            return -1;
        }else if(this.num<rs.num){
            return 1;
        }else {
            if(this.time>rs.time){
                return 1;
            }else if(this.time<rs.time){
                return -1;
            }
        }
        return 0;
    }
    @Override
    public String toString(){
        return " "+id;
    }
}
public class ArraySort1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while (scan.hasNext()){
            int N=scan.nextInt();
            RankScore[] ranks=new RankScore[N];
            for (int i=0;i<N;i++){
                int id=scan.nextInt();
                int num=scan.nextInt();
                int time=scan.nextInt();
                ranks[i]=new RankScore(id,num,time);
            }
            Arrays.sort(ranks);
            for (RankScore rs:ranks){
                System.out.print(rs);
            }
        }
    }
}
