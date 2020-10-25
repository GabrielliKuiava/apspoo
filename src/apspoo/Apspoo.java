
package apspoo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Apspoo {
     
    
   
    public static void main(String[] args) {
        
        
        for (int i = 0; i < 10; i++) {
            
        System.out.println("Qual o departamento?:");
        System.out.println("1 -Bebidas:");
        System.out.println("2 -Comidas:");
        System.out.println("3 -Higiene:");
        System.out.println("4 -Limpeza:");
        Scanner teclado = new Scanner(System.in);
        int tipoproduto = teclado.nextInt();
        
        
        switch(tipoproduto){
            case 1:
                Bebidas B1 = new Bebidas();
                System.out.println("Insira o nome produto:");
                B1.setNome(teclado.nextLine());
                listaProdutos.add(teclado.nextLine());
                System.out.println("Qual o valor por item?");
                B1.setValor(teclado.nextDouble());
                System.out.println("Quantas unidades?");
                B1.setQtd(teclado.nextInt());
                
                break;
            case 2:
                Alimentos A1 = new Alimentos();
                System.out.println("Insira o nome:");
                A1.setNome(teclado.nextLine());
                listaProdutos.add(teclado.nextLine());
                System.out.println("Qual o valor?");
                A1.setValor(teclado.nextDouble());
                System.out.println("Quantas unidades");
                A1.setQtd(teclado.nextInt());
                break;
            case 3:
                Higiene H1 = new Higiene();
                System.out.println("Insira o nome produto:");
                H1.setNome(teclado.nextLine());
                listaProdutos.add(teclado.nextLine());
                System.out.println("Qual o valor por item?");
                H1.setValor(teclado.nextDouble());
                System.out.println("Quantas unidades?");
                H1.setQtd(teclado.nextInt());
                break;
             case 4:
                Limpeza L1 = new Limpeza();
                System.out.println("Insira o nome produto:");
                L1.setNome(teclado.nextLine());
                listaProdutos.add(teclado.nextLine());
                System.out.println("Qual o valor por item?");
                L1.setValor(teclado.nextDouble());
                System.out.println("Quantas unidades?");
                L1.setQtd(teclado.nextInt());
                break;
                
                
             
                }
        
                 for(String prod : listaProdutos){
                 System.out.println("Produtos Cadastrados: " + prod);
                 
                 System.out.println("Deseja Cadastrar mais um item: \n1 = SIM "
                         + "\n2 = NÃO");
                 tipoproduto=(teclado.nextInt());
                 
                 if(tipoproduto == 1){
                      i=0;    
                     }else{
                         i=11;
                   }
            }
         }

  
    }
}