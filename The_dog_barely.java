import java.util.Scanner;
public class The_dog_barely {
    public static void main(String[]args){
        System.out.println("THE DOG BARLEY");
        Scanner Xray= new Scanner(System.in);
        System.out.println("How many big candies");
        int L = Xray.nextInt();
        System.out.println("How many medium candies");
        int M = Xray.nextInt();
        System.out.println("How many small candies");
        int S = Xray.nextInt();

        int mood = S + 2*M + 3*L;

        if (mood <= 9){
            System.out.println("The Dog is unhappy with his" + mood + "candies Bozo");
        }
        else{
            System.out.println("The dog is very content with his" + mood + "candies");
        }




        Xray.close();
    }

}
