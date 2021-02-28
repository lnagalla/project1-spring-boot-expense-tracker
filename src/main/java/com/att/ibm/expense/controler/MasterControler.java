package com.att.ibm.expense.controler;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.att.ibm.expense.model.Expense;
import com.att.ibm.expense.service.ExpenseService;

@Controller
public class MasterControler {

	Logger logger = LoggerFactory.getLogger(MasterControler.class);

	@Autowired
	ExpenseService expenseService;

	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("home");
		mav.addObject("message", "List of Expenses");
		List<Expense> expenses = expenseService.findAll();
		System.out.println(expenses);
		mav.addObject("expenses", expenses);
		return mav;

	}

	@RequestMapping("/expense")
	public ModelAndView addExpense() {
		ModelAndView mav = new ModelAndView("expense");
		mav.addObject("expense", new Expense());
		return mav;

	}

	@RequestMapping(value = "/expense", method = RequestMethod.POST)
	public String save(@ModelAttribute("expense") Expense expense) {
		expenseService.save(expense);
		return "redirect:/";

	}

	@RequestMapping(value = "/expense/{id}")
	public ModelAndView edit(@PathVariable("id") long id) {
		ModelAndView mav = new ModelAndView("expense");
		Expense expense=expenseService.findById(id);
		mav.addObject("expense", expense);
		return mav;

	}


	@RequestMapping(value = "/expense/{id}/delete")
	public String delete(@PathVariable("id") long id) {
		expenseService.delete(id);
		return "redirect:/";

	}

	
	//	public ModelAndView home() {
//		
//		ModelAndView mav=new ModelAndView("home");
//		mav.addObject("message","List of Expenses");
//		List<Expense> expenses=expenseService.findAll();
//		System.out.println(expenses);
//		mav.addObject("expense",expenses);
////		for (Expense expense : expenses) {
////			logger.debug(expense.toString());
////		}
//		return mav;
//	}
}
