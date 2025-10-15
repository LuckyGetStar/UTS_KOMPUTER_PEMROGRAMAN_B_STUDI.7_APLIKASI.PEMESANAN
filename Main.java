import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pemesanan psn = new Pemesanan();

        System.out.println("=== APLIKASI PEMESANAN MAKANAN ===");

        System.out.print("MASUKKAN NAMA PELANGGAN: ");
        String nama = input.nextLine();
        System.out.print("MASUKKAN NOMOR TELEPON: ");
        String telepon = input.nextLine();
        psn.setPelanggan(nama, telepon);

        String[] daftarMenu = psn.getMenu();
        int[] daftarHarga = psn.getHargaMenu();

        System.out.println("\nDAFTAR MENU MAKANAN:");
        for (int i = 0; i < daftarMenu.length; i++) {
            System.out.println((i + 1) + ". " + daftarMenu[i] + " - Rp" + daftarHarga[i]);
        }

        System.out.print("\nPILIH NOMOR MENU: ");
        int pilihan = input.nextInt();

        if (pilihan < 1 || pilihan > daftarMenu.length) {
            System.out.println("MENU TIDAK TERSEDIA!");
            input.close();
            return;
        }

        System.out.print("MASUKKAN JUMLAH PESANAN: ");
        int jumlah = input.nextInt();

        psn.setPesanan(daftarMenu[pilihan - 1], jumlah);
        psn.hitungTotalHarga(daftarHarga[pilihan - 1]);

        System.out.println("\n=== DATA PEMESANAN ===");
        System.out.println(psn.getPelanggan());
        System.out.println(psn.getPesanan());
        System.out.println("HARGA PER PORSI: Rp" + daftarHarga[pilihan - 1]);
        System.out.println("TOTAL HARGA: Rp" + psn.getTotalHarga());
        System.out.println("\nTERIMA KASIH TELAH MEMESAN DI APLIKASI KAMI");

        input.close();
    }
}
