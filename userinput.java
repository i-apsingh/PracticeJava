import java.util.Scanner;

public class userinput{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("enter number : ");
        int age = input.nextInt();

        System.out.println("this is your age : "+age);
    }
}