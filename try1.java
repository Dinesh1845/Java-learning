import java.util.Scanner;

public class try1 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int a = user.nextInt();
        if(a <= 7){
            System.out.println("less than seven");
        }else{
            System.out.println("greater than seven");
        }
    

    int num1 = 6;
    int num2 = 8;

    boolean result = num1 < num2;
    System.out.println(result);
    }
}
