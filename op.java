import java.util.Scanner;

public class op {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=================================");
        for(int i = 0; i < 3; i++){
            int a = input.nextInt();
            String b = input.next();
            input.next();
            System.out.printf("%-5s%03d%n" , a , b );
        }
        System.out.println("=================================");
    input.close();
    }
    
}
