
package apspoo;

import javax.swing.JOptionPane;

public class Produtos {
   public  String Nome;
   public int Qtd;
   protected double Valor;
   
    
   
   public Produtos(String Nome, int Qtd, double Valor){
        this.Nome = Nome;
        this.Qtd = Qtd;
        this.Valor = Valor;
   }
   
      public Produtos(){
      }
   
   
     public void setNome(String Nome){
       this.Nome = Nome;
     }
     public void setQtd(int Qtd){
        this.Qtd = Qtd;
     } 
     public void setValor(double Valor){
        this.Valor = Valor;
     }
     
    public void imprimir(){
        String texto = "Nome: " + this.Nome + "\nQuantidade: " + this.Qtd;
        JOptionPane.showMessageDialog(null, texto);
    }
}
