package BSUIR.WT.Lab1.Task2.Area;

import BSUIR.WT.Lab1.Task2.Interface.Contain;

public class Area implements Contain {

    private final Flat[] flats;

    public Area(Flat[] flats) {
        this.flats = flats;
    }

    public boolean isContain(double x, double y) {
        for(Flat flat : flats){
            if (flat.isContain(x, y)){
                return true;
            }
        }
        return false;
    }
}
