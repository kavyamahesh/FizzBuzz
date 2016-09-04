/**
 * Created by Kruthi on 9/4/2016.
 */
import java.io.*;
import java.util.*;

public class FizzBuzz {
    public int read() {
        String inputline = null;
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputline = is.readLine();
        } catch (IOException e) {
            System.out.println("IOException:" + e);
        }
        return Integer.parseInt(inputline);
    }

    public static void main(String[] args) {
        FizzBuzz fizzbuzz = new FizzBuzz();
        System.out.println("Enter the number");
        int num=fizzbuzz.read();
        for(int i=1;i<=num;i++){
            if(i%5==0 && i%3==0){
                System.out.println("FizzBuzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else System.out.println(num);

        }

    }
}
