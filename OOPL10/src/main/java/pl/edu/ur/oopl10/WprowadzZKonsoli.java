package pl.edu.ur.oopl10;

import java.util.Scanner;
/**
 *
 * @author Emek
 */
public class WprowadzZKonsoli {
    Scanner wczytaj;
    
    public WprowadzZKonsoli() {
        this.wczytaj = new Scanner(System.in);
    }
    
 
    public void wprowadzInt(){
        try{
           int liczba = wczytaj.nextInt();
           
        }catch(Exception e){
            System.out.println("To nie liczba");
        }
    }
    
    public void wprowadzChar(){
        try{
            String znak = wczytaj.nextLine();
            if(znak.length()>1){
                throw new Exception("To nie znak"); 
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void wprowadzLong(){
        try{
           long liczba = wczytaj.nextLong();
        }catch(Exception e){
            System.out.println("To nie long");
        }
    }
    
    public void wprowadzShort(){
        try{
           short liczba = wczytaj.nextShort();
        }catch(Exception e){
            System.out.println("To nie short");
        }
    }   
    
    public void wprowadzFloat(){
        try{
           float liczba = wczytaj.nextFloat();
        }catch(Exception e){
            System.out.println("To nie float");
        }
    }
    
    public void wprowadzDouble(){
        try{
           double liczba = wczytaj.nextDouble();
        }catch(Exception e){
            System.out.println("To nie double");
        }
    }
    
    public void wprowadzString(){
        try{
           String napis = wczytaj.nextLine();
        }catch(Exception e){
            System.out.println("To nie napis");
        }
    }       
}

