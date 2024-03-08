package com.example.baithigiuaki.baivenguoidung;

public class Main {
    public static void main(String[] args) {
        User user = new User("My4924", "my123@gmail.com", "1234567");
        user.register("My4924", "my123@gmail.com", "1234567");

        Admin admin = new Admin("admin1", "admin@gmail.com", "admin123");
        admin.login("admin01", "admin123");

        Customer customer = new Customer("customer1", "customer@gmail.com", "customer123");
        customer.login("customer01", "customer123");

        Moderator moderator = new Moderator("moderator01", "moderator@gmail.com", "moderator123");
        moderator.login("moderator01", "moderator123");
    }
}
