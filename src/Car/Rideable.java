package Car;

public interface Rideable {
    void ride();
default void swim(){
    System.out.println("Swimming");
}

}
