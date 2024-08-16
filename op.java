import java.util.Scanner;

public class op {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for( int i = 0 ; i<3 ; i++ ){
            System.out.println( "============================");
            String name = input.nextLine();
            int n = input.nextInt();
            input.nextInt();
            System.out.printf("-%5s%03d%n" , name , n);
           
        }
        System.out.println("================================");
        input.close();
    }
}
