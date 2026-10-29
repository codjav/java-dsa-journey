package Recursion.BackTrack;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        int ans = recur(3, 3);
        System.out.println(ans);

        ArrayList<String> list = new ArrayList<>();
        recur1("", 3, 3, list);
        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>();
        recurdiagonal("", 3, 3, list2);
        System.out.println(list2);

        
        ArrayList<String> list3 = new ArrayList<>();
        boolean[][] maze = {
            {true, true, true},
            {true, false, true},
            {true, true, true}
        };
        recurriver("", 0, 0, list3, maze);
        System.out.println(list3);
    }
    static int recur(int r, int c) {
        if(r==1 || c==1) {
            return 1;
        }
        int count = 0;
        count += recur(r-1, c);
        count += recur(r, c-1);

        return count;
    }
    static void recur1(String p, int r, int c, ArrayList<String> list) {
        if(r==1) {
            while(c>1) {
                p+='R';
                c--;
            }
            list.add(p);
            return;
        }
        if(c==1) {
            while(r>1) {
                p+='D';
                r--;
            }
            list.add(p);
            return;
        }

        recur1(p+'D', r-1, c, list);
        recur1(p+'R', r, c-1, list);

        return;
    }
    static void recurdiagonal(String p, int r, int c, ArrayList<String> list) {
        if(r==1) {
            while(c>1) {
                p+='R';
                c--;
            }
            list.add(p);
            return;
        }
        if(c==1) {
            while(r>1) {
                p+='D';
                r--;
            }
            list.add(p);
            return;
        }

        recurdiagonal(p+'D', r-1, c, list);
        recurdiagonal(p+'X', r-1, c-1, list);
        recurdiagonal(p+'R', r, c-1, list);

        return;
    }
    static void recurriver(String p, int r, int c, ArrayList<String> list, boolean[][] maze) {
        if(r==maze.length-1 && c==maze[0].length-1) {
            list.add(p);
            return;
        }
        if(maze[r][c]==false) {
            return;
        }

        if(r<maze.length-1 && c<maze[0].length-1) {
            recurriver(p+'X', r+1, c+1, list, maze);
        }
        if(r<maze.length-1) {
            recurriver(p+'D', r+1, c, list, maze);
        }
        if(c<maze[0].length-1) {
            recurriver(p+'R', r, c+1, list, maze);
        }

        return;
    }
}
