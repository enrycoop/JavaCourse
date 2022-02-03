package OOP.Inheritance;

class MountainBike extends Bicycle {
    public int seatHeight;

    public MountainBike( int startHeight, int startSpeed, int startGear){
        super(startSpeed,startGear);
        startHeight = seatHeight;
    }

    public void setHeight (int newValue){
        seatHeight = newValue;
    }
}
