package com.enesbayram.model;

import org.springframework.stereotype.Component;

@Component("islem") // <bean id="islem" class=com.enesbayram.model.Islem>
public class Islem {
	
	public int topla(int sayi1,int sayi2)
	{
		return sayi1+sayi2;
	}
	
	public int cikar(int sayi1, int sayi2)
	{
		return sayi1-sayi2;
	}
	
	public int carp(int sayi1, int sayi2)
	{
		return sayi1*sayi2;
	}

	public double bol(int sayi1, int sayi2)
	{
		return (double)sayi1/sayi2;
	}
}
