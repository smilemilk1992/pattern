package com.jangz.newfeature.chap6;

import static java.util.stream.Collectors.groupingBy;

import java.util.List;
import java.util.Map;

import com.jangz.newfeature.entity.Transaction;
import com.jangz.newfeature.util.factory.TransactionFactory;

public class SimpleUsingStreamExample {

	public static void main(String[] args) {
		Map<Integer, List<Transaction>> transactionsByCurrencies = TransactionFactory.generateTransactionList().stream()
				.collect(groupingBy(Transaction::getValue));
	}
}
