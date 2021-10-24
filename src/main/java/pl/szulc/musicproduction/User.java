package pl.szulc.musicproduction;

public class User {
    private String username;
    private String firstName;
    private String lastName;
    private UserType userType;

    public User(String username,
                String firstName,
                String lastName,
                UserType userType) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userType = userType;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setType(UserType userType) {
        this.userType = userType;
    }
}