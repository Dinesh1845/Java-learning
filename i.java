import java.util.Scanner;

class i{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int h = input.nextInt();
        for(int i =0 ; i>h; i++){
            long x = input.nextLong();
            if(x <100 && x>200){
                System.out.println("you're correct your value is beetween 100 to 200");
            }
            byte b = input.nextByte();
            if(b > -128 && b<127){
                System.out.println("your vanle is beetween 127");
            }
        }
    }
}
