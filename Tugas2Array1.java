import java.util.Scanner;

public class Tugas2Array1 {
    public static void main(String[] args) {
        Scanner hikmal = new Scanner(System.in);
        System.out.print("Masukkan jumlah pesanan :");
        int jmlPesanan = hikmal.nextInt();
        System.out.println();
        int total = 0;
        String namaPesanan[] = new String[jmlPesanan];
        int hargaPesanan[] = new int[jmlPesanan];
        for (int i = 0; i < jmlPesanan; i++) {
            System.out.print("Masukkan nama pesanan ke-" + (i + 1) + " : ");
            namaPesanan[i] = hikmal.nextLine();
            System.out.print("Masukkan harga pesanan ke-" + (i + 1) + " : ");
            hargaPesanan[i] = hikmal.nextInt();
            total += hargaPesanan[i];
        }
        System.out.println();
        for (int i = 0; i < jmlPesanan; i++) {
            System.out.println("Pesanan ke-1 :");
            System.out.println("\tNama: " + namaPesanan[i]);
            System.out.println("\tHarga: " + hargaPesanan[i]);
        }
        System.out.println();
        System.out.println("Total belanja = " + total);

        hikmal.close();
    }
}