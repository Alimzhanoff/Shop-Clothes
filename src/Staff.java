public class Staff {
    private String name;
    private int age;
    private String rang;
    private int number;

    //Contructors
    Staff(String name, String rang, int workExperience, int number) {
        this.name = name;
        this.age = age;
        this.rang = rang;
        this.number= number;
    }


    public void printStaff(){
        System.out.println(this.getName() + "\n" + this.getAge() + "\n" + this.getRang() + "\n" + this.getNumber());
    }

    // Setters and Getters
    public void setName(String name){this.name = name;}
    public void setAge(int age){this.age = age;}
    public void setRang(String rang){this.rang = rang;}
    public void setNumber(int number){this.number = number;}

    public String getName(){
        return this.name = name;
    }
    public int getAge(){
        return this.age = age;
    }
    public String getRang(){
        return this.rang = rang;
    }
    public int getNumber(){
        return this.number = number;
    }




}
