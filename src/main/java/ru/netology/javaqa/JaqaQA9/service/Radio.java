package ru.netology.javaqa.JaqaQA9.service;
public class Radio {
    public int currentRadioStation;
    public int currentVolume;

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0 || newCurrentRadioStation > 9){
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void next(){
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        }
        if (currentRadioStation == 9){
            currentRadioStation = 0;
        }
    }
    public void prev(){
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        }
        if (currentRadioStation == 0){
            currentRadioStation = 9;
        }
    }
    public void increaseVolume(){
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume(){
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }


}
