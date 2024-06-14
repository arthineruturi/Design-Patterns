package Bridge;


class AdvancedRemoteControl extends RemoteControl {
 
 public AdvancedRemoteControl(Device device) {
     super(device);
 }
 
 @Override
 public void turnOn() {
     device.turnOn();
 }
 
 @Override
 public void turnOff() {
     device.turnOff();
 }
 
 @Override
 public void setVolume(int volume) {
     device.setVolume(volume);
 }
 
 public void mute() {
     device.setVolume(0);
 }
}
