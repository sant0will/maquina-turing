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

public class viewPrincipal extends javax.swing.JFrame {
    
    String[] estados;
    String[] alfabeto;
    String[] alfabetoCaractereVazio;
    String[] estadosIniciais;
    String[] estadosFinais;
    char[] sentenca;
    char[] sentencab;
    String estadoAtual;
    String teste;

    public viewPrincipal() {
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
        txtAlfabeto = new javax.swing.JTextField();
        txtEstadoInicial = new javax.swing.JTextField();
        txtEstadoFinal = new javax.swing.JTextField();
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
                {"","","","",""}/*,
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""}*/
            },
            new String [] {
                "Estado atual", "Caractere de leitura", "Estado futuro", "Caractere de escrita", "Movimento do cabeçote"
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
                {""}
            },
            new String [] {
                "Sentencas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
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
                {null, null}
            },
            new String [] {
                "Resultado", "Saida"
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
                btnIniciar.setText("Iniciar fita");
                btnIniciar.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnIniciarActionPerformed(evt);
                    }
                });
        
        JButton btnniciar2Fitas = new JButton();
        btnniciar2Fitas.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		estados = tratador(txtEstados.getText());
                alfabeto = tratador(txtAlfabeto.getText());
                estadosIniciais = tratador(txtEstadoInicial.getText());
                estadosFinais = tratador(txtEstadoFinal.getText());
                
                if(!estadosIniciais[0].isEmpty() && !estadosFinais[0].isEmpty() && !estados[0].isEmpty() && !alfabeto[0].isEmpty()) {
                	teste_duas_fitas_sentenca();
                }else {
                	JOptionPane.showMessageDialog(null, "Adicione as informações do formulário e a tabela de transições");
                }                
        	}
        });
        btnniciar2Fitas.setText("Iniciar duas fitas");
        btnniciar2Fitas.setFont(new Font("Dialog", Font.BOLD, 11));
        btnniciar2Fitas.setBackground(Color.LIGHT_GRAY);

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
        					.addComponent(btnniciar2Fitas, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
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
        				.addComponent(btnniciar2Fitas, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
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
        new viewPrincipal().setVisible(true);
    }//GEN-LAST:event_btnLimparActionPerformed

    public void completaCampos(){
        String eEstados = "";
        String aAlfabeto = "";
        String aAlfabetoCar = "";
        for(int i = 0; i < tblTransicoes.getRowCount(); i++){
            if(!eEstados.contains(leituraTblTransicoes(i,0))) eEstados += leituraTblTransicoes(i,0)+",";
            if(!eEstados.contains(leituraTblTransicoes(i,2))) eEstados += leituraTblTransicoes(i,2)+",";
            
            if(!aAlfabeto.contains(leituraTblTransicoes(i,1)) && !"#".equals(leituraTblTransicoes(i,1))) aAlfabeto += leituraTblTransicoes(i,1)+",";
            if(!aAlfabeto.contains(leituraTblTransicoes(i,3)) && !"#".equals(leituraTblTransicoes(i,3))) aAlfabeto += leituraTblTransicoes(i,3)+",";
            
            if(!aAlfabetoCar.contains(leituraTblTransicoes(i,1))) aAlfabetoCar += leituraTblTransicoes(i,1)+",";
            if(!aAlfabetoCar.contains(leituraTblTransicoes(i,3))) aAlfabetoCar += leituraTblTransicoes(i,3)+",";
        }
        eEstados = eEstados.substring(0, eEstados.length());
        aAlfabeto = aAlfabeto.substring(0, aAlfabeto.length() - 1);
        aAlfabetoCar = aAlfabetoCar.substring(0, aAlfabetoCar.length() - 1);
        txtEstados.setText(eEstados);
        txtAlfabeto.setText(aAlfabeto);
    }
    
    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        estados = tratador(txtEstados.getText());
        alfabeto = tratador(txtAlfabeto.getText());
        estadosIniciais = tratador(txtEstadoInicial.getText());
        estadosFinais = tratador(txtEstadoFinal.getText());
        
        if(!estadosIniciais[0].isEmpty() && !estadosFinais[0].isEmpty() && !estados[0].isEmpty() && !alfabeto[0].isEmpty()) {
        	teste_sentenca();
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
    
    public void teste_sentenca(){     
    	
        estadoAtual = estadosIniciais[0];
        
        for(int z = 0; z < tblSentecas.getRowCount(); z++){
            String aux = leituraTblSentencas(z);
            aux += "#";
            sentenca = aux.toCharArray();
            int i = 0;
            while(i < sentenca.length){
                boolean flag = false;
                for(int j = 0; j <= tblTransicoes.getRowCount(); j++){
                    if(j == tblTransicoes.getRowCount()) break;        
                    
                    if(estadoAtual.equals(leituraTblTransicoes(j,0)) && leituraTblTransicoes(j, 1).equals(Character.toString(sentenca[i]))){
                        flag = true;
                        estadoAtual = leituraTblTransicoes(j, 2);
                        String aux2 = leituraTblTransicoes(j, 3);
                        
                        if(!aux2.contains("#")){
                            sentenca[i] = aux2.charAt(0);
                        }
                        
                        switch (leituraTblTransicoes(j, 4)) {
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
                        if(estadoFinal.equals(estadoAtual)) {
                            ef = true;
                            break;
                        }
                    }
                    if(ef){
                        tblSaida.setValueAt("Aceitou", z, 0);
                        teste = String.copyValueOf(sentenca);
                        teste = teste.substring(0, teste.length() - 1);
                        tblSaida.setValueAt(teste, z, 1);
                        i = sentenca.length + 1;
                        estadoAtual = estadoAtual = estadosIniciais[0];
                    }else{
                        tblSaida.setValueAt("Recusou", z, 0);
                        i = sentenca.length + 1;
                        estadoAtual = estadoAtual = estadosIniciais[0];
                    }
                }
            }
        }
    }
    
public void teste_duas_fitas_sentenca(){    
		//Teste com duas fitas
    	
        estadoAtual = estadosIniciais[0];
        
        for(int z = 0; z < tblSentecas.getRowCount(); z += 2){
        	if(tblSentecas.getRowCount() % 2 == 0) {
                String aux = leituraTblSentencas(z);
                String auxb = leituraTblSentencas(z+1);
                aux += "#";
                auxb += "#";
                sentenca = aux.toCharArray();
                sentencab = auxb.toCharArray();
                transicoes(sentenca, z);
                transicoes(sentencab, (z+1));
        	}else {
        		JOptionPane.showMessageDialog(btnIniciar, "Entradas apenas em pares, adicione mais uma sentença!");    
        		break;
        	}
            
        }
    }

	public void transicoes(char[] sentenca, int z) {
		System.out.println(z);
		int i = 0;
        while(i < sentenca.length){
            boolean flag = false;
            for(int j = 0; j <= tblTransicoes.getRowCount(); j++){
                if(j == tblTransicoes.getRowCount()) break;        
                
                if(estadoAtual.equals(leituraTblTransicoes(j,0)) && leituraTblTransicoes(j, 1).equals(Character.toString(sentenca[i]))){
                    flag = true;
                    estadoAtual = leituraTblTransicoes(j, 2);
                    String aux2 = leituraTblTransicoes(j, 3);
                    
                    if(!aux2.contains("#")){
                        sentenca[i] = aux2.charAt(0);
                    }
                    
                    switch (leituraTblTransicoes(j, 4)) {
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
                    if(estadoFinal.equals(estadoAtual)) {
                        ef = true;
                        break;
                    }
                }
                if(ef){
                    tblSaida.setValueAt("Aceitou", z, 0);
                    teste = String.copyValueOf(sentenca);
                    teste = teste.substring(0, teste.length() - 1);
                    tblSaida.setValueAt(teste, z, 1);
                    i = sentenca.length + 1;
                    estadoAtual = estadoAtual = estadosIniciais[0];
                }else{
                    tblSaida.setValueAt("Recusou", z, 0);
                    i = sentenca.length + 1;
                    estadoAtual = estadoAtual = estadosIniciais[0];
                }
            }
        }
	}
    
    public String leituraTblSentencas(int linha){
        String sentencas = tblSentecas.getValueAt(linha, 0).toString();
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
    
//    private boolean testaConteudoTabela(){
//        boolean teste = true;
//        for(int i = 0; i < tblTransicoes.getRowCount(); i++){
//            for(int j = 0; j < tblTransicoes.getColumnCount(); j++){
//                if(tblTransicoes.getValueAt(i,j) == ""){
//                    teste = false;
//                    break;
//                }
//            }
//        }
//        return teste;
//    }
   
        
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewPrincipal().setVisible(true);
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
