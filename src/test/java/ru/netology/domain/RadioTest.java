package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShouldRadioTest {


    @Test
    void ShouldnumberStationNext() {
        Radio radio = new Radio(33);
        radio.setCurrentNumberStation(32);
        radio.numberStationNext();
        assertEquals(33, radio.getCurrentNumberStation());

        radio.numberStationNext();
        assertEquals(0, radio.getCurrentNumberStation());

        radio.numberStationNext();
        assertEquals(1, radio.getCurrentNumberStation());
    }

    @Test
    void numberStationPrev() {
        Radio radio = new Radio(33);
        radio.setCurrentNumberStation(0);
        radio.numberStationPrev();
        assertEquals(33, radio.getCurrentNumberStation());

        radio.numberStationPrev();
        assertEquals(32, radio.getCurrentNumberStation());
    }

    @Test
    void numberStationValue() {
        Radio radio = new Radio(20);

        radio.numberStationValue(5);
        assertEquals(5, radio.getCurrentNumberStation());

        radio.numberStationValue(17);
        assertEquals(17, radio.getCurrentNumberStation());

    }

    @Test
    void ShouldVolumePlus() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.volumePlus();
        assertEquals(100, radio.getCurrentVolume());

        radio.volumePlus();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void ShouldVolumeMinus() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.volumeMinus();
        assertEquals(0, radio.getCurrentVolume());

        radio.setCurrentVolume(100);
        radio.volumeMinus();
        assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    void ShouldVolumeBorder() {
        Radio radio = new Radio(5, 80, 10);
        radio.setCurrentVolume(-10);
        assertEquals(80, radio.getCurrentVolume());
        radio.setCurrentVolume(150);
        assertEquals(80, radio.getCurrentVolume());
    }

    @Test
    void ShouldnumberStationBorder() {
        Radio radio = new Radio(33);
        radio.setCurrentNumberStation(30);
        radio.setCurrentNumberStation(-9);
        assertEquals(30, radio.getCurrentNumberStation());
        radio.setCurrentNumberStation(40);
        assertEquals(30, radio.getCurrentNumberStation());
    }
}