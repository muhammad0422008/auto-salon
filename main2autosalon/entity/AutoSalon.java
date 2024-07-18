package main2autosalon.entity;

import java.util.List;

public class AutoSalon {
    private int id;
    private String name;
    private double balance;
    private List<Car> carList;
    private List<User> userList;
    private List<Category> categoryList;

    public AutoSalon(int id, String name, double balance, List<Car> carList, List<User> userList, List<Category> categoryList) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.carList = carList;
        this.userList = userList;
        this.categoryList = categoryList;
    }

    public AutoSalon() {
    }

    @Override
    public String toString() {
        return "AutoSalon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", carList=" + carList +
                ", userList=" + userList +
                ", categoryList=" + categoryList +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }
}
