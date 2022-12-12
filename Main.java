import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int birinci_sayi;
        int ikinci_sayi;

        System.out.print(" Birinci Sayı: ");
        birinci_sayi = scanner.nextInt();
        System.out.print(" İkinci Sayı : ");
        ikinci_sayi = scanner.nextInt();

        System.out.print(" Değiştirilmeden Önce ... ");
        System.out.println();
        System.out.print(" Birinci Sayı : " + birinci_sayi);
        System.out.println();
        System.out.print(" İkinci Sayı : " + ikinci_sayi);

        int gecici = birinci_sayi;
        birinci_sayi = ikinci_sayi;
        ikinci_sayi = gecici;

        System.out.println();

        System.out.print(" Değiştirildikten Sonra ... ");
        System.out.println();
        System.out.print(" Birinci Sayı : " + birinci_sayi);
        System.out.println();
        System.out.print(" İkinci Sayı : " + ikinci_sayi);

        //erdemacar6



    }

}
