
package Chat;

import static Chat.chat_server.ss;
import static Chat.chat_server.dout;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *Clase para representar el chat de un cliente.
 * Interactua con un servidor de forma peer to peer
 * mediante un chat.
 * @author Ludwin Ramos
 * @version 1.0
 * @since 27/08/2021
 */
public class Client extends javax.swing.JFrame {

    static Socket s;
    static DataInputStream dis;
    static DataOutputStream dout;

    /**
     * Inicializa los componentes o elementos del formulario Cliente.
     */
    public Client() {
        initComponents();
    }

    /**
     * Este metodo es llamado desde dentro del constructor para inicializar el
     * formulario
     * CUIDADO: no moidficar este código. El contenido de este metodo es siempre
     * regenerado por el editor de formularios automaticamente.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        tituloValor = new javax.swing.JLabel();
        textValor = new javax.swing.JTextField();
        tituloProducto = new javax.swing.JLabel();
        textPeso = new javax.swing.JTextField();
        tituloImpuesto = new javax.swing.JLabel();
        textImpuesto = new javax.swing.JTextField();
        botonCalcular = new javax.swing.JButton();
        botonResultado = new javax.swing.JButton();
        botonEnviar = new javax.swing.JButton();
        tituloPanel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        tituloValor.setText("Valor del producto");

        tituloProducto.setText("Peso del producto");

        textPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPesoActionPerformed(evt);
            }
        });

        tituloImpuesto.setText("Impuesto del producto");

        textImpuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textImpuestoActionPerformed(evt);
            }
        });

        botonCalcular.setText("Calcular");
        botonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalcularActionPerformed(evt);
            }
        });

        botonResultado.setText("Enviar resultado");
        botonResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonResultadoActionPerformed(evt);
            }
        });

        botonEnviar.setText("Enviar");
        botonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEnviarActionPerformed(evt);
            }
        });

        tituloPanel.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        tituloPanel.setText("Panel de entrada");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonCalcular)
                                .addGap(18, 18, 18)
                                .addComponent(botonResultado)
                                .addGap(51, 51, 51)
                                .addComponent(botonEnviar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(textPeso, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                                .addComponent(textValor))
                                            .addComponent(textImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(tituloImpuesto))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(tituloValor))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(tituloProducto))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(tituloPanel)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloPanel)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tituloValor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tituloProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tituloImpuesto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCalcular)
                    .addComponent(botonResultado)
                    .addComponent(botonEnviar))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPesoActionPerformed

    private void textImpuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textImpuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textImpuestoActionPerformed
    
    /**
     * Metodo llamado al presionar el boton botonEnviar.
     * Clave enviar el mensaje contenido con los datos al servidor.
     * @param evt. Permite activar el evento del boton botonEnviar una vez incializado.
     */
    private void botonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEnviarActionPerformed
        // TODO add your handling code here:
        try {
            String mensaje = "";
            int valorProducto = Integer.parseInt(textValor.getText());
            int valorPeso = Integer.parseInt(textPeso.getText());
            int valorImpuesto = Integer.parseInt(textImpuesto.getText());
            if (Character.isDefined(valorProducto) && Character.isDefined(valorPeso) && Character.isDefined(valorImpuesto)) {
                mensaje = textValor.getText() + "\n" + textPeso.getText() + "\n" + textImpuesto.getText() + "\n";
                dout.writeUTF(mensaje);
                textValor.setText("");
                textPeso.setText("");
                textImpuesto.setText("");
            }

        } catch (Exception e) {
            //se maneja la excepción aquí
        }

    }//GEN-LAST:event_botonEnviarActionPerformed
    
    /**
     * Metodo llamado al presionar el botont botonCalcular.
     * Calcula el resultado que se tiene que reenviar al servidor con base
     * a los valores recibidos.
     * @param evt .Permite activar el evento del boton botonCalcular una vez incializado.
     */
    private void botonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalcularActionPerformed
        // TODO add your handling code here:
        try {

            botonResultado.setEnabled(true);
            String msj;
            int valor = 0;
            int peso = 0;
            int impuesto = 0;
            int[] nums = new int[3];
            msj = textArea.getText();
            String[] valores = new String[3];
            valores = msj.split("\n");
            for (int i = 0; i < valores.length; i++) {
                int numero = Integer.parseInt(valores[i]);
                if (i == 0) {
                    valor = numero;
                } else if (i == 1) {
                    peso = numero;
                } else {
                    impuesto = numero;
                }
            }

            double monto = valor * impuesto / 100 + peso * 0.15;
            msj = String.valueOf(monto);
            textArea.setText(msj);
            botonCalcular.setEnabled(false);

        } catch (Exception e) {
            //se maneja la excepción aquí
        }

    }//GEN-LAST:event_botonCalcularActionPerformed
    
    /**
     * Metodo llamado al presionar el boton botonResultado.
     * Envía el resultado calculado al cliente.
     * @param evt .Permite activar el evento del botonResultado una vez incializado.
     */
    private void botonResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonResultadoActionPerformed
        // TODO add your handling code here:

        try {
            botonCalcular.setEnabled(true);
            String resultado = textArea.getText();
            dout.writeUTF(resultado);
            //jTextArea1.setText("");
            botonResultado.setEnabled(false);

        } catch (Exception e) {
            //se maneja la excepción aquí
        }

    }//GEN-LAST:event_botonResultadoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* crea y muestra el formulario o interfaz gráfica */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client().setVisible(true);
            }
        });

        try {
            String mensaje = "";

            s = new Socket("127.0.0.1", 1201);
            dis = new DataInputStream(s.getInputStream());
            dout = new DataOutputStream(s.getOutputStream());

            while (!mensaje.equals("exit")) {
                mensaje = dis.readUTF();
                textArea.setText(mensaje);

            }

        } catch (Exception e) {
            //se maneja la excepción aquí
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCalcular;
    private javax.swing.JButton botonEnviar;
    private javax.swing.JButton botonResultado;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTextArea textArea;
    private javax.swing.JTextField textImpuesto;
    private javax.swing.JTextField textPeso;
    private javax.swing.JTextField textValor;
    private javax.swing.JLabel tituloImpuesto;
    private javax.swing.JLabel tituloPanel;
    private javax.swing.JLabel tituloProducto;
    private javax.swing.JLabel tituloValor;
    // End of variables declaration//GEN-END:variables
}
