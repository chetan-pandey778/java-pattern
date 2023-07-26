// CODE FOR FILLING THE * IN UPAAR PART OF STAR PATTERN P1,P2,P3,P4
import java.util.Scanner;
public class pattern_qus12 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            
                if(  // FOR FILLING P1 SECTION
                    i+j<=(n-1)/2 || i==0 && j<=(n-1)/2 || j==0 && i==(n-1)/2  
                    // FOR FILLING P2 SECTION
                    || i-j>=(n-1)/2 || i==(n-1)/2 && j==0 ||i==(n-1) && j<=(n-1)/2
                   // FOR FILLING P3 SECTION
                    || j-i>=(n-1)/2 || i==0 && j>=(n-1)/2 || j==(n-1) && i==(n-1)/2 
                    // FOR FILLING P4 SECTION
                      || i+j>=(n-1)+(n-1)/2 || j==(n-1) && i<=(n-1)/2 || i==(n-1) && j<=(n-1)/2
                    
                    )
                    {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}

