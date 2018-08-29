import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String input =JOptionPane.showInputDialog("ใส่ตัวเลข 1 ตัว","");
        JOptionPane.showMessageDialog(null,input,"title",JOptionPane.INFORMATION_MESSAGE);

        int ans =JOptionPane.showConfirmDialog(null,"Confirm"," eiei", JOptionPane.YES_NO_OPTION);

        if(ans == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null,"สุดยอด");
        } else {
            JOptionPane.showMessageDialog(null,"WTF");
        }
    }
}
