import java.util.Scanner;

public class KonversiDetik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah detik: ");
        int detik = input.nextInt();
        
        int hari = detik / 86400;
        int sisaDetik = detik % 86400;
        int jam = sisaDetik / 3600;
        sisaDetik %= 3600;
        int menit = sisaDetik / 60;
        sisaDetik %= 60;
        
        System.out.println(detik + " detik = " + hari + " hari, " + jam + " jam, " + menit + " menit, " + sisaDetik + " detik");
    }
}