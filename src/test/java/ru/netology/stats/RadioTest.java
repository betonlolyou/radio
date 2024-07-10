package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldCreateRadioWithDefaultNumberOfStations() {
        Radio rad = new Radio();

        int expected = 10;
        int actual = rad.getNumberOfStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCreateRadioWithCustomNumberOfStations() {
        Radio rad = new Radio(20);

        int expected = 20;
        int actual = rad.getNumberOfStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDoNextButtonLastStationIfItsLastStationCustomStations() {
        Radio rad = new Radio(15);
        rad.setCurrentRadioStation(14);

        rad.next();

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDoPrevButtonFirstStationIfItsFirstStationCustomStations() {
        Radio rad = new Radio(15);
        rad.setCurrentRadioStation(0);

        rad.prev();

        int expected = 14;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationAboveCustomMax() {
        Radio rad = new Radio(15);

        rad.setCurrentRadioStation(15);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationBelowMin() {
        Radio rad = new Radio(15);

        rad.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(9);

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationAboveMax() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(50);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationBelowMax() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(-5);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDoNextButtonPlusOne() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(3);

        rad.next();

        int expected = 4;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDoNextButtonFirstStationIfItsLastStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);

        rad.next();

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDoPrevButtonMinusOne() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(3);

        rad.prev();

        int expected = 2;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDoPrevButtonLastStationIfItsFirstStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);

        rad.prev();

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(9);

        int expected = 9;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(120);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-5);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDoLouderButtonPlusOne() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);

        rad.increaseVolume();

        int expected = 6;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDoNotDoLouderButtonPlusOneIfItsMaxVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);

        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDoQuietButtonMinusOne() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);

        rad.reduceVolume();

        int expected = 4;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDoNotDoQuietButtonMinusOneIfItsMinVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        rad.reduceVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}