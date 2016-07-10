import javax.swing.*;
import java.io.*;

public class TowersOfHanoi {
  /** Recursive method 
     @param n is the number of disks */
 public static String showMoves(int n, char startPeg, char destPeg, char tempPeg){
  if (n == 1) {
   return "Move disk 1 from peg " + startPeg + " to peg " + destPeg + "\n";
  } else { // recursive step 
   return showMoves(n-1, startPeg, tempPeg, destPeg) + "Move disk " + n + " from peg " + startPeg + " to peg " + destPeg + "\n" 
          + showMoves(n-1, tempPeg, destPeg, startPeg) ;
  }
 }
/// sM(3,L,R,M) 
 // sM(2,L,M,R)+"move 3"+sM(2,M,R,L) 
/// {sM(1,L,R,M)+"move 2" + sM(1,R,M,L)} + "move 3" + {sM(1,M,L,R)+"move 2"+sM(1,L,R,M)}
 // {[move 1] + move 2 + move 1} + move 3 + move 1 + move 2 + move 1 
 

 public static void main(String[] args) {
  String nDisks = JOptionPane.showInputDialog("Enter number of disks");
  String startPeg = JOptionPane.showInputDialog("Enter start peg (L, M, R)");
  String destPeg = JOptionPane.showInputDialog("Enter destination peg " + "(L, M, R), " + "but not " + startPeg);
  String tempPeg = JOptionPane.showInputDialog("Enter temporary peg " + "(L, M, R), " + "but not " + startPeg + " or " + destPeg);
  String moves = showMoves(Integer.parseInt(nDisks), startPeg.toUpperCase().charAt(0), destPeg.toUpperCase().charAt(0), tempPeg.toUpperCase().charAt(0));
  JOptionPane.showMessageDialog(null, moves);
 }
}
