package model;

public class Mammal extends LivingBeing{

    public Integer mommas;

    public Boolean hasHair;

    public Mammal(Integer mommas, Boolean hasHair) {
        this.mommas = mommas;
        this.hasHair = hasHair;
    }

    public Mammal() {

    }

    public Integer getMommas() {
        return mommas;
    }

    public void setMommas(Integer mommas) {
        this.mommas = mommas;
    }

    public Boolean getHasHair() {
        return hasHair;
    }

    public void setHasHair(Boolean hasHair) {
        this.hasHair = hasHair;
    }
}
