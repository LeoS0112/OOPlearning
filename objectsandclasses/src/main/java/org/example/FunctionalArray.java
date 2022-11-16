package org.example;

public class FunctionalArray {

    private BinaryTreeNode tree;
    private int length;
    public FunctionalArray(int length){
        this.length = length;
        this.tree = new BinaryTreeNode(0);
        for (int i=1; i<length; i++){
            addToArray(i, this.tree);
        }
    }

    private void addToArray(int i, BinaryTreeNode current) {
        if (i == 1 || i == 3){
            current.setRight(new BinaryTreeNode(0));
        } else if (i==2) {
            current.setLeft(new BinaryTreeNode(0));
        } else if (i%2==0) {
            addToArray(i/2, current.getLeft());
        } else {
            addToArray(i/2, current.getRight());
        }
    }

    public void set(int index, int value){
        setInner(index+1, value, this.tree);
    }

    private void setInner(int index, int value, BinaryTreeNode current) {
        if (index==1){
            current.setValue(value);
        } else if (index%2==0) {
            setInner(index/2, value, current.getLeft());
        } else if (index%2==1) {
            setInner(index/2, value, current.getRight());
        }
    }

    public int get(int index){
        return getInner(index+1, this.tree);
    }

    private int getInner(int i, BinaryTreeNode current) {
        if (i==1){
            return current.getValue();
        } else if (i%2==0) {
            return getInner(i/2, current.getLeft());
        } else {
            return getInner(i/2, current.getRight());
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
}
