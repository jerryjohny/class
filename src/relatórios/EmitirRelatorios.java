/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relatórios;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author jerry johny
 */
public class EmitirRelatorios extends javax.swing.JFrame {

    /**
     * Creates new form EmitirRelatorios
     */
    public EmitirRelatorios() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btRact = new javax.swing.JButton();
        btRCentros = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabActividades = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabCentros = new javax.swing.JTable();
        btAbrir = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        btRact.setBackground(new java.awt.Color(204, 153, 0));
        btRact.setText("Relatórios de actividades");
        btRact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRactActionPerformed(evt);
            }
        });

        btRCentros.setBackground(new java.awt.Color(51, 153, 0));
        btRCentros.setText("Relatórios de centros");
        btRCentros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRCentrosActionPerformed(evt);
            }
        });

        tabActividades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Registo", "Alojado. id-0012", "Operador. ID-1300", "20/12/2019"},
                {"Eliminação", "Alojado.ID-8823", "Gestor. ID-990", "21/12/2019"},
                {"Actualização", "Centro.ID-034CTR", "Administrador", "21/112/2019"},
                {"Elimimação", "Gestor.ID-009", "Administrador", "12/12/2019"}
            },
            new String [] {
                "Tipo", "Entidade", "Executor", "Data"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabActividades);

        tabCentros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"A-300  B-100", "A-100  B-30", "A-50  B-25", "A-70    B- 20", "A-40  B-60", "A-30  B-20", "A-3", "A-4", "A-1"}
            },
            new String [] {
                "Total afectos", "Crianças", "adolescentes", "Jovens", "Adultos", "Idosos", "Doentes", "Deficientes", "Obitos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabCentros.setRowHeight(30);
        jScrollPane3.setViewportView(tabCentros);

        btAbrir.setBackground(new java.awt.Color(255, 255, 255));
        btAbrir.setText("Abrir arquivo");
        btAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAbrirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
                    .addComponent(btRCentros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btRact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addComponent(btAbrir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                .addComponent(btAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btRact, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btRCentros, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btRactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRactActionPerformed
         
         
        Document doc = new Document();
       
   try {
            PdfWriter.getInstance(doc,new FileOutputStream("Relatório_Actividades.pdf"));
            doc.open();
      //cabeçalho====================================================================================================================================
              
    Paragraph idai = new Paragraph("S.G.C");
    Paragraph moz = new Paragraph(" República de Moçambique");
    Paragraph dataHead = new Paragraph("                                                                                                       Maputo, 21 de outubro de 2019");
    Paragraph barra = new Paragraph("____________________________________________________________________________________________________________________________________________________________");
    Paragraph footer = new Paragraph("____________________________________________________________________________________________________________________________________________________________");
    Paragraph titulo = new Paragraph("Relatório de Actividades");
    idai.setIndentationLeft(250);
    titulo.setSpacingBefore(40);
    moz.setIndentationLeft(180);
    titulo.setSpacingAfter(30);
    titulo.setIndentationLeft(200);
    footer.setSpacingBefore(150);
    
        
            doc.add(idai);
            doc.add(moz);
            doc.add(dataHead);
            doc.add(barra);
            doc.add(titulo);
            
   //=========================================================================================================================================================         
            
            
            
            
            
            PdfPTable tab1= new PdfPTable(4);
            tab1.addCell("Tipo");
            tab1.addCell("Entidade");
            tab1.addCell("Executor");
            tab1.addCell("Data");
            
            
            String tipo,entidade,executor,data;
            
            
            for (int i = 1; i <tabActividades.getRowCount(); i++) {
              tipo= tabActividades.getValueAt(i, 0).toString();
              entidade= tabActividades.getValueAt(i, 1).toString();
              executor= tabActividades.getValueAt(i, 2).toString();
              data= tabActividades.getValueAt(i, 3).toString();
              tab1.addCell(tipo);
              tab1.addCell(entidade);
              tab1.addCell(executor);
              tab1.addCell(data);
            }
            
            doc.add(tab1);
            doc.add(footer);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EmitirRelatorios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(EmitirRelatorios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        doc.close();
        dispose();
        
        
    }//GEN-LAST:event_btRactActionPerformed

    private void btRCentrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRCentrosActionPerformed
        // TODO add your handling code here:
      
        Document doc = new Document();
        
        try {
            PdfWriter.getInstance(doc,new FileOutputStream("Relatório_Centros.pdf"));
            doc.open();
         
    //cabeçalho====================================================================================================================================
              
    Paragraph idai = new Paragraph("S.G.C");
    Paragraph moz = new Paragraph(" República de Moçambique");
    Paragraph afetos = new Paragraph("                Classes:");
    Paragraph a = new Paragraph("                A - alojados");
    Paragraph b = new Paragraph("                B - beneficiários com alojamento próprio, afetos ao centro");
    Paragraph data = new Paragraph("                                                                                                       Maputo, 21 de outubro de 2019");
    Paragraph barra = new Paragraph("____________________________________________________________________________________________________________________________________________________________");
    Paragraph footer = new Paragraph("____________________________________________________________________________________________________________________________________________________________");
    Paragraph titulo = new Paragraph("Relatório de Centros");
    idai.setIndentationLeft(240);
    titulo.setSpacingBefore(40);
    moz.setIndentationLeft(180);
    titulo.setSpacingAfter(20);
    titulo.setIndentationLeft(200);
    afetos.setSpacingBefore(30);
    afetos.setSpacingAfter(20);
   
        
            doc.add(idai);
            doc.add(moz);
            doc.add(data);
            doc.add(barra);
            doc.add(titulo);
   //=========================================================================================================================================================         
            
            
            
            
            
            
            
            
            
            
            
            
            
            PdfPTable tab1= new PdfPTable(5);
            PdfPTable tab2= new PdfPTable(4);
            tab1.addCell("Total afectos");//"Total afectos", "Crianças", "adolescentes", "Jovens", "Adultos", "Idosos", "Doentes", "Deficientes", "Obitos"
            tab1.addCell("Crianças");
            tab1.addCell("adolescentes");
            tab1.addCell("Jovens");
            tab1.addCell("Adultos");
            tab2.setSpacingBefore(30);
            tab1.setSpacingAfter(20);
            
            tab2.addCell("Idosos");
            tab2.addCell("Doentes");
            tab2.addCell("Deficientes");
            tab2.addCell("Obitos");
            tab2.setSpacingBefore(20);
            footer.setSpacingBefore(40);
            
            String totalAfectos, criancas, adolescentes, jovens, adultos, idosos, doentes, deficientes, obitos;
            
            
            for (int i = 0; i <tabCentros.getRowCount(); i++) {
              totalAfectos= tabCentros.getValueAt(i, 0).toString();
              criancas= tabCentros.getValueAt(i, 1).toString();
              adolescentes= tabCentros.getValueAt(i, 2).toString();
              jovens= tabCentros.getValueAt(i, 3).toString();
              adultos= tabCentros.getValueAt(i, 4).toString();
              idosos= tabCentros.getValueAt(i, 5).toString();
              doentes= tabCentros.getValueAt(i, 6).toString();
              deficientes= tabCentros.getValueAt(i, 7).toString();
              obitos= tabCentros.getValueAt(i, 8).toString();
              
              
              
              //estes dados entram na primeira tavela
              tab1.addCell(totalAfectos);
              tab1.addCell(criancas);
              tab1.addCell(adolescentes);
              tab1.addCell(jovens);
              tab1.addCell(adultos);
              //estes entram na segunda tabela
              tab2.addCell(idosos);
              tab2.addCell(doentes);
              tab2.addCell(deficientes);
              tab2.addCell(obitos);
              
            }
            
            doc.add(tab1);
            
            doc.add(tab2);
            
            doc.add(afetos);
            doc.add(a);
            doc.add(b);
            doc.add(footer);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EmitirRelatorios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(EmitirRelatorios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EmitirRelatorios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        doc.close();
        dispose();
    }//GEN-LAST:event_btRCentrosActionPerformed

    private void btAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAbrirActionPerformed
        // TODO add your handling code here:
        JFileChooser f = new JFileChooser("C:/Users/jerry johny/Documents/NetBeansProjects/Relatórios");
        f.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        f.showOpenDialog(this);
        
    }//GEN-LAST:event_btAbrirActionPerformed

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
            java.util.logging.Logger.getLogger(EmitirRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmitirRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmitirRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmitirRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmitirRelatorios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAbrir;
    private javax.swing.JButton btRCentros;
    private javax.swing.JButton btRact;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabActividades;
    private javax.swing.JTable tabCentros;
    // End of variables declaration//GEN-END:variables
}
