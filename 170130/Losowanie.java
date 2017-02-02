import java.util.Random;
import java.util.Scanner;

public class Losowanie{
    public static void main(String[] args){
        
        Scanner in=new Scanner(System.in);
     Random rand = new Random();
    int p;
    int q;
    int a;
    
    int b;
    System.out.println("Podaj zakres");
    
    p=in.nextInt();
    q=in.nextInt();
    
           a=(rand.nextInt(q-p+1)+p);
            
            
          System.out.println(a);
     
    }
    }
