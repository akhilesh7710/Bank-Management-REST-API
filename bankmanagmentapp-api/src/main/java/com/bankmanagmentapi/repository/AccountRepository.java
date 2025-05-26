package com.bankmanagmentapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankmanagmentapi.dto.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{
	

}
