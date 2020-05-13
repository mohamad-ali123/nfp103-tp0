/*
GNU LESSER GENERAL PUBLIC LICENSE V3.0 
https://www.gnu.org/licenses/lgpl-3.0.fr.html 
 */
package lb.edu.isae.nfp103.tp0;

/**
 *
 * @author Pascal Fares <pascal.fares at cofares.net>
 */
public class Main {
    public static Thread[] creerEtLance(Data d, int n) {
        Thread[] t=new Thread[3];
        
        Runnable rinc,rdec,raff;
        rinc = () -> {
            for (int i=0; i<n; i++) {
                d.inc();
            }
        };
        rdec = () -> {
            for (int i=0; i<n; i++) {
                d.dec();
            }
        };
        raff = () -> System.out.println(d);
           
        t[0]=new Thread(rinc,"INC");
        t[1]=new Thread(rdec,"DEC");
        t[2]=new Thread(raff,"AFF");
        return t;
    }
    public static void main(String... args) throws InterruptedException {
        Data d=new Data();
        Thread[] t=creerEtLance(d,10000);
        t[0].start();
        t[1].start();
        t[0].join();t[1].join();
        t[2].start();
    }
}
