
public class Calcolatrice 
{
	public double somma (double...addendi)
	{
		double s= 0;
		for(double addendo : addendi) 
		{
			if(addendo < 0)
			{
				System.out.println("addendo negativo");
			}
			if(addendo==0)
			{
				System.out.println("addendo è 0");
			}
			if(addendo>0)
			{
				System.out.println("addendo è positivo");
			}
			s = s + addendo;
		}
		return s;
	}
	
	public double differenza (double d1,double d2)
	{
		double diff = 0;
		diff = d1-d2;
		return diff;
	}
	
	public double moltiplicazione(double m1, double m2)
	{
		double risultato=0;
		risultato = m1 * m2;
		return risultato;
	}
	
	public double divisione(double d1, double d2)
	{
		double risultato=0;
		if(d2 == 0) 
		{
			System.out.println("ERRORE!!! Divisione per 0!!");
		}
		risultato = d1 / d2;
		return risultato;
	}
	
}
