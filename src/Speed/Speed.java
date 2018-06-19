package Speed;

public enum Speed {
    SLOW(30),
    NORMAL(90),
    FAST(150);

    private final int speedName;

    private Speed(int speedName){
        this.speedName = speedName;
    }

    public void printSpeedName() {
        System.out.println(this.speedName);
    }

    public int getSpeedName() {
        return speedName;
    }

    @Override
    public String toString(){
        return name() + " " +  speedName;
    }
}
