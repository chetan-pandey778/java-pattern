import java.util.Scanner;
public class pattern_qus11 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                // FOR PRINTING P1,P2,P3,P4 IN THE SQURE 
                if(i+j==(n-1)/2 || i-j==(n-1)/2 || j-i==(n-1)/2 || i+j==(n-1) + (n-1)/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
