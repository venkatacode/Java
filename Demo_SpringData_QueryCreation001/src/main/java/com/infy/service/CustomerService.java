package com.infy.service;

import java.time.LocalDate;
import java.util.List;

import com.infy.dto.CustomerDTO;
import com.infy.exception.InfyBankException;

public interface CustomerService {

	public CustomerDTO findByEmailId(String emailId) throws InfyBankException;

	public CustomerDTO findByEmailIdAndName(String emailId, String name) throws InfyBankException;

	public List<CustomerDTO> findByEmailIdOrName(String emailId, String name) throws InfyBankException;

	public List<CustomerDTO> findByDateOfBirthBetween(LocalDate fromDate, LocalDate toDate) throws InfyBankException;

	public List<CustomerDTO> findByDateOfBirthLessThan(LocalDate dateOfBirth) throws InfyBankException;

	public List<CustomerDTO> findByDateOfBirthGreaterThan(LocalDate dateOfBirth) throws InfyBankException;

	public List<CustomerDTO> findByDateOfBirthAfter(LocalDate dateOfBirth) throws InfyBankException;

	public List<CustomerDTO> findByDateOfBirthBefore(LocalDate dateOfBirth) throws InfyBankException;

	public List<CustomerDTO> findByEmailIdNull() throws InfyBankException;

	public List<CustomerDTO> findByNameLike(String pattern) throws InfyBankException;

	public List<CustomerDTO> findByNameOrderByDateOfBirth(String name) throws InfyBankException;

	public List<CustomerDTO> findByNameOrderByDateOfBirthDesc(String name) throws InfyBankException;
}
