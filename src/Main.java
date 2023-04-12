import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
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