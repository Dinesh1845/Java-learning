import java.util.Scanner;

public class w {
    public static void main(String args[]){
        Scanner num = new Scanner(System.in);
        while(num.hasNextInt()){
            int number = num.nextInt();
            System.out.println(number);
        }

        num.close();
    }

}
