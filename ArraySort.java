import java.util.Scanner;

public class ArraySort{
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int N=sc.nextInt();
            int[] Ti=new int[100];
            int[] Si=new int[100];
            int[] Pi=new int[10000];
            for (int i=0;i<N;i++){
                Ti[i]=sc.nextInt();
                Si[i]=sc.nextInt();
                Pi[i]=sc.nextInt();
            }
            for (int j=0;j<N-1;j++){

                int temp=0,temp1=0;
                for (int k=0;k<N-1-j;k++){//冒泡排序法
                    if (Si[k]<Si[k+1]){
                        temp=Si[k];
                        Si[k]=Si[k+1];
                        Si[k+1]=temp;
                        temp=Ti[k];
                        Ti[k]=Ti[k+1];
                        Ti[k+1]=temp;
                    }
                }
            }
          for(int i=0;i<N;i++) {
            System.out.print(Ti[i]+" ");
          }
        }
    }
}