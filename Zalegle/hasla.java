import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import static java.lang.Math.*;

public class hasla{
    
    
    public static void main(String[] args) throws FileNotFoundException{
         File file = new File("hasla.txt");
        Scanner in=new Scanner(file);
        PrintWriter savea = new PrintWriter("wynik4a.txt");
        PrintWriter saveb = new PrintWriter("wynik4b.txt");
        PrintWriter savec = new PrintWriter("wynik4c.txt");
        int b=0;
        int a;
        int c=0;
        int d=0;
        int e =0;
        char z;
        char x;
        int f;
        int g;
        int p=0;
        int r=0;
        
        
        while(in.hasNextLine()){
            f=0;
            String text=in.nextLine();
            a=text.length();
            e=a;
            r=0;
             //text2=Integer.parseInt(text);
            if(a%2==0){b=b+1;}
            else{c=c+1;}
        
        
            for(d=0;d<=a-1;d++){
                x= text.charAt(d);
                z=text.charAt(e-1); 
            //if(x!=z){d=a;f=f+1;}
            //else{f=0;}
            
            if(x!=z){f=f+1;}
            e=e-1;}
            if(f==0){saveb.println(text + " ");}
            
         
         
         for(g=0;g<=(a-1);g++){
             char y = text.charAt(g);
                p= (int)   y;
                if(p-r==1){savec.println(text + " ");}
                r=p; }
            //ifrx!=z){d=a;f=f+1;}
            //else{f=0;}
         
         
         
         
 }
            
        
        
        
        
            savea.println("parzyste " + b);
            savea.println("te drugie " + c);
       
       
      //  System.out.println(b+ " ");
    
    savea.close();
    saveb.close();
    savec.close();
}
}