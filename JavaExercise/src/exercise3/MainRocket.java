package lab4;


import java.util.Arrays;

public class MainRocket {

    //entry point of the application
    public static void main(String[] args) {

        //initialise a payload array variable to size of 10
        int [] payload = new int[10];

        //populate the payload with 10 random numbers from 0 to 100
        for (int i = 0; i < 10; i++) {
            payload[i] = (int)(Math.random()*100); // put a new random number to the index location
        }

        System.out.println("Printing content of payload array");
        for (int i = 0; i < payload.length; i++) {
            System.out.println(payload[i]); // print he value of the payload array index
        }

        //Creating a new instance of Rocket object with payload ad param
        Rocket rocket = new Rocket(payload);
        System.out.println("Payload : " + Arrays.toString(rocket.getPayload()));
        System.out.println("Max: " + rocket.getMaxWeight());
        System.out.println("Mean: " + rocket.getAverageWeight());
        System.out.println("Min: " + rocket.getMinWeight());
        System.out.println("Sum: " + rocket.getLaunchWeight());

    }
}
