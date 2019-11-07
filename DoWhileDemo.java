import java.util.Scanner;
public class DoWhileDemo {
    public static void main(String[] args) {
        
        int sum= 0;
        int i = 1;

        do{
            sum = sum + i;
            i ++;

        }
        while(i < 101);
        System.out.println(sum);


    }


}