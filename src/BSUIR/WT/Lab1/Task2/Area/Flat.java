package BSUIR.WT.Lab1.Task2.Area;

import BSUIR.WT.Lab1.Task2.Interface.Contain;

public class Flat implements Contain {
    private final double left;
    private final double right;
    private final double top;
    private final double bottom;

    public Flat(double left, double right, double top, double bottom){
        this.left = left;
        this.right = right;
        this.top = top;
        this.bottom = bottom;
    }

    public boolean isContain(double x, double y){
        return x >= this.left && x <= this.right && y <= this.top && y >= this.bottom;
    }
}
