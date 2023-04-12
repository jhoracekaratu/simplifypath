/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke.co.mspace.twosum;

/**
 *
 * @author developer
 */
public class Main {
    public static void main(String[] args) {
        int [] arr = {3,2,4};
   
   Two_Sum_Solution solution=new Two_Sum_Solution();
   int [] result=solution.getTwoSum(arr,6);
   if(result!=null){
         System.out.println("The indexes are:"+result[0]+" and "+result[1]);
        System.out.println("The values are "+arr[result[0]]+" and "+arr[result[1]]);
   }else{
       System.out.println("Not found");
   }
      
    }
   
    
           
    
}
