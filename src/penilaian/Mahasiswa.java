package penilaian;

public class Mahasiswa {
    //membuat variabel
    private double nama, npm;

    @Override
    public String toString() {
        return "Mahasiswa{" + "nama=" + nama + ", npm=" + npm + '}';
    }
    
    
    
    //constructor

    public Mahasiswa(double nama, double npm) {
        this.nama = nama;
        this.npm = npm;
    }

    public double getNama() {
        return nama;
    }

    public double getNpm() {
        return npm;
    }

    public void setNama(double nama) {
        this.nama = nama;
    }

    public void setNpm(double npm) {
        this.npm = npm;
    }
    
}
