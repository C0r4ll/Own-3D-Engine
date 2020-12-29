import java.awt.*;
import java.awt.event.ActionEvent;
import static java.lang.Math.*;
import javax.swing.*;
import java.awt.geom.Line2D;
import java.util.Arrays;
import java.awt.event.MouseEvent;
import java.awt.Dimension;

/**
 * Own 3D Render Engine.
 *
 * @author (Marlon)
 * @version (V1.0)
 */
public class Engine3D extends JPanel {
    private double[][] points;
    private int[][] pointSequence;
    private double SP1, SP2,  EP1, EP2, maxVelocity, velocity, ps;
    public Color color;
    
    // Constructor for Engine3D Class
    public void main() 
    {
        //Creates JFrame Frame
        SwingUtilities.invokeLater(() -> {
            JFrame f = new JFrame(); 
            f.setSize(700,700);
            f.getContentPane().setLayout(new BorderLayout());
            JLabel Label = new JLabel("<html><body>Das Auto hat die Farbe: " + color + "<br>Es fährt mit einer geschwindichkeit von: " + (int) velocity +  " km/h<br>Das Auto hatt: " + (int) ps + " ps<br>Die Maximal Geschwindichkeit des Autos beträgt: " + (int) maxVelocity + " km/h</body></html>");
            Label.setPreferredSize(new Dimension(500,10));
            f.setVisible(true);
            f.add(Label, BorderLayout.WEST);   
            f.add(new Engine3D(points, pointSequence, color, maxVelocity, velocity, ps),BorderLayout.NORTH);
        }); 
    }
    
    // Read in 3D point values/Object attributes --> paint them
    public Engine3D(double[][] points, int[][] pointSequence, Color color, double maxVelocity, double velocity,double ps) {  
        if(color == Color.WHITE)
        setBackground(Color.BLACK); 
        if(color == Color.YELLOW)
        setBackground(Color.BLACK);  
        if(color == Color.ORANGE)
        setBackground(Color.BLACK); 
        setPreferredSize(new Dimension(30,500));
        
        this.points = points;
        this.pointSequence = pointSequence; 
        this.color = color;
        this.maxVelocity = maxVelocity;
        this.velocity = velocity;
        this.ps = ps;
        
        
        new Timer(17, (ActionEvent e) -> {            
            repaint();
        }).start();
    }
    
    public void FillCube(double[] Vsp1, double[] Vsp2, double[] Vep1, double[] Vep2)
    {

    }
 
    //draw lines betweet points depending on defined Point sequence
    public void drawCube(Graphics2D g) {
        g.translate(getWidth() / 2, getHeight() / 2);
        
        for (int[] sequence : pointSequence) {
            double[] xy1 = points[sequence[0]];
            double[] xy2 = points[sequence[1]];
            g.setColor(color);
            g.draw(new Line2D.Double(xy1[0], xy1[1], xy2[0], xy2[1]));
            g.draw(new Line2D.Double(xy1[0], xy1[1], xy2[0], xy2[1]));
        }
       
    }
 
    @Override
    public void paintComponent(Graphics gg) {
        super.paintComponent(gg);
        Graphics2D g = (Graphics2D) gg;
        drawCube(g);
    }
 
}