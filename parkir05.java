import java.util.Scanner;
public class parkir05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis,durasi,total=0;

        System.out.println("============================SISTEM PEMBAYARAN PARKIR=============================");
        System.out.println("Tarif : mobil:3000/jam, motor:2000/jam");
        System.out.println(" parkir lebih dari 5 jam, diberikan tarif sebesar Rp 12.500 untuk semua kendaraan");
        System.out.println("=================================================================================\n");

        do {
            System.out.print("Masukkan jenis kendaraan (1: mobil, 2: motor, 0: keluar): ");
            jenis = sc.nextInt();

            if(jenis != 0) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();

                if (durasi >5) {
                    total += 12500;
                } else {
                    if (jenis == 1) {
                        total += durasi * 3000;
                    } else if (jenis == 2) {
                        total += durasi * 2000;
                    } 
                } 
            }  
        }while (jenis !=0) ;
                System.out.println("\n=======================TOTAL PARKIR============================");
                System .out.println("Total tarif parkir: Rp" + total + "");
                System.out.print("TERIMA KASIH  ");
    
    }
}
