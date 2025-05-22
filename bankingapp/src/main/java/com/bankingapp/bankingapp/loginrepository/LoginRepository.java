package com.bankingapp.bankingapp.loginrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.bankingapp.bankingapp.login.Credentials;

@Repository
public interface LoginRepository extends JpaRepository<Credentials, Long> {


}
