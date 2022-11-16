package org.example;

import java.util.NoSuchElementException;

public class BinaryTreeNode {
    private int mValue;
    private BinaryTreeNode left;
    private BinaryTreeNode right;

    BinaryTreeNode(int i){
        this.mValue = i;
        this.right = null;
        this.left = null;
    }

    int getValue(){
        return this.mValue;
    }

    void setValue(int i){
        this.mValue = i;
    }

    BinaryTreeNode getLeft(){
        if (this.left==null){
            throw new NoSuchElementException();
        }
        return this.left;
    }

    BinaryTreeNode getRight(){
        if (this.right==null){
            throw new NoSuchElementException();
        }
        return this.right;
    }

    void setLeft(BinaryTreeNode n){
        this.left = n;
    }

    void setRight(BinaryTreeNode n){
        this.right = n;
    }

}
