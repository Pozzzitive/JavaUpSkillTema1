public class main {


    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance();
        Person p1 = new Person.PersonBuilder("Dan", "123456")
                .withAge(20)
                .withAddress("address")
                .withVehicle(factory.createVehicle("Car" , "Dacia"))
                .build();

        Person p2 = new Person.PersonBuilder()
                .withName("Andrei")
                .withCnp("24515")
                .withAddress("address2")
                .withVehicle(factory.createVehicle("Truck", "Nissan"))
                .withAge(25)
                .build();
        System.out.println(p1);
        System.out.println(p2);
    }
}
