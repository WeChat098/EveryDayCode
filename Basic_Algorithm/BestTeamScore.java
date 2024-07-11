import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @Author : Yinghao Zhang
 * @Date : 2024/7/11 23:25
 * @Version : V1.2
 * @Description : 无矛盾的最佳球队
 *
 * 这道题需要重点记录一下，首先一个点是使用优先队列PriorityQueue对属性进行排序
 * PriorityQueue<Person> pq = new PriorityQueue<>((a,b)->{
 *     int diff = Integer.compare(a.score,b.score);
 *     if (diif != 0){
 *         rerturn diff;
 *     }else{
 *         reutrn Integer.compare(a.age,b.age);
 *     }
 * }
 * 这里面直接使用的匿名表达式作为参数作用于优先队列，这里面a 和 b 是作为一个对象，首先去获取对象的score属性进行比较，
 * 效果是根据score进行排序，之后根据age进行排序 使用的方法是Integer.compare(a.age,b.age)
 *
 * 另外这道题的一个想法是根据score进行排序，当前用户的score肯定是大于之前一个用户的score，在这个前提夏，当前用户的年龄一定是需要大于等于
 * 前面用户的年龄
 *
 * 同样是首先递归，之后使用记忆化搜索封装一下
 *
 * )
 * */
class BestTeamScore {
    int scores[], ages[];
    int memo[][];

    public int bestTeamScore(int[] scores, int[] ages) {
        this.scores = scores;
        this.ages = ages;
        memo = new int[scores.length + 1][scores.length + 2];
        for (int i = 0; i < memo.length; i++) {
            Arrays.fill(memo[i], Integer.MIN_VALUE);
        }
        PriorityQueue<Person> pq = new PriorityQueue<>((a, b) -> {
            int diff = Integer.compare(a.score, b.score);
            if (diff != 0) {
                return diff;
            } else {
                return Integer.compare(a.age, b.age);
            }
        });
        for (int i = 0; i < scores.length; i++) {
            pq.add(new Person(scores[i], ages[i]));
        }
        for (int i = 0; i < scores.length; i++) {
            Person person = pq.poll();
            scores[i] = person.score;
            ages[i] = person.age;
        }
        return dfs(scores.length - 1, scores.length);
    }

    public int dfs(int index, int pre) {
        if (index < 0) {
            return 0;
        }
        if (memo[index][pre] != Integer.MIN_VALUE) {
            return memo[index][pre];
        }
        if (pre == scores.length || ages[index] <= ages[pre]) {
            return memo[index][pre] = Math.max(dfs(index - 1, index) + scores[index], dfs(index - 1, pre));
        } else {
            return memo[index][pre] = dfs(index - 1, pre);
        }
    }
}

class Person {
    int score;
    int age;

    public Person(int score, int age) {
        this.score = score;
        this.age = age;
    }
}