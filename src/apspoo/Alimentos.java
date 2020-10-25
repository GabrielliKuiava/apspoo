
package apspoo;

import javax.swing.JOptionPane;

public class Alimentos  extends Produtos {
    boolean Perecível;
    
    public Alimentos(){
        
    }
    
    public Alimentos(String Nome, int Qtd, double Valor, boolean Perecível){
    super(Nome,Qtd,Valor);
    this.Perecível = Perecível;
}

    @Override
    public void imprimir() {
        String texto = "Nome: " + this.Nome + "\nQuantidade: " + this.Qtd +
                "O Produto é perecivel: " + this.Perecível;
        JOptionPane.showMessageDialog(null, texto);
    }
    
}
