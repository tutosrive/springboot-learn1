package dev.srm.springboot_learn1.models;

import dev.srm.springboot_learn1.utils.RandomUtils;

public class UserModel {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;

    public UserModel() {
        this(
                RandomUtils.getAtomicId(),
                RandomUtils.getRandomFirstName(),
                RandomUtils.getRandomLastName(),
                RandomUtils.getRandomEmail(),
                RandomUtils.getRandomInt(10, 75)
        );
    }

    public UserModel(int id, String firstName, String lastName, String email, int age) {
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(email);
        this.setAge(age);
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
