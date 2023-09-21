package view;

import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class ConceptsPanel extends JPanel {
    private JLabel title;
    private JTextArea concept1;
    private JTextArea concept2;
    private JTextArea concept3;
    private JTextArea concept4;
    private JTextArea concept5;
    private JTextArea concept6;
    private JTextArea concept7;
    private JTextArea concept8;
    private JTextArea concept9;
    private Border margin;

    public ConceptsPanel() {
        initcomponents();
    }

    private void initcomponents() {
        this.setLayout(new GridLayout(10, 1));

        title = new JLabel("Conceptos importantes");
        title.setFont(new Font("Arial", Font.ITALIC, 20));
        title.setHorizontalAlignment(JLabel.CENTER);
        add(title);
                
        concept1 = new JTextArea("Máquina de Carnot: Es un dispositivo teórico que sigue el ciclo de Carnot y opera de manera ideal para lograr la máxima eficiencia posible en la conversión de calor en trabajo.");
        concept2 = new JTextArea("Eficiencia de Carnot: Es la eficiencia máxima teórica de cualquier máquina térmica que opera entre dos temperaturas. Se calcula como la relación entre el trabajo útil realizado por la máquina y la energía térmica absorbida de la fuente caliente.");
        concept3 = new JTextArea("Reservorio de calor: Es un sistema termodinámico idealizado que mantiene una temperatura constante y suministra o absorbe calor sin cambiar su temperatura. En el ciclo de Carnot, hay un reservorio de calor caliente y uno de calor frío.");
        concept4 = new JTextArea("Trabajo realizado: Es la energía mecánica producida o consumida durante el ciclo de Carnot y se calcula como la integral de la presión con respecto al volumen en cada etapa del ciclo.");
        concept5 = new JTextArea("Energía térmica: Es la energía transferida entre el sistema y sus alrededores en forma de calor.");
        concept6 = new JTextArea("Ley de Carnot: Esta ley establece que ninguna máquina térmica reversible que opera entre dos temperaturas puede tener una eficiencia mayor que una máquina de Carnot que opera entre las mismas dos temperaturas.");
        concept7 = new JTextArea("Reversibilidad: En el contexto de la termodinámica, reversibilidad significa que un proceso puede revertirse completamente sin pérdida de energía o cambio en el entorno.");
        concept8 = new JTextArea("Eficiencia real de una máquina: Es la eficiencia que una máquina térmica real alcanza en comparación con la eficiencia teórica de Carnot. Siempre será menor que la eficiencia de Carnot debido a las irreversibilidades en las máquinas reales.");
        concept9 = new JTextArea("Diagrama P-V (Presión-Volumen): Un gráfico que representa las variaciones de presión y volumen durante el ciclo de Carnot, mostrando claramente las cuatro etapas del ciclo.");
        
        editTextArea(concept1);
        editTextArea(concept2);
        editTextArea(concept3);
        editTextArea(concept4);
        editTextArea(concept5);
        editTextArea(concept6);
        editTextArea(concept7);
        editTextArea(concept8);
        editTextArea(concept9);
        
        add(concept1);
        add(concept2);
        add(concept3);
        add(concept4);
        add(concept5);
        add(concept6);
        add(concept7);
        add(concept8);
        add(concept9);
    }

    private void editTextArea(JTextArea text) {
        text.setLineWrap(true);
        text.setWrapStyleWord(true);
        text.setEditable(false);
        text.setFont(new Font("Arial", Font.ITALIC, 15));
    }
}
