import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("What is car speed in kilometers per hour?");
        var speed = scanner.nextDouble();

        while (true) {
            System.out.println("How meny travel time in hours?");
            var time = scanner.nextDouble();

            if (time == 0)
                break;

        var result = speed * time;
        System.out.println("Result = " + result);
        }
    }
}