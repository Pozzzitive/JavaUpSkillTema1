public class Person
{
    String name;
    int age;
    String cnp;
    String address;
    Vehicle personalVehicle;

    public Person(){}
    public Person(String name, String cnp)
    {
        this.name = name;
        this.cnp = cnp;
    }

    public Person(String name, int age, boolean married, boolean employed, String cnp, String address)
    {
        this.name = name;
        this.age = age;
        this.cnp = cnp;
        this.address = address;
    }

    public Person(String name, int age, boolean married, boolean employed, String cnp)
    {
        this(name, age, married, employed, cnp, null);
    }

    public Person(String name, boolean employed, boolean married, String cnp)
    {
        this(name, 0, married, employed, cnp, null);
    }



    public static class PersonBuilder {

        private Person person;

        public PersonBuilder(){
            this.person = new Person();
        }
        public PersonBuilder(String name, String cnp)
        {
            this.person = new Person(name, cnp);
        }
        public PersonBuilder withName(String name) {
            this.person.name = name;
            return this;
        }
        public PersonBuilder withCnp(String cnp) {
            this.person.cnp = cnp;
            return this;
        }
        public PersonBuilder withAge(int age) {
            this.person.age = age;
            return this;
        }

        public PersonBuilder withVehicle(Vehicle vehicle) {
            this.person.personalVehicle = vehicle;
            return this;
        }

        public PersonBuilder withAddress(String address) {
            this.person.address = address;
            return this;
        }

        public Person build() {
            return this.person;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cnp='" + cnp + '\'' +
                ", address='" + address + '\'' +
                ", personalVehicle=" + personalVehicle +
                '}';
    }
}
