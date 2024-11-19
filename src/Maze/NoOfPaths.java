package Maze;

public class NoOfPaths {
    public static void main(String[] args) {
        System.out.println(pathCount(new int[]{0, 0}, new int[]{1, 1}));
        path(new int[]{0, 0}, new int[]{1, 1}, "");
    }

    // return number of ways to reach the destination
    private static int pathCount(int[] result, int[] target) {
        if (target[0] == result[0] || target[1] == result[1]) return 1;
        int right = pathCount(new int[]{result[0], result[1] + 1}, target);
        int down = pathCount(new int[]{result[0] + 1, result[1]}, target);
        return right + down;
    }

    // exact path to reach the destination
    private static void path(int[] result, int[] target, String processed) {
        if (result[0] > target[0] || result[1] > target[1]) return ;
        if (target[0] == result[0] && target[1] == result[1]) {
            System.out.println(processed);
            return;
        };
        path(new int[]{result[0], result[1] + 1}, target, processed + "R");
        path(new int[]{result[0] + 1, result[1]}, target, processed + "D");
    }
}
