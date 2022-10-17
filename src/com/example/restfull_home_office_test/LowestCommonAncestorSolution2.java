package com.example.restfull_home_office_test;

import java.util.Stack;


    class Node
    {
        int index;
        Node left, right;

        public Node(int item)
        {
            index = item;
            left = right = null;
        }
    }



    public class LowestCommonAncestorSolution2 {

        public static int findLowest( int n1, int n2) {
            if (n1 == n2) return n1; // if they are the same nodes, don't I still need the parent node?

            Stack pathToN1 = pathTo(1, n1);
            printStack(pathToN1);

            Stack pathToN2 = pathTo(1, n2);
            printStack(pathToN2);
            if (pathToN1 == null || pathToN2 == null) return 0;

            int commonAncestor = 0;
            while (!pathToN1.isEmpty() && !pathToN2.isEmpty()) {
                int indexFromPathToIndex1 = (int) pathToN1.pop();
                int indexFromPathToIndex2 = (int) pathToN2.pop();
                if (indexFromPathToIndex1 == indexFromPathToIndex2) commonAncestor = indexFromPathToIndex1;
                else break;
            }

            return commonAncestor;
        }

        public static Stack<Integer> pathTo(int rootIndex, int index) {
            if (rootIndex == index) {
                Stack<Integer> stackContainingOnlyRoot = new Stack<>();
                stackContainingOnlyRoot.push(rootIndex);
                return stackContainingOnlyRoot;
            }
            int rootLeftDescendant= rootIndex * 2;
            int rootRightDescendant = rootIndex * 2 +1;
            if(rootLeftDescendant<= index) {
                Stack<Integer> leftStack = pathTo(rootLeftDescendant, index);
                if (leftStack != null) {
                    leftStack.push(rootLeftDescendant);
                    return leftStack;
                }
            }

            if(rootRightDescendant<= index) {
                Stack<Integer> rightStack = pathTo(rootRightDescendant, index);
                if (rightStack != null) {
                    rightStack.push(rootRightDescendant);
                    return rightStack;
                }

            }


            return null;
        }
        public static void printStack(Stack path){
            while(path.size() >0){
                System.out.println(path.pop());
            }
        }
        public static void main(String[] args) {
//            System.out.println("LowestCommonAncestorSolution2:  "
//                    + findLowest(4,7));
            System.out.println("LowestCommonAncestorSolution2:  "
                    + findLowest(1,2));

        }
    }


