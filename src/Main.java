import Advertisement.FacebookAdvertisement;
import Advertisement.eMail;
import Advertisement.printAdvertisement;
import Animals.Cat;
import Animals.Dog;
import Bank.BancaTransilvania;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {


        FacebookAdvertisement facebookAdvertisement = new FacebookAdvertisement();
        eMail eMail = new eMail();
        printAdvertisement printAdvertisement = new printAdvertisement();

        System.out.println("___________________________________________________________");

        facebookAdvertisement.advertiseMessage("This is the facebook message");
        eMail.advertiseMessage("This is the eMail message");
        printAdvertisement.advertiseMessage("This is the print message");

        System.out.println("___________________________________________________________");

        BancaTransilvania bancaTransilvania = new BancaTransilvania(1000);

        int soldCurent;

        soldCurent = bancaTransilvania.withdraw(5000);
        System.out.println("Sold curent: " + soldCurent);

        soldCurent = bancaTransilvania.deposit(1000);
        System.out.println("Sold curent: " + soldCurent);

        System.out.println("___________________________________________________________");


        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println("Dog walking style: " + dog.walk());
        System.out.println("Dog eating style: " + dog.eat());
        System.out.println("Dog talking style: " + dog.talk());


        System.out.println("Cat walking style: " + cat.walk());
        System.out.println("Cat eating style: " + cat.eat());
        System.out.println("Cat talking style: " + cat.talk());


        System.out.println("___________________________________________________________");

        Student student1 = new Student("Andrei", 10);
        Student student2 = new Student("Marius", 5);
        Student student3 = new Student("Alex", 7);
        Student student4 = new Student("Cristi", 4);
        Student student5 = new Student("Mihai", 9);

        System.out.println("Media studentilor este: " + Student.getAverageGrade());



    }
}