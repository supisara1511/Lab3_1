import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Input Your Student ID","");
        JOptionPane.showMessageDialog(null,input,"Your StudentID",JOptionPane.INFORMATION_MESSAGE);

        int ans =JOptionPane.showConfirmDialog(null,"Do you want to save?","Save", JOptionPane.YES_NO_OPTION);

        if(ans == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null,"Thank You");
        } else {
            JOptionPane.showMessageDialog(null,"No Save : Thank You");
        }
    }
}
