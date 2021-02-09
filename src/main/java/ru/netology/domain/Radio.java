package ru.netology.domain;

public class Radio {
    private int currentNumberStation;
    private int currentVolume;

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public void setCurrentNumberStation(int currentNumberStation) {
        if (currentNumberStation < 0)
            return;
        if (currentNumberStation > 9)
            return;
        this.currentNumberStation = currentNumberStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0)
            return;
        if (currentVolume > 10)
            return;
        this.currentVolume = currentVolume;
    }

    void numberStationNext() {
        if (getCurrentNumberStation() == 9) {
            setCurrentNumberStation(0);
            return;
        }
        setCurrentNumberStation(getCurrentNumberStation() + 1);
    }

    void numberStationPrev() {
        if (getCurrentNumberStation() == 0) {
            setCurrentNumberStation(9);
            return;
        }
        setCurrentNumberStation(getCurrentNumberStation() - 1);
    }

    void numberStationValue(int CurrentNumberStation) {

        setCurrentNumberStation(CurrentNumberStation);
    }

    void volumePlus() {
        if (getCurrentVolume() == 10) {
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
