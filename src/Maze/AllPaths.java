package Maze;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] maze = new boolean[3][3];
        allPath(maze, 0,0, "");
    }

    // return all possible paths to destination in all combinations
    private static void allPath (boolean[][] maze,int row, int col, String processed) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(processed.substring(0, processed.length() - 2));
            return;
        };

        if (maze[row][col]) return; // if the cell is marked as true return

        maze[row][col] = !maze[row][col]; // mark the cell as true (to forbid infinite loop)

        if (col < maze[0].length - 1) allPath(maze, row, col + 1, processed + "Right, ");
        if (col > 0) allPath(maze, row, col - 1, processed + "Left, ");
        if (row < maze.length - 1) allPath(maze, row + 1, col, processed + "Down, ");
        if (row > 0) allPath(maze, row - 1, col, processed + "Up, ");

        maze[row][col] = !maze[row][col]; // mark the cell as false as we are backtracking.
    }
}
