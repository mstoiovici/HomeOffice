package com.example.restfull_home_office_test;

import java.util.HashMap;

public class LowestCommonAncestorSolution {
    public static int run(int index1, int index2){
        int index1_ancestor = index1/2;
        int index2_ancestor = index2/2;
        if(index1 ==1 || index2 ==1 || index1_ancestor==1 || index2_ancestor == 1){
            return 1;
        }
        if(index1_ancestor == index2_ancestor){
            return index1_ancestor;
        }
       return run(index1_ancestor, index2_ancestor);

    }

    public static int run2(int index1, int index2){
        int commonAncestor = 1;
        int index1Ancestor = index1/2;
        int index2Ancestor = index2/2;
        if(index1 == 1 || index2 == 1){
            return 1;
        } else if(index1/2 == index2/2){
            return index1/2;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(index1,index1Ancestor);
        map.put(index2, index2Ancestor);

        while(map.get(index1) != map.get(index2)){
            index1 = map.get(index1);
            index2 = map.get(index2);
            index1Ancestor = index1/2;
            index2Ancestor = index2/2;
            if(index1Ancestor == index2Ancestor){
                return index1Ancestor;

            }
            map.put(index1, index1Ancestor);
            map.put(index2, index2Ancestor);

        }
        return commonAncestor;
    }
    public static int run3(int index1, int index2){
        int commonAncestor = 1;
        if(index1 == 1 || index2 ==1){
           return commonAncestor;
        }

        int index1Ancestor = index1/2;
        int index2Ancestor = index2/2;
        if(index1Ancestor == index2Ancestor){
            return index1Ancestor;
        }

        while(((index1Ancestor !=1) &&(index2Ancestor !=1))){
            index1 = index1Ancestor;
            index2 = index2Ancestor;
            index1Ancestor = index1/2;
            index2Ancestor = index2/2;
            if(index1Ancestor == index2Ancestor){
                return index1Ancestor;

            }

        }
        return commonAncestor;
    }

    public static void main(String[] args) {
//        int sol = run3(13,15);
//        System.out.println("sol : " + sol);
//        int sol1 = run3(11,13);
//        System.out.println("sol1 : " + sol1);
//        int sol2 = run3(10,11);
//        System.out.println("sol2 : " + sol2);
//        int sol3 = run3(1,1);
//        System.out.println("sol3 : " + sol3);
//        int sol4 = run3(2,1000000);
//        System.out.println("sol4 : " + sol4);
//        int sol5 = run3(9,25);
//        System.out.println("sol5 : " + sol5);
//        int sol6 = run3(61,62);
//        System.out.println("sol6 : " + sol6);


//        int index1= 13;
//        int index2 = 15;
//       int sol = run(index1, index2);
//        System.out.println("sol : " + sol);
//
//        int index11= 11;
//        int index21 = 13;
//        int sol1 = run(index11, index21);
//        System.out.println("sol1 : " + sol1);
//
//        int index12= 22;
//        int index22 = 12;
//        int sol2 = run(index12, index22);
//        System.out.println("sol2 : " + sol2);
//

//        int sol = run1(13,15);
//        System.out.println("sol : " + sol);
//        int sol1 = run1(11,13);
//        System.out.println("sol1 : " + sol1);
//        int sol2 = run1(10,11);
//        System.out.println("sol2 : " + sol2);
//        int sol3 = run1(1,1);
//        System.out.println("sol3 : " + sol3);
//        int sol4 = run1(2,1000000);
//        System.out.println("sol4 : " + sol4);
//        int sol5 = run1(9,25);
//        System.out.println("sol5 : " + sol5);
//        int sol6 = run1(61,62);
//        System.out.println("sol6 : " + sol6);

        int sol = run2(13,15);
        System.out.println("sol : " + sol);
        int sol1 = run2(11,13);
        System.out.println("sol1 : " + sol1);
        int sol2 = run2(10,11);
        System.out.println("sol2 : " + sol2);
        int sol3 = run2(1,1);
        System.out.println("sol3 : " + sol3);
        int sol4 = run2(2,1000000);
        System.out.println("sol4 : " + sol4);
        int sol5 = run2(9,25);
        System.out.println("sol5 : " + sol5);
        int sol6 = run2(61,62);
        System.out.println("sol6 : " + sol6);
    }

}
