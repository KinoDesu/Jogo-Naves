/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padrao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leonardo.nmfujimura
 */
public class NaveJogador implements Subject{
    
    private String nome;
    private Acao acao;
    private List<Observer> lista;
    
    public NaveJogador(String nome){
        this.nome=nome;
        lista=new ArrayList<>();
    }

    @Override
    public void addObservador(Observer observer) {
        lista.add(observer);
    }

    @Override
    public void delObservador(Observer observer) {
        lista.remove(observer);
    }

    @Override
    public void adicionarAcao(Acao acao) {
        this.acao=acao;
        notificar();
    }

    @Override
    public void notificar() {
        for(Observer observer:lista){
            observer.atualizar(acao);
        }
    }
    
}
