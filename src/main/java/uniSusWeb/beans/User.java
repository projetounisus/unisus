package uniSusWeb.beans;

import org.springframework.stereotype.Repository;

@Repository
public class User extends AbstractBean{
	private String userName;
	private String userPassword;

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
}
