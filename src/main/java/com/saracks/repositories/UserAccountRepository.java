package com.saracks.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saracks.model.UserAccount;

public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {

}