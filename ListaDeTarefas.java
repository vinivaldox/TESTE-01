import javax.swing.*;
import java.awt.*;

// Classe que representa a lista de tarefas
class ListaDeTarefas extends JPanel {

    Color corClara = new Color(211, 211, 211);

    ListaDeTarefas() {
        GridLayout layout = new GridLayout(10, 1);
        layout.setVgap(5); // Espaçamento vertical

        this.setLayout(layout); // 10 tarefas
        this.setPreferredSize(new Dimension(400, 560));
        this.setBackground(corClara);
    }

    public void atualizarNumeros() {
        Component[] itensLista = this.getComponents();

        for (int i = 0; i < itensLista.length; i++) {
            if (itensLista[i] instanceof Tarefa) {
                ((Tarefa) itensLista[i]).alterarIndice(i + 1);
            }
        }

    }

    public void removerTarefasConcluidas() {

        for (Component c : getComponents()) {
            if (c instanceof Tarefa) {
                if (((Tarefa) c).getEstado()) {
                    remove(c); // remove o componente
                    atualizarNumeros(); // atualiza a numeração de todos os itens
                }
            }
        }

    }

}
