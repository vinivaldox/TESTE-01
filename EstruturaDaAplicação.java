import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// Classe principal que representa a estrutura da aplicação
class EstruturaDaAplicacao extends JFrame {

    private BarraDeTitulo titulo;
    private Rodape rodape;
    private ListaDeTarefas lista;

    private JButton novaTarefa;
    private JButton limpar;

    EstruturaDaAplicacao() {
        this.setSize(400, 600); // Largura 400 e altura 600
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fechar ao sair
        this.setVisible(true); // Tornar visível

        titulo = new BarraDeTitulo();
        rodape = new Rodape();
        lista = new ListaDeTarefas();

        this.add(titulo, BorderLayout.NORTH); // Adiciona a barra de título no topo da tela
        this.add(rodape, BorderLayout.SOUTH); // Adiciona o rodapé na parte inferior da tela
        this.add(lista, BorderLayout.CENTER); // Adiciona a lista no meio do rodapé e título

        novaTarefa = rodape.getNovaTarefa();
        limpar = rodape.getLimpar();

        adicionarOuvintes();
    }

    public void adicionarOuvintes() {
        novaTarefa.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                Tarefa tarefa = new Tarefa();
                lista.add(tarefa); // Adiciona uma nova tarefa à lista
                lista.atualizarNumeros(); // Atualiza os números das tarefas

                tarefa.getConcluido().addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {

                        tarefa.alterarEstado(); // Altera a cor da tarefa
                        lista.atualizarNumeros(); // Atualiza os números das tarefas
                        revalidate(); // Atualiza o frame

                    }
                });
            }
        });

        limpar.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                lista.removerTarefasConcluidas(); // Remove todas as tarefas concluídas
                repaint(); // Repinta a lista
            }
        });
    }
}
