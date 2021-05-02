public class Main {
    public static void main(String[] args) {
        Bunga nasabah = new Bunga();
        System.out.println("\n===Input Data===");
        nasabah.input();
        nasabah.add();
        System.out.println("\n===Pilih Jenis Kredit===");
        nasabah.pilihKredit();
        System.out.println("\n===Pilih Jenis Bunga===");
        nasabah.pilihBunga();
        System.out.println("\n=====Data Nasabah=====");
        nasabah.info();
        System.out.println("\n=====Informasi Bunga=====");
        nasabah.total();
    }
}
