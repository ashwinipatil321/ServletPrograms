package com.bridgeit.Model;

public class RegisterBean {
public String UserName;
public String EmailId;
public String password;
public String ConfirmPassword;
public String mobileNumber;

public String getUserName() {
	return UserName;
}
public void setUserName(String userName) {
	UserName = userName;
}
public String getEmailId() {
	return EmailId;
}
public void setEmailId(String emailId) {
	EmailId = emailId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getConfirmPassword() {
	return ConfirmPassword;
}
public void setConfirmPassword(String confirmPassword) {
	ConfirmPassword = confirmPassword;
}
public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}


}
