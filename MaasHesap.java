// Ad Soyad: Yusuf Tuğra Deveci
// Öğrenci No:250541095
// Tarih: 02.11.2025
// Açıklama: Bu program kullanıcıdan çalışanın adını, brüt maaşını,
 // haftalık çalışma saatini ve mesai saatini alır. 
 // Alınan bilgilere göre SGK, gelir ve damga vergisi kesintilerini
 // hesaplayarak toplam gelir, toplam kesinti ve net maaşı belirler.
 // Sonuçları düzenli bir maaş bordrosu formatında ekrana yazdırır.

import java.util.Scanner;

public class MaasHesap {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Ad Soyad:");
        String adSoyad = input.nextLine();
        System.out.print("Aylık Brüt Maaş(TL):");
        double brutMaas = input.nextDouble();
        System.out.print("Haftalık Çalışma Saati:");
        int haftalikSaat = input.nextInt();
        System.out.print("Mesai Saati:");
        int mesaiSaat = input.nextInt();
        System.out.println("Bilgiler başarıyla alındı. Hesaplama işlemi başlıyor...");
        final double SGK_ORANI=0.14;
        final double GELİR_VERGİSİ_ORANI=0.15;
        final double DAMGA_VERGİSİ_ORANI=0.00759;
       double mesaiUcreti=(brutMaas/160)*mesaiSaat*1.5;
       double toplamGelir =brutMaas + mesaiUcreti;
       double SGK = toplamGelir*SGK_ORANI;
       double gelirVergisi=toplamGelir*GELİR_VERGİSİ_ORANI;
       double damgaVergisi= toplamGelir*DAMGA_VERGİSİ_ORANI;
       double toplamKesinti=SGK + gelirVergisi +damgaVergisi;
       double netMaas = toplamGelir - toplamKesinti;
       double kesintiOrani =(toplamKesinti/toplamGelir)*100;
       double saatlikNet = netMaas/176;
       double günlükNet = netMaas/22;
       System.out.println(".......");
       System.out.println("MAAŞ BORDROSU");
       System.out.println(".......");
       System.out.println("Çalışan:"+ adSoyad);
       System.out.println("GELİRLER:");
       System.out.printf("Brut Maas : %.2f TL%n", brutMaas);
       System.out.printf("Mesai Ücreri (%dsaat):%.2f TL%n", mesaiSaat,mesaiUcreti);
       System.out.println("------------------------");
       System.out.printf("Toplam Gelir : %.2f TL%n", toplamGelir);
       System.out.println("KESİNTİLER:");
       System.out.printf("SGK kesintisi (%.1f%%):%.2f TL%n", SGK_ORANI*100,SGK);
       System.out.printf("Gelir Vergisi(%.1f%%):%.2f TL%n", GELİR_VERGİSİ_ORANI*100, gelirVergisi);
       System.out.printf("Damga Vergisi(%.1f%%):%.2f TL%n",DAMGA_VERGİSİ_ORANI*100, damgaVergisi);
       System.out.println("------------------------");
       System.out.printf("TOPLAM KESINTI : %.2f TL%n", toplamKesinti);

        input.close();










    }
    }


//Çıktısı:
//Aylık Brüt Maaş(TL):15000
//Haftalık Çalışma Saati:40
//Mesai Saati:10
//Bilgiler başarıyla alındı. Hesaplama işlemi başlıyor...
//.......
//MAAŞ BORDROSU
//.......
//Çalışan:Yusuf Tuğra Deveci
//GELİRLER:
//Brut Maas : 15000,00 TL
//Mesai Ücreri (10saat):1406,25 TL
//------------------------
//Toplam Gelir : 16406,25 TL
//KESİNTİLER:
//SGK kesintisi (14,0%):2296,88 TL
//Gelir Vergisi(15,0%):2460,94 TL
//Damga Vergisi(0,8%):124,52 TL
//------------------------
//TOPLAM KESINTI : 4882,34 TL
