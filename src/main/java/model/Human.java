package model;

public class Human extends Mammal {


    private String language;
    private String occupation;

    public Human(Integer mommas, Boolean hasHair, String language, String occupation, String adress, int phoneNumber) {
        super(mommas, hasHair);
        this.language = language;
        this.occupation = occupation;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
    }

    public Human() {
        super();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private String adress;

    private int phoneNumber;

}
