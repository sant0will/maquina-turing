package maquinadeturing;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DuasFitas extends javax.swing.JFrame {
    
    String[] estados;
    String[] alfabeto;
    String[] alfabetoCaractereVazio;
    String[] estadosIniciais;
    String[] estadosFinais;
    char[] sentenca1;
    char[] sentenca2;
    String estadoAtual;
    String teste;
    String estadoAtual2;
    String teste2;

    public DuasFitas() {
    	getContentPane().setBackground(Color.DARK_GRAY);
    	setBackground(Color.DARK_GRAY);
    	setAlwaysOnTop(true);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_principal = new java.awt.Panel();
        jLabel_estados = new javax.swing.JLabel();
        jLabel_estados.setForeground(Color.WHITE);
        jLabel_alfabeto = new javax.swing.JLabel();
        jLabel_alfabeto.setForeground(Color.WHITE);
        jLabel_estadoInicial = new javax.swing.JLabel();
        jLabel_estadoInicial.setForeground(Color.WHITE);
        jLabel_estadoFinal = new javax.swing.JLabel();
        jLabel_estadoFinal.setForeground(Color.WHITE);
        jLabel_transicoes = new javax.swing.JLabel();
        jLabel_transicoes.setForeground(Color.WHITE);
        txtEstados = new javax.swing.JTextField();
        txtEstados.setText("q0,q1,q2");
        txtAlfabeto = new javax.swing.JTextField();
        txtAlfabeto.setText("1,0,2,g,o,l,&");
        txtEstadoInicial = new javax.swing.JTextField();
        txtEstadoInicial.setText("q0");
        txtEstadoFinal = new javax.swing.JTextField();
        txtEstadoFinal.setText("q2");
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTransicoes = new javax.swing.JTable();
        btnMaisLinhaTransicoes = new javax.swing.JButton();
        btnMaisLinhaTransicoes.setFont(new Font("Dialog", Font.BOLD, 12));
        btnMaisLinhaTransicoes.setBackground(Color.LIGHT_GRAY);
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSentecas = new javax.swing.JTable();
        btnMaisLinhaSentencas = new javax.swing.JButton();
        btnMaisLinhaSentencas.setFont(new Font("Dialog", Font.BOLD, 12));
        btnMaisLinhaSentencas.setBackground(Color.LIGHT_GRAY);
        jLabel_sentencas = new javax.swing.JLabel();
        jLabel_sentencas.setForeground(Color.WHITE);
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSaida = new javax.swing.JTable();
        setPreferredSize(new Dimension(850, 600));
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("M\u00E1quina de Turing");
        setName("M\u00E1quina de Turing");
        setVisible(true);
        setResizable(false);

        jLabel_estados.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel_estados.setText("Estados (Q):");

        jLabel_alfabeto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel_alfabeto.setText("Alfabeto (Î£):");

        jLabel_estadoInicial.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel_estadoInicial.setText("Estado inicial: (Ex: q0)");

        jLabel_estadoFinal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel_estadoFinal.setText("Estado final: (Ex: q3,q4)");

        jLabel_transicoes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel_transicoes.setText("Transi\u00E7\u00F5es:");

        txtEstados.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtEstados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadosActionPerformed(evt);
            }
        });

        txtAlfabeto.setDisabledTextColor(new java.awt.Color(51, 51, 51));

        tblTransicoes.setAutoCreateRowSorter(true);
        tblTransicoes.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        tblTransicoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"q0 - q0","1 - &","q0 - q0","1 - g","R - R"},
                {"q0 - q0","0 - &","q1 - q1","0 - o","R - R"},
                {"q1 - q1","0 - &","q1 - q1","0 - o","R - R"},
                {"q1 - q1","2 - &","q2 - q2","2 - l","R - S"},
            },
            new String [] {
                "Estado atual (1 - 2)", "Caractere de leitura", "Estado futuro", "Caractere de escrita", "Movimento do cabeçote"
            }
        ));
        tblTransicoes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblTransicoesKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblTransicoes);

        btnMaisLinhaTransicoes.setText("+");
        btnMaisLinhaTransicoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaisLinhaTransicoesActionPerformed(evt);
            }
        });

        tblSentecas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1100002", "&&&&&&&"}
            },
            new String [] {
                "Sentenca 1", "Sentenca 2"
            }
        ));
        tblSentecas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblSentecasKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(tblSentecas);

        btnMaisLinhaSentencas.setText("+");
        btnMaisLinhaSentencas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaisLinhaSentencasActionPerformed(evt);
            }
        });

        jLabel_sentencas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel_sentencas.setText("Senten\u00E7as para teste:");

        tblSaida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Resultado 1", "Saida 1", "Resultado 2", "Saida 2"
            }
        ));
        tblSaida.setEnabled(false);
        jScrollPane2.setViewportView(tblSaida);
        btnLimpar = new javax.swing.JButton();
        btnLimpar.setBackground(Color.LIGHT_GRAY);
        btnLimpar.setForeground(new Color(0, 0, 0));
        
                btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 11)); // NOI18N
                btnLimpar.setText("Limpar");
                btnLimpar.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnLimparActionPerformed(evt);
                    }
                });
        btnIniciar = new javax.swing.JButton();
        btnIniciar.setBackground(Color.LIGHT_GRAY);        
        btnIniciar.setFont(new Font("Tahoma", Font.BOLD, 11)); // NOI18N
        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        

        javax.swing.GroupLayout panel_principalLayout = new javax.swing.GroupLayout(panel_principal);
        panel_principalLayout.setHorizontalGroup(
        	panel_principalLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(panel_principalLayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(panel_principalLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel_alfabeto)
        				.addGroup(panel_principalLayout.createSequentialGroup()
        					.addComponent(txtAlfabeto, GroupLayout.PREFERRED_SIZE, 360, GroupLayout.PREFERRED_SIZE)
        					.addGap(26)
        					.addComponent(txtEstadoFinal, GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE))
        				.addGroup(panel_principalLayout.createSequentialGroup()
        					.addComponent(jLabel_sentencas)
        					.addPreferredGap(ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
        					.addComponent(btnIniciar)
        					.addGap(42)
        					.addGap(26)
        					.addComponent(btnLimpar, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
        					.addGap(82)
        					.addComponent(btnMaisLinhaSentencas))
        				.addGroup(panel_principalLayout.createSequentialGroup()
        					.addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
        					.addGap(44)
        					.addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE))
        				.addGroup(panel_principalLayout.createSequentialGroup()
        					.addGroup(panel_principalLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel_estados)
        						.addComponent(txtEstados, GroupLayout.PREFERRED_SIZE, 360, GroupLayout.PREFERRED_SIZE))
        					.addGap(26)
        					.addGroup(panel_principalLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel_estadoInicial)
        						.addComponent(jLabel_estadoFinal)
        						.addComponent(txtEstadoInicial, 438, 438, 438)))
        				.addGroup(panel_principalLayout.createSequentialGroup()
        					.addComponent(jLabel_transicoes)
        					.addPreferredGap(ComponentPlacement.RELATED, 673, Short.MAX_VALUE)
        					.addComponent(btnMaisLinhaTransicoes))
        				.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE))
        			.addGap(870))
        );
        panel_principalLayout.setVerticalGroup(
        	panel_principalLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(panel_principalLayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(panel_principalLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel_estados)
        				.addComponent(jLabel_estadoInicial))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(panel_principalLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtEstados, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(txtEstadoInicial, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(14)
        			.addGroup(panel_principalLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel_alfabeto)
        				.addComponent(jLabel_estadoFinal))
        			.addGap(3)
        			.addGroup(panel_principalLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtAlfabeto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(txtEstadoFinal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGroup(panel_principalLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(panel_principalLayout.createSequentialGroup()
        					.addGap(18)
        					.addComponent(jLabel_transicoes))
        				.addGroup(panel_principalLayout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(btnMaisLinhaTransicoes)))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
        			.addGroup(panel_principalLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel_sentencas)
        				.addComponent(btnMaisLinhaSentencas)
        				.addComponent(btnIniciar)
        				.addComponent(btnLimpar))
        			.addGap(11)
        			.addGroup(panel_principalLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        panel_principal.setLayout(panel_principalLayout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(panel_principal, GroupLayout.PREFERRED_SIZE, 1706, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(panel_principal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
        getContentPane().setLayout(layout);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMaisLinhaSentencasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaisLinhaSentencasActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblSentecas.getModel();
        DefaultTableModel model2 = (DefaultTableModel) tblSaida.getModel();

        Object[] linha = new Object[]{""};

        model.addRow(linha);
        model2.addRow(linha);
    }//GEN-LAST:event_btnMaisLinhaSentencasActionPerformed

    private void tblSentecasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblSentecasKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            DefaultTableModel model = (DefaultTableModel) tblSentecas.getModel();
            DefaultTableModel model2 = (DefaultTableModel) tblSaida.getModel();

            Object[] linha = new Object[]{""};

            model.addRow(linha);
            model2.addRow(linha);
        }
    }//GEN-LAST:event_tblSentecasKeyPressed

    private void btnMaisLinhaTransicoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaisLinhaTransicoesActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblTransicoes.getModel();

        Object[] linha = new Object[]{"","","","","",};

        model.addRow(linha);
    }//GEN-LAST:event_btnMaisLinhaTransicoesActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        this.dispose();
        limpaVariaveis();
        new DuasFitas().setVisible(true);
    }//GEN-LAST:event_btnLimparActionPerformed
    
    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        estados = tratador(txtEstados.getText());
        alfabeto = tratador(txtAlfabeto.getText());
        estadosIniciais = tratador(txtEstadoInicial.getText());
        estadosFinais = tratador(txtEstadoFinal.getText());
        
        if(!estadosIniciais[0].isEmpty() && !estadosFinais[0].isEmpty() && !estados[0].isEmpty() && !alfabeto[0].isEmpty()) {
        	teste_sentencas();
        }else {
        	JOptionPane.showMessageDialog(null, "Adicione as informações do formulário e a tabela de transições");
        }  

    }//GEN-LAST:event_btnIniciarActionPerformed

    private void tblTransicoesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblTransicoesKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            DefaultTableModel model = (DefaultTableModel) tblTransicoes.getModel();

            Object[] linha = new Object[]{"","","","",""};

            model.addRow(linha);
        }
    }//GEN-LAST:event_tblTransicoesKeyPressed

    private void txtEstadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadosActionPerformed
   
    private String[] tratador(String valores){
        String[] arrayValores = valores.split(",");
        return arrayValores;
    }
    
    private String tratadorTransicoes(String transicao, int posicao){
        String[] arrayValores = transicao.split(" - ");
        return arrayValores[posicao].toString();
        
    }
    
    public void teste_sentencas(){    
        estadoAtual = estadosIniciais[0];
        estadoAtual2 = estadosIniciais[0];
        
        for(int z = 0; z < tblSentecas.getRowCount(); z++){
            String aux = leituraTblSentencas(z, 0);
            String auxx = leituraTblSentencas(z, 1);
            aux += "#";
            auxx += "#";
            sentenca1 = aux.toCharArray();
            sentenca2 = auxx.toCharArray();
            int i = 0;
            
            while(i < sentenca1.length){
                boolean flag = false;
                for(int j = 0; j <= tblTransicoes.getRowCount(); j++){
                    if(j == tblTransicoes.getRowCount()) break;
                    
                    if(
                    		estadoAtual.equals(tratadorTransicoes(leituraTblTransicoes(j,0), 0)) && 
                    		tratadorTransicoes(leituraTblTransicoes(j,1), 0).equals(Character.toString(sentenca1[i])) &&
                    		estadoAtual2.equals(tratadorTransicoes(leituraTblTransicoes(j,0), 1)) && 
                    		tratadorTransicoes(leituraTblTransicoes(j,1), 1).equals(Character.toString(sentenca2[i]))
                    ){
                        flag = true;
                        estadoAtual = tratadorTransicoes(leituraTblTransicoes(j,2), 0);
                        String aux2 = tratadorTransicoes(leituraTblTransicoes(j,3), 0);
                        estadoAtual2 = tratadorTransicoes(leituraTblTransicoes(j,2), 1);
                        String aux22 = tratadorTransicoes(leituraTblTransicoes(j,3), 1);
                        if(!aux2.contains("#") && !aux22.contains("#")){
                            sentenca1[i] = aux2.charAt(0);
                            sentenca2[i] = aux22.charAt(0);
                        }
                        
                        switch (tratadorTransicoes(leituraTblTransicoes(j,4), 0)) {
                            case "R":
                                i++;
                                break;
                            case "L":
                                i--;
                                break;             
                            case "S":
                                break;
                            default:
                                break;
                        }
                        switch (tratadorTransicoes(leituraTblTransicoes(j,4), 1)) {
	                        case "R":
	                            i++;
	                            break;
	                        case "L":
	                            i--;
	                            break;             
	                        case "S":
	                            break;
	                        default:
	                            break;
	                    }
                    }              
                    if(flag) break;          
                }
                
                if(!flag){
                    boolean ef = false;
                    for(String estadoFinal : estadosFinais){
                        if(estadoFinal.equals(estadoAtual) && estadoFinal.equals(estadoAtual2)) {
                            ef = true;
                            break;
                        }
                    }
                    if(ef){
                        tblSaida.setValueAt("Aceitou", z, 0);
                        teste = String.copyValueOf(sentenca1);
                        teste = teste.substring(0, teste.length() - 1);
                        tblSaida.setValueAt(teste, z, 1);
                        i = sentenca1.length + 1;
                        estadoAtual = estadosIniciais[0];
                        tblSaida.setValueAt("Aceitou", z, 2);
	                      teste2 = String.copyValueOf(sentenca2);
	                      teste2 = teste2.substring(0, teste2.length() - 1);
	                      tblSaida.setValueAt(teste2, z, 3);
	                      i = sentenca2.length + 1;
	                      estadoAtual2 = estadosIniciais[0];
                        break;
                    }else{
                        tblSaida.setValueAt("Recusou", z, 0);
                        tblSaida.setValueAt("Erro", z, 1);
                        i = sentenca1.length + 1;
                        estadoAtual = estadosIniciais[0];
                        tblSaida.setValueAt("Recusou", z, 2);
	                      tblSaida.setValueAt("Erro", z, 3);
	                      i = sentenca2.length + 1;
	                      estadoAtual2 = estadosIniciais[0];
                    }
                    
                    
	                  
                }
            }           
        }
    }

    
    public String leituraTblSentencas(int linha, int coluna){
        String sentencas = tblSentecas.getValueAt(linha, coluna).toString();
        return sentencas;
    }
    
    public String leituraTblTransicoes(int linha, int coluna){
        String transicoes = tblTransicoes.getValueAt(linha, coluna).toString();
        
        return transicoes;
    }
    
    private void limpaVariaveis(){
        String estados = "";
        String alfabeto = "";
        String alfabetoCaractereVazio = "";
        String estadoInicial = "";
        String estadoFinal = "";    
        String transicoes = "";
    }
   
        
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DuasFitas().setVisible(true);
            }
        });
    }

    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnMaisLinhaSentencas;
    private javax.swing.JButton btnMaisLinhaTransicoes;
    private javax.swing.JLabel jLabel_alfabeto;
    private javax.swing.JLabel jLabel_estadoFinal;
    private javax.swing.JLabel jLabel_estadoInicial;
    private javax.swing.JLabel jLabel_estados;
    private javax.swing.JLabel jLabel_sentencas;
    private javax.swing.JLabel jLabel_transicoes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private java.awt.Panel panel_principal;
    private javax.swing.JTable tblSaida;
    public javax.swing.JTable tblSentecas;
    private javax.swing.JTable tblTransicoes;
    private javax.swing.JTextField txtAlfabeto;
    private javax.swing.JTextField txtEstadoFinal;
    private javax.swing.JTextField txtEstadoInicial;
    private javax.swing.JTextField txtEstados;
    // End of variables declaration//GEN-END:variables

    void setEnable(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String toString(char txt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
