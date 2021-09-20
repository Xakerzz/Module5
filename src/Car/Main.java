package Car;

public class Main {
    public static void main(String[] args) {
        Car mazda = new Car();
        mazda.start();
        Car lada = new Car("Lada",123,false,20);
        lada.start();
        System.out.println(lada.getAcceleration() + " " + mazda.getAcceleration());
        System.out.println(mazda.coutSpeed(5) + " " + lada.coutSpeed(5));

    }
}
