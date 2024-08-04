import java.util.Scanner;

public class multM{
    public static void main(String s[]) {



        int a[][] =new int[]{{3,5,6,7},{5},{2,3,4,5}};
        int c=1;

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0+2].length;j++)
            {
                c*=a[i][j];
               
            }
        }

        System.out.println(c+" ");
        
    }
}