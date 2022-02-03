package OOP.Polimorph.MethodOverride;

public class MethodOverridetest {
    public static void main(String arg[]){
        Bicycle bicycle = new Bicycle(1, 10);
        Bicycle mountainbike = new MountainBike(2, 10, 1);

        bicycle.applyBrake(1);
        mountainbike.applyBrake(1);

        System.out.println("Bicicle speed: "+bicycle.speed);
        System.out.println("Mountainbike speed: "+mountainbike.speed);
    }
}
