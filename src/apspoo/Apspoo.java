
package apspoo;

import java.util.Scanner;

public class Apspoo {
     static var tipoproduto;
    
   
    public static void main(String[] args, String Nome) {
  
        
        System.out.println("Qual o departamento?:");
        System.out.println("1 -Bebidas:");
        System.out.println("2 -Comidas:");
        System.out.println("3 -Higiene:");
        System.out.println("4 -Limpeza:");
        Scanner teclado = new Scanner(System.in);
        tipoproduto = teclado.nextInt();
        
        
        switch(tipoproduto){
            case 1:
                Bebidas B1 = new Bebidas();
                System.out.println("Insira o nome produto:");
                tipoproduto = teclado.next(Nome);
                B1.setNome(tipoproduto);
                System.out.println("Qual o valor por item?");
                tipoproduto = teclado.nextFloat();
                B1.setValor(tipoproduto);
                System.out.println("Quantas unidades?");
                tipoproduto = teclado.nextInt();
                B1.setQtd(tipoproduto);
                break;
            case 2:
                Comidas C1 = new Comidas();
                System.out.println("Insira o nome:");
                tipoproduto = teclado.next(Nome);
                C1.setNome(tipoproduto);
                System.out.println("Qual o valor?");
                tipoproduto = teclado.nextFloat();
                C1.setValor(tipoproduto);
                System.out.println("Quantas unidades");
                tipoproduto = teclado.nextInt();
                C1.setQtd(tipoproduto);
                break;
            case 3:
                Higiene H1 = new Higiene();
                System.out.println("Insira o nome:");
                tipoproduto = teclado.next(Nome);
                H1.setNome(tipoproduto);
                System.out.println("Qual o valor?");
                tipoproduto = teclado.nextFloat();
                H1.setValor(tipoproduto);
                System.out.println("Quantas unidades");
                tipoproduto = teclado.nextInt();
                H1.setQtd(tipoproduto);
                break;
             case 4:
                Limpeza L1 = new Limpeza();
                System.out.println("Insira o nome:");
                tipoproduto = teclado.next(Nome);
                L1.setNome(tipoproduto);
                System.out.println("Qual o valor?");
                tipoproduto = teclado.nextFloat();
                L1.setValor(tipoproduto);
                System.out.println("Quantas unidades");
                tipoproduto = teclado.nextInt();
                L1.setQtd(tipoproduto);
                break;
    }
    

  }
}
