package model;

public class Reptiles extends LivingBeing{
    public Boolean hasScales;
    public Boolean canLayEggs;

    public Boolean getHasScales() {
        return hasScales;
    }

    public Reptiles(Boolean hasScales, Boolean canLayEggs) {
        this.hasScales = hasScales;
        this.canLayEggs = canLayEggs;
    }

    public void setHasScales(Boolean hasScales) {
        this.hasScales = hasScales;
    }

    public Boolean getCanLayEggs() {
        return canLayEggs;
    }

    public void setCanLayEggs(Boolean canLayEggs) {
        this.canLayEggs = canLayEggs;
    }
}
