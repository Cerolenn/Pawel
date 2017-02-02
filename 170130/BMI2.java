import java.util.Scanner;

public class BMI2{
    public static void main(String[] args){
        double d=0;
        double a;
        double b;
        Scanner in=new Scanner(System.in);
        do{
        System.out.println("podaj wage i wysokosc");
        
        
        
        if(args.length!=2){System.out.println("Bład Danych");}
        else{
            if(d!=0){
                System.out.println("Podaj wage");
                a=in.nextDouble(); 
                System.out.println("Podaj wysokosc");
                b=in.nextDouble(); 
            }
            else{
        a=Double.parseDouble(args[0]);
        b=Double.parseDouble(args[1]);
            }
        double c=(a/(b*b));
        
        if (c<18.5) {System.out.println("Niedowaga");}
        else if(c>24.99){System.out.println("Nadwaga");}
        else{System.out.println("Waga prawidlowa");}
        }
        System.out.println("Kontynuowac? Y-1/N-2");
       
        d=in.nextDouble(); 
        } while (d==1);
    }
}