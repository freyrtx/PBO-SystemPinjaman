class DataBank extends KTP{
    private String noHP;
    public int jangka;
    public int jumlah;
    private String korp;

    void add(){
        System.out.println("Nama Instansi(Jika ada) : ");
        korp = input.nextLine();
        System.out.println("No Handphone : ");
        noHP = input.nextLine();
        System.out.println("Jumlah yang Diajukan : ");
        jumlah = input.nextInt();
        System.out.println("Jangka Waktu(bulan) : ");
        jangka = input.nextInt();
        input.nextLine();
    }

    public void info(){
        super.info();
        System.out.println("Nama Instansi\t\t: "+this.korp);
        System.out.println("No Handphone\t\t: "+this.noHP);
        System.out.println("Jumlah yang Diajukan\t: Rp. "+this.jumlah);
        System.out.println("Jangka Waktu\t\t: "+this.jangka+"bulan");
    }
}
