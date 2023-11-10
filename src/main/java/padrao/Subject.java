/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padrao;

/**
 *
 * @author leonardo.nmfujimura
 */
public interface Subject {
    
    public void addObservador(Observer observer);
    
    public void delObservador(Observer observer);
    
    public void adicionarAcao(Acao acao);
    
    public void notificar();
}
