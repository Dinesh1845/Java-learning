import java.util.Scanner;

public class n {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        while(name.hasNextInt()){
            int n = name.nextInt();
            System.out.println(n);
        }
        name.close();
    }
}
