package models;

import play.Logger;
import play.db.ebean.Model;

import javax.persistence.*;

import libs.*;

import java.util.List;

/*
User class by Rifqi Ryan Avila Rakhman 
*/

@Entity
public class User extends Model {

    @Id
    public String username;

    public String hash;

    public String email;
	
	public String country;
	
	public String firstName;

	public String lastName;

	public String twitter;
	
	public String website;
	
    public boolean online = false;
	
	//public List<Dream> dream;

    public static Finder<String, User> find = new Finder<>(String.class, User.class);

    public User(String username, String password, String email) {
        this.username = username;
        this.hash = createHash(password);
        this.email = email;
    }

    private static String createHash(String password) {
        try {
            return PasswordHash.createHash(password);
        } catch (Exception e) {
            return null;
        }
    }

    public static User findByEmail(String email) {
        return find.where().eq("email", email).findUnique();
    }

    public static User findByUsername(String username) {
        return find.byId(username);
    }
	
	public static int findTotalUser() {
        return find.all().size();
    }


    public static User createUser(String username, String password, String email) throws IllegalArgumentException {
        if (findByUsername(username) != null) throw new IllegalArgumentException("Username is already taken by someone else");
        if (findByEmail(email) != null) throw new IllegalArgumentException("Email is already taken by someone else");
        User newUser = new User(username, password, email);
        newUser.save();
        return newUser;
    }

    public static java.util.List<User> findAll() {
        return find.all();
    }

    public static java.util.List<User> findOnlineUsers() {
        return find.where().eq("online", true).findList();
    }

    public static boolean authenticate(String username, String password) {
		User u = findByUsername(username);
		String userHash = null;
		if (u != null) {
			userHash = u.hash;
		} else {
			return false;
		}
        try {
            return PasswordHash.validatePassword(password, userHash);
        } catch (Exception e) {
            return false;
        }
    }

}
