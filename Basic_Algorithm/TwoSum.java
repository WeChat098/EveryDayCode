

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int shu[] = new int[2];
        int len = numbers.length;
        int left = 0,right = len - 1;
        while(left < right){
            if(numbers[left] + numbers[right] == target){
                shu[0] = left + 1;
                shu[1] = right + 1;
                return shu;
            }else if(numbers[left] + numbers[right] > target){
                right--;
            }else{
                left++;
            }
        }
        return shu;
    }
}
