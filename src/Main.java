import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        // identefication
        System.out.println("Input a name:");
        Scanner scan = new Scanner(System.in);
        String idef = scan.nextLine();
        System.out.println("Welcome " + idef + "!");


        // Clients
        System.out.println("----------------Clients------------");
        Clients jeff = new Clients("Jeff Bezos", "Bezdar@Jeff.com", "Prinston 60A/6");
        System.out.println(jeff.getClientInfo());
        Clients bob = new Clients("Bob Mazovski", "Bobresi@email.com", "Jerdin_birjeri 65A");
        System.out.println(bob.getClientInfo());
        Clients Kanye = new Clients("Kanye West", "KanyeWestern", "USA56/6");
        System.out.println(Kanye.getClientInfo());

        //Clothes

        System.out.println("-----------------Merchendies------------------");
        Merchandise jeans = new Merchandise("Levi's 501", 79.9, "M", "Blue");
        Merchandise tShirt =  new Merchandise("Nike", 15.99, "L", "Yellow");
        Merchandise sneakers = new Merchandise("Nike air Jordans", 60, "46", "Black");

        jeans.printItem() ;
        tShirt.printItem();
        sneakers.printItem();


        //Staff
        System.out.println("----------------------STAFF------------------");
        Staff Elena = new Staff("Elena", "Director", 8, 8);
        Staff Kagan = new Staff( "Kagan", "Stylist", 4, 7);
        Staff Darkhan = new Staff("Darkhan", "Cashier", 2, 6);

        Elena.printStaff();
        Kagan.printStaff();;
        Darkhan.printStaff();



       }

    }
