package com.example.restfull_home_office_test;

import java.util.HashMap;

public class LowestCommonAncestorSolution {
    // Time and Space log(index1) or log(index2) whichever is larger. Space being used because of the stack calls as
    //this is a recursive solution
    public static int run(int index1, int index2){
        int commonAncestor = 0;
        if(index1 == 1 || index2 == 1){
            return commonAncestor;
        }
        if(index1/2 == index2/2){
            return index1/2;
        }
       return run(index1/2, index2/2);

    }
    // Iterative solution. Time complexity still log(largest index input) but no extra space is used
    // as the input may be max of 1000000 which is a constant, log(1000000) can be considerend O(1)?
    public static int run2(int index1, int index2){
        int commonAncestor = 0;
        while(index1 >= 2 && index2 >= 2){
            if(index1/2 == index2/2){
                return index1/2;
            }
            index1 = index1/2;
            index2 = index2/2;
        }
        return commonAncestor;

    }

    public static void main(String[] args) {
//        int sol = run2(13,15);
//        System.out.println("sol : " + sol);
//        int sol1 = run2(11,13);
//        System.out.println("sol1 : " + sol1);
//        int sol2 = run2(10,11);
//        System.out.println("sol2 : " + sol2);
//        int sol3 = run2(1,1);
//        System.out.println("sol3 : " + sol3);
//        int sol4 = run2(2,1000000);
//        System.out.println("sol4 : " + sol4);
//        int sol5 = run2(9,25);
//        System.out.println("sol5 : " + sol5);
//        int sol6 = run2(61,62);
//        System.out.println("sol6 : " + sol6);
//        int sol7 = run2(2,3);
//        System.out.println("sol7 : " + sol7);


        int sol = run(13,15);
        System.out.println("sol : " + sol);
        int sol1 = run(11,13);
        System.out.println("sol1 : " + sol1);
        int sol2 = run(10,11);
        System.out.println("sol2 : " + sol2);
        int sol3 = run(1,1);
        System.out.println("sol3 : " + sol3);
        int sol4 = run(2,1000000);
        System.out.println("sol4 : " + sol4);
        int sol5 = run(9,25);
        System.out.println("sol5 : " + sol5);
        int sol6 = run(61,62);
        System.out.println("sol6 : " + sol6);
        int sol7 = run(2,3);
        System.out.println("sol7 : " + sol7);


    }

}
