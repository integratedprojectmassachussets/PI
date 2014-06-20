/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bartender.view;

import br.com.bartender.controller.EventoController;
import br.com.bartender.model.Evento;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Logger;
import java.util.zip.DataFormatException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author eduardo
 */
public class ManutencaoEventoUI extends javax.swing.JInternalFrame {

    private ArrayList<Evento> listaEvento = new ArrayList<>();

    /**
     * Creates new form ManutencaoEventoUI
     */
    public ManutencaoEventoUI() {
        initComponents();
    }

   
    public void tabelaEvento() {
        DefaultTableModel tabelaEvento = new DefaultTableModel();
        tabelaEvento.setColumnIdentifiers(new String[]{"ID", "Nome", "Data", "Horario", "Valor Masculino", "Valor Feminino"});

        for (int i = 0; i < this.listaEvento.size(); i++) {
            tabelaEvento.addRow(new Object[]{this.listaEvento.get(i).getIdEvento(),
                        this.listaEvento.get(i).getNomeEvento(),
                        this.listaEvento.get(i).getDataEvento(),
                        this.listaEvento.get(i).getHorarioEvento(),
                        this.listaEvento.get(i).getValorMasc(),
                        this.listaEvento.get(i).getValorFem()});


        }
        jtListaEvento.setModel(tabelaEvento);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtListaEvento = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jtfEventoSalvarEdicao = new javax.swing.JButton();
        jtfEventoLimparEdicao = new javax.swing.JButton();
        jtfEventoExcluir = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jtfEventoEditarNome = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jtfEventoEditarData = new javax.swing.JTextField();
        jtfEventoEditarHorario = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jtfEventoEditarValorMasc = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jtfEventoEditarValorFem = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jbBuscarEvento = new javax.swing.JButton();
        jbBuscarTodosEventos = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtfEventoBuscarId = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jtfEventoBuscarNome = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfEventoBuscarDataDe = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        jtfEventoBuscardataAte = new javax.swing.JFormattedTextField();

        setClosable(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(650, 500));

        jtListaEvento.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jtListaEvento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Data", "Horário", "Valor Masculino", "Valor Feminino"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtListaEvento);
        jtListaEvento.getColumnModel().getColumn(0).setPreferredWidth(20);
        jtListaEvento.getColumnModel().getColumn(3).setPreferredWidth(20);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("Evento");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastrar/Editar Evento", 0, 0, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jtfEventoSalvarEdicao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtfEventoSalvarEdicao.setText("Salvar");
        jtfEventoSalvarEdicao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfEventoSalvarEdicaoMouseClicked(evt);
            }
        });

        jtfEventoLimparEdicao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtfEventoLimparEdicao.setText("Limpar");
        jtfEventoLimparEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEventoLimparEdicaoActionPerformed(evt);
            }
        });

        jtfEventoExcluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtfEventoExcluir.setText("Excluir");
        jtfEventoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEventoExcluirActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Nome:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Data:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Horário:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Valor de Entrada:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("M:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("F:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jtfEventoSalvarEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jtfEventoLimparEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jtfEventoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfEventoEditarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17))
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfEventoEditarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfEventoEditarData, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfEventoEditarValorMasc, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21)
                        .addGap(6, 6, 6)
                        .addComponent(jtfEventoEditarValorFem, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jtfEventoEditarData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel16)
                    .addComponent(jtfEventoEditarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21)
                        .addComponent(jtfEventoEditarValorFem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfEventoEditarValorMasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(jtfEventoEditarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfEventoSalvarEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfEventoLimparEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfEventoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jbBuscarEvento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbBuscarEvento.setText("Buscar");
        jbBuscarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarEventoActionPerformed(evt);
            }
        });

        jbBuscarTodosEventos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbBuscarTodosEventos.setText("Listar Todos");
        jbBuscarTodosEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarTodosEventosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbBuscarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscarTodosEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jbBuscarEvento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbBuscarTodosEventos)
                .addContainerGap())
        );

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Evento", 0, 0, new java.awt.Font("Ubuntu", 1, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("ID:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfEventoBuscarId, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfEventoBuscarId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Por ID", jPanel4);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nome:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfEventoBuscarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfEventoBuscarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Por Nome", jPanel5);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Data:");

        jLabel6.setText("De:");

        jtfEventoBuscarDataDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEventoBuscarDataDeActionPerformed(evt);
            }
        });

        jLabel14.setText("Até:");

        jtfEventoBuscardataAte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEventoBuscardataAteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfEventoBuscarDataDe, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jtfEventoBuscardataAte, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfEventoBuscarDataDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel14)
                    .addComponent(jtfEventoBuscardataAte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Por Período", jPanel6);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(270, 270, 270))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfEventoSalvarEdicaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfEventoSalvarEdicaoMouseClicked
        // TODO add your handling code here:

        /*
         * Falta fazer o comportamento de alterar Evento
         */
        try {

            Date dataEvento = null;

            Evento evento = new Evento();
            /* if(jtfEventoEditarID.getText() != null ){
             evento.setIdEvento(Integer.parseInt(jtfEventoEditarID.getText()));
             }
             */
            evento.setNomeEvento(jtfEventoEditarNome.getText());
            evento.setHorarioEvento(jtfEventoEditarHorario.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
            dataEvento = sdf.parse(jtfEventoEditarData.getText());
            /*dataEvento = (Date) new SimpleDateFormat("dd/MM/yyyy").parse(jtfEventoEditarData.getText()); 
             */
            evento.setDataEvento(dataEvento);
            evento.setValorMasc(Double.parseDouble(jtfEventoEditarValorMasc.getText()));
            evento.setValorFem(Double.parseDouble(jtfEventoEditarValorFem.getText()));
            EventoController.obterInstancia().Cadastrar(evento);

        } catch (DataFormatException e) {
            JOptionPane.showMessageDialog(null, "Data inválida");
        } catch (Exception ex) {
            Logger.getLogger(ManutencaoEventoUI.class.getName());
            JOptionPane.showMessageDialog(null, "Não foi possível estabelecer conexão com o banco de dados.");
        }

        JOptionPane.showMessageDialog(
                null, "Evento cadastrado com sucesso!", "Confirmação de Cadastro", WIDTH);
    }//GEN-LAST:event_jtfEventoSalvarEdicaoMouseClicked

    private void jtfEventoLimparEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEventoLimparEdicaoActionPerformed
        // TODO add your handling code here:

        this.listaEvento.clear();
        ((DefaultTableModel) jtListaEvento.getModel()).setNumRows(0);
        this.jtListaEvento.updateUI();

    }//GEN-LAST:event_jtfEventoLimparEdicaoActionPerformed

    private void jtfEventoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEventoExcluirActionPerformed
        // TODO add your handling code here:


        try {


            EventoController.obterInstancia().Excluir(this.listaEvento.get(jtListaEvento.getSelectedRow()));

        } catch (ArrayIndexOutOfBoundsException a) {
            JOptionPane.showMessageDialog(null, "Selecione um produto");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
       
        this.listaEvento.clear();
        ((DefaultTableModel) jtListaEvento.getModel()).setNumRows(0);
        this.jtListaEvento.updateUI();

        this.listaEvento = EventoController.obterInstancia().listarTodos();
        tabelaEvento();


    }//GEN-LAST:event_jtfEventoExcluirActionPerformed

    private void jbBuscarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarEventoActionPerformed
        // TODO add your handling code here:

        /*
         * Verificar como fazer pra escolher apenas um campo
         */

        Date dataEvento1 = null;
        Date dataEvento2 = null;


        this.listaEvento.clear();
        ((DefaultTableModel) jtListaEvento.getModel()).setNumRows(0);
        this.jtListaEvento.updateUI();

        if (!jtfEventoBuscarId.getText().equals("")) {
            try {
                Evento evento = new Evento();

                evento.setIdEvento(Integer.parseInt(jtfEventoBuscarId.getText()));
                this.listaEvento = EventoController.obterInstancia().ListarEventoId(evento);


                tabelaEvento();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não foi possível estabelecer conexão com o banco de dados.");
            }
        } else if (!jtfEventoBuscarNome.getText().equals("")) {
            try {
                Evento evento = new Evento();

                evento.setNomeEvento(jtfEventoBuscarNome.getText());
                this.listaEvento = EventoController.obterInstancia().ListarEventoNome(evento);


                tabelaEvento();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não foi possível estabelecer conexão com o banco de dados.");
            }
        } else if (jtfEventoBuscarDataDe.getText() != null && jtfEventoBuscardataAte != null) {
            try {


                SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
                dataEvento1 = sdf.parse(jtfEventoBuscarDataDe.getText());

                SimpleDateFormat sdf2 = new SimpleDateFormat("dd/mm/yyyy");
                dataEvento2 = sdf2.parse(jtfEventoBuscardataAte.getText());


                this.listaEvento = EventoController.obterInstancia().ListarEventoIntervaloData(dataEvento1, dataEvento2);


                tabelaEvento();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não foi possível estabelecer conexão com o banco de dados.");
            }
        }



    }//GEN-LAST:event_jbBuscarEventoActionPerformed

    private void jtfEventoBuscarDataDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEventoBuscarDataDeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEventoBuscarDataDeActionPerformed

    private void jtfEventoBuscardataAteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEventoBuscardataAteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEventoBuscardataAteActionPerformed

    private void jbBuscarTodosEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarTodosEventosActionPerformed
        // TODO add your handling code here:
        
        this.listaEvento.clear();
        ((DefaultTableModel) jtListaEvento.getModel()).setNumRows(0);
        this.jtListaEvento.updateUI();

        this.listaEvento = EventoController.obterInstancia().listarTodos();
        tabelaEvento();



    }//GEN-LAST:event_jbBuscarTodosEventosActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbBuscarEvento;
    private javax.swing.JButton jbBuscarTodosEventos;
    private javax.swing.JTable jtListaEvento;
    private javax.swing.JFormattedTextField jtfEventoBuscarDataDe;
    private javax.swing.JTextField jtfEventoBuscarId;
    private javax.swing.JTextField jtfEventoBuscarNome;
    private javax.swing.JFormattedTextField jtfEventoBuscardataAte;
    private javax.swing.JTextField jtfEventoEditarData;
    private javax.swing.JTextField jtfEventoEditarHorario;
    private javax.swing.JTextField jtfEventoEditarNome;
    private javax.swing.JTextField jtfEventoEditarValorFem;
    private javax.swing.JTextField jtfEventoEditarValorMasc;
    private javax.swing.JButton jtfEventoExcluir;
    private javax.swing.JButton jtfEventoLimparEdicao;
    private javax.swing.JButton jtfEventoSalvarEdicao;
    // End of variables declaration//GEN-END:variables
}
