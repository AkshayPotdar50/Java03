package com.java.Sprint3;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface IUser{
    String getId();
    String getEmail();
    String getPassword();
    String getLocation();

    int getIncorrectAttempts();
    void incrementIncorrectAttempts();
    void resetIncorrectAttempts();
}

class User implements IUser{

    private String id;
    private String email;
    private String password;
    private String location;
    private int incorrectAttempts;

    public User(String id, String email, String password, String location) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.location = location;
        this.incorrectAttempts = 0;

    }




    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getLocation() {
        return getLocation();
    }

    @Override
    public int getIncorrectAttempts() {
        return incorrectAttempts;
    }

    @Override
    public void incrementIncorrectAttempts() {
        incorrectAttempts++;

    }

    @Override
    public void resetIncorrectAttempts() {
        incorrectAttempts=0;

    }
}

interface IApplicationAuthState{
    String register(IUser user);
    String login(IUser user);
    String logout(IUser user);
}

class ApplicationAuthState implements IApplicationAuthState{

    private List<String> allowedLocations;
    private List<User> registeredUser;

    private List<User> userLoggedIn;

    public ApplicationAuthState(List<String> allowedLocations, List<User> registeredUser, List<User> userLoggedIn) {
        this.allowedLocations = allowedLocations;
        this.registeredUser = new ArrayList<>();
        this.userLoggedIn = new ArrayList<>();
    }

    public ApplicationAuthState(List<String> list) {
    }

    @Override
    public String register(IUser user) {
        for(User u:registeredUser){
            if(u.getEmail().equals(user.getEmail())){
                return "user already registered";
            }
        }
        registeredUser.add((User) user);
        return "user registered successfully";
    }

    @Override
    public String login(IUser user) {
        if(!registeredUser.contains(user)){
            return "user not registered";
        }
        if(user.getIncorrectAttempts() >= 3){
            return "user blocked";
        }

        for(User u:userLoggedIn){
            if(u.getEmail().equals(user.getEmail())){
                return "user already logged in";
            }
            if(!u.getLocation().equals(user.getLocation())){
                return "user already logged in from different location";
            }
        }

        if(!allowedLocations.contains(user.getLocation())){
            return "user from this location is not allowed";
        }

        if(!user.getPassword().equals(user.getPassword())){
            user.incrementIncorrectAttempts();
            return "Incorrect password";

        }
        userLoggedIn.add((User) user);
        user.resetIncorrectAttempts();
        return "login successful";

    }

    @Override
    public String logout(IUser user) {
        if(!userLoggedIn.contains(user)){
            return "user not logged in";
        }
        userLoggedIn.remove(user);
        return "logout successful";

    }
}



public class Solution {
    public static void main(String[] args) {
        // Allowed locations
        String[] allowedLocations = {"Location1", "Location2", "Location3"};

        // Create an instance of ApplicationAuthState
        ApplicationAuthState authState = new ApplicationAuthState(Arrays.asList(allowedLocations));

        // Register users
        User user1 = new User("1", "user1@example.com", "password1", "Location1");
        User user2 = new User("2", "user2@example.com", "password2", "Location2");
        User user3 = new User("3", "user3@example.com", "password3", "Location3");

        System.out.println(authState.register(user1)); // User registered successfully
        System.out.println(authState.register(user2)); // User registered successfully
        System.out.println(authState.register(user3)); // User registered successfully

        // Attempt login
        System.out.println(authState.login(user1)); // Login successful
        System.out.println(authState.login(user2)); // Login successful
        System.out.println(authState.login(user3)); // Login successful

        // Attempt logout
        System.out.println(authState.logout(user1)); // Logout successful
        System.out.println(authState.logout(user2)); // Logout successful
        System.out.println(authState.logout(user3)); // Logout successful
    }
}
