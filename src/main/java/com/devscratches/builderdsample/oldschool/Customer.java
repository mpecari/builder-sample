package com.devscratches.builderdsample.oldschool;

public class Customer {

    private Long id;

    private String firstName;

    private String lastName;

    private Integer age;

    private String email;

    public Customer(){

    }

    public Customer(Long id, String firstName, String lastName, Integer age, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    static class CustomerBuilder {

        private Long id;

        private String firstName;

        private String lastName;

        private Integer age;

        private String email;

        public CustomerBuilder setId(Long id) {
            this.id = id;
            return this;
        }

        public CustomerBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public CustomerBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public CustomerBuilder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public CustomerBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Customer build() {

            return new Customer(this.id, this.firstName, this.lastName, this.age, this.email);
        }
    }
}
