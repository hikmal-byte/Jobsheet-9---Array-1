import java.util.Scanner;

public class Tugas3Array1 {
    public static void main(String[] args) {
        Scanner hikmal = new Scanner(System.in);
        System.out.println("Daftar Menu");
        String menu[] = {"Nasi Goreng", "mie goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice",};

        for (int i = 0; i < menu.length; i++) {
            System.out.println("- "+menu[i]);
        }
        System.out.println();
        System.out.print("Masukkan nama menu yang dicari : ");
        String cari=hikmal.nextLine();
        String hasil="Menu tidak ditemukan";
        for (String CariTemp : menu) {
            if (cari.equalsIgnoreCase(CariTemp)) {
                hasil="Menu tersedia";
                break;
            }
        }
        System.out.println(hasil);
        hikmal.close();
    }
}