import java.util.*;
public class MaxSubSum {
    public static void MaxSAS(int nums[]){
        int currsum=0;
        int MaxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int start=i;
            for(int j=i;j<nums.length;j++){
                int end=j;
                 currsum=0;
                for(int k=start;k<=end;k++){
                    currsum +=nums[k];
                }
                System.out.println(currsum);
                if(MaxSum<currsum){
                    MaxSum=currsum;
                }
            }
        }
        System.out.println("MAX SUM =" + MaxSum);
    }
    public static void main(String[] args) {
        int nums[]={2,4,6,8,10};
        MaxSAS(nums);
    }
}
