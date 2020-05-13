/*
GNU LESSER GENERAL PUBLIC LICENSE V3.0 
https://www.gnu.org/licenses/lgpl-3.0.fr.html 
 */
package lb.edu.isae.nfp103.tp0;

/**
 *
 * @author Pascal Fares <pascal.fares at cofares.net>
 */
public class Data {

    private int x = 0;

    public void inc() {
        x = x + 1;
    }

    public void dec() {
        x = x - 1;
    }
    
    @Override
    public String toString(){
        return String.format("x=%d",x);
    }

}
