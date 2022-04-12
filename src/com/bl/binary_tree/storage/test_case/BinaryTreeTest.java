package com.bl.binary_tree.storage.test_case;

import com.bl.binary_tree.storage.MyBinaryNode;
import com.bl.binary_tree.storage.MyBinaryTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinaryTreeTest {

    //UC1
    @Test
    public void given3KeysCreateBinaryTree() {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
    }

    //UC2
    @Test
    public void given3KeysCreateBinaryTreeMatchSizeShouldMatch() {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        int size = myBinaryTree.getSize();
        Assertions.assertEquals(3, size);
    }

    //UC3
    @Test
    public void given3KeysCreateBinaryTreeSearchKeyShouldMatchResult() {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        myBinaryTree.search(30);
    }
}
