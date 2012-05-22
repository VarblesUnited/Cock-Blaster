
import java.awt.geom.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.*;

public class Cock extends JComponent
{
  //---------------- instance variables ------------------------
  Image cock = null;
  
  //
  //
  //
  public Cock ( int startX, int startY, String imgPath ) {
    
    readCockPic( imgPath );
  }
  
  //-----------------------------------------------------------------------
  // 
  //
  private void readCockPic( String path ) {
    
    try {
      System.out.println( "Working" );
      InputStream is = new BufferedInputStream( new FileInputStream( path ) );
      cock = ImageIO.read( is );
    } 
    catch (IOException e) {
    
    }

    JLabel label = new JLabel(new ImageIcon( cock ));
    add( label );
  }

  //-----------------------------------------------------------------------
  // 
  //
   
//--------------------- main -----------------------------------
/**
 * unit test
 */
public static void main( String[] args )
{     
    JFrame testFrame = new JFrame();
    testFrame.setSize( 700, 500 );  // define window size
    
    testFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    JPanel testPanel = new JPanel( (LayoutManager) null );
    testFrame.add( testPanel );
    testFrame.setBackground(Color.BLACK);
    
    Cock s = new Cock( 100, 100, "/Users/davidharrigan/Desktop/penis-cartoon.jpg");
    testPanel.add(s);
    
    testFrame.setVisible( true );  // Initially, JFrame is not visible, make it so.
}

}
