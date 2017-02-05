import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Zadanie3{
    public static void main(String[] args){
        
     
    int[] tablica = new int[9];
 Random rand = new Random();
    int p=0;
    int q=100;
    int a;
    int b;
    
            for(int i=0;i<9;i++){
                
                
         a=(rand.nextInt(q-p+1)+p);
              tablica[i]=a;
            }
            
 
    int iArr[] = tablica;

   // sorting array
   Arrays.sort(iArr);

   // let us print all the elements available in list
   System.out.println("The sorted int array is:");
   for (int number : iArr) {
   System.out.print(number+",");
   }
        
        
    }
}