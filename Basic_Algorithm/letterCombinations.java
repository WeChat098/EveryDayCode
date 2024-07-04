import java.util.ArrayList;
import java.util.List;

class Solution {
    private static final String[] MAPPING = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    private static final List<String> ans = new ArrayList<>();
    private static char[] digits;
    private static char[] path;

    public List<String> letterCombinations(String digits) {
        int n = digits.length();
        if (n == 0) return List.of();
        this.digits = digits.toCharArray();
        path = new char[n]; // 本题 path 长度固定为 n
        dfs(0);
        return ans;
    }

    private static void dfs(int i) {
        if (i == digits.length) {
            ans.add(new String(path));
            return;
        }
        for (char c : MAPPING[digits[i] - '0'].toCharArray()) {
            path[i] = c; // 直接覆盖
            dfs(i + 1);
        }
    }

    public static void main(String[] args) {
        int n = 2;
        digits = "23".toCharArray();
        path = new char[n];
        dfs(0);

    }
}