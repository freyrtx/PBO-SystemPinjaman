import java.util.Scanner;

class KTP {
    private String nik;
    private String nama;
    private String ttl;
    private String alamat;
    private String pekerjaan;

    Scanner input = new Scanner(System.in);

    void input(){
        System.out.println("\n=======Input======\n");
        System.out.println("NIK : ");
        nik = input.nextLine();
        System.out.println("Nama : ");
        nama = input.nextLine();
        System.out.println("Tanggal Lahir : ");
        ttl = input.nextLine();
        System.out.println("Alamat : ");
        alamat = input.nextLine();
        System.out.println("Pekerjaan : ");
        pekerjaan = input.nextLine();
    }
    public void info(){
        System.out.println("NIK\t\t\t: "+this.nik);
        System.out.println("Nama\t\t\t: "+this.nama);
        System.out.println("Tanggal Lahir\t\t: "+this.ttl);
        System.out.println("Alamat\t\t\t: "+this.alamat);
        System.out.println("Pekerjaan\t\t: "+this.pekerjaan);
    }
}
