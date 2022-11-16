package org.example;

public class SearchSet {
    private int mElements;
    private BinaryTreeNode tree;
    public  SearchSet(){
        this.mElements = 0;
        this.tree = null;
    }


    public void insert(int element){
        if (this.tree == null){
            this.tree = new BinaryTreeNode(element);
            return;
        }
        insertInner(element, this.tree);
    }
    void insertInner(int element, BinaryTreeNode current) {
        boolean notInserted = true;
        boolean leftExists = true;
        boolean rightExists = true;
        try {
            current.getLeft();
        } catch (Exception NoSuchElementException) {
            leftExists = false;
        }
        try {
            current.getRight();
        } catch (Exception NoSuchElementException) {
            rightExists = false;
        }
        if (leftExists&&rightExists){
            if (element > current.getValue()){
                insertInner(element, current.getLeft());
            }
            else{
                insertInner(element, current.getRight());
            }
        } else if (leftExists) {
            if (element > current.getValue()){
                insertInner(element, current.getLeft());
            }
            else{
                current.setRight(new BinaryTreeNode(element));
            }
        } else if (rightExists) {
            if (element > current.getValue()){
                current.setLeft(new BinaryTreeNode(element));
            }
            else{
                insertInner(element, current.getRight());
            }
        }
        else {
            if (element > current.getValue()){
                current.setLeft(new BinaryTreeNode(element));
            }
            else{
                current.setRight(new BinaryTreeNode(element));
            }
        }


    }
    @Override
    public String toString() {
        if (this.tree == null){
            return "||";
        }
        return toStringInner(this.tree);
    }

    String toStringInner(BinaryTreeNode current){
        boolean leftExists = true;
        boolean rightExists = true;
        try {
            current.getLeft();
        }
        catch (Exception NoSuchElementException){
            leftExists = false;
        }
        try {
            current.getRight();
        }
        catch (Exception NoSuchElementException){
            rightExists = false;
        }

            if(leftExists&&rightExists){
                return toStringInner(current.getLeft()) + current.getValue() + toStringInner(current.getRight());
            } else if (leftExists) {
                return toStringInner(current.getLeft()) + current.getValue() + "||";
            } else if (rightExists) {
                 return "||" + current.getValue() + toStringInner(current.getRight());
            } else {
                 return String.valueOf(current.getValue());
            }

    }

    public int getNumberElements(){
        if (this.tree == null){
            return 0;
        }
        return getNumberElementsInner(this.tree);
    }

    private int getNumberElementsInner(BinaryTreeNode current) {
        boolean leftExists = true;
        boolean rightExists = true;
        try {
            current.getLeft();
        }
        catch (Exception NoSuchElementException){
            leftExists = false;
        }
        try {
            current.getRight();
        }
        catch (Exception NoSuchElementException){
            rightExists = false;
        }
        if (rightExists&&leftExists){
            return 1 + getNumberElementsInner(current.getLeft()) + getNumberElementsInner(current.getRight());
        } else if (rightExists) {
            return 1 + getNumberElementsInner(current.getRight());
        } else if (leftExists) {
            return 1 + getNumberElementsInner(current.getLeft());
        } else {return 1;}
    }

    public boolean contains(int i){
        if (this.tree == null){
            return false;
        }
        return containsInner(i, this.tree);
    }

    private boolean containsInner(int i, BinaryTreeNode current) {
        boolean leftExists = true;
        boolean rightExists = true;
        try {
            current.getLeft();
        }
        catch (Exception NoSuchElementException){
            leftExists = false;
        }
        try {
            current.getRight();
        }
        catch (Exception NoSuchElementException){
            rightExists = false;
        }
        if (i == current.getValue()){
            return true;
        }
        if (i > current.getValue()){
            if (leftExists){
                return containsInner(i, current.getLeft());
            }
            else {
                return false;
            }
        }
        if (i<current.getValue()){
            if (rightExists) {
                return containsInner(i, current.getRight());
            }
            else {
                return false;
            }
        }
        return false;
    }


}
