import java.util.Scanner;

public class e {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        try{
            int n = name.nextInt();
        }
        catch(Exception e){
            System.out.println("you enter a wrong");
        }

        System.out.println("end");
        
        name.close();

    }
    
}
