import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import static java.lang.Math.*;

public class napisy{
    
    
    public static void main(String[] args) throws FileNotFoundException{
         File file = new File("napisy.txt");
        Scanner in=new Scanner(file);
        PrintWriter save = new PrintWriter("zadanie4.txt");
    
        int a;
        int b=0;
        int c=0;
        int d=0;
        int e=0;
        int f=0;
        int g=0;
        int h=0;
        int z=0;
        
        int i=0;
        int j=0;
        int k=0;
        int l=0;
        int m=0;
        int n=0;
        int o=0;
        int p=0;
        int r=0;
        int s=0;
        int t=0;
        int u=0;
        int v=0;
        int w=0;
        int aa=0;
        
        char x;
    
        while(in.hasNextLine()){
             String text=in.nextLine();
            
            e=0;
            
            c=0;
            
            a=text.length();
            
            if(a%2==0){b=b+1;}
         
            for(d=0;d<=a-1;d++){
                x= text.charAt(d);
                
            if(x=='0'){c=c+1;}
            else{e=e+1;}
            
            
            }
            
            
            
            if(e==c){f=f+1;}
            if(c==0){g=g+1;}
            if(e==0){h=h+1;}
            
            
            if(a==2){i++;}
            if(a==3){j++;}
            if(a==4){k++;}
            if(a==5){l++;}
            if(a==6){m++;}
            if(a==7){n++;}
            if(a==8){o++;}
            if(a==9){p++;}
            if(a==10){r++;}
            if(a==11){s++;}
            if(a==12){t++;}
            if(a==13){u++;}
            if(a==14){v++;}
            if(a==15){w++;}
            if(a==16){aa++;}
            
            
            
            
            
      
      
        }
            save.println("a) parzyste " + b);
             save.println("b) takie same " + f);
             save.println("c) same jedynki " + g);
            save.println("   same zera " + h);
            save.println("d) 2 " + i);
            save.println("   3 " + j);
            save.println("   4 " + k);
            save.println("   5 " + l);
            save.println("   6 " + m);
            save.println("   7 " + n);
            save.println("   8 " + o);
            save.println("   9 " + p);
            save.println("   10 " + r);
            save.println("   11 " + s);
            save.println("   12 " + t);
            save.println("   13 " + u);
            save.println("   14 " + v);
            save.println("   15 " + w);
            save.println("   16 " + aa);
            
        System.out.println("" + b );
        System.out.println("111  " + g );
        System.out.println("000  " + h );
       
        System.out.println("" + f );
  //     System.out.println(c+ " ");
    
    save.close();

}
}