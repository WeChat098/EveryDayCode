import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 四数之和
 * 同三数之和一样的思路，里面的一些优化点
 * 其中需要注意的是，int相加会造成溢出的情况 可以直接使用long进行运行，但是相加的时候需要一个个转换成long，不能仅仅是将最后的结果转换成long
 */
public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int len = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        for(int i = 0;i < len - 3;i++){
            if(i != 0 && nums[i] == nums[i - 1]){
                continue;
            }
            long temp = (long)nums[len - 1] + (long)nums[len - 2] + (long)nums[len - 3] + (long)nums[i];
            if(temp < target){
                continue;// 这里说明当前这个值如果是小于target，只是说明当前这个值没有必要匹配，不能使用break
            }
            temp = (long)nums[i] + (long)nums[i + 1] + (long)nums[i + 2] + (long)nums[i + 3];
            if(temp > target){
                break; // 这里使用break的原因是如果所有数组中最大的四个数相加仍然小于target，表明所有的任意四元组都是小于target的直接 break；
            }
            for(int j = i + 1;j < len - 2;j++){
                int left = j + 1,right = len - 1;
                while(left < right){
                    temp = (long)nums[i] + (long)nums[j] + (long)nums[left] + (long)nums[right];
                    if(temp == target){
                        if(set.add(Stream.of(nums[i],nums[j],nums[left],nums[right]).sorted().collect(Collectors.toList()))){
                            res.add(List.of(nums[i],nums[j],nums[left],nums[right]));
                        }
                        for(left++;left < right && nums[left] == nums[left - 1];left++);
                        for(right--;right > left && nums[right] == nums[right + 1];right--);
                    }else if(temp > target){
                        right--;
                    }else {
                        left++;
                    }
                }

            }
        }
        return res;
    }

    public static void main(String[] args) {
        FourSum fourSum = new FourSum();
        System.out.println(fourSum.fourSum(new int[]{0,0,0,1000000000,1000000000,1000000000,1000000000},1000000000));
    }
}
