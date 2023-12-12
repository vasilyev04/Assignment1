package Task1;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        Phone samsung = new Phone("87085455470", "Samsung A23", 0.5);
        Phone iphone = new Phone("87756648189", "Iphone 15", 0.3);
        Phone poco = new Phone("87723718485", "Poco X3", 1);

        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(samsung);
        phones.add(iphone);
        phones.add(poco);

        System.out.println("Information");
        for (Phone phone: phones) {
            System.out.println("Number: " + phone.getNumber());
            System.out.println("Model: " + phone.getModel());
            System.out.println("Weight: " + phone.getWeight());
        }
        System.out.println();
        System.out.println("Receiving calls");
        for (Phone phone: phones) {
            phone.receiveCall("Roman");
            phone.receiveCall("Anatoliy", phone.getNumber());
        }

        System.out.println();
        System.out.println("Sending messages");
        for (Phone phone : phones) {
            phone.sendMessage("87085455470");
        }
    }
}