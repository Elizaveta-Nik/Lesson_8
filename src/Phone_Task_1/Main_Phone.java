package Phone_Task_1;

import java.util.Random;

public class Main_Phone {
    private static final Random random = new Random();
    private static final String[] names = {"Никита", "Анастасия", "Сергей", "Марина", "Кирилл"};

    public static void main(String[] args) {

        Phone[] phones = createPhones(3);

        printPhoneDetails(phones);

        callPhones(phones);

        phones[0].receiveCall("Алексей", "+375257351879");

        phones[0].sendMessage("+375291111111", "+375332222222", "+375443333333");
    }

    private static Phone[] createPhones(int count) {
        Phone[] phones = new Phone[count];
        for (int i = 0; i < count; i++) {
            String number = String.format("%05d", random.nextInt(250000000, 300000000));
            String model = "Model" + (i + 1);
            double weight = 100 + random.nextDouble() * 100;
            phones[i] = new Phone(number, model, weight);
        }
        return phones;
    }

    private static void printPhoneDetails(Phone[] phones) {
        for (Phone phone : phones) {
            System.out.println("Номер телефона: +" + phone.getNumber() + ", " + phone.getModel() + ", " + phone.getWeight());
        }
    }

    private static void callPhones(Phone[] phones) {
        for (Phone phone : phones) {
            String randomName = names[random.nextInt(names.length)];
            phone.receiveCall(randomName);
            System.out.println("Номер телефона: +" + phone.getNumber());
        }
    }
}
