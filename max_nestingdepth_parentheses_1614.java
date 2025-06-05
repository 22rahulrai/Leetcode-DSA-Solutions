package questions.leetcode;

public class max_nestingdepth_parentheses_1614 {
    public static void main(String[] args) {

    }

    public static int maxDepth(String s) { //tc = O(n)
        int countmax = 0;
        int c = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                c++;
            } else if (ch == ')') {
                c--;
            }
            countmax = Math.max(c, countmax);
        }

        return countmax;
    }
}
