package ru.netology.stats;

public class Radio {
    private int currentRadioStation; ///текущая радиостанция
    private int currentVolume; ///текущая громкость

    public int getCurrentRadioStation() { ///получение текущей радиостанции
        return currentRadioStation;
    }

    public int getCurrentVolume() { ///получение текущей громкости
        return currentVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) { ///установка текущей радиостанции напрямую
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
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
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prev() { ///переключить радиостанцию на 1 назад
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = 9;
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