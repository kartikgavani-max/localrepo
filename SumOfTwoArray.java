public class SumOfTwoArray {
    public static void hollow_rectangle(int row,int col)
    {
        for(int i=1;i<row;i++)
        {
            for(int j=1;j<col;j++)
            {
                if(i==1||i==row||j==1||j==col)
                    {
                System.out.println("*");
                 }
                 else
                 {
                    System.out.println(" ");
                 }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow_rectangle(4, 5);
    }
    
}
