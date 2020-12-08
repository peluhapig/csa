/**
 * Implements a program with a pie chart
 * that shows interactive polling results for three candidates
 */

import java.awt.Color;
import java.awt.Container;
import java.awt.BorderLayout;
import javax.swing.JFrame;

public class Main extends JFrame
{
  // NOTE: The section below is "commented out" so that you can test your
  //       code for part 4. Once your code is working, you can highlight
  //       everything commented below, hold Ctrl, and press / to uncomment
  //       the code that will be used for the actual poll display. You
  //       should also "comment out" the other main method below!
  
  public Main()
  {
    super("Vote for Tami, Brian, or Liz");

    Container c = getContentPane();
    c.setBackground(Color.WHITE);
    PollDisplayPanel chart = new PollDisplayPanel("Tami", "Brian", "Liz");
    PollControlPanel controls = new PollControlPanel(chart);
    c.add(chart, BorderLayout.CENTER);
    c.add(controls, BorderLayout.SOUTH);
  }

  public static void main(String[] args)
  {
    Main w = new Main();
    w.setBounds(300, 300, 400, 400);
    w.setDefaultCloseOperation(EXIT_ON_CLOSE);
    w.setVisible(true);
  }
}

//   public static void main(String[] args) // This is only used for part 4
//   {
//     PollDisplayPanel votingMachine = new PollDisplayPanel("Tami", "Brian", "Liz");
//     votingMachine.vote1();
//     votingMachine.vote2();
//     votingMachine.vote2();
//     System.out.println(votingMachine);
//   }
// }

