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




//        System.out.printf("Your number: %d \n", num);
//        in.close();
//class Main {
//    public static int func(){  //идентификатор доступа, функция статична, тип возвращаемого значения и имя функции без параметров
//        int n = 10;  //создание переменной со значением
//        return n;  //возврат значения при вызове данной функции
//    }
//
//    public static void func1(){  //идентификатор доступа, функция статична, тип возвращаемого значения и имя функции без параметров
//        System.out.println("Привет из функции!");  //вывод на экран сообщения
//    }
//
//    public static void main(String[] args) {  //основной блок программы
//
//        int u = func();  //присвоение переменной значения возвращённого функцией
//        System.out.println(u);  //вывод на экран значения переменной
//
//        func1();  //вызов функции по имени
//    }
//}

