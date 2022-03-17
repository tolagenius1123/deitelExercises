package tddClass;

public class Television {
    private int channel;
    private int volume;
    private boolean isOn;

    public Television(String tvName) {}

    public boolean isOn() {
        return isOn;
    }

    public void setOn() {
        isOn = true;
    }

    public void setOff() {
        isOn = false;
    }

    public void increaseVolume() {
        volume = volume + 1;
        /*if (isOn && volume < 100) volume++;*/
    }
    public int getVolume() {
        return volume;
    }

public void decreaseVolume(){
        volume = volume - 1;
   }

    public void setChannel(int Channel) {
        channel = Channel;

    }

    public int getChannel() {
        return channel;
    }

    public void increaseChannel() {
        channel = channel + 1;
    }

    public void changeChannel(int newChannel) {
        setChannel(newChannel);

    }
}
