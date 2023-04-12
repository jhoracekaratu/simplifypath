package ke.co.mspace.twosum;

public class Two_Sum_Solution {

   public int [] getTwoSum(int[] arr,int num) {
       for(int i=0; i<arr.length;i++){
       for(int j=0; j<arr.length;j++){
           if(i==j)break;
       if((arr[i]+arr[j])==num){
           return new int[]{i,j};
       }
   }}
       return null;
    }
    
}
