import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import static java.lang.Math.*;

public class powt{
 
  
 
    public static void main(String[] args) throws FileNotFoundException{
       
        File file = new File("cyfry.txt");
        Scanner in=new Scanner(file);
        
     //    System.out.println("Test programu");
        //PrintWriter save = new PrintWriter("wynik.txt");
       
       int najwiekszaSuma=0;
    
       int a=0;
      
     
       int liniaDuza=0;
        while(in.hasNextLine())
        { //String text=in.nextLine();
           
           
           
           
        boolean jestCiag=true;
         int text2=Integer.parseInt(in.nextLine());
        // int z=Integer.parseInt(in.nextLine());
        
        if(text2%2==0)
        {
         a=a+1;
        }
        
        
         if(text2<10000)
      {
       int o=text2;
        String binarny = "";
   while (o > 0) {
       int l = o % 2;
       binarny = l + binarny;
       o = o / 2;
   }
   
   System.out.println(text2 + " binarny to " + binarny);
   
      }
        
        
        int z=text2;
         int suma=0;
         while(text2>=1)
         {
             suma=suma+text2%10;
          
             if(text2/10>=1 && text2%10 <= (text2/10)%10)
              {
                  jestCiag=false;
                 // System.out.println("Wartosc zmieniona na lini "+(a+1)+" i na wartosci "+text2);
              }
            
             text2=text2/10;
         }
         
         if(suma>najwiekszaSuma)
         {
             najwiekszaSuma=suma;
             liniaDuza=a;
         }
        
         
        //  System.out.println("koniec programu");
        
        if(jestCiag==true) {System.out.println(z);}
      //  System.out.println(Integer.parseInt(in.nextLine()));
      
     
      
      
            
        }
        
        
        
        System.out.println("ilosc liczb-" + a);
        
        System.out.println("najwieksza suma-" + najwiekszaSuma+ " na linijce "+liniaDuza);
        
        }
         //save.close();
    }