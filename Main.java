import java.util.Scanner;

class Pemesanan {
    private String[][] pelanggan = new String[1][2];
    private Object[][] pesanan = new Object[1][2];
    private int totalHarga;

    
    public void setPelanggan(String nama, String telepon) {
        pelanggan[0][0] = nama;
        pelanggan[0][1] = telepon;
    }

    public void setPesanan(String jenisMakanan, int jumlah) {
        pesanan[0][0] = jenisMakanan;
        pesanan[0][1] = jumlah;
    }

    public void hitungTotalHarga(int harga) {
        totalHarga = harga * (int) pesanan[0][1];
    }

    public String getPelanggan() {
        return "NAMA: " + pelanggan[0][0] +  "\nTELEPON: " + pelanggan[0][1];
    }

    public String getPesanan() {
        return "JENIS MAKANAN: " + pesanan[0][0] + "\nJUMLAH: " + pesanan[0][1];
    }

    public int getTotalHarga() {
        return totalHarga;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pemesanan psn = new Pemesanan();

        String[] menu = {"AYAM GORENG", "AYAM BAKAR", "IKAN GORENG", "IKAN BAKAR", "JUS JERUK", "ES TEH"};
        int[] hargaMenu = {10000, 15000, 10000, 12000, 5000, 3000};

        System.out.println("=== APLIKASI PEMESANAN MAKANAN ===");
        System.out.print("MASUKKAN NAMA PELANGGAN: ");
        String nama = input.nextLine();
        System.out.print("MASUKKAN NOMOR TELEPON: ");
        String telepon = input.nextLine();

        psn.setPelanggan(nama, telepon);

        System.out.println("DAFTAR MENU:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp." + hargaMenu[i]);
        }

        System.out.print("\nPILIH NOMOR MENU: ");
        int pilihan = input.nextInt();

        if (pilihan < 1 || pilihan > menu.length) {
            System.out.println("MENU TIDAK TERSEDIA");
            return;
        }

        System.out.print("MASUKKAN JUMLAH PESANAN: ");
        int jumlah = input.nextInt();

        psn.setPesanan(menu[pilihan - 1], jumlah);
        psn.hitungTotalHarga(hargaMenu[pilihan - 1]);

        System.out.println("\n=== DATA PEMESANAN ===");
        System.out.println(psn.getPelanggan());
        System.out.println(psn.getPesanan());
        System.out.println("HARGA PER PORSI: Rp" + hargaMenu[pilihan - 1]);
        System.out.println("TOTAL HARGA: Rp" + psn.getTotalHarga());
        System.out.println("\nTERIMA KASIH TELAH MEMESAN DI APLIKASI KAMI");

        input.close();
    }
}
