import java.util.Scanner;

public class Tugas218 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          int jumlahToko;
        do {
            System.out.print("Jumlah toko: ");
            jumlahToko = sc.nextInt();
        } while (jumlahToko < 1);
 
        int total = 0, maks = -1, tokoMaks = 0;
 
        for (int t = 1; t <= jumlahToko; t++) {
            int pelanggan;
            do {
                System.out.print("Jumlah pelanggan toko " + t + ": ");
                pelanggan = sc.nextInt();
            } while (pelanggan < 0);
 
            int barangToko = 0;
            for (int p = 1; p <= pelanggan; p++) {
                int barang;
                do {
                    System.out.print("  Barang pelanggan " + p + ": ");
                    barang = sc.nextInt();
                } while (barang < 0);
                barangToko += barang;
            }
 
            System.out.println("Toko " + t + " - pelanggan: " + pelanggan + ", total barang: " + barangToko);
            total += barangToko;
 
            if (barangToko > maks) {
                maks = barangToko;
                tokoMaks = t;
            }
        }
 
        System.out.println("Total barang seluruh toko: " + total);
        System.out.println("Toko dengan barang terbanyak: " + tokoMaks);
        sc.close();

    }
}
