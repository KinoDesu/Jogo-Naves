/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padrao;

/**
 *
 * @author leonardo.nmfujimura
 */
public class NaveInimigo implements Observer {

    private String nome;

    public NaveInimigo(String nome, Subject sub){
        this.nome=nome;
        sub.addObservador(this);
    }

    @Override
    public void atualizar(Acao acao) {
        System.out.println(nome + " " + acao);
    }
    
}
