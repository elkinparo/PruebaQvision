package com.petstore.octoperf.models;

public class RegisterUser {
    private String UserID,Password,FirstName,LastName,Email,Phone,Address1,Addres2,City,State,Zip,Country;

    public RegisterUser(String userID, String password, String firstName, String lastName, String email, String phone,
                        String address1, String addres2, String city, String state, String zip, String country) {
        UserID = userID;
        Password = password;
        FirstName = firstName;
        LastName = lastName;
        Email = email;
        Phone = phone;
        Address1 = address1;
        Addres2 = addres2;
        City = city;
        State = state;
        Zip = zip;
        Country = country;
    }

    public String getUserID() {
        return UserID;
    }

    public String getPassword() {
        return Password;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getEmail() {
        return Email;
    }

    public String getPhone() {
        return Phone;
    }

    public String getAddress1() {
        return Address1;
    }

    public String getAddres2() {
        return Addres2;
    }

    public String getCity() {
        return City;
    }

    public String getState() {
        return State;
    }

    public String getZip() {
        return Zip;
    }

    public String getCountry() {
        return Country;
    }
}
