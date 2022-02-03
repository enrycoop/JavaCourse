package OOP.Interfaces;

interface Bicycle {
    //int gear = 1; //<-- would be accepted
    //int gear; <-- error
    
    //public Bicycle(int startSpeed, int startGear) <-- NO costructor!

    public void setGear(int newValue); 

    public void applyBrake(int decrement);

    public void speedUp(int increment);
}
