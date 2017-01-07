/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemsolvem;

import java.util.ArrayList;
import java.util.List;

/**
 * Exercise Task: Find the differences between two arrays of a similar size
 */
public class ProblemB {

    public static int getAbsDifferences(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        int diff = 0;
        for (int i = 0; i < l1.size(); i++) {
            diff += Math.abs(l1.get(i) - l2.get(i));
        }
        return diff;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list.add(2);
        list.add(4);
        list.add(50);
        list.add(3);
        list.add(6);
        list.add(9);

        list2.add(3);
        list2.add(50);
        list2.add(7);
        list2.add(13);
        list2.add(16);
        list2.add(10);

        System.out.println("Total difference: " + getAbsDifferences(list, list2));

    }
}
