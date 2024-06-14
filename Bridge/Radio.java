package Bridge;

class Radio implements Device {
    
    private int volume;
    
    @Override
    public void turnOn() {
        System.out.println("Radio is turned on.");
    }
    
    @Override
    public void turnOff() {
        System.out.println("Radio is turned off.");
    }
    
    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Radio volume set to " + volume);
    }
}