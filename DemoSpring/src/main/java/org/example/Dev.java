package org.example;

public class Dev {
//    private int age;
//    private Laptop laptop;
private Computer com;

//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }



//    public int getAge() {
//        return age;
//    }

//    public Dev(int age) {
//        this.age = age;
//    }

//    public void setAge(int age) {
//        this.age = age;
//    }

//    public Dev(Laptop laptop) {
//        this.laptop = laptop;
//    }


    public Dev(Computer com) {
        this.com = com;
    }

    public Dev() {
//        this.computer = computer;
    }

    public void build()
    {
        laptop.compile();
        System.out.println("inside build class");
    }
}
