import javax.swing.*;
import java.awt.*;

// Classe que representa a barra de título da aplicação
class BarraDeTitulo extends JPanel {

    Color corClara = new Color(211, 211, 211);

    BarraDeTitulo() {
        this.setPreferredSize(new Dimension(400, 80)); // Tamanho da barra de título
        this.setBackground(corClara); // Cor da barra de título
        JLabel textoTitulo = new JLabel("Lista de Tarefas"); // Texto da barra de título
        textoTitulo.setPreferredSize(new Dimension(200, 60)); // Tamanho do texto
        textoTitulo.setFont(new Font("Sans-serif", Font.BOLD, 20)); // Fonte do texto
        textoTitulo.setHorizontalAlignment(JLabel.CENTER); // Alinha o texto ao centro
        this.add(textoTitulo); // Adiciona o texto à barra de título
    }
}
