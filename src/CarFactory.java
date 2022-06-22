public class CarFactory {
    private static CarFactory instance = null;
    private CarFactory() {

    }
    public static CarFactory getInstance(){
        if (instance == null) {
            instance = new CarFactory();
        }
        return instance;
    }
    public static Vehicle createVehicle(String vehicleName, String marca){
        if("Car".equalsIgnoreCase(vehicleName)){
            return new Car(marca);
        } else if("Truck".equalsIgnoreCase(vehicleName)){
            return new Truck(marca);
        }else {
            throw new IllegalArgumentException("not a valid vehicle name");
        }
    }
}
