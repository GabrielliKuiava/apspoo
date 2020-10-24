
package apspoo;

public class Alimentos  extends Produtos {
    boolean Perecível;
    
    public Alimentos(){
        
    }
    
    public Alimentos(String Nome, int Qtd, float Valor, boolean Perecível){
    super(Nome,Qtd,Valor);
    this.Perecível = Perecível;
}
 
}
