package Car;

public class Car {
    String brand;
    int forcePower;
    boolean isAwd;
    float acceleration;

    public Car() {
        this("Mazda",190,false,10);

    }
    public Car(String brand, int forcePower, boolean isAwd, float acceleration) {
        this.brand = brand;
        this.forcePower = forcePower;
        this.isAwd = isAwd;
        this.acceleration = acceleration;
    }




    void start(){
        System.out.println(brand + " " + "has been started");
    }
    public float getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(float acceleration) {
        this.acceleration = acceleration;
    }

    float coutSpeed(float time){
        return (100/acceleration)*time;
    }
}
