package penilaian;

public class NilaiAkhir {
    private double uts, uas, tugas;

    public NilaiAkhir(double uts, double uas, double tugas) {
        this.uts = uts;
        this.uas = uas;
        this.tugas = tugas;
    }
    
    //membuat method
    public double setNilaiAkhir() {
        return 30%*uts + 30%*uas + 40%*tugas;
    
}
}
