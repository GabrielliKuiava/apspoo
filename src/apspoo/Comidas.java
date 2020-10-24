
package apspoo;

public class Comidas  extends Produtos {
    boolean Perecível;
    
    public Comidas(){
        
    }
    
    public Comidas(String Nome, int Qtd, float Valor, boolean Perecível){
    super(Nome,Qtd,Valor);
    this.Perecível = Perecível;
}
 
}
