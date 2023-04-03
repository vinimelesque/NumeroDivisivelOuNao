import javax.swing.JOptionPane;

public class main {
    
    public static void main (String[] args) {
        
        int num1, num2;
        String mensagem;
        
        mensagem = JOptionPane.showInputDialog("Digite um número:");
        num1 = Integer.parseInt(mensagem);
        
        mensagem = JOptionPane.showInputDialog("Digite mais um número:");
        num2 = Integer.parseInt(mensagem);
        
        if (num1 % num2 == 0) {
            JOptionPane.showMessageDialog(null, "O número " + num1 + " é divisível por " + num2 + ".");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + num1 + " não é divisível por " + num2 + ".");
        }
    }
}