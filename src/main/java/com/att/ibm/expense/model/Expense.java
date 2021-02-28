package com.att.ibm.expense.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tbl_expenses")
@Setter
@Getter
@ToString
public class Expense {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	private BigDecimal amount;
	
	@Column(name = "created_at")
	private long createdAt;
	
	@Column(name = "description")
	private String expenseName;
	
	@Column
	private String note;

	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public BigDecimal getAmount() {
		return amount;
	}


	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}


	public long getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(long createdAt) {
		this.createdAt = createdAt;
	}


	public String getExpenseName() {
		return expenseName;
	}


	public void setExpenseName(String expenseName) {
		this.expenseName = expenseName;
	}


	public String getNote() {
		return note;
	}


	public void setNote(String note) {
		this.note = note;
	}


	@Override
	public String toString() {
		return "Expense [id=" + id + ", amount=" + amount + ", createdAt=" + createdAt + ", expenseName=" + expenseName
				+ ", note=" + note + "]";
	}
	
	

}
