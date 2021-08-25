package App;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class Cliente1 extends JFrame implements Observer {
    private JPanel ClientePanel;
    private JTextArea textArea2;
    private JLabel TítuloMonto;
    private JTextField TextValor;
    private JTextField TextPeso;
    private JTextField TextImpuesto;
    private JButton enviarButton;
    private JButton calcularButton;
    private JButton enviarResultadoButton;

    public Cliente1() {
        //initComponents();
        this.getRootPane().setDefaultButton(this.enviarButton);
        ServidorObservador s = new ServidorObservador(5000);
        s.addObserver(this);
        Thread t = new Thread(s);
        t.start();
        enviarButton.addActionListener(new ActionListener() {

    @Override
    public void actionPerformed(ActionEvent e) {
        String mensaje = TextValor.getText() +"\n"+ TextPeso.getText() +"\n"+TextImpuesto + "\n";
        Servidor2 c = new Servidor2(6000, mensaje);
        Thread t = new Thread(c);
        t.start();
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame root = new Cliente1();
                root.setSize(600, 250);
                root.setResizable(false);
                root.setVisible(true);
            }
        });
    }
    @Override
    public void update(Observable o, Object arg) {
            this.textArea2.append((String) arg);
    }
}

