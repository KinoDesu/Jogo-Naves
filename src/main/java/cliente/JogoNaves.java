/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cliente;

import javax.swing.JFrame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author leonardo.nmfujimura
 */
import padrao.*;

public class JogoNaves {

    public static void main(String[] args) throws InterruptedException {

        Subject naveJ = new NaveJogador("NoobMaster69");
        Observer naveI1 = new NaveInimigo("Inimigo 1", naveJ);

        JFrame jframe = new JFrame();
        Keychecker checker = new Keychecker();
        jframe.addKeyListener(checker);

        jframe.setSize(400, 350);

        jframe.setVisible(true);

        Acao acao = null;
        while (acao != Acao.ENCERRAR) {
            acao = checker.getAcao();

            if (acao != null) {
                naveJ.adicionarAcao(acao);
                if(acao==Acao.ENCERRAR){
                    System.exit(0);
                }
                checker.setAcao(null);
                acao = checker.getAcao();
            }
            Thread.sleep(1);
        };
    }

}

class Keychecker extends KeyAdapter {

    private char tecla;
    private Acao acao;

    public Acao getAcao() {
        return acao;
    }

    public void setAcao(Acao acao) {
        this.acao = acao;
    }

    public Keychecker() {
    }

    @Override
    public void keyPressed(KeyEvent event) {
        this.tecla = event.getKeyChar();
        this.acao = passarAcao();

    }

    public Acao passarAcao() {

        switch (tecla) {
            case 'w', 'W':
                tecla = ' ';
                return Acao.AVANCAR;
            case 's':
                tecla = ' ';
                return Acao.RECUAR;
            case 'a':
                tecla = ' ';
                return Acao.VIRAR_ESQ;
            case 'd':
                tecla = ' ';
                return Acao.VIRAR_DIR;
            case '0':
                tecla = ' ';
                return Acao.ENCERRAR;
            default:
                tecla = ' ';
                return null;
        }
    }

    public char getTecla() {
        return tecla;
    }

    public void setTecla(char tecla) {
        this.tecla = tecla;
    }

}
