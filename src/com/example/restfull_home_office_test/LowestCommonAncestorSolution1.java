package com.example.restfull_home_office_test;

import org.junit.jupiter.api.Assertions;

public class LowestCommonAncestorSolution1 {
    // I've worked under the assumption we're always working with a fully balanced binary tree. In this case, the parent of each node
// will have the index equal to the node's index divided by 2.
//                     1
//                 /      \
//               2          3
//              / \        /  \
//             4   5      6     7
//           / \  /  \    / \   / \
//          8  9  10  11  12 13 14 15
    public static int run(int index1, int index2) {
        // instantiate common ancestor at the root's index
        int commonAncestor = 1;

        do {
            // If indexes represent the same node, we found the
            // common ancestor, and we want to return it
            if (index1 == index2) {
                commonAncestor = index1;
                break;
            }
            // If one node's index is greater than the
            // other one, we'll move up the tree to its node's
            // parent
            if (index1 > index2) {
                index1 = index1 / 2;
            }
            if (index2 > index1) {
                index2 = index2 / 2;
            }
        }
        // Keep moving up the tree from node to parent
        // until we reach the common node/index ancestor
        while (true);

        return commonAncestor;

    }


    public static void main(String[] args) {
        Assertions.assertEquals(3, run(13, 15));
        Assertions.assertEquals(1, run(11, 13));
        Assertions.assertEquals(5, run(10, 11));
        Assertions.assertEquals(1, run(1, 1));
        Assertions.assertEquals(1, run(1, 1000000));
        Assertions.assertEquals(1000000, run(1000000, 1000000));
        Assertions.assertEquals(1, run(1000000, 1));
        Assertions.assertEquals(1, run(9, 25));
        Assertions.assertEquals(15, run(61, 62));
        Assertions.assertEquals(1, run(2, 3));
        Assertions.assertEquals(3, run(61, 25));
        Assertions.assertEquals(61, run(61, 61));
        Assertions.assertEquals(2, run(4, 5));
        Assertions.assertEquals(1, run(4, 6));
        Assertions.assertEquals(1, run(3, 4));
        Assertions.assertEquals(2, run(2, 4));
    }
}
