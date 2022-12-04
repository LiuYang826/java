public class Exam {
    public static void main(String[] args) {
        System.out.println("Start");
        try {
            String s="123a";
            int x=Integer.parseInt(s);
            System.out.println("hello");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("IndexOutOfBound Error");
        }catch (NumberFormatException e){
            System.out.println("NumberFormat Error");
        }
        finally {
            System.out.println("Finally");
        }
        System.out.println("End");
    }
}
