import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        if (t>0 && t<500){
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            if (a>0 && b<50 && n>=1 && n<=15){
                int count=0+a;
                for(int j=1;j<=n;j++){
                    count=count+(2**(n-1)*b);
                    System.out.print(count);
                }
            }
        
        in.close();
    }
}}}
