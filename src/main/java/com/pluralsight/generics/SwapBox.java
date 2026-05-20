package com.pluralsight.generics;

public class SwapBox<T>{
    private T leftItem;
    private T rightItem;

    public SwapBox(T leftItem, T rightItem) {
        this.leftItem = leftItem;
        this.rightItem = rightItem;
    }
    public T getLeftItem(){
        return this.leftItem;
    }

    public T getRightItem() {
        return this.rightItem;
    }

    public void setLeftItem(T leftItem) {
        this.leftItem = leftItem;
    }

    public void setRightItem(T rightItem) {
        this.rightItem = rightItem;
    }

    public void swap(){
        T temp = this.leftItem;
        this.leftItem = this.rightItem;
        this.rightItem = temp;
    }

    public String describe(){
        return String.format("Left: %s, Right: %s",this.leftItem.toString() ,this.rightItem.toString());
    }
}
