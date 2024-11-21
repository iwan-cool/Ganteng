import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input No Faktur
            System.out.print("Masukkan No Faktur: ");
            String noFaktur = scanner.nextLine();
            if (noFaktur.isEmpty()) {
                throw new InvalidInputException("No Faktur tidak boleh kosong!");
            }

            // Input Kode Barang
            System.out.print("Masukkan Kode Barang: ");
            String kodeBarang = scanner.nextLine();
            if (kodeBarang.isEmpty()) {
                throw new InvalidInputException("Kode Barang tidak boleh kosong!");
            }

            // Input Nama Barang
            System.out.print("Masukkan Nama Barang: ");
            String namaBarang = scanner.nextLine();
            if (namaBarang.isEmpty()) {
                throw new InvalidInputException("Nama Barang tidak boleh kosong!");
            }

            // Input Harga Barang
            System.out.print("Masukkan Harga Barang: ");
            double hargaBarang = scanner.nextDouble();
            if (hargaBarang <= 0) {
                throw new InvalidInputException("Harga Barang harus lebih dari 0!");
            }

            // Input Jumlah Beli
            System.out.print("Masukkan Jumlah Beli: ");
            int jumlahBeli = scanner.nextInt();
            if (jumlahBeli <= 0) {
                throw new InvalidInputException("Jumlah Beli harus lebih dari 0!");
            }

            // Membuat objek transaksi
            Transaksi transaksi = new Transaksi(noFaktur, kodeBarang, namaBarang, hargaBarang);
            transaksi.tampilkanTransaksi(jumlahBeli);

        } catch (InvalidInputException e) {
            System.out.println("Input Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}