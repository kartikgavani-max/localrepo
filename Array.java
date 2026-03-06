public class Array {
    public static int linearSearch(int num[],int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={2,3,4,5,6,10,31,23,9};
        int key=10;
        int index=linearSearch(num, key);
        if(index==-1){
            System.out.println("Key not Found");
        }
        else{
            System.out.println("Key Found at :"+index);
            }
    }   
}
   
    

