package App;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class Cliente2 extends JFrame implements Observer {
    private JPanel Mainpanel;
    private JLabel Titulo_panel;
    private JTextArea Calculopanel;
    private JButton enviarResultadoButton;
    private JButton enviarButton;
    private JTextField Text_valor;
    private JTextField Text_peso;
    private JTextField Text_impuesto;
    private JButton calcularButton1;

    public Cliente2() {
        //initComponents();
        this.getRootPane().setDefaultButton(this.enviarButton);
        ServidorObservador s = new ServidorObservador(6000);
        s.addObserver(this);
        Thread t = new Thread(s);
        t.start();
        enviarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mensaje = Text_valor.getText() + "\n" + Text_peso.getText() + "\n" + Text_impuesto + "\n";
                Servidor2 c = new Servidor2(5000, mensaje);
                Thread t = new Thread(c);
                t.start();
            }
        });
    }

    public void habilitarEnviar() {
        enviarButton.setEnabled(true);
    }
    public void desabilitarEnviar() {
        enviarButton.setEnabled(false);
    }
    public void desabilitarCalcular() {
        calcularButton1.setEnabled(false);
    }
    public void desabilitarEnviarResult() {
        enviarResultadoButton.setEnabled(false);
    }

    public void borrardDatos() {
        Text_valor.setText("");
        Text_impuesto.setText("");
        Text_peso.setText("");
    }

    public void vaciarPanel() {
        Calculopanel.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame root = new Cliente2();
                root.setSize(600, 250);
                root.setResizable(false);
                root.setVisible(true);
            }
        });
    }
    @Override
    public void update(Observable o, Object arg) {
        this.Calculopanel.append((String) arg);
    }
}
