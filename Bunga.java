public class Bunga extends DataBank {
    private int jenisKredit;
    private int jenisBunga;
    public double pokok;
    public double bunga;
    public double angsuran;
    public double flow;

    void pilihKredit(){
        System.out.println("===Pilih Jenis Bunga===");
        System.out.println("1 (Korporasi Besar)");
        System.out.println("2 (Ritel)");
        System.out.println("3 (Mikro)");
        System.out.println("4 (KPR)");
        System.out.println("5 (Non KPR)");
        System.out.println("Pilihan : ");
        jenisKredit = input.nextInt();
        input.nextLine();
    }

    void pilihBunga(){
        System.out.println("===Pilih Jenis Bunga===");
        System.out.println("1 (Flat)");
        System.out.println("2 (Efektif)");
        System.out.println("Pilihan : ");
        jenisBunga = input.nextInt();
        input.nextLine();
    }

    public void Total(){
        switch (jenisKredit){
            case 1: if(this.jenisBunga==1){
                pokok = super.jumlah / super.jangka;
                bunga = super.jumlah * 8/100 / 12;
                angsuran = this.pokok + this.bunga;
                System.out.println("Cicilan pokok\t: "+this.pokok);
                System.out.println("Bunga\t\t: "+this.bunga);
                System.out.println("Angsuran per Bulan\t: "+this.angsuran);
                break;
            } else if(this.jenisBunga==2){
                for (int i = 0; i < super.jangka; i++) {
                    pokok = super.jumlah / super.jangka;
                    flow = super.jumlah - this.pokok*i;
                    bunga = this.flow * 8/100 / 12;
                    angsuran = this.pokok + this.bunga;
                    System.out.println("\n===================================");
                    System.out.println("Pokok Bulan ke-"+i+" : "+this.pokok);
                    System.out.println("Bunga Bulan ke-"+i+" : "+this.bunga);
                    System.out.println("Angsuran ke-"+i+" : "+this.angsuran);
                }
                break;
            }
            case 2: if(this.jenisBunga==1){
                pokok = super.jumlah / super.jangka;
                bunga = super.jumlah * 8.25/100 / 12;
                angsuran = this.pokok + this.bunga;
                System.out.println("Cicilan pokok\t: "+this.pokok);
                System.out.println("Bunga\t\t: "+this.bunga);
                System.out.println("Angsuran per Bulan\t: "+this.angsuran);
                break;
            } else if(this.jenisBunga==2){
                for (int i = 0; i < super.jangka; i++) {
                    pokok = super.jumlah / super.jangka;
                    flow = super.jumlah - this.pokok*i;
                    bunga = this.flow * 8.25/100 / 12;
                    angsuran = this.pokok + this.bunga;
                    System.out.println("\n===================================");
                    System.out.println("Pokok Bulan ke-"+i+" : "+this.pokok);
                    System.out.println("Bunga Bulan ke-"+i+" : "+this.bunga);
                    System.out.println("Angsuran ke-"+i+" : "+this.angsuran);
                }
                break;
            }
            case 3: if(this.jenisBunga==1){
                pokok = super.jumlah / super.jangka;
                bunga = super.jumlah * 14/100 / 12;
                angsuran = this.pokok + this.bunga;
                System.out.println("Cicilan pokok\t: "+this.pokok);
                System.out.println("Bunga\t\t: "+this.bunga);
                System.out.println("Angsuran per Bulan\t: "+this.angsuran);
                break;
            } else if(this.jenisBunga==2){
                for (int i = 0; i < super.jangka; i++) {
                    pokok = super.jumlah / super.jangka;
                    flow = super.jumlah - this.pokok*i;
                    bunga = this.flow * 14/100 / 12;
                    angsuran = this.pokok + this.bunga;
                    System.out.println("\n===================================");
                    System.out.println("Pokok Bulan ke-"+i+" : "+this.pokok);
                    System.out.println("Bunga Bulan ke-"+i+" : "+this.bunga);
                    System.out.println("Angsuran ke-"+i+" : "+this.angsuran);
                }
                break;
            }
            case 4: if(this.jenisBunga==1){
                pokok = super.jumlah / super.jangka;
                bunga = super.jumlah * 7.25/100 / 12;
                angsuran = this.pokok + this.bunga;
                System.out.println("Cicilan pokok\t: "+this.pokok);
                System.out.println("Bunga\t\t: "+this.bunga);
                System.out.println("Angsuran per Bulan\t: "+this.angsuran);
                break;
            } else if(this.jenisBunga==2){
                for (int i = 0; i < super.jangka; i++) {
                    pokok = super.jumlah / super.jangka;
                    flow = super.jumlah - this.pokok*i;
                    bunga = this.flow * 7.25/100 / 12;
                    angsuran = this.pokok + this.bunga;
                    System.out.println("\n===================================");
                    System.out.println("Pokok Bulan ke-"+i+" : "+this.pokok);
                    System.out.println("Bunga Bulan ke-"+i+" : "+this.bunga);
                    System.out.println("Angsuran ke-"+i+" : "+this.angsuran);
                }
                break;
            }
            case 5: if(this.jenisBunga==1){
                pokok = super.jumlah / super.jangka;
                bunga = super.jumlah * 8.75/100 / 12;
                angsuran = this.pokok + this.bunga;
                System.out.println("Cicilan pokok\t: "+this.pokok);
                System.out.println("Bunga\t\t: "+this.bunga);
                System.out.println("Angsuran per Bulan\t: "+this.angsuran);
                break;
            } else if(this.jenisBunga==2){
                for (int i = 0; i < super.jangka; i++) {
                    pokok = super.jumlah / super.jangka;
                    flow = super.jumlah - this.pokok*i;
                    bunga = this.flow * 8.75/100 / 12;
                    angsuran = this.pokok + this.bunga;
                    System.out.println("\n===================================");
                    System.out.println("Pokok Bulan ke-"+i+" : "+this.pokok);
                    System.out.println("Bunga Bulan ke-"+i+" : "+this.bunga);
                    System.out.println("Angsuran ke-"+i+" : "+this.angsuran);
                }
                break;
            }
        }
    }
}
