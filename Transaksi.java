class Transaksi extends Barang {
    private String noFaktur;

    public Transaksi(String noFaktur, String kodeBarang, String namaBarang, double hargaBarang) {
        super(kodeBarang, namaBarang, hargaBarang); // Memanggil constructor superclass
        this.noFaktur = noFaktur;
    }

    public void tampilkanTransaksi(int jumlahBeli) {
        double total = hitungTotal(jumlahBeli);
        System.out.println("\n=== Detail Transaksi ===");
        System.out.println("No Faktur   : " + noFaktur);
        System.out.println("Kode Barang : " + kodeBarang);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga Barang: Rp " + hargaBarang);
        System.out.println("Jumlah Beli : " + jumlahBeli);
        System.out.println("Total Harga : Rp " + total);
    }
}