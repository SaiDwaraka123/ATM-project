package com.kodnest.project;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl  implements AtmOperation{
	ATM a = new ATM();
	Map<Double,String> ministmt= new HashMap<>();
			@Override
	public void viewBalance() {
		System.out.println("Avaliable balance is:"+ a.getBalance());

	}

	@Override
	public void withdrawAmount( double withdrawAmount) {
		if(withdrawAmount%500==0) {
	if(withdrawAmount<=a.getBalance()) {
		ministmt.put(withdrawAmount,"Amount withdrawl");
		
		System.out.println("Collect  the cash"+withdrawAmount);
		a.setBalance(a.getBalance()-withdrawAmount);
		viewBalance();
	}else {
		System.out.println("Insufficent Balance");
	}
		
	}else {
		System.out.println("please entercthe amount in multipal of 500");
	}
	}

	@Override
	public void depositAmount(int depositAmount) {
		ministmt.put((double) depositAmount,"Amount Deposited");
		System.out.println(depositAmount+"Deposited Successfully !");
		a.setBalance(a.getBalance()+depositAmount);
		viewBalance();
	}

	@Override
	public void ministatement() {
		for(Map.Entry<Double,String>m:ministmt.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
		}
	}

}
