import java.util.Scanner;
public class KafeDoWhile05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti;
        String namapelanggan;
        int hkopi = 12000, hteh = 7000, hroti = 20000;
        do {
            System.out.print("masukan nama pelanggan (ketik 'batal' untuk keluar): ");
            namapelanggan = sc.nextLine();
            if (namapelanggan.equalsIgnoreCase("batal")) {
                System.out.print("Transaksi dibatalkan!");
                break;
            }
            System.out.print("Masukkan jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Masukkan jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Masukkan jumlah roti: ");
            roti = sc.nextInt();

            int totalharga = (kopi * hkopi) + (teh * hteh) + (roti * hroti);
            System.out.println("toatal yang harus dibayar Rp:"+ totalharga);
            sc.nextLine();
        } while (true);

        System.out.println("Semua transaksi selesai.");


       
    }
    
}
