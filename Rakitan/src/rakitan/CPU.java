package rakitan;

public class CPU {

    public String nama;
    public int kecepatan;

    CPU(String nama, int kecepatan) {
        this.nama = nama;
        this.kecepatan = kecepatan;
        
    }

    String getCPUData() {
        return(this.nama+" "+this.kecepatan+" GHz"); 
    }
}
