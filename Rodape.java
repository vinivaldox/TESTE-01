import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

// Classe que representa o rodapé da aplicação
class Rodape extends JPanel {

    JButton adicionarTarefa;
    JButton limpar;

    Color corBotao = new Color(178, 193, 228);
    Color corClara = new Color(211, 211, 211);
    Border bordaVazia = BorderFactory.createEmptyBorder();

    Rodape() {
        this.setPreferredSize(new Dimension(400, 60));
        this.setBackground(corClara);

        adicionarTarefa = new JButton("Adicionar Tarefa"); // botão para adicionar tarefa
        adicionarTarefa.setBorder(bordaVazia); // remove a borda
        adicionarTarefa.setFont(new Font("Sans-serif", Font.ITALIC, 20)); // define a fonte
        adicionarTarefa.setVerticalAlignment(JButton.BOTTOM); // alinha o texto à parte inferior
        adicionarTarefa.setBackground(corBotao); // define a cor de fundo
        this.add(adicionarTarefa); // adiciona ao rodapé

        this.add(Box.createHorizontalStrut(20)); // Espaço entre os botões

        limpar = new JButton("Limpar tarefas concluídas"); // botão para limpar
        limpar.setFont(new Font("Sans-serif", Font.ITALIC, 20)); // define a fonte
        limpar.setBorder(bordaVazia); // remove a borda
        limpar.setBackground(corBotao); // define a cor de fundo
        this.add(limpar); // adiciona ao rodapé
    }

    public JButton getNovaTarefa() {
        return adicionarTarefa;
    }

    public JButton getLimpar() {
        return limpar;
    }
}
