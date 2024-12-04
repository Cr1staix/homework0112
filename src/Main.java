import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
    }

    /**
     * Задача №1
     */
    public static void task1() {
        Printer printer1 = new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        };
        printer1.print("Печатаю доклад");

        Printer printer2 = message -> System.out.println(message);
        printer2.print("Печатаю курсовую");

        Printer printer3 = message -> {
            System.out.println(message);
            System.out.println("Длина сообщения " + message.length() + " символов");
        };
        printer3.print("Печатаю диплом");
    }
    /**
     * Задача №2
     */
    public static void task2() {
        List<String> names = Arrays.asList("Алексей", "Борис", "Сергей", "Абраам", "Светлана");
        System.out.println("До сортировки - " + names);
        names.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println("После первой сортировки - " + names);

        names.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println("После второй сортировки - " + names);
    }
    /**
     * Задача №3
     */
    public static void task3() {
        Car car1 = new Car("LADA", "Vesta", 2022);
        Car car2 = new Car("LADA", "XRay", 2022);
        Car car3 = new Car("BMW", "X5", 2021);
        Car car4 = new Car("BMW", "E38", 1998);
        Car car5 = new Car("AUDI", "Q5", 2024);

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        System.out.println(cars);

        cars.sort((o1, o2) -> {
            if (o2.getYear().compareTo(o1.getYear()) == 0) {
                if (o1.getBrand().compareTo(o2.getBrand()) == 0) {
                    return o1.getModel().compareTo(o1.getModel());
                }
                return o1.getBrand().compareTo(o2.getBrand());
            }
            return o2.getYear().compareTo(o1.getYear());
        });

        System.out.println(cars);
    }
    /**
     * Задача №4
     */
    public static void task4() {
        List<String> words = Arrays.asList("apple", "banana", "fig", "date", "kiwi", "grape");
        List<String> wordsAfterStream = new ArrayList<>(words);
        wordsAfterStream = words.stream()
                .filter(n -> n.length() > 4)
                .sorted((n1, n2) -> Integer.compare(n1.length(), n2.length()))
                .map(n -> n.toUpperCase())
                .toList();
        System.out.println(wordsAfterStream);
    }
}

