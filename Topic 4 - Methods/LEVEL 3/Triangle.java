import java.util.Scanner;
public class Triangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input 3 points
        System.out.print("Enter x1 y1: ");
        int x1 = input.nextInt(), y1 = input.nextInt();

        System.out.print("Enter x2 y2: ");
        int x2 = input.nextInt(), y2 = input.nextInt();

        System.out.print("Enter x3 y3: ");
        int x3 = input.nextInt(), y3 = input.nextInt();

        // Check collinearity
        if (checkBySlope(x1, y1, x2, y2, x3, y3))
            System.out.println("Collinear (Slope Method)");
        else
            System.out.println("Not Collinear (Slope Method)");

        if (checkByArea(x1, y1, x2, y2, x3, y3))
            System.out.println("Collinear (Area Method)");
        else
            System.out.println("Not Collinear (Area Method)");
    }

    static boolean checkBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    }

    static boolean checkByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        return area == 0;
    }
}

