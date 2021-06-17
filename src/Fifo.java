/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meher
 */

public class Fifo
{
    private String[] file;
    private int premier; 
    private int dernier;
    private int taille;
    
    /*----------------------------------------------------------*/
    
    /**
       Il suffit pour créer une Fifo de préciser sa taille.
     */

    public Fifo(int taille)
    {
	file = new String[taille];
	this.taille = taille;
	premier = 0;
	dernier = 0;
    }
    
    /*-----------------------------------------------------------*/
    
    /**
       Pour ajouter un objet dans la file.
     */

    public void add(String o) 
    {
	if (isFull())
	    {
		System.out.println("Fifo overflow");
	    }
	else
	    {
		file[dernier] = o;
		dernier = incrementeIndice(dernier);
	    }
    }
    
    /*-----------------------------------------------------------*/

    private int incrementeIndice(int indice)
    {
	return (indice + 1)%taille;
    }

    /*-----------------------------------------------------------*/    

    /**
       Pour récupérer la tête de file, renvoie null si la file est vide.
     */

    public String get()
    {
	if (isEmpty())
	    {
		return null;
	    }
	return file[premier];
    }

    /*-----------------------------------------------------------*/
    
    /**
       Pour éliminer la tête de file.
     */

    public void extract()
    {
	if (!isEmpty())
	    {		    
		file[premier]=null;
		premier = incrementeIndice(premier);
	    }
    }

    /*-----------------------------------------------------------*/

    public boolean isEmpty()
    {
	return (file[premier] == null);
    }

    /*-----------------------------------------------------------*/

    private boolean isFull()
    {	
	return ((premier == dernier)&&(!isEmpty()));
    }
 
    /*-----------------------------------------------------------*/

    public String toString()
    {	
	String res = "fifo : ";
	if (isEmpty())
	    {
		return (res + "empty");
	    }
	else
	    {
		for(int i = premier; i !=dernier ; i = incrementeIndice(i))
		    {
			res += file[i].toString() + "; ";
		    }
	    }	    
	return res;
    }
}