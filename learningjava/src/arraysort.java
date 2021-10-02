import java.util.ArrayList;
import java.util.Arrays;

public class arraysort {
    public static void main(String[] args) {
        ArrayList<Integer>  arr = new ArrayList<Integer>();
        //The  program should not work for static codes. Instead it should accept input from the user to become dynamic and usable
        Scanner sc=new Scanner(System.in);
        arr.add(sc.nextInt());
        arr.add(sc.nextInt());
        arr.add(sc.nextInt());
        arr.add(sc.nextInt());
        arr.add(sc.nextInt());
      Object[] a = arr.toArray();
        Arrays.sort(a);
        for(int i=0; i<5;i++){
            System.out.print(a[i]+" );
        }


    }
}
