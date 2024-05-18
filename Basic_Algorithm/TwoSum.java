/**
 * 给你一个下标从 1 开始的整数数组 numbers ，该数组已按 非递减顺序排列  ，请你从数组中找出满足相加之和等于目标数 target 的两个数。如果设这两个数分别是 numbers[index1] 和 numbers[index2] ，则 1 <= index1 < index2 <= numbers.length 。
 *
 * 以长度为 2 的整数数组 [index1, index2] 的形式返回这两个整数的下标 index1 和 index2。
 *
 * 你可以假设每个输入 只对应唯一的答案 ，而且你 不可以 重复使用相同的元素。
 *
 * 你所设计的解决方案必须只使用常量级的额外空间。
 *
 * 思路：使用双指针的方法，左指针指向第一个元素，右指针指向最后一个元素，依次对来两个元素进行add，如果当前值已经大于目标值，说明当前的右指针代表的值太大了，
 *
 * 需要减少由指针的值，相反，如果当前add的结果已经小于当前的目标值，这时候需要对将左指针的值减小
 *
 * 总结： 双指针的方法，可以用来解决一些排序后的数组的问题，比如两数之和，三数之和等等，这种方法的时间复杂度为O(n)，空间复杂度为O(1)
 *
 * 当数组已经排排序好的时候，可以考虑使用双指针的想法
 *
 * */

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
