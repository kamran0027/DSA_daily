import java.util.Scanner;

public class Pattern1 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int n1,n2;
        n1=sc.nextInt();
        n2=sc.nextInt();
        int space=0;
        for(int i=0;i<n1;i++){
            for(int j=n2-i;j>0;j--){
                System.err.printf("* ");
            }
            //space   2n-1
            space=2*i-1;
            for(int k=0;k<space;k++){
                System.err.printf("  ");
            }
            for(int l=n2-(space/2);l>1;l--){
                System.err.print("* ");
            }
            System.err.println();
        }

        for(int i=1;i<n1;i++){
            for(int j=1+i;j>0;j--){
                System.err.printf("* ");
            }
            // space 2*(n1-i-1)-1

            space=2*(n1-i-1)-1;
            for(int k=0;k<space;k++){
                System.err.printf("  ");
            }

            if(space>0){
                for(int l=i+1;l>0;l--){
                System.err.printf("* ");
                }
            }
            else{
                for(int j=n1-1;j>0;j--){
                    System.err.printf("* ");
                }
            }
            
            System.err.println();
        }

         
    }

}
