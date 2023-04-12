import java.util.Scanner;

public class PracticalAssignment1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Hello and welcome!");
        System.out.print("Please enter your name: ");
        String name = in.nextLine();

        System.out.print("Please enter your title: ");
        String title = in.nextLine();

        System.out.printf("Name: %s \n", name);
        System.out.printf("Title: %s ", title);


    }
}
