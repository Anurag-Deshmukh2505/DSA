package Array;

public class SingleNumber {
    public int singleNumber(int[] nums){
        int number = nums[0];
        for(int i = 1; i < nums.length; i++){
            number ^= nums[i];
        }

        return number;
    }
}
