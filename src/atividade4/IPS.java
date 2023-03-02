package atividade4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IPS {
    List<Pagamentos> ips;
    int valorProduto;
    int frete;
    int seguro;
    int despesas;
    int aliquoata;
    
    public IPS(){
        ips = new ArrayList<Pagamentos>();
    }
    
    public int getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(int valorProduto) {
        this.valorProduto = valorProduto;
    }

    public int getFrete() {
        return frete;
    }

    public void setFrete(int frete) {
        this.frete = frete;
    }

    public int getSeguro() {
        return seguro;
    }

    public void setSeguro(int seguro) {
        this.seguro = seguro;
    }

    public int getDespesas() {
        return despesas;
    }

    public void setDespesas(int despesas) {
        this.despesas = despesas;
    }

    public int getAliquoata() {
        return aliquoata;
    }

    public void setAliquoata(int aliquoata) {
        this.aliquoata = aliquoata;
    }

    public IPS(int valorProduto, int frete, int seguro, int despesas, int aliquoata) {
        this.valorProduto = valorProduto;
        this.frete = frete;
        this.seguro = seguro;
        this.despesas = despesas;
        this.aliquoata = aliquoata;
    }
    
    public void calcImposto(){
        for(Pagamentos p : ips){
        System.out.println("IPS");
            System.out.println((p.valorProduto + p.frete + p.seguro + p.despesas) * p.aliquoata/100);
        }
    }
    
    public void pagaImposto(){
        Pagamentos novoPagamento = new Pagamentos();
        Scanner leia = new Scanner(System.in);
        String opcao = "";
        while(!"Pare".equals(opcao)){
        System.out.println("Digite s para continuar ou digite 'Pare' para parar");
        opcao = leia.next();
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
                
                ips.add(novoPagamento);
                
            }
        calcImposto();
    }
    
    }
