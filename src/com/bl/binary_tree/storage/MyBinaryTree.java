package com.bl.binary_tree.storage;

public class MyBinaryTree<K extends Comparable<K>> {
    private MyBinaryNode<K> root;

    public void add(K key) {
        this.root = this.addRecursively(root, key);
    }

    private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
        if (current == null) return new MyBinaryNode<>(key);
        int compareResult = key.compareTo(current.key);
        if (compareResult == 0) return current;
        if (compareResult < 0) current.left = addRecursively(current.left, key);
        else current.right = addRecursively(current.right, key);
        return current;
    }

    public int getSize() {
        return this.getSizeRecursively(root);
    }

    private int getSizeRecursively(MyBinaryNode<K> current) {
        return current == null ? 0 : 1 + this.getSizeRecursively(current.left) +
                getSizeRecursively(current.left);
    }

    public MyBinaryNode<K> search(K key) {
        return searchRecursively(root, key);
    }

    public MyBinaryNode<K> searchRecursively(MyBinaryNode<K> current, K key) {
        if (current.key == key)
            return current;
        else {
            int compareResult = key.compareTo(current.key);
            if (compareResult < 0) current = searchRecursively(current.left, key);
            else current = searchRecursively(current.right, key);
        }
        return current;
    }


}
