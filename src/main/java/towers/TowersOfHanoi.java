package main.java.towers;

import java.util.Arrays;

public class TowersOfHanoi {
    /**
     * Main method
     */
    public static void main(String[] args) {
        iterativeMoveDisks(10);
    }


    public static void iterativeMoveDisks(int n){
        int moves = (int)Math.pow(n,2)-1;

        Tower[] towers = new Tower[3];

        towers[0] = new Tower(n);
        towers[1] = new Tower(0);
        towers[2] = new Tower(0);

        int i = 1;
        while(towers[2].size() != n){
            System.out.println(Arrays.toString(towers));
            if(i%3 == 1) {
                if(towers[2].getTop() > towers[0].getTop()){
                    towers[2].add(towers[0].pop());
                }
                else{
                    towers[0].add(towers[2].pop());
                }
            }
            if(i%3 == 2) {
                if(towers[1].getTop() > towers[0].getTop()){
                    towers[1].add(towers[0].pop());
                }
                else{
                    towers[0].add(towers[1].pop());
                }
            }
            if(i%3 == 0){
                if(towers[1].getTop() > towers[2].getTop()){
                    towers[1].add(towers[2].pop());
                }
                else{
                    towers[2].add(towers[1].pop());
                }
            }
            i++;
        }

        System.out.println(Arrays.toString(towers));
    }

    /**
     * The method for finding the solution to move n disks
     * from fromTower to toTower with auxTower
     *
     * @param n         Number of disks to move
     * @param fromTower Name of tower to move from
     * @param toTower   Name of tower to move to
     * @param auxTower  Name of other tower
     */
    public static void moveDisks(int n, char fromTower,
                                 char toTower, char auxTower) {
        if (n == 1) // Stopping condition
            System.out.println("Move disk " + n + " from " +
                    fromTower + " to " + toTower);
        else {
            moveDisks(n - 1, fromTower, auxTower, toTower);
            System.out.println("Move disk " + n + " from " +
                    fromTower + " to " + toTower);
            moveDisks(n - 1, auxTower, toTower, fromTower);
        }
    }
}