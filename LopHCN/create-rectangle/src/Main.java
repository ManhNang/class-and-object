import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        double height = scn.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double width = scn.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);
        rectangle.display();
    }
}
