import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.JaqaQA9.service.Radio;

public class RadioTest {

    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(6);

        Assertions.assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetMaxRadioStation() {
        Radio radio = new Radio(0, 0, 15);

        radio.setCurrentRadioStation(14);

        Assertions.assertEquals(14, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetMinRadioStation() {
        Radio radio = new Radio();
        ;

        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetFirstRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);

        Assertions.assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetEightRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);

        Assertions.assertEquals(8, radio.getCurrentRadioStation());
    }


    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);

        Assertions.assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetMinVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetFirstVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        Assertions.assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetPrevLastVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        Assertions.assertEquals(99, radio.getCurrentVolume());
    }


    @Test
    public void shouldIncreaseMinRadioStation() {
        Radio radio = new Radio();

        radio.next();

        Assertions.assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldIncreaseRadioStation() {
        Radio radio = new Radio(0, 0, 21);

        radio.setCurrentRadioStation(6);

        radio.next();

        Assertions.assertEquals(7, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldIncreaseRadioStationToMax() {
        Radio radio = new Radio(0, 0, 26);

        radio.setCurrentRadioStation(24);

        radio.next();

        Assertions.assertEquals(25, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldReduceRadioStation() {
        Radio radio = new Radio(0, 0, 11);

        radio.setCurrentRadioStation(6);

        radio.prev();

        Assertions.assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldReduceMaxRadioStation() {
        Radio radio = new Radio(0, 0, 16);

        radio.setCurrentRadioStation(15);

        radio.prev();

        Assertions.assertEquals(14, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldReduceRadioStationToMin() {
        Radio radio = new Radio(0, 0, 20);

        radio.setCurrentRadioStation(1);

        radio.prev();

        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldIncreaseMaxRadioStation() {
        Radio radio = new Radio(0, 0, 30);

        radio.setCurrentRadioStation(29);

        radio.next();

        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldReduceMinRadioStation() {
        Radio radio = new Radio(0, 0, 50);

        radio.setCurrentRadioStation(0);

        radio.prev();

        Assertions.assertEquals(49, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);

        radio.increaseVolume();

        Assertions.assertEquals(51, radio.getCurrentVolume());
    }

    @Test
    public void shouldReduceVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);

        radio.reduceVolume();

        Assertions.assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    public void shouldReduceWhenMaxVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        radio.reduceVolume();

        Assertions.assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseWhenMinVolume() {
        Radio radio = new Radio();

        radio.increaseVolume();

        Assertions.assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldNegativeReduceVolume() {
        Radio radio = new Radio();

        radio.reduceVolume();

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolumeMoreThanMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        radio.increaseVolume();

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }


    @Test
    public void shouldIncreaseWhenOneRadioStation() {
        Radio radio = new Radio(0, 0, 1);

        radio.next();

        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldReduceWhenOneRadioStation() {
        Radio radio = new Radio(0, 0, 1);

        radio.prev();

        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldReduceWhenTwoRadioStation() {
        Radio radio = new Radio(0, 0, 2);

        radio.prev();

        Assertions.assertEquals(1, radio.getCurrentRadioStation());
    }


}
