public class Truck implements Vehicle{
    private final String name;

    @Override
    public void drive() {
        System.out.println("driving a Truck");
    }
    Truck(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "name='" + name + '\'' +
                '}';
    }
}
