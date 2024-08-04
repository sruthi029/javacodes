import java.util.*;
public class LIST1
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        List<List<Integer>> out = new ArrayList<>();
        List<Integer> inlist = new ArrayList<>();
        System.out.println("Enter the size");
        int size=in.nextInt();
        System.out.println("Enter the integers in list 1");
        for(int i=0;i<size;i++)
        {
          inlist.add(in.nextInt());
        }
        out.add(inlist);
        List<Integer> inlist1 = new ArrayList<>();
        System.out.println("Enter the integers in list 2");
        for(int i=0;i<size;i++)
        {
          inlist1.add(in.nextInt());
        }
        out.add(inlist1);
        System.out.println(out);
    }
}                                                                   