//lab4
package lab4;

class Address {
    String street;
    String city;
    String state;

    public Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public String getAddressInfo() {
        return street + ", " + city + ", " + state;
    }
}

class Student {
    int id;
    String name;
    Address address; 

    public Student(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Address: " + address.getAddressInfo());
    }
}





