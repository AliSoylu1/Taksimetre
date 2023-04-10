package Giriş;
import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

        int km;
        double perKm=2.20, total, startPrice = 10;
        System.out.println("Lütfen gidilen mesafeyi km olarak giriniz");
        Scanner input = new Scanner(System.in);

        km = input.nextInt();
        System.out.print("Gidilen yol:  " + km + "km'dir");

        total = (km + perKm);
        total += startPrice;

        total = (total < 20) ? 20 : total ;

        System.out.println("Toplam Tutar: " + total);


    }
}
