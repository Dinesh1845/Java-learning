import java.util.Scanner;

class hello {
    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);
        String user = h.nextLine();
        System.out.println("you entered "+ user);
 
        h.close();


    }
}