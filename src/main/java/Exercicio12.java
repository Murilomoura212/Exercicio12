import javax.swing.JOptionPane;

public class Exercicio12{

    public static void main(String[] args) {
    int ano1, ano2, idade;
    ano1 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o seu ano de nascença: ")); 
    ano2 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o ano atual: ")); 
    idade = ano2-ano1;
    if (idade>0){ JOptionPane.showMessageDialog(null,"Sua idade é: " +idade);
    }else{
    }
    }
}
