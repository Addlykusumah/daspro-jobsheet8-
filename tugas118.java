import java.util.Scanner;

public class tugas118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        int total = 0;
        int i = 1;

        if (n <= 0) {
            System.out.println("Nilai n harus lebih besar dari 0");
            return;
        } else {
            while (i <= n) {

                int j = 1;
                while (j <= i) {
                    System.out.print(j);
                    total++;
                    j++;
                    System.out.println("Total Angka yang tercetak = " + total);
                }
                System.out.println();
                i++;
            }

        }

    }
}
