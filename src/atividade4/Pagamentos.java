package atividade4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pagamentos {
    List<Pagamentos> pagamentos;
    double debito;
    double credito;
    int valorProduto;
    int frete;
    int seguro;
    int despesas;
    int aliquoata;

    public Pagamentos(double debito, double credito) {
        this.debito = debito;
        this.credito = credito;
    }

    public Pagamentos(int valorProduto, int frete, int seguro, int despesas, int aliquoata) {
        this.valorProduto = valorProduto;
        this.frete = frete;
        this.seguro = seguro;
        this.despesas = despesas;
        this.aliquoata = aliquoata;
    }
    
    public Pagamentos(){
        pagamentos = new ArrayList<>();
    }
    
    public void calcImposto(){
        for(Pagamentos p : pagamentos){
            System.out.println("PIS");
            System.out.println((p.debito-p.credito)*0.0165);
            
            System.out.println("IPS");
            System.out.println((p.valorProduto + p.frete + p.seguro + p.despesas) * p.aliquoata/100);
        }
    }
    
    public void pagaImposto(){
        Scanner leia = new Scanner(System.in);
        String opcao = "";
        Pagamentos novoPagamento = new Pagamentos();
        
        while(!opcao.equals("Pare")){
            System.out.println("Digite o tipo de imposto a ser paga (PIS/IPS) ou digite 'Pare' para parar: ");
            opcao = leia.next();
            
            if(opcao.equals("PIS")){
            
            System.out.print("Digite o valor total do debito: ");
            novoPagamento.debito = leia.nextDouble();
            
            System.out.print("Digite o valor total do credito: ");
            novoPagamento.credito = leia.nextDouble();
            
            pagamentos.add(novoPagamento);
            }
            else if(opcao.equals("IPS")){
                System.out.print("Digite o valor do seguro: ");
                novoPagamento.seguro = leia.nextInt();
                
                System.out.print("Digite o valor do frete: ");
                novoPagamento.frete = leia.nextInt();
                
                System.out.print("Digite o valor do produto: ");
                novoPagamento.valorProduto = leia.nextInt();
                
                System.out.print("Digite o valor de outras despesas: ");
                novoPagamento.despesas = leia.nextInt();
                
                System.out.print("Digite o valor da aliquoata: ");
                novoPagamento.aliquoata = leia.nextInt();
                
                pagamentos.add(novoPagamento);
                
            }
        }
        calcImposto();
    }

    
    
}
