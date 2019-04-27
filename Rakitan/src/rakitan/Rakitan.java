
package rakitan;

public class Rakitan {

    public static void main(String[] args) {
        Komputer komputer1 = new Komputer();
        Intel intel1 = new Intel(0);
        AMD amd1 = new AMD(0);
        
        komputer1.cetakInfo(intel1);
        komputer1.mencabut(intel1);
        komputer1.memasang(amd1);
        komputer1.cetakInfo(amd1);
    }
    
}
