import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double avarage;
        int math, physics, chemistry, history;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your math grade: ");
        math = scanner.nextInt();
        System.out.print("Please enter you physics grade: ");
        physics = scanner.nextInt();
        System.out.print("Please enter your history grade: ");
        history = scanner.nextInt();

        avarage = (math + physics + history) / 3.0;
        System.out.println("Your avarage= " + avarage);


    }
}


