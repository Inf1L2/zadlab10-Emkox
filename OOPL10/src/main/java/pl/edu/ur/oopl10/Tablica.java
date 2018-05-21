package pl.edu.ur.oopl10;

import java.util.Random;
/**
 *
 * @author Emek
 */
public class Tablica {
    int[] tab = new int[10];
     
    public void Tablica(){
    //    Random r = new Random();
        System.out.println("sialalalalala");                ////////DLACZEGO TO NIE DZIAŁA???
   /*     for(int i=0;i<10;i++)
        {
            this.tab[i]=r.nextInt();
            System.out.println(this.tab[i]);
        }*/
    }
    
    public void wyswietlTablica(){
        try{
            for(int i=0; i<11; i++){
                System.out.println("tab["+i+"] = "+tab[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }  
}
