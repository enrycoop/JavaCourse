package OOP.Polimorph.MethodOverride;

class MountainBike extends Bicycle {
    public int seatHeight;
    
    public MountainBike(int startHeight, int startSpeed, int startGear){
        super(startGear,startSpeed);
        seatHeight = startHeight;
    }

    public void setHeight(int newValue){
        seatHeight = newValue;
    }

    @Override
    public void setGear(int newValue){
        gear = newValue+2;
    }

    @Override  // Se lo metto static -> ERROR
    public void applyBrake(int decrement){
        speed = speed - decrement -10;
    }

    @Override
    public void speedUp(int increment){
        speed = speed + increment + 10;
    }
}
