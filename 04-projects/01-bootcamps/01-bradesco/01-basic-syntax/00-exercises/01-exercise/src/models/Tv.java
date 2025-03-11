package models;

public class Tv {
  private boolean isOn;
  private int channel;
  private int sound;

  public Tv() {
    this.isOn = false;
    this.channel = 0;
    this.sound = 0;
  }

  public Tv(boolean isOn, int chanel, int sound) {
    this.isOn = isOn;
    this.channel = chanel;
    this.sound = sound;
  }

  public boolean getIsOn() {
    return isOn;
  }

  public void setTurnOnOrTurnOff() {
    this.isOn = !this.isOn;
  }

  public int getChanel() {
    return channel;
  }

  public void setChanel(int chanel) {
    this.channel = chanel;
  }

  public int getSound() {
    return sound;
  }

  public void setSound(int sound) {
    this.sound = sound;
  }

  public void increaseSound() {
    if (this.channel <= 100) {
      this.sound++;
    }
  }

  public void turnDownSound() {
    if (this.channel <= 100) {
      this.sound--;
    }
  }

  public void changeTopChannel() {
    if (this.channel <= 100) {
      this.channel++;
    }
  }

  public void changeDownChannel() {
    if (this.channel >= 0) {
      this.channel--;
    }
  }

}
