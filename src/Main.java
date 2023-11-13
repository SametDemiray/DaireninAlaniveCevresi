import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Integer r;
        Double pi = 3.14;

        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen Dairenin Yarıçapını Giriniz : ");
        r = inp.nextInt();
        Double alan = pi * r * r;
        Double cevre = 2 * pi * r;

        System.out.println("Dairenin Alanı : " + alan);
        System.out.println("Dairenin Çevresi : " + cevre);
    }
}