İsim Soyad:Yusuf Tuğra Deveci      Öğrenci Numarası:250541095


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


