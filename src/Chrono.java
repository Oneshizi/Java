



public class Chrono implements Runnable{

	private final int PAUSE = (int) (Game.time*1000); // temps d'attente entre 2 tours de boucle
	
	@Override
	public void run() {
                
                    int j=0;
                    while((!Game.actions.isEmpty())){
                        if(j==0)
                        {
                            Game.init();
                            j++;
                        }
                        else
                        {
                            Simulation.scene.repaint();
                            Game.action(Integer.parseInt(Game.actions.get().split ( ",", 2 )[0]),Integer.parseInt(Game.actions.get().split ( ",", 2 )[1])) ;
                            Game.actions.extract();
                            try {
                                    Thread.sleep(PAUSE);
                            }catch (InterruptedException e) {}
                        }
                    }
		
	}

}
