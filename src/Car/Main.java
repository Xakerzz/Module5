package Car;

public class Main {
    public static void main(String[] args) {
        Rideable mazda = new Car();
//        mazda.start();
//        Car lada = new Car("Lada",123,false,20);
//        lada.start();
//        System.out.println(lada.getAcceleration() + " " + mazda.getAcceleration());
//        System.out.println(mazda.countSpeed(5) + " " + lada.countSpeed(5));
        rideRideable(new Boat());
        mazda.ride();

    }
    public static void rideRideable(Rideable rideable){
        rideable.ride();
    }
}
