public class Pattern{
    public static void hallow_rectangle(int row,int col) {
       
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=col;j++)
            {
                if(i==1 || i==row || j==1 || j==col)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
    public static void inverted_haf_pyramid(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
        
    }
    System.out.println("\n");
  public static void inverted_haf_pyramid_int(int n)
      {
         for(int i=1;i<=n;i++)
      {
          for(int j=1;j<=n-i+1;j++)
              {
                  System.out.print(j);
              }
      }
        System.out.println();
}
          
    public static void main(String[] args) {
        hallow_rectangle(5, 5);
        inverted_haf_pyramid(5);
        inverted_haf_pyramid_int(5);
    }

}
