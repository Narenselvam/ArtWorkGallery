package entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {
    private int userId;
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String profilePicture;
    private List<Artwork> favoriteArtworks;

    public User() {
        this.favoriteArtworks = new ArrayList<>();
    }

    public User(int userId, String username, String password, String email, String firstName, String lastName, Date dateOfBirth, String profilePicture) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.profilePicture = profilePicture;
        this.favoriteArtworks = new ArrayList<>();
    }

    // Getters and setters
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public Date getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(Date dateOfBirth) { this.dateOfBirth = dateOfBirth; }
    public String getProfilePicture() { return profilePicture; }
    public void setProfilePicture(String profilePicture) { this.profilePicture = profilePicture; }
    public List<Artwork> getFavoriteArtworks() { return favoriteArtworks; }
    public void setFavoriteArtworks(List<Artwork> favoriteArtworks) { this.favoriteArtworks = favoriteArtworks; }
}