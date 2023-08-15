package com.smallworld.adapter;

import java.io.File;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.smallworld.model.Transaction;

public class TransactionAdapter {
	
	public List<Transaction> loadDataFromFile() throws Exception  {
		
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			List<Transaction> transactions = objectMapper.readValue(new File("transactions.json"), new TypeReference<List<Transaction>>() {});
			
			return transactions;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
