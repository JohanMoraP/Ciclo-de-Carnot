package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class CicleExplication extends JPanel {

    private JLabel title;
    private JTextArea text;
    private Border margin;

    public CicleExplication() {
        initcomponents();
    }

    private void initcomponents() {
        this.setLayout(new GridBagLayout());
        margin = new EmptyBorder(new Insets(10, 10, 10, 10));

        

        title = new JLabel("Ciclo de Carnot");
        title.setFont(new Font("Arial", Font.ITALIC, 30));
        title.setBackground(new Color(75, 162, 181));
        title.setHorizontalAlignment(JLabel.CENTER);
        add(title);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridy = 1;

        text = new JTextArea(
                "El ciclo de Carnot es un concepto teórico fundamental en la termodinámica que describe un proceso idealizado de conversión de calor en trabajo y viceversa. Propuesto por el físico francés Sadi Carnot en el siglo XIX, este ciclo sirve como un estándar teórico de referencia para medir la eficiencia de las máquinas térmicas, como motores de combustión y refrigeradores.\r\n" + //
                        "\r\n" + //
                        "Este ciclo se compone de cuatro etapas bien definidas: dos etapas isotérmicas, en las que la temperatura del sistema se mantiene constante, y dos etapas adiabáticas, en las que no se intercambia calor con el entorno. A lo largo de estas etapas, el gas o el sistema de trabajo en la máquina experimenta cambios en su presión y volumen que permiten la conversión de calor en trabajo mecánico y viceversa.\r\n" + //
                        "\r\n" + //
                        "El ciclo de Carnot se utiliza como una herramienta teórica para establecer el límite máximo de eficiencia que cualquier máquina térmica puede alcanzar cuando opera entre dos fuentes de temperatura diferentes. Es importante destacar que, en la práctica, ninguna máquina real puede alcanzar la eficiencia teórica del ciclo de Carnot debido a las pérdidas de energía y la fricción inherentes en los procesos reales. Sin embargo, esta representación teórica sigue siendo esencial para comprender los principios fundamentales de la termodinámica y para evaluar y mejorar la eficiencia de las máquinas en aplicaciones del mundo real.",
                20, 40);
        text.setEditable(false);
        text.setLineWrap(true);
        text.setWrapStyleWord(true);
        text.setFont(new Font("Arial", Font.ITALIC, 20));
        text.setBorder(margin);
        gbc.insets = new Insets(30, 0, 0, 0);

        add(text, gbc);

    }
}
