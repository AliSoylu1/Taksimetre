package Giriş;
import java.util.Scanner;

public class UcgenAlan {
    public static void main(String[] args) {

        int a,b,c;

        System.out.println("Lütfen üçgenin 3 kenar uzunluğunuda giriniz");
        Scanner input = new Scanner(System.in);

        System.out.print("1. Kenar Uzunluğu: ");
        a = input.nextInt();
        System.out.print("2. Kenar Uzunluğu: ");
        b = input.nextInt();
        System.out.print("3. Kenar Uzunluğu: ");
        c = input.nextInt();
        int u=((a + b + c)/2);
        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgenin alanı: " + alan);





    }
}
