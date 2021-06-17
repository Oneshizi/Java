/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meher
 */
public class Game {
	public static Tour tour_1=new Tour();
	public static Tour tour_2=new Tour();
	public static Tour tour_3=new Tour();
	public static Fifo actions=new Fifo(100);
        public static float time;
	public static void init()
	{
		Game.tour_1.initg();
                Game.tour_3.init();
                Game.tour_2.init();
                
	}
	public static void action(int i, int j)
	{
		switch(j)
		{
			case 1: switch(i)
					{
						case 1: Game.tour_1.retirer(Game.tour_1.inserer(Game.tour_1.sommet())); break;
						case 2: Game.tour_2.retirer(Game.tour_1.inserer(Game.tour_2.sommet())); break;
						case 3: Game.tour_3.retirer(Game.tour_1.inserer(Game.tour_3.sommet())); break;
					}
					break;
			case 2: switch(i)
					{
						case 1: Game.tour_1.retirer(Game.tour_2.inserer(Game.tour_1.sommet())); break;
						case 2: Game.tour_2.retirer(Game.tour_2.inserer(Game.tour_2.sommet())); break;
						case 3: Game.tour_3.retirer(Game.tour_2.inserer(Game.tour_3.sommet())); break;
					}
					break;
			case 3:  switch(i)
					{
						case 1: Game.tour_1.retirer(Game.tour_3.inserer(Game.tour_1.sommet())); break;
						case 2: Game.tour_2.retirer(Game.tour_3.inserer(Game.tour_2.sommet())); break;
						case 3: Game.tour_3.retirer(Game.tour_3.inserer(Game.tour_3.sommet())); break;
					}
					break;
		}
	}
}
