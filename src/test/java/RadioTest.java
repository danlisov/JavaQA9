import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.JaqaQA9.service.Radio;

public class RadioTest {

    @Test
    public void shouldSetRadioStation(){
        Radio radio = new Radio();

        radio.setCurrentRadioStation(6);

        int expected = 6;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxRadioStation(){
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinRadioStation(){
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetFirstRadioStation(){
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);

        int expected = 1;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetEightRadioStation(){
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);

        int expected = 8;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNegativeMinRadioStation(){
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNegativeMaxRadioStation(){
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseMinRadioStation(){
        Radio radio = new Radio();

        radio.next();

        int expected = 1;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStation(){
        Radio radio = new Radio();

        radio.setCurrentRadioStation(6);

        radio.next();

        int expected = 7;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceRadioStation(){
        Radio radio = new Radio();

        radio.setCurrentRadioStation(6);

        radio.prev();

        int expected = 5;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceMaxRadioStation(){
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        radio.prev();

        int expected = 8;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseMaxRadioStation(){
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceMinRadioStation(){
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume(){
        Radio radio = new Radio();

        radio.currentVolume = 50;

        radio.increaseVolume();

        int expected = 51;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume(){
        Radio radio = new Radio();

        radio.currentVolume = 50;

        radio.reduceVolume();

        int expected = 49;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceWhenMaxVolume(){
        Radio radio = new Radio();

        radio.currentVolume = 100;

        radio.reduceVolume();

        int expected = 99;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseWhenMinVolume(){
        Radio radio = new Radio();

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNegativeReduceVolume(){
        Radio radio = new Radio();

        radio.reduceVolume();

        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMoreThanMax(){
        Radio radio = new Radio();

        radio.currentVolume = 100;

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
}
