package com.att.ibm.expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.att.ibm.expense.model.Expense;

@Repository
//FYI.. JpaRepository<T, ID> T is entity name and ID i primary ID return value
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}
