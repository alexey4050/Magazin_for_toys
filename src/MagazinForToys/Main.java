package MagazinForToys;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        Controller controller =new Controller();

        ArrayList<Toy> toys = new ArrayList<>();
        toys.add(new Toy(1, "Робот", 10));
        toys.add(new Toy(2, "Конструктор", 30));
        toys.add(new Toy(3, "Настоьная игра", 7));
        toys.add(new Toy(4, "Мягкая игрушка", 25));
        toys.add(new Toy(5,"Кукла", 20));
        toys.add(new Toy(6, "Машинка", 40));

        int numberOfPrizes = 20;

        controller.fileWriter(toys, "lottery_result.txt", numberOfPrizes);
    }
}