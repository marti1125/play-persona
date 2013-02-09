package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class User extends Model {

	public String email;
	public String username;
	public String password;
	public String fullname;

	public User(String email, String username, String password, String fullname) {
		super();
		this.email = email;
		this.username = username;
		this.password = password;
		this.fullname = fullname;
	}

}
