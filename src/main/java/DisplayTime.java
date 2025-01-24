import java.util.Scanner;

public class DisplayTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer for seconds : ");
        int seconds = input.nextInt();
        //Find minutes  in seconds
        int minutes = seconds / 60;
        //Seconds remaining
        int remainingSeconds = seconds % 60;
        System.out.println(seconds + " seconds is " + minutes + " minutes and " +
                remainingSeconds + " seconds");



    }
}
