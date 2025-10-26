import java.util.Scanner;
public class bioskop05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalTiket=0;
        int hargaTiket = 50000;
        int jumlahTiket;
        double totalJual=0;

        System.out.println("=========sistem penjualan tiket bioskop==========");
        System.out.println("harga tiket per orang Rp 50.000");
        System.out.println("diskon 10% untuk > 4 tiket: ");
        System.out.println("diskon 15% untuk > 10 tiket: ");
        System.out.println("======================================================\n");

        while (true) {
        System.out.print("Masukkan jumlah tiket yang dibeli (ketik 0 untuk selesai): ");
        jumlahTiket = sc.nextInt();
             if (jumlahTiket == 0) {
                  break;
             }
            if (jumlahTiket <0) {
                System.out.println("Jumlah tiket tidak valid (negatif). silahkan masukkan kembali!\n");
                continue; 
            }
            double diskon = 0;
            if (jumlahTiket >10) {
                diskon = 0.15;
                System.out.println("Anda mendapatkan diskon : 15%");
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
                System.out.println("Anda mendapatkan diskon : 10%");
            }
            double totalBayar = jumlahTiket * hargaTiket * (1 - diskon);
            System.out.println("Total harga untuk " + jumlahTiket + " tiket: Rp" + (int)totalBayar+"\n");

            totalTiket += jumlahTiket;
            totalJual += totalBayar;

        }
           System.out.println("================RINGKASAN PENJUALAN TIKET==================");
            System.out.println("Total tiket terjual : " + totalTiket);
            System.out.println("Total penjualan     : Rp" + (int)totalJual);
        }
    }




      
        
    


