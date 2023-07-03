import java.time.LocalDate;

import java.time.Period;

public class Main {
    public static void main(String[] args) {

        LocalDate birthday1 = LocalDate.of(1995, 4, 14);

        User user1 = new User("John", birthday1, "john@example.com", "123456", "Doe", 80, 120, 10000);

        LocalDate birthday2 = LocalDate.of(1988, 7, 22);

        User user2 = new User("Jane", birthday2, "jane@example.com", "654321", "Doe", 60, 110, 8000);

        user1.printAccountInfo();

        user2.printAccountInfo();

        // Изменение параметров для двух пользователей

        user1.setSurname("Smith");

        user1.setWeight(85);

        user1.setPressure(125);

        user1.setSteps(12000);

        user2.setSurname("Johnson");

        user2.setWeight(65);

        user2.setPressure(115);

        user2.setSteps(9000);

        // Печать информации о пользователях

        user1.printAccountInfo();

        user2.printAccountInfo();

    }
}