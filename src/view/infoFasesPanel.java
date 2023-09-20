package view;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class infoFasesPanel extends JPanel {
    private JLabel fase1;
    private JLabel fase2;
    private JLabel fase3;
    private JLabel fase4;

    infoFasesPanel() {
        initComponents();
    }

    public void initComponents() {
        fase1 = new JLabel("FASE 1: (Expansión Isotermica) \n" +
                "El gas que está en contacto con el foco caliente a Temperatura constante y se expande lentamente \n"
                + "En este proceso de expansión el gas reduciría su Temperatura, pero se compensa con el calor Q1 que está siendo introducido del foco caliente, resultando en una expansión isoterma. \n"
                + "El calor Q1 introducido se transforma en trabajo que ejerce nuestro sistema. Como estamos tratando a un gas ideal, el hecho de que su temperatura no varíe incide directamente en que su energía interna (U) tampoco lo haga");
        fase2 = new JLabel("FASE 2: (Expansi;ón adiabática) \n"
                + "El gas no intercambia calor con el exterior y se continúa expandiendo, \n"
                + "Esta expansión del provoca una disminución de temperatura, reduciendo la energía interna ya que no se esta absorbiendo calor de Q1 resultando en un enfriamiento");
        fase3 = new JLabel("FASE 3: (Compresión isotermica) \n"
                + "Habiendo ya entrado en contacto con el foco frío, el gas se pone de nuevo en contacto con el exterior.\n"
                + " Si bien la compresión aumenta la temperatura del gas atrapado, el intercambio de calor con el exterior, Q2, compensa este aumento resultando en una compresión isoterma.\n"
                + " El calor, Q2, que pierde el sistema se traduce como trabajo que se ejerce sobre nuestro sistema.");
        fase4 = new JLabel("FASE 4: (Compresión adiabática) \n"
                + "El gas, de nuevo aislado del exterior, se comprime. La temperatura aumenta en función al trabajo realizado sobre el gas, por lo que la energía interna del gas aumenta , resultando en un aumento de temperatura");
        add(fase1);
        add(fase2);
        add(fase3);
        add(fase4);
    }
}
