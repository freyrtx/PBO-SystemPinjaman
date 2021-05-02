public class Bunga extends DataBank {
    private String jenisBunga;
    private String jenisKredit;
    public int pokok;
    public int bunga;
    public int angsuran;

    void pilihKredit(){
        System.out.println("===Pilih Jenis Bunga===");
        System.out.println("1 (Korporasi Besar)");
        System.out.println("2 (Ritel)");
        System.out.println("3 (Mikro)");
        System.out.println("4 (KPR)");
        System.out.println("5 (Non KPR)");
        System.out.println("Pilihan : ");
        jenisKredit = input.nextLine();
    }

    void pilihBunga(){
        System.out.println("===Pilih Jenis Bunga===");
        System.out.println("1 (Flat)");
        System.out.println("2 (Efektif)");
        System.out.println("Pilihan : ");
        jenisBunga = input.nextLine();
    }

    public void Total(){
        switch (jenisKredit){
            case "1": if(jenisBunga=="1"){
                pokok = super.jumlah / super.jangka;
                bunga = super.jumlah * (995/100) / 12;
                angsuran = this.pokok + this.bunga;
                System.out.println("Cicilan pokok\t: "+this.pokok);
                System.out.println("Bunga\t\t: "+this.bunga);
                System.out.println("Angsuran per Bulan\t: "+this.angsuran);
            } else if(jenisBunga=="2"){
                pokok = super.jumlah / super.jangka;
                bunga = super.jumlah * (995/100) / 12;
                angsuran = this.pokok + this.bunga;
                System.out.println("Cicilan pokok\t: "+this.pokok);
                System.out.println("Bunga\t\t: "+this.bunga);
                System.out.println("Angsuran per Bulan\t: "+this.angsuran);
            }
        }
    }
}
