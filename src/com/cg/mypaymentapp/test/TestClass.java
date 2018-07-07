package com.cg.mypaymentapp.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.cg.mypaymentapp.beans.Customer;
import com.cg.mypaymentapp.beans.Wallet;
import com.cg.mypaymentapp.service.WalletService;
import com.cg.mypaymentapp.service.WalletServiceImpl;

public class TestClass {

	@Test
	public void test() {
	}
WalletService service;
	
	@Before
	public void initData(){
		 Map<String,Customer> data= new HashMap<String, Customer>();
		 Customer cust1=new Customer("Amit", "9900112212",new Wallet(new BigDecimal(9000)));
		 Customer cust2=new Customer("Ajay", "9963242422",new Wallet(new BigDecimal(6000)));
		 Customer cust3=new Customer("Yogini", "9922950519",new Wallet(new BigDecimal(7000)));
				
		 data.put("9900112212", cust1);
		 data.put("9963242422", cust2);	
		 data.put("9922950519", cust3);	
			service= new WalletServiceImpl(data);
			
	}
	
	@Test
	public void test2()
	{
		Customer customer=service.createAccount(null, null, new BigDecimal(7000));
		assertNull(customer.getName());
	}
	
	@Test
	public void test3()
	{
		 Map<String,Customer> data= new HashMap<String, Customer>();
		Customer cust2=new Customer("Ajay", "9963242422",new Wallet(new BigDecimal(6000)));
		data.put("9963242422", cust2);
		service= new WalletServiceImpl(data);
		assertEquals(cust2.getName(),"Ajay");
	}
	
	@Test
	public void test4()
	{
		 Map<String,Customer> data= new HashMap<String, Customer>();
		Customer cust1=new Customer("Amit","9900112212",new Wallet(new BigDecimal(9000)));
		data.put("9900112212", cust1);
		service= new WalletServiceImpl(data);
		assertEquals(cust1.getName(),"Amit");
	}
	
	@Test
	public void test5()
	{
		 Map<String,Customer> data= new HashMap<String, Customer>();
		Customer cust3=new Customer("Yogini", "9922950519",new Wallet(new BigDecimal(7000)));
		data.put("9922950519", cust3);
		service= new WalletServiceImpl(data);
		Wallet w1=cust3.getWallet();
		assertEquals(w1.getBalance(),new BigDecimal(7000));
	}
	
	
	@Test
	public void test6()
	{
		 Map<String,Customer> data= new HashMap<String, Customer>();
		Customer cust1=new Customer(null,"9900112212",new Wallet(new BigDecimal(9000)));
		data.put("9900112212", cust1);
		service= new WalletServiceImpl(data);
		assertNull(cust1.getName());
	}
	
	@Test
	public void test7()
	{
		 Map<String,Customer> data= new HashMap<String, Customer>();
		Customer cust2=new Customer("Ajay",null,new Wallet(new BigDecimal(6000)));
		assertNull(cust2.getMobileNo());
	}
	
	@Test
	public void test8()
	{
		 Map<String,Customer> data= new HashMap<String, Customer>();
		Customer cust2=new Customer("Ajay","9963242422",new Wallet(null));
		Wallet w1=cust2.getWallet();
		assertNull(w1.getBalance());
	}
	
	@Test
	public void test9()
	{
		 Map<String,Customer> data= new HashMap<String, Customer>();
		Customer cust2=new Customer("Ajay", "9963242422",new Wallet(new BigDecimal(6000)));
		assertNotNull(cust2.getName());
	}
	
	@Test
	public void test10()
	{
		 Map<String,Customer> data= new HashMap<String, Customer>();
		Customer cust2=new Customer("Ajay", "9963242422",new Wallet(new BigDecimal(6000)));
		assertNotNull(cust2.getMobileNo());
	}
	
	@Test
	public void test11()
	{
		 Map<String,Customer> data= new HashMap<String, Customer>();
		Customer cust2=new Customer(null,"9900112212",new Wallet(new BigDecimal(9000)));
		Wallet w1=cust2.getWallet();
		assertNotNull(w1.getBalance());
	}
	
	@Test
	public void test12()
	{
		 Map<String,Customer> data= new HashMap<String, Customer>();
		Customer cust2=new Customer(null,"9900112212",new Wallet(new BigDecimal(9000)));
	
	}
	
	@Test
	public void test13()
	{
		 Map<String,Customer> data= new HashMap<String, Customer>();
		Customer cust2=new Customer("Ajay","9900112212",new Wallet(null));
	
	}
	
	@Test
	public void test14()
	{
		 Map<String,Customer> data= new HashMap<String, Customer>();
		Customer cust3=new Customer("Yogini", "9922950519",new Wallet(new BigDecimal(7000)));
		data.put("9922950519", cust3);
		service= new WalletServiceImpl(data);
		Wallet w1=cust3.getWallet();
		assertNotEquals(w1.getBalance(),new BigDecimal(8000));
	}
	
	@Test
	public void test15()
	{
		 Map<String,Customer> data= new HashMap<String, Customer>();
		Customer cust2=new Customer("Ajay", "9963242422",new Wallet(new BigDecimal(6000)));
		data.put("9963242422", cust2);
		service= new WalletServiceImpl(data);
		assertNotEquals(cust2.getName(),"Amit");
	}
	
	@Test
	public void test16()
	{
		 Map<String,Customer> data= new HashMap<String, Customer>();
		Customer cust2=new Customer("Ajay", "9963242422",new Wallet(new BigDecimal(6000)));
		data.put("9963242422", cust2);
		service= new WalletServiceImpl(data);
		assertNotEquals(cust2.getMobileNo(),"9900112212");
	}
	
	@Test
	public void test17()
	{
		 Map<String,Customer> data= new HashMap<String, Customer>();
		Customer cust2=new Customer("Ajay", "9963242422",new Wallet(new BigDecimal(6000)));
		data.put("9922950519", cust2);
		service= new WalletServiceImpl(data);
		Wallet w1=cust2.getWallet();
		assertNotEquals(w1.getBalance(),new BigDecimal(6500));
	}
	
	
	@Test
	public void test18()
	{
		 Map<String,Customer> data= new HashMap<String, Customer>();
		Customer cust2=new Customer("Yogini", "9922950519",new Wallet(new BigDecimal(7000)));
		data.put("9922950519", cust2);
		service= new WalletServiceImpl(data);
		assertNotEquals(cust2.getName(),"Amit");
	}
	
	@Test
	public void test19()
	{
		 Map<String,Customer> data= new HashMap<String, Customer>();
		Customer cust2=new Customer("Yogini", "9922950519",new Wallet(new BigDecimal(7000)));
		Wallet w1=cust2.getWallet();
		assertNotNull(w1.getBalance());
	}
	
	
	
	
}