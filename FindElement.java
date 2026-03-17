import java.util.*;
public class FindElement {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of n :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int data=sc.nextInt();

        int idx=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==data)
            {
                System.out.println("The index value is")
                ;
                idx = i;
                break;
            }
        }
        System.out.println(idx);

    }
    
}
