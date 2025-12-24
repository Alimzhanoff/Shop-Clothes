public class Clients {
    private String name;
    private String email;
    private String address;

    Clients(String name, String email, String address){
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }
    public String getAddress(){return this.address;}

    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setAddress(String address){this.address = address;}

    public String getClientInfo() {
        return "name: " + this.name + " email: " + this.email + " adress: " + this.address;
    }
}
