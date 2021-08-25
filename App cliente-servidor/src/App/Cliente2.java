package App;

import javax.swing.*;

public class Cliente2 extends JFrame implements ActionChat {
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
        super("Cliente-servidor");
        setContentPane(Mainpanel);

    }

    @Override
    public void habilitarEnviar() {
        enviarButton.setEnabled(true);
    }

    @Override
    public void desabilitarEnviar() {
        enviarButton.setEnabled(false);
    }

    @Override
    public void desabilitarCalcular() {
        calcularButton1.setEnabled(false);
    }

    @Override
    public void desabilitarEnviarResult() {
        enviarResultadoButton.setEnabled(false);
    }

    @Override
    public void borrardDatos() {
        Text_valor.setText("");
        Text_impuesto.setText("");
        Text_peso.setText("");
    }

    @Override
    public void mostrarDatos(String Datos) {
        Calculopanel.append(Datos);
    }

    @Override
    public void vaciarPanel() {
        Calculopanel.setText("");
    }
}
