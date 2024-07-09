package ru.netology.stats;

public class Radio {
    private int currentRadioStation; ///текущая радиостанция
    private int currentVolume; ///текущая громкость
    private int numberOfStations; /// количество радиостанций

    public Radio() {
        this.numberOfStations = 10; /// по умолчанию 10 станций
    }

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations; /// для задания количества станций
    }

    public int getCurrentRadioStation() { ///получение текущей радиостанции
        return currentRadioStation;
    }

    public int getCurrentVolume() { ///получение текущей громкости
        return currentVolume;
    }

    public int getNumberOfStations() {
        return numberOfStations;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) { ///установка текущей радиостанции напрямую
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > (numberOfStations - 1)) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setCurrentVolume(int newCurrentVolume) { ///установка текущей громкости напрямую
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void next() { ///переключить радиостанцию на 1 вперед
        if (currentRadioStation < (numberOfStations - 1)) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prev() { ///переключить радиостанцию на 1 назад
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = numberOfStations - 1;
        }
    }

    public void increaseVolume() { ///увеличить громкость на 1
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() { ///уменьшить громкость на 1
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}