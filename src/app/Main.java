package app;

public class Main {

    public static void main(String[] args) {
        Customer customer = getCustomer(getData());
// Створюємо змінну output, яка буде містити текст для виводу
// customer.getName() - викликаємо метод геттера з класу Customer, який повертає ім'я
// customer.getPhone() - викликаємо метод що повертає телефон клієнта
        String output = "Customer: " + customer.getName() +
                ", phone " + customer.getPhone();
//output - змінна яка містить фінальний текст
        getOutput(output);
    }
// Викликаємо метод який повертає масив String[]
    public static String[] getData() {
        return new String[]{"Tom", "555 123-8596"};
    }
// Викликаємо метод який приймає масив data, створює об'єкт Customer використовуючи елементи масиву, повертає об'єкт
// і результат зберігає в змінну customer.
    public static Customer getCustomer(String[] data) {
        return new Customer(data[0], data[1]);
    }
//Викликаємо метод getOutput, щоб вивести результат у консоль
    public static void getOutput(String output) {
        System.out.println(output);
    }
}
