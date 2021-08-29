
package Chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *Clase para representar el chat de un servidor.
 * Interactua con otro usuario o cliente de forma peer to peer
 * mediante un chat.
 * @author Ludwin RAMOS
 * @version 1.0
 * @since 27/08/2021
 */
public class chat_server extends javax.swing.JFrame {
    
    static ServerSocket ss;
    static Socket s;
    static DataInputStream dis;
    static DataOutputStream dout;

    /**
     * Inicializa los componentes o elementos del formulario chat_server.
     */
    public chat_server() {
        initComponents();
    }

    /**
     * Este metodo es llamado desde dentro del constructor para inicializar el
     * formulario.
     * CUIDADO: no moidficar este código. El contenido de este metodo es siempre
     * regenerado por el editor de formularios automaticamente.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textValor = new javax.swing.JTextField();
        tituloValor = new javax.swing.JLabel();
        tituloPeso = new javax.swing.JLabel();
        textPeso = new javax.swing.JTextField();
        tituloImpuesto = new javax.swing.JLabel();
        textImpuesto = new javax.swing.JTextField();
        botonEnviar = new javax.swing.JButton();
        botonCalcular = new javax.swing.JButton();
        botonResultado = new javax.swing.JButton();
        tituloPanel = new javax.swing.JLabel();
        MainPanel = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloValor.setText("Valor del producto");

        tituloPeso.setText("Peso del producto");

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

        botonEnviar.setText("Enviar");
        botonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEnviarActionPerformed(evt);
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

        tituloPanel.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        tituloPanel.setText("Panel de entrada");

        MainPanel.setEnabled(false);
        MainPanel.setWheelScrollingEnabled(false);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        MainPanel.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textValor, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(tituloImpuesto))
                            .addComponent(textImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(botonEnviar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(tituloPeso))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(tituloValor)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(tituloPanel)
                            .addGap(74, 74, 74))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(botonCalcular)
                            .addGap(18, 18, 18)
                            .addComponent(botonResultado)
                            .addGap(45, 45, 45)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tituloPanel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonCalcular)
                            .addComponent(botonResultado)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(tituloValor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tituloPeso)
                        .addGap(9, 9, 9)
                        .addComponent(textPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tituloImpuesto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonEnviar)))
                .addContainerGap(36, Short.MAX_VALUE))
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
     * Metodo llamado al presionar el botont botonCalcular.
     * Calcula el resultado que se tiene que reenviar al cliente con base
     * a los valores recibidos.
     * @param evt. Permite activar el evento del boton botonCalcular una vez incializado.
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
            msj = jTextArea1.getText();
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
            jTextArea1.setText(msj);
            botonCalcular.setEnabled(false);

        } catch (Exception e) {
            //se maneja la excepción aquí
        }

    }//GEN-LAST:event_botonCalcularActionPerformed

    /**
     * Metodo llamado al presionar el boton botonEnviar.
     * Clave enviar el mensaje contenido con los datos al cliente.
     * @param evt.Permite activar el evento del boton botonEnviar una vez incializado.
     */
    private void botonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEnviarActionPerformed

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
     * Metodo llamado al presionar el boton botonResultado.
     * Envía el resultado calculado al cliente.
     * @param evt Permite activar el evento del botonResultado una vez incializado.
     */
    private void botonResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonResultadoActionPerformed
        // TODO add your handling code here:
        try {
            botonCalcular.setEnabled(true);
            String resultado = jTextArea1.getText();
            dout.writeUTF(resultado);
            //jTextArea1.setText("");
            botonResultado.setEnabled(false);

        } catch (Exception e) {
            //se maneja la excepción aquí
        }
    }//GEN-LAST:event_botonResultadoActionPerformed

    /**
     * Metodo main principal que inicializa la conexión del servidor.
     * Se inicia el servidor con un puerto específico en el cual los clientes
     * se conectarán.
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* crea y muestra el formulario o interfaz gráfica */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new chat_server().setVisible(true);
            }
        });

        try {
            String mensaje = "";
            ss = new ServerSocket(1201);
            s = ss.accept();
            dis = new DataInputStream(s.getInputStream());
            dout = new DataOutputStream(s.getOutputStream());

            while (!mensaje.equals("exit")) {
                mensaje = dis.readUTF();
                jTextArea1.setText(mensaje);

            }

        } catch (Exception e) {
           //se maneja la excepción aquí
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane MainPanel;
    private javax.swing.JButton botonCalcular;
    private javax.swing.JButton botonEnviar;
    private javax.swing.JButton botonResultado;
    private static javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField textImpuesto;
    private javax.swing.JTextField textPeso;
    private javax.swing.JTextField textValor;
    private javax.swing.JLabel tituloImpuesto;
    private javax.swing.JLabel tituloPanel;
    private javax.swing.JLabel tituloPeso;
    private javax.swing.JLabel tituloValor;
    // End of variables declaration//GEN-END:variables

}
