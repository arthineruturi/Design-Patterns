package Bridge;

public class Main {
    public static void main(String[] args) {
        Device tv = new TV();
        AdvancedRemoteControl tvRemote = new AdvancedRemoteControl(tv);
        
        tvRemote.turnOn();
        tvRemote.setVolume(10);
        tvRemote.turnOff();
        tvRemote.mute();
        
        Device radio = new Radio();
        RemoteControl radioRemote = new AdvancedRemoteControl(radio);
        
        radioRemote.turnOn();
        radioRemote.setVolume(20);
        radioRemote.turnOff();
    }
}
