import java.util.Scanner;
import java.lang.*;
import java.util.*;

public class ReadingFromKeyboard {

    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.print("Hi! Please Enter Your Name:");
        name = sc.nextLine();
        System.out.println("Welcome To Our Coding Room " +name);
    }
}