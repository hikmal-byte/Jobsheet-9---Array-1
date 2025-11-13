import java.util.Scanner;

public class Tugas1Array1 {
    public static void main(String[] args) {
        Scanner hikmal = new Scanner(System.in);
        System.out.print("Masukkan jumlah nilai mahasiswa yang diinput: ");
        int arrNilai[] = new int[hikmal.nextInt()];
        int rata2, nilaiTertinggi = 100, nilaiTerendah = 66, totalNilai = 0;

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = hikmal.nextInt();
            totalNilai += arrNilai[i];
            if (arrNilai[i] > nilaiTertinggi) {
                nilaiTertinggi = arrNilai[i];
            }
            if (arrNilai[i] > nilaiTerendah) {
                nilaiTerendah = arrNilai[i];
            }
        }

        System.out.println();
        rata2 = totalNilai / arrNilai.length;

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + " = " + arrNilai[i]);
        }
        System.out.println();
        System.out.println("Nilai rata-rata = " + rata2);
        System.out.println("Nilai terendah = " + nilaiTerendah);
        System.out.println("Nilai tertinggi = " + nilaiTertinggi);

        hikmal.close();
    }
}