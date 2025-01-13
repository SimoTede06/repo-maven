import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class TestCalcolatrice {

	@Test
	void testSomma() 
	{
		Calcolatrice calc = new Calcolatrice();
		
		double res = calc.somma(5,6);
		
		Assert.assertEquals(11,res,0);
	}
	
	@Test
	void testSomma2() 
	{
		Calcolatrice calc = new Calcolatrice();
		
		double res = calc.somma(0,6);
		
		Assert.assertEquals(6,res,0);
	}
	
	@Test
	void testSomma3() 
	{
		Calcolatrice calc = new Calcolatrice();
		
		double res = calc.somma(-1,6);
		
		Assert.assertEquals(5,res,0);
	}
	
	@Test
	void testDifferenza() 
	{
		Calcolatrice calc = new Calcolatrice();
		
		double res = calc.differenza(5,2);
		
		Assert.assertEquals(3,res,0);
	}
	
	@Test
	void testMoltiplicazione() 
	{
		Calcolatrice calc = new Calcolatrice();
		
		double res = calc.moltiplicazione(5,2);
		
		Assert.assertEquals(10,res,0);
	}
	
	@Test
	void testDivisione() 
	{
		Calcolatrice calc = new Calcolatrice();
		
		double res = calc.divisione(10,2);
		
		Assert.assertEquals(5,res,0);
	}
	
	@Test
	void testDivisione2() 
	{
		Calcolatrice calc = new Calcolatrice();
		
		double res = calc.divisione(10,0);
		
		Assert.assertEquals(Double.POSITIVE_INFINITY,res,0);
	}

	
	@Test
	void testDivisione3() 
	{
		Calcolatrice calc = new Calcolatrice();
		
		double res = calc.divisione(-10,0);
		
		Assert.assertEquals(Double.NEGATIVE_INFINITY,res,0);
	}

}
