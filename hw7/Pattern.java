package org.example.hw7;
//Для примера, реализуем паттерн Builder на Java.
//
//Паттерн Builder используется для пошагового построения сложных объектов. Он позволяет создавать объекты с различными свойствами, используя один и тот же код строительства.
public class User {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String email;
    private final String phone;

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.email = builder.email;
        this.phone = builder.phone;
    }

    // геттеры для всех свойств

    public static class UserBuilder {
        private final String firstName;
        private final String lastName;
        private int age;
        private String email;
        private String phone;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
//Здесь класс User представляет объект, который мы хотим построить. Внутри класса определен статический вложенный класс UserBuilder, который отвечает за пошаговое создание объекта User. UserBuilder имеет методы для установки каждого свойства объекта (например, метод age() для установки возраста). После установки всех свойств мы можем вызвать метод build() для создания объекта User.
User user = new User.UserBuilder("John", "Doe")
        .age(30)
        .email("johndoe@example.com")
        .phone("555-1234")
        .build();

//В этом примере мы создаем объект User с помощью UserBuilder. Мы вызываем методы age(), email() и phone() для установки соответствующих свойств объекта, а затем вызываем метод build() для создания объекта User.