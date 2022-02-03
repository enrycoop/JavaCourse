package OOP.Polimorph.MethodOverride;

class Bicycle {
    protected int gear;
    protected int speed;
    
    public Bicycle(int startGear, int startSpeed){
        speed = startSpeed;
        gear = startGear;
    }

    //Se lo metto static -> ERROR
    public void setGear(int newValue){
        gear = newValue;
    }

    public void applyBrake(int decrement){
        speed -= decrement;
    }
    public void speedUp(int increment){
        speed += increment;
    }
}
