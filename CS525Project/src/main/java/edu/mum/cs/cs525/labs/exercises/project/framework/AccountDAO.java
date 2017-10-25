package edu.mum.cs.cs525.labs.exercises.project.framework;

import java.util.Collection;

public interface AccountDAO {
	void saveAccount(Account account);

	void updateAccount(Account account);

	Account loadAccount(String accountnumber);
	
	Party loadCustomer(String email);

	Collection<? extends Account> getAccounts();
}
