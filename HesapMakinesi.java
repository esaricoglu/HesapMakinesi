package KosulluIfadelerveKodBlokları;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("ilk sayıyı giriniz: ");
        int a = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int b = input.nextInt();

        System.out.println("Toplama işlemi için 1'e basınız.");
        System.out.println("Çıkarma işlemi için 2'ye basınız.");
        System.out.println("Çarpma işlemi için 3'e basınız.");
        System.out.println("Bölme işlemi için 4'e basınız.");
        int decision = input.nextInt();

        switch (decision) {
            case 1:
                System.out.println(a + "+" + b + "=" + (a + b));
                break;
            case 2:
                System.out.println(a + "-" + b + "=" + (a - b));
                break;
            case 3:
                System.out.println(a + "*" + b + "=" + (a * b));
                break;
            case 4:
                switch (b) {
                    case 0:
                        System.out.println("Sıfıra bölünemez.");
                        break;
                    default:
                        System.out.println(a + "/" + b + "=" + (a / b));
                }
                break;
            default:
                System.out.println("Tanımlanmamış bir seçim yaptınız.");


        }
    }
}
