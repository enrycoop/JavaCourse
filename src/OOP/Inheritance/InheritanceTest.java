package OOP.Inheritance;

public class InheritanceTest {
    public static void main(String args[]){
        MountainBike mountainBike = new MountainBike(20, 10, 1);
        System.out.println("Gear is: " + mountainBike.gear);
        System.out.println("Seat is: " + mountainBike.seatHeight);
        System.out.println("Speed is: " + mountainBike.speed);
        mountainBike.applyBrake(2);
        System.out.println("After applyBrake speed is: " + mountainBike.speed);

    }
}
