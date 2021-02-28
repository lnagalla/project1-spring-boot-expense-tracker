package com.att.ibm.expense.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.att.ibm.expense.model.Expense;
import com.att.ibm.expense.repository.ExpenseRepository;

@Service
public class ExpenseServiceImpl implements ExpenseService {

	@Autowired
	ExpenseRepository expenseRepository;

	@Override
	public List<Expense> findAll() {
		return expenseRepository.findAll();
	}

	@Override
	public void save(Expense expense) {
		expenseRepository.save(expense);

	}

	@Override
	public Expense findById(Long id) {
		 if( expenseRepository.findById(id).isPresent()) {
		 return expenseRepository.findById(id).get();
		 }
		 return null;
		 
	}

	@Override
	public void delete(Long id) {
		Expense expense=findById(id);
		expenseRepository.delete(expense);
		
	}

}
