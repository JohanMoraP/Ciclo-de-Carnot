package view;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Image;
import java.awt.Toolkit;

public class PanelInfo1 extends JPanel {
    private JLabel info1;
    private JLabel info2;
    private JLabel info3;
    private JLabel infoImage;
    private Image image;

    PanelInfo1() {
        initComponents();
    }

    public void initComponents() {
        info1 = new JLabel("CICLO TERMODINÁMICO  \n" +
                "se le denomina ciclo termodinámico a cualquier serie de procesos termodinámicos tales que al transcurrir todos ellos el sistea vuelve al estado inicial");
        info2 = new JLabel("PROCESOS TEMODINÁMICOS \n" +
                "ADIABÁTICO : Proceso en el cual no hay flujo de calor \n" +
                "ISOTÉRMICO: Proceso en el que la temperatura es constante \n" +
                "ISOCÓRICO: Proceso a volumen constante \n" +
                "ISOBÁRICO: Proceso a presión constante \n");
        info3 = new JLabel("CICLO DE CARNOT : \n" +
                "se compone de cuatro etapas reversibles: dos procesos isotermos (a temperatura constante) y dos procesos adiabáticos (sin transferencia de calor). Estas etapas se llevan a cabo en un sistema compuesto por un gas ideal contenido en un dispositivo llamado «máquina de Carnot»");
        image = Toolkit.getDefaultToolkit().getImage("images/CicloCarnot-pV.png");
        ImageIcon icon = new ImageIcon(image);
        infoImage = new JLabel(
                "El ciclo de Carnot opera entre dos fuentes de calor, un foco a temperatura alta (Tc) y un foco a temperatura baja (Tf).\n"
                        + " El ciclo tiene como objetivo convertir el calor absorbido de la fuente caliente en trabajo útil y rechazar el calor residual a la fuente fría.",
                icon, ABORT);

        add(info1);
        add(info2);
        add(info3);
        add(infoImage);

    }

}
