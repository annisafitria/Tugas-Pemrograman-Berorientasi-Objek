
package rakitan;

public class Komputer {
    private CPU cpu;
    
    public Komputer(CPU cpu){
        this.cpu = cpu;
    }
    
    public Komputer(){
        
    }

    public void memasang(CPU cpu){
        System.out.println("CPU : " +cpu.getCPUData()+" dipasang");
    }
    
    public void mencabut(CPU cpu){
        System.out.println("CPU : " +cpu.getCPUData()+ " dicabut");
    }
    
    public void cetakInfo(CPU cpu){
        System.out.println("Spesifikasi : CPU : " +cpu.getCPUData()+ " ");
    }
}
