package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShouldRadioTest {


    @Test
    void ShouldnumberStationNext() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(9);
        radio.setCurrentNumberStation(-9);
        assertEquals(9, radio.getCurrentNumberStation());
        radio.setCurrentNumberStation(20);
        assertEquals(9, radio.getCurrentNumberStation());

        radio.numberStationNext();
        assertEquals(0, radio.getCurrentNumberStation());

        radio.numberStationNext();
        assertEquals(1, radio.getCurrentNumberStation());
    }

    @Test
    void numberStationPrev() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(0);
        radio.numberStationPrev();
        assertEquals(9, radio.getCurrentNumberStation());

        radio.numberStationPrev();
        assertEquals(8, radio.getCurrentNumberStation());
    }

    @Test
    void numberStationValue() {
        Radio radio = new Radio();

        radio.numberStationValue(5);
        assertEquals(5, radio.getCurrentNumberStation());

        radio.numberStationValue(7);
        assertEquals(7, radio.getCurrentNumberStation());

    }

    @Test
    void ShouldVolumePlus() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        radio.setCurrentVolume(-10);
        assertEquals(10, radio.getCurrentVolume());
        radio.setCurrentVolume(20);
        assertEquals(10, radio.getCurrentVolume());

        radio.volumePlus();
        assertEquals(10, radio.getCurrentVolume());

        radio.setCurrentVolume(9);
        radio.volumePlus();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void ShouldVolumeMinus() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.volumeMinus();
        assertEquals(0, radio.getCurrentVolume());

        radio.setCurrentVolume(10);
        radio.volumeMinus();
        assertEquals(9, radio.getCurrentVolume());
    }
}