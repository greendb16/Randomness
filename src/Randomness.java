import java.util.Random;



public class Randomness {
    public static void main(String []args){
        System.out.println("Generating 10 random numbers between 1 and 6...");
        Random ran = new Random();

        for (int i = 0; i < 10; i++){
            int randomInt = ran.nextInt(6)+1;
            System.out.println("Generated number: " + randomInt);
        }
        System.out.println("Done");


    }
}
