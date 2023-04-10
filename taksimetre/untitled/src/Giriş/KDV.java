package Giriş;
import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {

        double price;

        System.out.println("KDV Tutarı Hesaplama Programına Hoşgeldiniz...");
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen KDV ve KDV'li Fiyatını Görmek İstediğiniz Tutaru Giriniz:");
        price = input.nextDouble();
        double firstPrice=price;
        double result = price >= 0 && price <= 1000 ? price*(1.18) : price*(1.08);

        System.out.println("Girilen Tutar: " + firstPrice);
        System.out.println("KDV'li Tutar: " + result);




    }
}
