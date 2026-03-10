import java.util.*;

public class SubArray {
    public static void SubArray(int num[]){
        int curr=0;
        int sumMAX=Integer.MIN_VALUE;

        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                curr=0;
                for(int k=start;k<=end;k++){
                    curr +=num[k];
                }
                System.out.println(curr);
                if(sumMAX <curr){
                    sumMAX=curr;
                }
            }
        }
        System.out.println( "MAX SUM ="+sumMAX);
    }
    
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        SubArray(num);
    }
}
