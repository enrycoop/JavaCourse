package OOP.Inheritance;

class Bicycle {
    //private int gear; <-- Non è accessibile da MountainBike
    // int gear; <-- Funzionerebbe perchè la classe derivata è nello stesso package..
    protected int gear;
    protected int speed;
    
    public Bicycle(int startSpeed, int startGear){
        // Constructor! //
        gear = startGear;
        speed = startSpeed;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void applyBrake(int decrement){
        speed -= decrement;
    }

    public void speedUp(int increment){
        speed += increment;
    }
}
