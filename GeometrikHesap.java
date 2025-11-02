// Ad Soyad: Yusuf Tuğra Deveci
// Öğrenci No:250541095
// Tarih: 02.11.2025
// Açıklama: Gorev 2 - Geometrik Hesaplayıcı
//Bu program kullanicidan dairenin yarıçapını alır ve
 // bu yarıçap değerine göre çeşitli geometrik hesaplamalar yapar.
 // Dairenin alanı, çevresi ve çapı ile kürenin hacmi ve yüzey alanını
// hesaplayarak sonuçları düzenli bir biçimde ekrana yazdırır.

import java.util.Scanner;
public class GeometrikHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını girin :");
        double r = input.nextDouble();
        final double PI =3.14159;
        double daireAlani = PI*r*r;
        double daireÇevresi = 2*PI*r;
        double daireÇapi = 2*r;
        double kureHacmi = (4.0/3.0)*PI*Math.pow(r,3);
        double kureYuzeyAlani = 4*PI*Math.pow(r,2);

        System.out.println(".....Geometrik Hesaplayıcı.....");

        System.out.print("Dairenin yarıçapını giriniz:");
        System.out.printf("%.1f%n",r);
        System.out.println("Sonuçlar");
        System.out.printf("Daire Alanı:  %.2f cm^2%n",daireAlani);
        System.out.printf("Dairenin Çevresi:  %.2f cm%n",daireÇevresi);
        System.out.printf("Daire Çapı: %.2f cm%n",daireÇapi);
        System.out.printf("Kürenin Hacmi:  %.2f cm^3%n",kureHacmi);
        System.out.printf("Küre Yüzey Alanı:  %.2f cm^2%n",kureYuzeyAlani);


        input.close();

     // Çıktısı: Dairenin yarıçapını girin : 5,0
//.....Geometrik Hesaplayıcı.....
//Dairenin yarıçapını giriniz:5,0
//Sonuçlar
//Daire Alanı:  78,54 cm^2
//Dairenin Çevresi:  31,42 cm
//Daire Çapı: 10,00 cm
//Kürenin Hacmi:  523,60 cm^3
//Küre Yüzey Alanı:  314,16 cm^2


