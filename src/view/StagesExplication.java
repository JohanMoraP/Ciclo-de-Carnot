package view;

import java.awt.BorderLayout;
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

public class StagesExplication extends JPanel {

        private JLabel title;
        private JTextArea stage1;
        private JTextArea stage2;
        private JTextArea stage3;
        private JTextArea stage4;
        private JPanel stages;
        private Border margin;

        public StagesExplication() {
                initcomponents();
        }

        private void initcomponents() {
                this.setLayout(new BorderLayout());
                margin = new EmptyBorder(new Insets(10, 10, 10, 10));
                GridBagConstraints gbc = new GridBagConstraints();

                title = new JLabel("Ciclo de carnot");
                title.setBackground(new Color(75, 162, 181));
                title.setFont(new Font("Arial", Font.ITALIC, 40));
                title.setHorizontalAlignment(JLabel.CENTER);
                add(title, BorderLayout.NORTH);

                stages = new JPanel(new GridBagLayout());
                stages.setBorder(margin);

                gbc.insets = new Insets(10, 10, 10, 10);
                gbc.fill = GridBagConstraints.BOTH;
                gbc.weightx = 1.0;
                gbc.weighty = 1.0;
                
                stage1 = new JTextArea(
                        "FASE 1: (Expansión Isotermica) El gas que está en contacto con el foco caliente a Temperatura constante y se expande lentamente En este proceso de expansión el gas reduciría su Temperatura, pero se compensa con el calor Q1 que está siendo introducido del foco caliente, resultando en una expansión isoterma. El calor Q1 introducido se transforma en trabajo que ejerce nuestro sistema. Como estamos tratando a un gas ideal, el hecho de que su temperatura no varíe incide directamente en que su energía interna (U) tampoco lo haga",
                                12, 30);
                stage1.setLineWrap(true);
                stage1.setWrapStyleWord(true);
                stage1.setBorder(margin);
                stage1.setEditable(false);
                stage1.setFont(new Font("Arial", Font.ITALIC, 15));
                stages.add(stage1, gbc);

                gbc.gridx = 1;

                stage2 = new JTextArea(
                        "FASE 2: (Expansión adiabática) El gas no intercambia calor con el exterior y se continúa expandiendo, Esta expansión del provoca una disminución de temperatura, reduciendo la energía interna ya que no se esta absorbiendo calor de Q1 resultando en un enfriamiento",
                                12, 30);
                stage2.setLineWrap(true);
                stage2.setWrapStyleWord(true);
                stage2.setBorder(margin);
                stage2.setEditable(false);
                stage2.setFont(new Font("Arial", Font.ITALIC, 15));
                stages.add(stage2, gbc);

                gbc.gridy = 1;
                gbc.gridx = 0;

                stage3 = new JTextArea(
                        "FASE 3: (Compresión isotermica) Habiendo ya entrado en contacto con el foco frío, el gas se pone de nuevo en contacto con el exterior. Si bien la compresión aumenta la temperatura del gas atrapado, el intercambio de calor con el exterior, Q2, compensa este aumento resultando en una compresión isoterma. El calor, Q2, que pierde el sistema se traduce como trabajo que se ejerce sobre nuestro sistema.",
                                12, 30);
                stage3.setLineWrap(true);
                stage3.setWrapStyleWord(true);
                stage3.setBorder(margin);
                stage3.setEditable(false);
                stage3.setFont(new Font("Arial", Font.ITALIC, 15));
                stages.add(stage3, gbc);

                gbc.gridx = 1;

                stage4 = new JTextArea(
                        "FASE 4: (Compresión adiabática) El gas, de nuevo aislado del exterior, se comprime. La temperatura aumenta en función al trabajo realizado sobre el gas, por lo que la energía interna del gas aumenta , resultando en un aumento de temperatura",
                                12, 30);
                stage4.setLineWrap(true);
                stage4.setWrapStyleWord(true);
                stage4.setBorder(margin);
                stage4.setEditable(false);
                stage4.setFont(new Font("Arial", Font.ITALIC, 15));
                stages.add(stage4, gbc);

                add(stages, BorderLayout.CENTER);
        }

}
