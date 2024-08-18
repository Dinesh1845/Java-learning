import java.util.Scanner;

public class op {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println( "============================");
        for( int i = 0 ; i<3 ; i++ ){
           
            String name = input.nextLine();
            input.nextLine();
            int n = input.nextInt();
            input.nextInt();
            System.out.printf("-%5s%03d%n" , name , n);
           
        }
        System.out.println("================================");
        input.close();
    }
}
