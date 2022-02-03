package OOP.MultipleInheritance;

class MountainBike extends TwoWheeler implements Bicycle, Vehicle {
    private int seatHeight;
    private int gear;
    private int speed;

    public MountainBike( int startHeight, int startSpeed, int startGear){
        gear = startGear;
        speed = startSpeed;
        startHeight = seatHeight;
    }

    @Override
    public void canDrive(){
        System.out.println("You can drive me!");
    }

    @Override
    public void setGear(int newValue){
        gear = newValue;
    }

    @Override
    public void applyBrake(int decrement){
        speed -= decrement;
    }
    
    @Override
    public void speedUp(int increment){
        speed += increment;
    }

    public void setHeight (int newValue){
        seatHeight = newValue;
    }

    public int getGear(){
        return gear;
    }
    public int getSpeed(){
        return speed;
    }
}
