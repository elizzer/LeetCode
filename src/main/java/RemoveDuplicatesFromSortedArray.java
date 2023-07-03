public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums){
        int count =1;
        int temp[]= new int[nums.length];
        temp[0]=nums[0];
        for(int i=0,j=0;i< nums.length;i++){
            if(nums[i]!=temp[j]){
                j++;
                count++;
                temp[j]=nums[i];
            }
        }

        nums=temp;
        for(int num:nums){
            System.out.println(num);
        }

        return count;
    }
}
