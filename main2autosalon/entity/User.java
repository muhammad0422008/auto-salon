package main2autosalon.entity;

import org.example.main2autosalon.menu.GenderRole;

import java.util.List;

public class User {
    private int id;
    private String username;
    private String password;
    private boolean isActive;
    private GenderRole genderRole;
    private List<Car> carList;

    public User(int id, String username, String password, boolean isActive, GenderRole genderRole, List<Car> cars) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.isActive = isActive;
        this.genderRole = genderRole;
        this.carList = cars;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", isActive=" + isActive +
                ", genderRole=" + genderRole +
                ", cars=" + carList +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public GenderRole getGenderRole() {
        return genderRole;
    }

    public void setGenderRole(GenderRole genderRole) {
        this.genderRole = genderRole;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }
}
