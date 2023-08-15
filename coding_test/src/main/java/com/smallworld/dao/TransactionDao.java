package com.smallworld.dao;

import java.util.List;

import com.smallworld.model.Transaction;
import com.smallworld.adapter.*;

public class TransactionDao {
	
	static public List<Transaction> loadData(){
		TransactionAdapter adapter = new TransactionAdapter();
		List<Transaction> transactions= null;
		try {
			transactions = adapter.loadDataFromFile();
		}catch(Exception e ) {
			e.printStackTrace();
		}
		return transactions;
	}

}
