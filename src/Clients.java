public class Clients {
    private String name;
    private String email;
    private String address;
    private  int number;



    Clients(String name, String email, String address, int number){
        this.name = name;
        this.email = email;
        this.address = address;
        int number1 = this.number;
    }

    public String getName() {
        return this.name;
    }
    public String getEmail() {
        return this.email;
    }
    public String getAddress(){return this.address;}
    public int getNumber(){return this.number;}

    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setAddress(String address){this.address = address;}
    public void setNumber(int number){this.number = number;}

    public String getClientInfo() {
        return "name: " + this.name + " email: " + this.email + " adress: " + this.address + "number " + this.number;
    }
}
