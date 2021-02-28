package com.att.ibm.expense.service;

import java.util.List;

import com.att.ibm.expense.model.Expense;

public interface ExpenseService {
	
	List<Expense> findAll();
	
	void save(Expense expense);
	
	Expense findById(Long id);
	
	void delete(Long id);

}
