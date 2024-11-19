package Maze;

import java.util.ArrayList;

public class NoOfPaths {
    public static void main(String[] args) {
        System.out.println(pathCount(new int[]{0, 0}, new int[]{1, 1}));
        path(new int[]{0, 0}, new int[]{1, 1}, "");
        System.out.println(pathReturn(new int[]{0, 0}, new int[]{2,2}, ""));
        System.out.println(pathWithDiagonal(new int[]{0, 0}, new int[]{2,2}, ""));
    }

    // return number of ways to reach the destination (move only right and down)
    private static int pathCount(int[] result, int[] target) {
        if (target[0] == result[0] || target[1] == result[1]) return 1;
        int right = pathCount(new int[]{result[0], result[1] + 1}, target);
        int down = pathCount(new int[]{result[0] + 1, result[1]}, target);
        return right + down;
    }

    // exact path to reach the destination (move only right and down)
    private static void path(int[] result, int[] target, String processed) {
        if (result[0] > target[0] || result[1] > target[1]) return ;
        if (target[0] == result[0] && target[1] == result[1]) {
            System.out.println(processed);
            return;
        };
        path(new int[]{result[0], result[1] + 1}, target, processed + "R");
        path(new int[]{result[0] + 1, result[1]}, target, processed + "D");
    }

    // return exact path to reach the destination (move only right and down)
    private static ArrayList<String> pathReturn (int[] result, int[] target, String processed) {
        if (target[0] == result[0] && target[1] == result[1]) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        };
        ArrayList<String> resultList = new ArrayList<>();
        if (result[1] < target[1]) resultList.addAll(pathReturn(new int[]{result[0], result[1] + 1}, target, processed + "R"));
        if (result[0] < target[0]) resultList.addAll(pathReturn(new int[]{result[0] + 1, result[1]}, target, processed + "D"));
        return resultList;
    }

    // return path with diagonal, right and down
    private static ArrayList<String> pathWithDiagonal (int[] result, int[] target, String processed) {
        if (target[0] == result[0] && target[1] == result[1]) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        };
        ArrayList<String> resultList = new ArrayList<>(); // result list to return the path direction to above level

        // result from below level that moves in right direction
        if (result[1] < target[1]) resultList.addAll(pathWithDiagonal(new int[]{result[0], result[1] + 1}, target, processed + "R"));

        if (result[1] < target[1] && result[0] < target[0]) resultList.addAll(pathWithDiagonal(new int[]{result[0] + 1, result[1] + 1}, target, processed + "dia"));

        // result from below level that moves in down direction
        if (result[0] < target[0]) resultList.addAll(pathWithDiagonal(new int[]{result[0] + 1, result[1]}, target, processed + "D"));
        return resultList;
    }
}
