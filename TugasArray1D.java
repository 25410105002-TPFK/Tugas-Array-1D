// Nama : Tri Prasetyo Fandy Kusuma
// NIM  : 25410105002

import java.util.Scanner;

public class TugasArray1D {
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] kategori = new String[10];
        int[] harga = new int[10];
        int[] jumlahBeli = new int[10];
        int jumlahKategori = 0;
        int pilihan;

        do {
            System.out.println(" Pemesanan Tiket SurabayaZoo ");
            System.out.println("1. Input Kategori dan Harga");
            System.out.println("2. Input Jumlah Beli");
            System.out.println("3. Lihat Total Bayar");
            System.out.println("4. Keluar Program");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1 -> {
                    System.out.print("Masukkan jumlah kategori tiket: ");
                    jumlahKategori = input.nextInt();
                    input.nextLine();
                    for (int i = 0; i < jumlahKategori; i++) {
                        System.out.print("Kategori ke-" + (i + 1) + ": ");
                        kategori[i] = input.nextLine();
                        System.out.print("Harga tiket " + kategori[i] + ": Rp ");
                        harga[i] = input.nextInt();
                        input.nextLine();
                        jumlahBeli[i] = 0;
                    }
                    System.out.println("Data berhasil disimpan.");
                }
                case 2 -> {
                    if (jumlahKategori == 0) {
                        System.out.println("Belum ada data kategori. Silakan pilih menu 1 terlebih dahulu.");
                        break;
                    }
                    System.out.println("--- Input Jumlah Tiket yang Dibeli ---");
                    for (int i = 0; i < jumlahKategori; i++) {
                        System.out.print("*) Kategori " + kategori[i] + " Harga Rp." + harga[i] + ": ");
                        jumlahBeli[i] = input.nextInt();
                        input.nextLine();
                    }
                    System.out.println("Jumlah tiket berhasil disimpan.");
                }
                case 3 -> {
                    if (jumlahKategori == 0) {
                        System.out.println("Belum ada data. Silakan isi menu 1 dan 2 terlebih dahulu.");
                        break;
                    }
                    // ini notanya saya dibantu AI bu karena susah nyusun yg sama seperti nota asli🙏🏻😭

                    System.out.println("========================================");
                    System.out.println("         STRUK PEMESANAN TIKET          ");
                    System.out.println("               SurabayaZoo              ");
                    System.out.println("========================================");
                    System.out.printf("%-15s %10s %8s %15s%n", "Kategori", "Harga", "Qty", "Subtotal");
                    System.out.println("----------------------------------------");
                    int totalBayar = 0;
                    for (int i = 0; i < jumlahKategori; i++) {
                        int subtotal = harga[i] * jumlahBeli[i];
                        totalBayar += subtotal;
                        System.out.printf("%-15s %,10d %8d %,15d%n",
                                kategori[i], harga[i], jumlahBeli[i], subtotal);
                    }
                    System.out.println("TOTAL BAYAR: " + totalBayar);
                }
                case 4 -> System.out.println("Terima kasih! Sampai jumpa.");
                default -> System.out.println("Pilihan tidak valid. Silahkan masukkan angka (1/2/3/4)");
            }
        } while (pilihan != 4);

        input.close();
    }
}