package OOP.Interfaces;

public class Interfacestest {
    public static void main (String args[]){
        MountainBike mountainBike = new MountainBike(12, 20, 1);
        Bicycle mountainBike2 = new MountainBike(13, 10, 1);

        System.out.println(mountainBike.getSpeed());
        //mountainBike2.getSpeed(); <-- Questo metodo non c'è nell'interfaccia

        mountainBike2.applyBrake(1);
    }
}
