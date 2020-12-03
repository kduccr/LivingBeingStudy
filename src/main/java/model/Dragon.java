package model;

public class Dragon extends Reptiles {
    public Boolean canFly;

    public Dragon(Boolean hasScales, Boolean canLayEggs) {
        super(hasScales, canLayEggs);
    }

    public Boolean getCanFly() {
        return canFly;
    }

    public Boolean getHasWings() {
        return hasWings;
    }

    public void setHasWings(Boolean hasWings) {
        this.hasWings = hasWings;
    }

    public void setCanFly(Boolean canFly) {
        this.canFly = canFly;
    }

    public Boolean hasWings;
}
