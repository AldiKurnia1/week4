import java.util.Scanner;

public class Penjualan {
    private String kode;
    private String nama;
    private float harga;
    private int jumlah;
    
    public void setData(String kode, String nama, float harga, int jumlah) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }
    
    public float getTotalPembelian() {
        return harga * jumlah;
    }
    
    public String getBonus() {
        String bonus = "";
        float total = getTotalPembelian();
        
        if (total >= 500000 && jumlah > 5) {
            bonus = "Setrika";
        } else if (total >= 100000 && jumlah > 3) {
            bonus = "Payung";
        } else if (total >= 50000 || jumlah > 2) {
            bonus = "Ballpoint";
        }
        
        return bonus;
    }
    
    public void cetakNota() {
        System.out.println("===== Nota Pembelian =====");
        System.out.println("Kode Barang: " + kode);
        System.out.println("Nama Barang: " + nama);
        System.out.println("Harga Barang: " + harga);
        System.out.println("Jumlah Barang: " + jumlah);
        System.out.println("Total Pembelian: " + getTotalPembelian());
        System.out.println("Bonus: " + getBonus());
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String jawaban = "Y";
        
        while (jawaban.equalsIgnoreCase("Y")) {
            System.out.print("Masukkan kode barang: ");
            String kode = input.nextLine();
            
            System.out.print("Masukkan nama barang: ");
            String nama = input.nextLine();
            
            System.out.print("Masukkan harga barang: ");
            float harga = input.nextFloat();
            
            System.out.print("Masukkan jumlah barang: ");
            int jumlah = input.nextInt();
            
            Penjualan penjualan = new Penjualan();
            penjualan.setData(kode, nama, harga, jumlah);
            penjualan.cetakNota();
            
            System.out.print("Input data lagi [Y/T]? ");
            jawaban = input.next();
            input.nextLine(); // membersihkan newline di buffer
        }
        
        System.out.println("Terima kasih!");
    }
}