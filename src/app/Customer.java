package app;

public class Customer {
    // Оголошуємо приватні змінні типу стрінг
    private final String name;
    private final String phone;
// Додаємо конструктор, який приймає два параметри: name і phone
    public Customer(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
// Додаємо геттер для name
    public String getName() {
        return name;
    }
// Додаємо геттер для phone
    public String getPhone() {
        return phone;
    }
}
