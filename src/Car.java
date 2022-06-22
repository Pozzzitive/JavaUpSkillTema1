public class Car implements Vehicle{
    private String name;

    @Override
    public void drive() {
        System.out.println("driving a car");
    }
    Car (String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}
