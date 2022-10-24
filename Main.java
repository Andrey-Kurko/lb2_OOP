
package Lb2_Kurko_Andrey;
import java.util.Scanner;

public class Main {
    public static boolean FirstTask(String input) {
        return input.endsWith("ed");
    }

    public static int SecondTask(String input) {
        int sum = 0;
        for (int i = 0; i < input.length(); i++)  {
            if (Character.isDigit(input.charAt(i))) {
                sum += Integer.parseInt(String.valueOf(input.charAt(i)));
            }
        }
        return sum;
    }

    public static int ThirdTask(String input) {
        int max = 0;
        int longitude = 0;
        char first = input.charAt(0);
        for(int i=0;i< input.length();i++){
            if(input.charAt(i) == first){
                longitude++;
            } else {
                first = input.charAt(i);
                longitude = 1;
            }
            if(longitude>max){
                max = longitude;
            }
        }
        return max;
    }
    public static void FourthTask(String input) {
        String[] words = input.split(" ");
        for (String word : words){
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        Scanner rem = new Scanner(System.in);

        System.out.println("Введіть рядок(ed):");
        String firstTask = rem.nextLine();
        System.out.println(FirstTask(firstTask));

        System.out.println("Введіть рядок із числами: ");
        String secondTask = rem.nextLine();
        System.out.println(SecondTask(secondTask));

        System.out.println("Введіть рядок:");
        String thirdTask = rem.nextLine();
        System.out.println(ThirdTask(thirdTask));

        System.out.println("Введіть рядок:");
        String fourthTask = rem.nextLine();
        FourthTask(fourthTask);


    }
}