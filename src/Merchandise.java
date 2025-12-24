public class Merchandise {
    private String model;
    private double price;
    private String size;
    private String color;


    Merchandise(String model, double price, String size, String color) {
        this.model = model;
        this.price = price;
        this.size = size;
        this.color = color;
    }

    public void printItem(){
        System.out.println(this.getModel() + "\n" + this.getPrice() + "\n" + this.getSize() + "\n" + this.color);
        System.out.println("----------------------------------");
    }

    public void setModel(String model) {this.model = model;}
    public void setPrice(double price) {
        this.price = price;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public void setColor(String color){this.color = color;}

    public String getModel() {
        return this.model;
    }

    public double getPrice() {
        return this.price;
    }

    public String getSize() {
        return this.size;
    }
    public String getColor(){
        return this.color;
    }
}
