import java.util.Scanner;

public class Mili_v_Kilometry {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введи количество миль ");
        float num = in.nextInt();
        float y = (float)  (num * 1.609);
        System.out.println("В "  + num + " милях - " + y + " километров");
    }
}
