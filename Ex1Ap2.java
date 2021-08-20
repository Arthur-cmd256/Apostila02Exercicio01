import javax.swing.JOptionPane;

public class Ex1Ap2{

    public static void main(String[] args) {
        
        Double salario;

        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salario, com os centavos: "));

        if(salario == 1100){
            JOptionPane.showMessageDialog(null, "Voce ganha um salario minimo");
        }
        else if(salario > 1100){
            JOptionPane.showMessageDialog(null, "Voce ganha mais de um salario minimo");
        }
        else{
            JOptionPane.showMessageDialog(null, "Voce ganha menos de um salario minimo");
        }

    }

}