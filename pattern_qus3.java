// print "H" using pattern
import java.util.Scanner;
public class pattern_qus3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt(); 
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0 || j==n-1 || i==(n-1)/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
