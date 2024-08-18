import java.util.Scanner;

public class t {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        for(int i =0;i<3; i++){
            String user = name.nextLine();
            name.nextLine();
            System.out.println(user);
        }
      name.close();
    }
}
