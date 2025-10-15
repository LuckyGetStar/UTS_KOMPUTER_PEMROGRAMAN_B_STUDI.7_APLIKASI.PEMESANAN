public class Pemesanan {
    private String[][] pelanggan = new String[1][2];
    private Object[][] pesanan = new Object[1][2];
    private int totalHarga;

    private String[] menu = {"AYAM GORENG", "AYAM BAKAR", "IKAN GORENG", "IKAN BAKAR", "JUS JERUK", "ES TEH"};
    private int[] hargaMenu = {10000, 15000, 10000, 12000, 5000, 3000};

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
        return "NAMA: " + pelanggan[0][0] + "\nTELEPON: " + pelanggan[0][1];
    }

    public String getPesanan() {
        return "JENIS MAKANAN: " + pesanan[0][0] + "\nJUMLAH: " + pesanan[0][1];
    }

    public int getTotalHarga() {
        return totalHarga;
    }

    public String[] getMenu() {
        return menu;
    }

    public int[] getHargaMenu() {
        return hargaMenu;
    }
}
