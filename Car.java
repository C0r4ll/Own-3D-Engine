import java.awt.*;
import java.awt.event.ActionEvent;
import static java.lang.Math.*;
import javax.swing.*;
import java.util.Random;
/**
 * Car Object.
 *  
 * @author (Marlon)
 * @version (V1.0)
 */
public class Car 
{
    // Declare Basic Shape Informations
    private double[][] points = 
    {
     /*SideLeft1*/{0.966879, -0.309947, 0.305401},
     /*SideLeft2*/{0.936054, -0.285923, 0.097723},
     /*SideLeft3*/{0.817477, -0.285941, 0.090244},
     /*SideLeft4*/{0.725803, -0.298602, 0.202496},
     /*SideLeft5*/{0.50084, -0.301339, 0.202496},
     /*SideLeft6*/{0.40053, -0.286066, 0.065914},
     /*SideLeft7*/{0.402445, -0.260039, 0.00945},
     /*SideLeft8*/{-0.401263, -0.260615, 0.002576},
     /*SideLeft9*/{-0.402114, -0.285043, 0.053406},
     /*SideLeft10*/{-0.505985, -0.306613, 0.202357},
     /*SideLeft11*/{-0.725146, -0.307577, 0.20228},
     /*SideLeft12*/{-0.802254, -0.283609, 0.083083},
     /*SideLeft13*/{-0.80062, -0.307577, 0.215977},
     /*SideLeft14*/{-0.096432, -0.240947, 0.453447},

     /*14 - WidowLeftOut1*/{0.31495, -0.270765, 0.38532},
     /*WidowLeftOut2*/{0.324859,-0.299409, 0.314515},
     /*WidowLeftOut3*/{-0.63129, -0.298743, 0.257081},
     /*WidowLeftOut4*/{-0.090763,-0.24843, 0.434542},
     /*WidowLeftIn1*/{0.31495, -0.259168, 0.38532},
     /*WidowLeftIn2*/{0.324859, -0.287418, 0.314515},
     /*WidowLeftIn3*/{-0.63129, -0.28622, 0.257081},
     /*WidowLeftIn4*/{-0.090763, -0.234699, 0.434542},

     /*22 - FrontLeftUp1*/{-0.80062, -0.308773, 0.215977},
     /*FrontLeftUp2*/{-0.793357, -0.303804, 0.219478},
     /*FrontLeftMiddle1*/{-0.794192, -0.297859, 0.18749},
     /*FrontLeftMiddle2*/{-0.800852, -0.303814, 0.186768},
     /*FrontLeftMiddle3*/{-0.804393, -0.303786, 0.183376},
     /*FrontLeftDown1*/{-0.804349, -0.284925, 0.086309},
     /*FrontLeftDown2*/{-0.887908, -0.19651, 0.085848},
     /*FrontLeftMiddle4*/{-0.906673, -0.192984, 0.170164},
     /*FrontLeftMiddle4*/{-0.89082, -0.1892, 0.174757},
     /*FrontLeftUp3*/{-0.89082,-0.1892, 0.186956},
     /*FrontLeftUp4*/{-0.896926, -0.192872, 0.184387},

     /*33 - Back1*/{0.966879, 0.313535, 0.305401},
     /*Back2*/{0.936054, 0.291618, 0.097723},
     /*Back3*/{0.936054, -0.285923, 0.097723},
     /*Back4*/{0.966879, -0.309947, 0.305401},

     /*37 - FrontRightUp1*/{-0.80062, 0.308773, 0.215977},
     /*FrontRightUp2*/{-0.793357, 0.303804, 0.219478},
     /*FrontRightMiddle1*/{-0.794192, 0.297859, 0.18749},
     /*FrontRightMiddle2*/{-0.800852, 0.303814, 0.186768},
     /*FrontRightMiddle3*/{-0.804393, 0.303786, 0.183376},
     /*FrontRightDown1*/{-0.804349, 0.284925, 0.086309},
     /*FrontRightDown2*/{-0.887908, 0.19651, 0.085848},
     /*FrontRightMiddle4*/{-0.906673, 0.192984, 0.170164},
     /*FrontRightMiddle4*/{-0.89082, 0.1892, 0.174757},
     /*FrontRightUp3*/{-0.89082,0.1892, 0.186956},
     /*FrontRightUp4*/{-0.896926, 0.192872, 0.184387},

     /*48 - SideRight1*/{0.966879, 0.309947, 0.305401},
     /*SideRight2*/{0.936054, 0.291618, 0.097723},
     /*SideRight3*/{0.817477, 0.285941, 0.090244},
     /*SideRight4*/{0.725803, 0.298602, 0.202496},
     /*SideRight5*/{0.50084, 0.301339, 0.202496},
     /*SideRight6*/{0.40053, 0.286066, 0.065914},
     /*SideRight7*/{0.402445, 0.260039, 0.00945},
     /*SideRight8*/{-0.401263, 0.260615, 0.002576},
     /*SideRight9*/{-0.402114, 0.285043, 0.053406},
     /*SideRight10*/{-0.505985, 0.306613, 0.202357},
     /*SideRight11*/{-0.725146, 0.307577, 0.20228},
     /*SideRight12*/{-0.802254, 0.283609, 0.083083},
     /*SideRight13*/{-0.80062, 0.307577, 0.215977},
     /*SideRight14*/{-0.096432, 0.240947, 0.453447},

     /*62 - WidowRightOut1*/{0.31495, 0.270765, 0.38532},
     /*WidowRightOut2*/{0.324859,0.299409, 0.314515},
     /*WidowRightOut3*/{-0.63129, 0.298743, 0.257081},
     /*WidowRightOut4*/{-0.090763,0.24843, 0.434542},

     /*66 - WidowRightIn1*/{0.31495, 0.259168, 0.38532},
     /*WidowRightIn2*/{0.324859, 0.287418, 0.314515},
     /*WidowRightIn3*/{-0.63129, 0.28622, 0.257081},
     /*WidowRightIn4*/{-0.090763, 0.234699, 0.434542},

     /* 70 - Tier1L1*/{-0.710221, -0.328083, 0.178264},
     /*Tier1L2*/{-0.538981, -0.328083, 0.178264},
     /*Tier1L3*/{-0.490437, -0.328083, 0.004474 },
     /*Tier1L4*/{-0.710221, -0.328083, 0.004474},

     /*Tier1L5*/{0.710221, -0.328083, 0.178264},
     /*Tier1L6*/{0.538981, -0.328083, 0.178264},
     /*Tier1L7*/{0.490437, -0.328083, 0.004474},
     /*Tier1L8*/{0.710221, -0.328083, 0.004474},
     
     /* 78 - Tier1L1*/{-0.710221, 0.328083, 0.178264},
     /*Tier1L2*/{-0.538981, 0.328083, 0.178264},
     /*Tier1L3*/{-0.490437, 0.328083, 0.004474 },
     /*Tier1L4*/{-0.710221, 0.328083, 0.004474},

     /*Tier1L5*/{0.710221, 0.328083, 0.178264},
     /*Tier1L6*/{0.538981, 0.328083, 0.178264},
     /*Tier1L7*/{0.490437, 0.328083, 0.004474},
     /*Tier1L8*/{0.710221, 0.328083, 0.004474},
     
    };
 
    private int[][] pointSequence = 
    {
        /*Front Right*/ {37,38}, {37,47}, {38, 39}, {38,46}, {39,40},{39,45}, {40,41}, {41,42}, {41,44}, {42,43}, {43,44}, {44,45}, {45,46}, {46,47},
        /*Front Left*/ {22,23}, {22,32}, {23, 24}, {23,31}, {24,25},{24,30}, {25,26}, {26,27}, {26,29}, {27,28}, {28,29}, {29,30}, {30,31}, {31,32},   
        /*Front Connection*/ {32,47}, {31, 46}, {30, 45}, {29, 44}, {28, 43},
        /*Side Left*/{0, 1}, {1, 2}, {2,3}, {3,4}, {4,5}, {5,6}, {6,7}, {7,8}, {8,9}, {9,10}, {10,11}, {11,12}, {12,13}, {13,0},
        /*Side Right*/{49, 50}, {50, 51}, {51,52}, {52,53}, {53,54}, {54,55}, {55,56}, {56,57}, {57,58}, {58,59}, {59,60}, {60,61}, {61,62}, {62,48},
        /*Widow Left Out*/{14,15},{15,16},{16,17},{17,14},
        /*Widow Left In*/{18,19},{19,20},{20,21},{21,18},
        /*Widow Right Out*/{62,63},{63,64},{64,65},{65,62},
        /*Widow Right In*/{66,67},{67,68},{68,69},{69,66},
        /*Back*/{33, 34}, {34,35}, {35,36}, {36,33},
        /*Top*/ {13,61},
        /*Tier 1 Left*/ {70,71},{71,72},{72,73},{73,70},
        /*Tier 2 Left*/ {74,75},{75,76},{76,77},{77,74},
        /*Tier 1 Right*/ {78,79},{79,80},{80,81},{81,78},
        /*Tier 2 Right*/ {82,83},{83,84},{84,85},{85,82}      
    };
    // Declare Basic Object Informations
    private Color[] colorList = {Color.WHITE, Color.BLACK, Color.BLUE, Color.RED, Color.YELLOW, Color.GREEN, Color.ORANGE, Color.PINK}; 
    
    private Color color;
    private double ps;
    private double velocity;
    private double maxVelocity;
    

    // Constructor for Car Class (repair, Car Class replace)     
    public Car()
    {
        //initialise Values Random
        int rnd = new Random().nextInt(colorList.length);
        color = colorList[rnd]; 
        ps = 15000 * Math.random();
        velocity = 0;
        maxVelocity = 40 * Math.random();          
        
        //Scale and Render 3D Model
        scale(30); 
        scale(10);         
        rotate(0, 0, 90.7d);
        render();
        
        //Rotate Model over time
        new Timer(17, (ActionEvent e) -> {  
        rotate(0, 0.01d, 0);
        //try {
        //wait(200);
        //}
        //catch (Exception x) {}
              
        }).start();
    }
    
    //accelerates the car
    public void accelerate()
    {
        if(velocity <= maxVelocity-20)
        velocity += 20;
    }
    //Make a weak break
    public void weakBreak()
    {
       if(velocity >= 20)
       velocity -= 20; 
    }
    //Make a hard break
    public void hardBreak()
    {
      velocity = 0;   
    }
    //Calculate breaking distance
    public double calcBreakingDistance()
    {
        double result = velocity/10 * velocity/10;
        return result;
    }
    
    //Scale Methode - Scales Car Object
    public void scale(double s) 
    {
     for (double[] point : points) 
     {
        point[0] *= s;
        point[1] *=s;
        point[2] *= s;
     }
    }
    
    //Rotate Methode - Rotate Car Object 
    public void rotate(double angleX, double angleY, double angleZ) 
    {
      // Declare Sin and Cos values of the angles
      double sinX = sin(angleX);
      double cosX = cos(angleX);
      
      double sinY = sin(angleY);
      double cosY = cos(angleY);
      
      
      double sinZ = sin(angleZ);
      double cosZ = cos(angleZ);
      
      // Calculate for any Point the specific Rotation
      for (double[] point : points) 
      {
          double x = point[0];
          double y = point[1];
          double z = point[2];
  
          
          if(angleX>0d)
          {
              point[0] = x * cosX - z * sinX;
              point[2] = z * cosX + x * sinX;
              
              z = point[2];
              point[1] = y * cosY - z * sinY;
              point[2] = z * cosY + y * sinY; 
          }
          else if(angleY>0)
          {
              point[0] = x * cosX - z * sinX;
              point[2] = z * cosX + x * sinX;
              
              z = point[2];
              point[1] = y * cosY - z * sinY;
              point[2] = z * cosY + y * sinY; 
          }
          else if(angleZ>0)
          {
              point[0] = x * cosX - z * sinX;
              point[2] = z * cosX + x * sinX;
              
              z = point[2];
              point[1] = y * cosY - z * sinY;
              point[2] = z * cosY + y * sinY; 
              
              point[0] = x * cosZ - y * sinZ;
              point[1] = x * sinZ + y * cosZ;   
          }
              
          
      }
    }
    
    //create new Engine3D Object, give it the 3D Structur Informations
    public void render()
    {
     new Engine3D(points, pointSequence, color, maxVelocity,velocity, ps).main();
    }
        
    
}
