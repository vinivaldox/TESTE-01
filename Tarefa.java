import javax.swing.*;
import java.awt.*;

// Classe que representa uma tarefa individual na lista
class Tarefa extends JPanel {

    JLabel index; // Rótulo para exibir o índice da tarefa
    JTextField nomeTarefa; // Campo de texto para o nome da tarefa
    JButton concluido; // Botão para marcar a tarefa como concluída

        Color corFtexto = new Color(159, 165, 167);
    Color corFtextoConc = new Color(144, 185, 162);
    Color corConcluido = new Color(115, 150, 131);

    private boolean marcado;

    Tarefa() {
        this.setPreferredSize(new Dimension(400, 20)); // define o tamanho da tarefa
        this.setBackground(corFtexto); // define a cor de fundo da tarefa

        this.setLayout(new BorderLayout()); // define o layout da tarefa

        marcado = false;

        index = new JLabel(""); // cria um rótulo para o índice
        index.setPreferredSize(new Dimension(20, 20)); // define o tamanho do rótulo do índice
        index.setHorizontalAlignment(JLabel.CENTER); // define o alinhamento do rótulo do índice
        this.add(index, BorderLayout.WEST); // adiciona o rótulo do índice à tarefa

        nomeTarefa = new JTextField("Escreva algo..."); // cria um campo de texto para o nome da tarefa
        nomeTarefa.setBorder(BorderFactory.createEmptyBorder()); // remove a borda do campo de texto
        nomeTarefa.setBackground(corFtexto); // define a cor de fundo do campo de texto

        this.add(nomeTarefa, BorderLayout.CENTER);

        concluido = new JButton("Concluído");
        concluido.setPreferredSize(new Dimension(80, 20));
        concluido.setBorder(BorderFactory.createEmptyBorder());
        concluido.setBackground(corConcluido);
        concluido.setFocusPainted(false);

        this.add(concluido, BorderLayout.EAST);

    }

    public void alterarIndice(int num) {
        this.index.setText(num + ""); // converte num para String
        this.revalidate(); // atualiza
    }

    public JButton getConcluido() {
        return concluido;
    }

    public boolean getEstado() {
        return marcado;
    }

    public void alterarEstado() {
        this.setBackground(corFtextoConc);
        nomeTarefa.setBackground(corFtextoConc);
        marcado = true;
        revalidate();
    }
}
