import java.util.*;

public class TextDemo2 {

    //判定字符是否唯一
//    public boolean isUnique(String astr) {
//        HashMap<Character,Integer> map = new HashMap<>();
//        for(int i = 0; i < astr.length(); i++) {
//            if(map.containsKey(astr.charAt(i))) {
//                int num = map.get(astr.charAt(i));
//                map.put(astr.charAt(i),num + 1);
//            } else {
//                map.put(astr.charAt(i),1);
//            }
//        }
//        for(int i = 0; i < astr.length(); i++) {
//            if(map.get(astr.charAt(i)) > 1) return false;
//        }
//        return true;
//    }


    //唯一元素的和
//    public int sumOfUnique(int[] nums) {
//        int sum = 0;
//        int[] tmp = new int[101];
//        for(int x : nums) {
//            tmp[x]++;
//        }
//        for(int i = 0; i < tmp.length; i++) {
//            if(tmp[i] == 1) {
//                sum += i;
//            }
//        }
//        return sum;
//    }


    //拥有最多糖果的孩子
//    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//        List<Boolean> list = new ArrayList<>();
//        int max = 0;
//        for(int i = 0; i < candies.length; i++){
//            if(candies[i] > max){
//                max = candies[i];
//            }
//        }
//        for(int i = 0; i < candies.length; i++) {
//            if(candies[i] + extraCandies >= max) {
//                list.add(true);
//            } else {
//                list.add(false);
//            }
//        }
//        return list;
//    }

    
    //N 叉树的前序遍历
//    public List<Integer> preorder(Node root) {
//        List<Integer> list = new ArrayList<>();
//        if(root == null) return list;
//        Stack<Node> s = new Stack<>();
//        s.push(root);
//        while(!s.isEmpty()) {
//            Node tmp = s.pop();
//            list.add(tmp.val);
//            for(int i = tmp.children.size() - 1; i >= 0; i--) {
//                s.push(tmp.children.get(i));
//            }
//        }
//        return list;
//
//    }

    //N 叉树的最大深度
//    public int maxDepth(Node root) {
//        if(root == null) return 0;
//        int max = 0;
//        for(int i = 0; i < root.children.size(); i++) {
//            int tmp = maxDepth(root.children.get(i));
//            max = Math.max(tmp,max);
//        }
//        return max + 1;
//    }


    //自除数
//    public static List<Integer> selfDividingNumbers(int left, int right) {
//        List<Integer> list = new ArrayList<>();
//        for(int i = left; i <= right; i++) {
//            boolean f = true;
//            int ret = i;
//            while(ret != 0) {
//                int tmp = ret % 10;
//                if(tmp == 0) break;
//                if(ret % tmp != 0) {
//                    f = false;
//                }
//                ret /= 10;
//            }
//            if(f && i % 10 != 0) list.add(i);
//        }
//        return list;
//    }


    //不同路径
//    public int uniquePaths(int m, int n) {
//        int[][] dp = new int[m][n];
//        for(int i = 0; i < m; i++) {
//            for(int j = 0; j < n; j++) {
//                if(i == 0 || j == 0) {
//                    dp[i][j] = 1;
//                } else {
//                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
//                }
//            }
//        }
//        return dp[m - 1][n - 1];
//    }

    //爬楼梯
//    public int climbStairs(int n) {
//        int[] dp = new int[n + 1];
//        if(n <= 2) return n;
//        dp[0] = 0;
//        dp[1] = 1;
//        dp[2] = 2;
//        for(int i = 3; i <= n; i++) {
//            dp[i] = dp[i - 1] + dp[i - 2];
//        }
//        return dp[n];
//    }

    //Offer 10- II. 青蛙跳台阶问题
//    public int numWays(int n) {
//        if(n == 0 || n == 1) return 1;
//        if(n == 2) return 2;
//        int[] dp = new int[n + 1];
//        dp[1] = 1;
//        dp[2] = 2;
//        for(int i = 3; i <= n; i++) {
//            dp[i] = (dp[i - 1] + dp [i - 2]) % 1000000007;
//        }
//        return dp[n];
//
//    }
    public static void main(String[] args) {

//        int left = 1,right = 22;
//        List<Integer> list = selfDividingNumbers(left,right);

//        System.out.println(list);
//
    }
}
