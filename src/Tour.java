/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meher
 */
public class Tour {
    	public Disque TDisque[]=new Disque[5];
	public int NbD=-1;

    /**
     *
     */
    public void initg()
	{
		for (int i=0;i<5;i++)
		{
			Disque d=new Disque(5-i);
			inserer (d);
		}
	}
        public void init()
	{
		for (int i=0;i<5;i++)
		{
			Disque d=new Disque(0);
                        this.TDisque[i]=d;
			
		}
	}
    
	public boolean inserer (Disque d)
	{
		if (NbD >= 0)
		{
			boolean n=true;
			if(d.getVal() < this.TDisque[this.NbD].getVal())
			{
				n=true;
			}
			else 
			{
				n=false;
			}
			if(n==true)
			{
				this.NbD++;
				this.TDisque[this.NbD]=d;
			}
			return n;
		}
		else
		{
			this.NbD++;
			this.TDisque[this.NbD]=d;
			return true;
		}
	}
	public void retirer(boolean n)
	{
		if (n==true)
		{
			Disque d=new Disque(0);
			this.TDisque[NbD]=d;
			this.NbD--;
		}
	}
	public Disque sommet()
	{
		return this.TDisque[this.NbD];
	}
	
}
