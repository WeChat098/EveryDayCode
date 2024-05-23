public class longestSemiRepetitiveSubstring {
    /**
     * 找到最长的半重复重复子字符串
     * 对于需要使用当前字符和下一个字符进行判断的时候，为了避免出现越界的情况，我们可以使下标从1开始，让当前字符和上一个字符进行判断是否相等
     * @param S
     * @return
     */


    public int longestSemiRepetitiveSubstring(String S) {
        var s = S.toCharArray();
        int ans = 1, left = 0, same = 0, n = s.length;
        for (int right = 1; right < n; right++) {
            if (s[right] == s[right - 1] && ++same > 1) {
                for (left++; s[left] != s[left - 1]; left++);
                same = 1;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        longestSemiRepetitiveSubstring lsrs = new longestSemiRepetitiveSubstring();
        lsrs.longestSemiRepetitiveSubstring("52233");
    }
}
