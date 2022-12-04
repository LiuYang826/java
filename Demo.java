import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo{


    public static void main(String[] args)  {
        double x=3.14;
        FileOutputStream fos=null;
        DataOutputStream dos=null;
        try {
            //FileOutputStream管道是字节流管道
            fos= new FileOutputStream("x.out");
            dos=new DataOutputStream(fos);
            //DataOutputStream数据流管道
            dos.writeDouble(x);
            System.out.println("写入文件成功");

        } catch (FileNotFoundException e) {
            System.out.println("文件没找到");
        }
        catch (IOException e){
            System.out.println("写入错误");
        }
        finally {
            try {
                if (dos==null)dos.close();
                if (fos==null)fos.close();
            }catch (Exception e){}


        }

    }
}