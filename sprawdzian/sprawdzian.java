import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;



public class sprawdzian{
    
    
    
    
   
    
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("cyfry.txt");
        Scanner in=new Scanner(file);
        PrintWriter save = new PrintWriter("powt.txt");
        
        int a=0;
        int b;
        int c=0;
        int d=0;
        int e=0;
        int f;
        int g;
        int h=0;
        int i=0;
        int j=-1; 
        int k;
        int l=0;
        int m;
        while(in.hasNextLine())
        {
            c=0;
            l=-1;
            
            String text=in.nextLine();
            int text2=Integer.parseInt(text);
            
            m=text2;
            
        if(text2%2==0){
            a=a+1;
           
        }
        
        b=text2;
        while (b>0) {
            
            f=(b%10);
            c=c+f;
            b=(b-f)/10;
         
        
        if(c>d){e=text2;}
        
        d=c;
        }
        
        
        g=text2;
        if(g<10000){
            save.print(g+ "     ");
            
            String z = "";
        while (g > 0) {
       int y = g % 2;
       z = y + z;
       g = g / 2;
   }
            
            
            save.println(z);
        }
        
        
        h=text2;
        while (h>0 && l==0) {
            
            i=(b%10);
            if(i<=j){l=1;}
            h=(h-i)/10;
            j=i;
        }
        if(l==0){
            save.println(m);
             }
        
        
        }
        save.println(a);
        save.println(e);
         save.close();
    }
    
}