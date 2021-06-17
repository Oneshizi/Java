

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Scene extends JPanel {

	private ImageIcon icoFond;
	private Image imgFond1;
	
	private ImageIcon icod1; //* code provisoire
	private Image imgd1; //* code provisoire
        private ImageIcon icod2; //* code provisoire
	private Image imgd2; //* code provisoire
        private ImageIcon icod3; //* code provisoire
	private Image imgd3; //* code provisoire
        private ImageIcon icod4; //* code provisoire
	private Image imgd4; //* code provisoire
        private ImageIcon icod5; //* code provisoire
	private Image imgd5; //* code provisoire
	
	private int xFond1;
	

	//**** CONSTRUCTEUR ****//	
	public Scene(){
		
		super();
		
		this.xFond1 = 20;
		
		icoFond = new ImageIcon(getClass().getResource("/images/tour.png"));
		this.imgFond1 = this.icoFond.getImage();
		icod1 = new ImageIcon(getClass().getResource("/images/d1.png"));
		this.imgd1 = this.icod1.getImage();
                icod2 = new ImageIcon(getClass().getResource("/images/d2.png"));
		this.imgd2 = this.icod2.getImage();
                icod3 = new ImageIcon(getClass().getResource("/images/d3.png"));
		this.imgd3 = this.icod3.getImage();
                icod4 = new ImageIcon(getClass().getResource("/images/d4.png"));
		this.imgd4 = this.icod4.getImage();
                icod5 = new ImageIcon(getClass().getResource("/images/d5.png"));
		this.imgd5 = this.icod5.getImage();
                Thread chronoEcran = new Thread(new Chrono());
		chronoEcran.start();
	}
	
	
	//**** METHODES ****//
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics g2 = (Graphics2D)g;
                int j=0;
                g2.drawImage(imgFond1, xFond1, 0, null); // Dessin de l'image de fond
                for (var i : Game.tour_1.TDisque) 
                { 
                    switch(i.getVal()) {
                        case 1:
                          g2.drawImage(imgd1, 119-(i.getVal()-1)*16, 243-j*24, null);
                          j++;//*** code provisoire
                          break;
                        case 2:
                          g2.drawImage(imgd2, 119-(i.getVal()-1)*16, 243-j*24, null);
                          j++;//*** code provisoire
                          break;
                        case 3:
                          g2.drawImage(imgd3, 119-(i.getVal()-1)*16, 243-j*24, null);
                          j++;//*** code provisoire
                          break;
                        case 4:
                          g2.drawImage(imgd4, 119-(i.getVal()-1)*16, 243-j*24, null);
                          j++;//*** code provisoire
                          break;
                        case 5:
                          g2.drawImage(imgd5, 119-(i.getVal()-1)*16, 243-j*24, null);
                          j++;//*** code provisoire
                          break;
                        default:
                         
                      }
                }
                j=0;
                for (var k : Game.tour_2.TDisque) 
                { 
                    switch(k.getVal()) {
                        case 1:
                          g2.drawImage(imgd1, 303-(k.getVal()-1)*16, 243-j*24, null);
                          j++;//*** code provisoire
                          break;
                        case 2:
                          g2.drawImage(imgd2, 303-(k.getVal()-1)*16, 243-j*24, null);
                          j++;//*** code provisoire
                          break;
                        case 3:
                          g2.drawImage(imgd3, 303-(k.getVal()-1)*16, 243-j*24, null);
                          j++;//*** code provisoire
                          break;
                        case 4:
                          g2.drawImage(imgd4, 303-(k.getVal()-1)*16, 243-j*24, null);
                          j++;//*** code provisoire
                          break;
                        case 5:
                          g2.drawImage(imgd5, 303-(k.getVal()-1)*16, 243-j*24, null);
                          j++;//*** code provisoire
                          break;
                        default:
                         
                      }
                }
                j=0;
                for (var s : Game.tour_3.TDisque) 
                { 
                    switch(s.getVal()) {
                        case 1:
                          g2.drawImage(imgd1, 511-(s.getVal()-1)*16, 243-j*24, null);
                          j++;//*** code provisoire
                          break;
                        case 2:
                          g2.drawImage(imgd2, 511-(s.getVal()-1)*16, 243-j*24, null);
                          j++;//*** code provisoire
                          break;
                        case 3:
                          g2.drawImage(imgd3, 511-(s.getVal()-1)*16, 243-j*24, null);
                          j++;//*** code provisoire
                          break;
                        case 4:
                          g2.drawImage(imgd4, 511-(s.getVal()-1)*16, 243-j*24, null);
                          j++;//*** code provisoire
                          break;
                        case 5:
                          g2.drawImage(imgd5, 511-(s.getVal()-1)*16, 243-j*24, null);
                          j++;//*** code provisoire
                          break;
                        default:
                         
                      }
                }
                
                /*g2.drawImage(imgFond1, xFond1, 0, null); // Dessin de l'image de fond
                g2.drawImage(imgd1, 303, 220, null); //*** code provisoire (+184)
                g2.drawImage(imgd2, 103, 243, null); //*** code provisoire
                g2.drawImage(imgd3, 87, 197, null); //*** code provisoire -16,-23 (119)*/
           
               
           
                
                
      
                
                
                
        }

  
}
