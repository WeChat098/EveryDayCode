/**
 * @Author : Yinghao Zhang
 * @Date : 2024/7/4 23:44
 * @Version : V1.2
 * @Description : 好字符串的个数
 */
class CountGoodStrings {
    final int mod = 1000000007;
    int low,high,zero,one;
    public int countGoodStrings(int low, int high, int zero, int one) {
        this.low = low;
        this.high = high;
        this.zero = zero;
        this.one = one;
        return dfs(low);
    }
    public int dfs(int len){
        if (len == 1 || len == 0){
            return 1;
        }
        if (len < 0){
            return 0;
        }
        int res = 0;
        res = dfs(len - zero) + dfs(len - one);
        return res;
    }

    public static void main(String[] args) {
        CountGoodStrings countGoodStrings = new CountGoodStrings();
        System.out.println(countGoodStrings.countGoodStrings(3, 3, 1, 1));
    }
}
