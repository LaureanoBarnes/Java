/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculadora;
/**
 *
 * @author Laurii
 */
public class calculador extends javax.swing.JFrame {

    private String cadenaNumeros = "";
    private String operacion = "nula";
    private String resultado2;
    private double primerNumero , resultado;
    private boolean activado = true;
    private boolean punto = true;

    public calculador() {
        initComponents();
        this.setTitle("Calculadora");
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        BotonC = new javax.swing.JButton();
        BotonRaiz = new javax.swing.JButton();
        botonDividir = new javax.swing.JButton();
        BotonCE = new javax.swing.JButton();
        Boton7 = new javax.swing.JButton();
        Boton8 = new javax.swing.JButton();
        Boton9 = new javax.swing.JButton();
        BotonMultiplicar = new javax.swing.JButton();
        Boton4 = new javax.swing.JButton();
        Boton5 = new javax.swing.JButton();
        Boton6 = new javax.swing.JButton();
        BotonResta = new javax.swing.JButton();
        Boton1 = new javax.swing.JButton();
        Boton2 = new javax.swing.JButton();
        Boton3 = new javax.swing.JButton();
        BotonSuma = new javax.swing.JButton();
        BotonElevado = new javax.swing.JButton();
        Boton0 = new javax.swing.JButton();
        botonComa = new javax.swing.JButton();
        BotonIgual = new javax.swing.JButton();
        EtiquetaNumeros = new javax.swing.JLabel();
        EtiquetaMuestra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setLayout(new java.awt.GridLayout(5, 4));

        BotonC.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        BotonC.setText("C");
        BotonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCActionPerformed(evt);
            }
        });
        panel.add(BotonC);

        BotonRaiz.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        BotonRaiz.setText("√");
        BotonRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRaizActionPerformed(evt);
            }
        });
        panel.add(BotonRaiz);

        botonDividir.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        botonDividir.setText("/");
        botonDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDividirActionPerformed(evt);
            }
        });
        panel.add(botonDividir);

        BotonCE.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        BotonCE.setText("CE");
        BotonCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCEActionPerformed(evt);
            }
        });
        panel.add(BotonCE);

        Boton7.setBackground(new java.awt.Color(51, 51, 51));
        Boton7.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        Boton7.setText("7");
        Boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton7ActionPerformed(evt);
            }
        });
        panel.add(Boton7);

        Boton8.setBackground(new java.awt.Color(51, 51, 51));
        Boton8.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        Boton8.setText("8");
        Boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton8ActionPerformed(evt);
            }
        });
        panel.add(Boton8);

        Boton9.setBackground(new java.awt.Color(51, 51, 51));
        Boton9.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        Boton9.setText("9");
        Boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton9ActionPerformed(evt);
            }
        });
        panel.add(Boton9);

        BotonMultiplicar.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        BotonMultiplicar.setText("X");
        BotonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMultiplicarActionPerformed(evt);
            }
        });
        panel.add(BotonMultiplicar);

        Boton4.setBackground(new java.awt.Color(51, 51, 51));
        Boton4.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        Boton4.setText("4");
        Boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton4ActionPerformed(evt);
            }
        });
        panel.add(Boton4);

        Boton5.setBackground(new java.awt.Color(51, 51, 51));
        Boton5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        Boton5.setText("5");
        Boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton5ActionPerformed(evt);
            }
        });
        panel.add(Boton5);

        Boton6.setBackground(new java.awt.Color(51, 51, 51));
        Boton6.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        Boton6.setText("6");
        Boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton6ActionPerformed(evt);
            }
        });
        panel.add(Boton6);

        BotonResta.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        BotonResta.setText("-");
        BotonResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRestaActionPerformed(evt);
            }
        });
        panel.add(BotonResta);

        Boton1.setBackground(new java.awt.Color(51, 51, 51));
        Boton1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        Boton1.setText("1");
        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });
        panel.add(Boton1);

        Boton2.setBackground(new java.awt.Color(51, 51, 51));
        Boton2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        Boton2.setText("2");
        Boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2ActionPerformed(evt);
            }
        });
        panel.add(Boton2);

        Boton3.setBackground(new java.awt.Color(51, 51, 51));
        Boton3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        Boton3.setText("3");
        Boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton3ActionPerformed(evt);
            }
        });
        panel.add(Boton3);

        BotonSuma.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        BotonSuma.setText("+");
        BotonSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSumaActionPerformed(evt);
            }
        });
        panel.add(BotonSuma);

        BotonElevado.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        BotonElevado.setText("^");
        BotonElevado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonElevadoActionPerformed(evt);
            }
        });
        panel.add(BotonElevado);

        Boton0.setBackground(new java.awt.Color(51, 51, 51));
        Boton0.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        Boton0.setText("0");
        Boton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton0ActionPerformed(evt);
            }
        });
        panel.add(Boton0);

        botonComa.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        botonComa.setText(".");
        botonComa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComaActionPerformed(evt);
            }
        });
        panel.add(botonComa);

        BotonIgual.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        BotonIgual.setText("=");
        BotonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIgualActionPerformed(evt);
            }
        });
        panel.add(BotonIgual);

        EtiquetaNumeros.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        EtiquetaNumeros.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        EtiquetaNumeros.setText("0");

        EtiquetaMuestra.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        EtiquetaMuestra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EtiquetaMuestra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(EtiquetaNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addComponent(EtiquetaMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EtiquetaNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton7ActionPerformed
          if(resultado>=1){
      }else{
        if(EtiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "7";
        }else{
            cadenaNumeros += "7";
        }
          }
          if(resultado>=1){
              String resultado2 = String.valueOf(resultado);
              EtiquetaMuestra.setText(resultado2);
              EtiquetaNumeros.setText("0");
              resultado=0;
              if(EtiquetaNumeros.getText().equals("0")){
        cadenaNumeros = "7";
              }else{
                cadenaNumeros += "7";
                }
          }
        EtiquetaNumeros.setText(cadenaNumeros);
        activado = true; //poder usar la calculadora
    }//GEN-LAST:event_Boton7ActionPerformed

    private void Boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton8ActionPerformed
         if(resultado>=1){
      }else{
        if(EtiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "8";
        }else{
            cadenaNumeros += "8";
        }
         }
         if(resultado>=1){
              String resultado2 = String.valueOf(resultado);
              EtiquetaMuestra.setText(resultado2);
              EtiquetaNumeros.setText("0");
              resultado=0;
              if(EtiquetaNumeros.getText().equals("0")){
        cadenaNumeros = "8";
              }else{
                cadenaNumeros += "8";
                }
          }
        EtiquetaNumeros.setText(cadenaNumeros);
        activado = true; //poder usar la calculadora
    }//GEN-LAST:event_Boton8ActionPerformed

    private void Boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton9ActionPerformed
          if(resultado>=1){
      }else{
        if(EtiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "9";
        }else{
            cadenaNumeros += "9";
        }
          }
          if(resultado>=1){
              String resultado2 = String.valueOf(resultado);
              EtiquetaMuestra.setText(resultado2);
              EtiquetaNumeros.setText("0");
              resultado=0;
              if(EtiquetaNumeros.getText().equals("0")){
        cadenaNumeros = "9";
              }else{
                cadenaNumeros += "9";
                }
          }
        EtiquetaNumeros.setText(cadenaNumeros);
        activado = true; //poder usar la calculadora
    }//GEN-LAST:event_Boton9ActionPerformed

    private void Boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton4ActionPerformed
          if(resultado>=1){
      }else{
        if(EtiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "4";
        }else{
            cadenaNumeros += "4";
        }
          }
          if(resultado>=1){
              String resultado2 = String.valueOf(resultado);
              EtiquetaMuestra.setText(resultado2);
              EtiquetaNumeros.setText("0");
              resultado=0;
              if(EtiquetaNumeros.getText().equals("0")){
        cadenaNumeros = "4";
              }else{
                cadenaNumeros += "4";
                }
          }
        EtiquetaNumeros.setText(cadenaNumeros);
        activado = true; //poder usar la calculadora
    }//GEN-LAST:event_Boton4ActionPerformed

    private void Boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton5ActionPerformed
          if(resultado>=1){
      }else{
        if(EtiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "5";
        }else{
            cadenaNumeros += "5";
        }
          }
          if(resultado>=1){
              String resultado2 = String.valueOf(resultado);
              EtiquetaMuestra.setText(resultado2);
              EtiquetaNumeros.setText("0");
              resultado=0;
              if(EtiquetaNumeros.getText().equals("0")){
        cadenaNumeros = "5";
              }else{
                cadenaNumeros += "5";
                }
          }
        EtiquetaNumeros.setText(cadenaNumeros);
        activado = true; //poder usar la calculadora
    }//GEN-LAST:event_Boton5ActionPerformed

    private void Boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton6ActionPerformed
          if(resultado>=1){
      }else{
        if(EtiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "6";
        }else{
            cadenaNumeros += "6";
        }
          }
          if(resultado>=1){
              String resultado2 = String.valueOf(resultado);
              EtiquetaMuestra.setText(resultado2);
              EtiquetaNumeros.setText("0");
              resultado=0;
              if(EtiquetaNumeros.getText().equals("0")){
        cadenaNumeros = "6";
              }else{
                cadenaNumeros += "6";
                }
          }
        EtiquetaNumeros.setText(cadenaNumeros);
        activado = true; //poder usar la calculadora
    }//GEN-LAST:event_Boton6ActionPerformed

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed
          if(resultado>=1){
      }else{
        if(EtiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "1";
        }else{
            cadenaNumeros += "1";
        }
          }
          if(resultado>=1){
              String resultado2 = String.valueOf(resultado);
              EtiquetaMuestra.setText(resultado2);
              EtiquetaNumeros.setText("0");
              resultado=0;
              if(EtiquetaNumeros.getText().equals("0")){
        cadenaNumeros = "1";
              }else{
                cadenaNumeros += "1";
                }
          }
        EtiquetaNumeros.setText(cadenaNumeros);
        activado = true; //poder usar la calculadora
    }//GEN-LAST:event_Boton1ActionPerformed

    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2ActionPerformed
        if(resultado>=1){
      }else{
        if(EtiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "2";
        }else{
            cadenaNumeros += "2";
        }
        }
        if(resultado>=1){
              String resultado2 = String.valueOf(resultado);
              EtiquetaMuestra.setText(resultado2);
              EtiquetaNumeros.setText("0");
              resultado=0;
              if(EtiquetaNumeros.getText().equals("0")){
        cadenaNumeros = "2";
              }else{
                cadenaNumeros += "2";
                }
          }
        EtiquetaNumeros.setText(cadenaNumeros);
        activado = true; //poder usar la calculadora
    }//GEN-LAST:event_Boton2ActionPerformed

    private void Boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton3ActionPerformed
      if(resultado>=1){
      }else{
        if(EtiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "3";
        }else{
            cadenaNumeros += "3";
        }
      }
      if(resultado>=1){
              String resultado2 = String.valueOf(resultado);
              EtiquetaMuestra.setText(resultado2);
              EtiquetaNumeros.setText("0");
              resultado=0;
              if(EtiquetaNumeros.getText().equals("0")){
        cadenaNumeros = "3";
              }else{
                cadenaNumeros += "3";
                }
          }
        EtiquetaNumeros.setText(cadenaNumeros);
        activado = true; //poder usar la calculadora
    }//GEN-LAST:event_Boton3ActionPerformed

    private void Boton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton0ActionPerformed
          if(resultado>=1){
      }else{
        if(EtiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "0";
        }else{
            cadenaNumeros += "0";
        }
          }
          if(resultado>=1){
              String resultado2 = String.valueOf(resultado);
              EtiquetaMuestra.setText(resultado2);
              EtiquetaNumeros.setText("0");
              resultado=0;
              if(EtiquetaNumeros.getText().equals("0")){
        cadenaNumeros = "0";
              }else{
                cadenaNumeros += "0";
                }
          }
        EtiquetaNumeros.setText(cadenaNumeros);
        activado = true; //poder usar la calculadora
    }//GEN-LAST:event_Boton0ActionPerformed

    private void BotonSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSumaActionPerformed
        if(activado == true){
            primerNumero = Double.parseDouble(cadenaNumeros);
            EtiquetaMuestra.setText(cadenaNumeros + " + ");
            cadenaNumeros = "";
            operacion = "sumar";
            resultado= 0;
            activado = false;
            punto = true;
        }
    }//GEN-LAST:event_BotonSumaActionPerformed

    private void BotonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIgualActionPerformed
        double segundoNumero;
        punto = false;
        if(operacion.equals("nula")){
            EtiquetaNumeros.setText(cadenaNumeros);
            
        }
        
        
        if(operacion.equals("sumar")){
            segundoNumero = Double.parseDouble(cadenaNumeros);
            resultado = primerNumero + segundoNumero;
            EtiquetaNumeros.setText(String.format("% .2f",resultado));
            cadenaNumeros = String.valueOf(resultado); //double a string
            operacion = "nula";
            activado=false;
        }
        EtiquetaMuestra.setText("");
        activado = true;
        if(operacion.equals("restar")){
            segundoNumero = Double.parseDouble(cadenaNumeros);
            resultado = primerNumero - segundoNumero;
            EtiquetaNumeros.setText(String.format("% .2f",resultado));
            cadenaNumeros = String.valueOf(resultado); //double a string
            operacion = "nula";
        }
        if(operacion.equals("multiplicar")){
            segundoNumero = Double.parseDouble(cadenaNumeros);
            resultado = primerNumero * segundoNumero;
            EtiquetaNumeros.setText(String.format("% .2f",resultado));
            cadenaNumeros = String.valueOf(resultado); //double a string
            operacion = "nula";
        }
        else if (operacion.equals("dividir")) {
            segundoNumero = Double.parseDouble(cadenaNumeros);
            if (segundoNumero == 0) {
                EtiquetaNumeros.setText("NoSeDivideEn0");
            } else {
            resultado = primerNumero / segundoNumero;
            EtiquetaNumeros.setText(String.format("% .2f", resultado));
            cadenaNumeros = String.valueOf(resultado); //double a string
            operacion = "nula";
            }
        }
        if(operacion.equals("Elevado")){
            segundoNumero = Double.parseDouble(cadenaNumeros);
            resultado = Math.pow(primerNumero, segundoNumero);
            EtiquetaNumeros.setText(String.format("% .2f",resultado));
            cadenaNumeros = String.valueOf(resultado); //double a string
            operacion = "nula";
        }
        EtiquetaMuestra.setText("");
        activado = true;
    }//GEN-LAST:event_BotonIgualActionPerformed

    private void BotonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMultiplicarActionPerformed
        if(activado == true){
            primerNumero = Double.parseDouble(cadenaNumeros);
            EtiquetaMuestra.setText(cadenaNumeros + "x");
            cadenaNumeros = "";
            operacion = "multiplicar";
            resultado= 0;
            activado = false;
            punto = true;
        }
    }//GEN-LAST:event_BotonMultiplicarActionPerformed

    private void BotonRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRestaActionPerformed
        if(activado == true){
            primerNumero = Double.parseDouble(cadenaNumeros);
            EtiquetaMuestra.setText(cadenaNumeros + " - ");
            cadenaNumeros = "";
            operacion = "restar";    
            resultado= 0;
            activado = false;
            punto = true;
        }
    }//GEN-LAST:event_BotonRestaActionPerformed

    private void botonDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDividirActionPerformed
        if(activado == true){
            primerNumero = Double.parseDouble(cadenaNumeros);
            EtiquetaMuestra.setText(cadenaNumeros + " / ");
            cadenaNumeros = "";
            operacion = "dividir";
            resultado= 0;
            activado = false;
            punto = true;
        }
    }//GEN-LAST:event_botonDividirActionPerformed

    private void BotonRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRaizActionPerformed
        primerNumero = Double.parseDouble(cadenaNumeros);
        EtiquetaMuestra.setText("sqrt("+cadenaNumeros+")");
        resultado = Math.sqrt(primerNumero);
        EtiquetaNumeros.setText(String.format("%.2f", resultado));
        cadenaNumeros = String.valueOf(resultado); //convertimos el valor a cadena
        punto = true;
        resultado= 1;
    }//GEN-LAST:event_BotonRaizActionPerformed

    private void botonComaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComaActionPerformed
        if(punto == true){
            if(cadenaNumeros.equals("")){
                cadenaNumeros = "0.";
            } else{
                cadenaNumeros += ".";
            }
            EtiquetaNumeros.setText(cadenaNumeros);
            punto = false;
        }
    }//GEN-LAST:event_botonComaActionPerformed

    private void BotonElevadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonElevadoActionPerformed
         if(activado == true){
            primerNumero = Double.parseDouble(cadenaNumeros);
            EtiquetaMuestra.setText(cadenaNumeros + " ^ ");
            cadenaNumeros = "";
            operacion = "Elevado";
            
            activado = false;
            punto = true;
            resultado= 0;
        }
    }//GEN-LAST:event_BotonElevadoActionPerformed

    private void BotonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCActionPerformed
        EtiquetaMuestra.setText("");
        EtiquetaNumeros.setText("0");
        operacion = "nula";
        cadenaNumeros = "";
        activado = true;
        punto = true;
        resultado= 0;
        
    }//GEN-LAST:event_BotonCActionPerformed

    private void BotonCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCEActionPerformed
        int tamaño = cadenaNumeros.length();
        if(tamaño == 1){
            cadenaNumeros = "0";
        }else{
            cadenaNumeros = cadenaNumeros.substring(0,cadenaNumeros.length() -1);
        }
        EtiquetaNumeros.setText(cadenaNumeros);
       resultado= 0;
    }//GEN-LAST:event_BotonCEActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(calculador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new calculador().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton0;
    private javax.swing.JButton Boton1;
    private javax.swing.JButton Boton2;
    private javax.swing.JButton Boton3;
    private javax.swing.JButton Boton4;
    private javax.swing.JButton Boton5;
    private javax.swing.JButton Boton6;
    private javax.swing.JButton Boton7;
    private javax.swing.JButton Boton8;
    private javax.swing.JButton Boton9;
    private javax.swing.JButton BotonC;
    private javax.swing.JButton BotonCE;
    private javax.swing.JButton BotonElevado;
    private javax.swing.JButton BotonIgual;
    private javax.swing.JButton BotonMultiplicar;
    private javax.swing.JButton BotonRaiz;
    private javax.swing.JButton BotonResta;
    private javax.swing.JButton BotonSuma;
    private javax.swing.JLabel EtiquetaMuestra;
    private javax.swing.JLabel EtiquetaNumeros;
    private javax.swing.JButton botonComa;
    private javax.swing.JButton botonDividir;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
