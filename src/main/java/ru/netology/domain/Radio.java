package ru.netology.domain;

public class Radio {
    private int currentNumberStation;
    private int currentVolume;
    private int quantityStation = 10;

    public Radio() {
    }

    public Radio(int quantityStation) {
        this.quantityStation = quantityStation;
    }

    public Radio(int currentNumberStation, int currentVolume, int quantityStation) {
        this.currentNumberStation = currentNumberStation;
        this.currentVolume = currentVolume;
        this.quantityStation = quantityStation;
    }

    public int getQuantityStation() {
        return quantityStation;
    }

    public void setQuantityStation(int quantityStation) {
        this.quantityStation = quantityStation;
    }

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public void setCurrentNumberStation(int currentNumberStation) {
        if (currentNumberStation < 0)
            return;
        if (currentNumberStation > getQuantityStation())
            return;
        this.currentNumberStation = currentNumberStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0)
            return;
        if (currentVolume > 100)
            return;
        this.currentVolume = currentVolume;
    }

    void numberStationNext() {
        if (getCurrentNumberStation() == getQuantityStation()) {
            setCurrentNumberStation(0);
            return;
        }
        setCurrentNumberStation(getCurrentNumberStation() + 1);
    }


    void numberStationPrev() {
        if (getCurrentNumberStation() == 0) {
            setCurrentNumberStation(getQuantityStation());
            return;
        }
        setCurrentNumberStation(getCurrentNumberStation() - 1);
    }

    void numberStationValue(int CurrentNumberStation) {

        setCurrentNumberStation(CurrentNumberStation);
    }

    void volumePlus() {
        if (getCurrentVolume() == 100) {
            return;
        }
        setCurrentVolume(getCurrentVolume() + 1);
    }

    void volumeMinus() {
        if (getCurrentVolume() == 0) {
            return;
        }
        setCurrentVolume(getCurrentVolume() - 1);
    }
}
