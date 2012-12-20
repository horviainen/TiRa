import java.util.HashMap;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


/**
 *
 * @author Anne Hankosalo
 * Tähän luokkaan tulee varsinainen A*-haku algoritmi. 
 *
 * 
 * 
 * 
 */
 


public class ReittihakuA {

    /**
     *  @param alku lähtöpyskäin koodi
     *  @param loppu päätepysäkin koodi
     *  @param aika  lähtöaika
     */
    
    public void haku(String alku, String loppu, int aika){
    
           System.out.println("Ei yhteyksia.");
    
    }
            
    public static void main(String[] args) {
        // TODO code application logic here
        
        ReittihakuA reittihakuA = new ReittihakuA();
        reittihakuA.haku("pysakkia", "pysakkil", 1);
    }
}
