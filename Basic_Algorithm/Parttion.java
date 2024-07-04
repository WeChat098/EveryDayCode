import java.util.ArrayList;
import java.util.List;

/**
 * @Author : Yinghao Zhang
 * @Date : 2024/7/2 20:04
 * @Version : V1.2
 * @Description : 分割回文串
 */
public class Parttion {
    List<List<String>> result = new ArrayList<>();
    List<String> temp =  new ArrayList<>();
    public boolean isPalindrome(String s,int start,int end){
        while (start < end){
            if (s.charAt(start++) != s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
    public void dfs(String s,int start){
        if (start == s.length()){
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start;i < s.length();i++){
            if (isPalindrome(s,start,i)) {
                temp.add(s.substring(start,i+1));
                dfs(s,i+1);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
