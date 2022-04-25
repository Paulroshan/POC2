package bank.online.SBIBank;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

import org.springframework.lang.Nullable;


@Entity
public class Account 
{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long accountNumber;
  private String accountHolder;
  private double accountBalance;
  private long contact;
  private String email;
  private String password;
  @Column(unique= true)
  private long customerId;
  @Nullable
  @OneToMany
  @JoinTable(name = "Records",joinColumns = @JoinColumn(name = "AccountNo"), inverseJoinColumns = @JoinColumn(name = "TransactionId"))
  private Collection<Transaction> mytrans=new ArrayList<Transaction>();
public long getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(long accountNumber) {
	this.accountNumber = accountNumber;
}
public String getAccountHolder() {
	return accountHolder;
}
public void setAccountHolder(String accountHolder) {
	this.accountHolder = accountHolder;
}
public double getAccountBalance() {
	return accountBalance;
}
public void setAccountBalance(double accountBalance) {
	this.accountBalance = accountBalance;
}
public long getContact() {
	return contact;
}
public void setContact(long contact) {
	this.contact = contact;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getCustomerId() {
	return customerId;
}
public void setCustomerId(long customerId) {
	this.customerId = customerId;
}
public Collection<Transaction> getMytrans() {
	return mytrans;
}
public void setMytrans(Collection<Transaction> mytrans) {
	this.mytrans = mytrans;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

@Override
public String toString() {
	return "Account [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder + ", accountBalance="
			+ accountBalance + ", contact=" + contact + ", email=" + email + ", customerId=" + customerId + ", mytrans="
			+ mytrans + "]";
}

public Account(String accountHolder, double accountBalance, long contact, String email, String password,
		long customerId, Collection<Transaction> mytrans) {
	super();
	this.accountHolder = accountHolder;
	this.accountBalance = accountBalance;
	this.contact = contact;
	this.email = email;
	this.password = password;
	this.customerId = customerId;
	this.mytrans = mytrans;
}
public Account() {
	super();
	// TODO Auto-generated constructor stub
}
  
}
