
package apspoo;

public class Produtos {
   public  String Nome;
   public int Qtd;
   public float Valor;
    
   
   public Produtos(String Nome, int Qtd, float Valor){
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
     public void setValor(float Valor){
        this.Valor = Valor;
     }
}
