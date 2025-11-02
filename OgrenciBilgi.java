// Ad Soyad: Yusuf Tuğra Deveci
// Öğrenci No:250541095
// Tarih:02.11.2025
// Açıklama:  -Görev-1  Öğrenci Bilgi Sistemi (GPA Değerlendirmeli)
  //Bu program kullanıcıdan öğrencinin adını, soyadını, numarasını,
  //yaşını ve not ortalamasını (GPA) alır. Girilen GPA değerine göre
 // öğrencinin başarılı veya başarısız olduğunu değerlendirir.
  //Sonuçları düzenli bir formatta ekrana yazdırır.

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double MAX_GPA=4.00;
        final double MIN_GPA=0.00;
        final double BASARI_ESIK = 2.50;

        System.out.println("...... Öğrenci Bilgi Sistemi .......");

        System.out.println("Adınızı girin:");
        String ad = input.nextLine();

        System.out.println("Soyadınızı girin:");
        String soyad = input.nextLine();

        System.out.println("Öğrenci numaranızı girin:");
        int ogrenciNo = input.nextInt();


        System.out.println("Yaşınızı girin");
        int yas = input.nextInt();

        System.out.println("GPA (0.00-4.00):");
        double gpa = input.nextDouble();

        System.out.println("...... Öğrenci Bilgi Sistemi .......");

        System.out.printf("Ad Soyad:%s %s\n", ad, soyad);
        System.out.printf("Öğrenci No: %d\n", ogrenciNo);
        System.out.printf("Yaş: %d\n", yas);
        System.out.printf("GPA: %.2f\n", gpa);

        if (gpa >= BASARI_ESIK) {
            System.out.println("Durum:Başarılı Öğrenci");
        } else {
            System.out.println("Durum: Başarısız Öğrenci");
        }

        input.close();

    }
}

//Çıktısı: ...... Öğrenci Bilgi Sistemi .......
//Adınızı girin:
//Yusuf Tuğra
//Soyadınızı girin:
//Deveci
//Öğrenci numaranızı girin:
//250541095
//Yaşınızı girin
//18
//GPA (0.00-4.00):
//3,50
//...... Öğrenci Bilgi Sistemi .......
//Ad Soyad:Yusuf Tuğra Deveci
//Öğrenci No: 250541095
//Yaş: 18
//GPA: 3,50
//Durum:Başarılı Öğrenci
