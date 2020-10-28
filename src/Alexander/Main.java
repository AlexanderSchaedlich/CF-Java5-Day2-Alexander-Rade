package Alexander;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //String string = "Was it a car or a cat I saw?";
        //System.out.println(string.length());
        //System.out.println(string.substring(9, 12));
        //System.out.println(string.split());


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your full name:");

        //String output = "";

        while (input.hasNext()) {
            //output += input.next().charAt(0) + "-";
            System.out.print(input.next().charAt(0));
        }
    }
}
