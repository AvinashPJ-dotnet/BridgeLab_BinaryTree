package com.bl.binary_tree.storage.test_case;

import com.bl.binary_tree.storage.MyBinaryTree;
import org.testng.annotations.Test;

public class BinaryTreeTest {

    @Test
    public void given3KeysCreateBinaryTree(){
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
    }
}
