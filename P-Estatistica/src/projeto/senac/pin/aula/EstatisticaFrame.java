package projeto.senac.pin.aula;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class EstatisticaFrame extends javax.swing.JFrame {

    /**
     * Criando um novo Formulario 
     */
    public EstatisticaFrame() {
        initComponents();
        
    }
    /*
     * Conexao Com Banco de Dados
     */
    private Connection con;
	public void Dao() {
		this.con = new BancoDeDados().getConnection();
	}
    
    @SuppressWarnings("unchecked")
    /*Informa ao compilador que o programador acredita que 
    o codigo é seguro e não causará execeções inesperadas*/
    
    private void initComponents() {
    	setExtendedState(NORMAL);

        jPanel1 = new javax.swing.JPanel();
        cabecalhoPanel = new javax.swing.JPanel();
        cabecalhoLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        numeroLabel = new javax.swing.JLabel();
        numeroTextField = new javax.swing.JTextField();
        adicionarButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        numerosJList = new javax.swing.JList<>();
        limparButton = new javax.swing.JButton();
        excluirButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        graficoPanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        graficoLinhaButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        numeroLabel1 = new javax.swing.JLabel();
        mediaTextField = new javax.swing.JTextField();
        frequenciaTextField = new javax.swing.JTextField();
        numeroLabel2 = new javax.swing.JLabel();
        medianaTextField = new javax.swing.JTextField();
        numeroLabel3 = new javax.swing.JLabel();
        modaTextField = new javax.swing.JTextField();
        numeroLabel4 = new javax.swing.JLabel();
        salvarTextField = new javax.swing.JTextField();
        salvarButton = new javax.swing.JButton();
        numeroLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projeto Integrador Modulo 2");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
       
            }
        });

        jPanel1.setBackground(new java.awt.Color(189, 195, 199));
        
        
        cabecalhoPanel.setBackground(new java.awt.Color(52,152,219));

        cabecalhoLabel.setFont(new java.awt.Font("Calibri", 1, 20)); 
        cabecalhoLabel.setForeground(new java.awt.Color(255, 255, 255));
        cabecalhoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource(""))); 
        cabecalhoLabel.setText("Estatística");
        cabecalhoLabel.setToolTipText("");
        cabecalhoLabel.setIconTextGap(10);
     
		
        graficoLinhaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/senac/pin/icones/line-48.png"))); 
        graficoLinhaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graficoLinhaButtonActionPerformed(evt);
            }
        });
        
        javax.swing.GroupLayout cabecalhoPanelLayout = new javax.swing.GroupLayout(cabecalhoPanel);
        cabecalhoPanel.setLayout(cabecalhoPanelLayout);
        cabecalhoPanelLayout.setHorizontalGroup(
            cabecalhoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabecalhoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cabecalhoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(graficoLinhaButton, javax.swing.GroupLayout.PREFERRED_SIZE,78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18,18,18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cabecalhoPanelLayout.setVerticalGroup(
            cabecalhoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabecalhoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cabecalhoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addComponent(graficoLinhaButton, javax.swing.GroupLayout.DEFAULT_SIZE,78, Short.MAX_VALUE)
                .addContainerGap())
        );

        /*
         * JTextField JListdados recebe os dados a serem informados
         */
        jPanel3.setBackground(new java.awt.Color(236, 240, 241));
  
        numeroLabel.setLabelFor(numeroTextField);
        numeroLabel.setText("Informe os valores dos dados de Evasão");
        numeroTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        numeroTextField.addKeyListener(new java.awt.event.KeyAdapter() {
           public void keyPressed(java.awt.event.KeyEvent evt) {
        	   numeroTextFieldKeyPressed(evt);
        	   
            }
        });
        

        adicionarButton.setBackground(new java.awt.Color(46, 204, 113));
        adicionarButton.setFont(new java.awt.Font("Tahoma", 0, 14));
        adicionarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/senac/pin/icones/plus-4-16.png")));
        adicionarButton.setText("Adicionar");
        adicionarButton.setIconTextGap(10);
        adicionarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	 adicionarButtonActionPerformed(evt);
            }
        });
        
        numerosJList.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        numerosJList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        numerosJList.setToolTipText("");
        jScrollPane1.setViewportView(numerosJList);
        
        limparButton.setBackground(new java.awt.Color(231, 76, 60));
        limparButton.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        limparButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/senac/pin/icones/erase-16.png")));
        limparButton.setText("Limpar");
        limparButton.setIconTextGap(10);
        limparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparButtonActionPerformed(evt);
            }
        });
        
        excluirButton.setBackground(new java.awt.Color(231, 76, 60));
        excluirButton.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        excluirButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/senac/pin/icones/x-mark-3-16.png"))); 
        excluirButton.setText("Excluir");
        excluirButton.setIconTextGap(10);
        excluirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               excluirButtonActionPerformed(evt);
            }
        });
        
        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(numeroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(adicionarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(numeroLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(excluirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(limparButton, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(numeroLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(adicionarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(numeroTextField))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(limparButton, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                        .addComponent(excluirButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        /*
         * Painel Grafico
         */
        jPanel2.setBackground(new java.awt.Color(236, 240, 241));
        graficoPanel.setBackground(new java.awt.Color(245, 255, 255));

        javax.swing.GroupLayout graficoPanelLayout = new javax.swing.GroupLayout(graficoPanel);
        graficoPanel.setLayout(graficoPanelLayout);
        graficoPanelLayout.setHorizontalGroup(
            graficoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 652, Short.MAX_VALUE)
        );
        graficoPanelLayout.setVerticalGroup(
            graficoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(graficoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(graficoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        
        
       // jPanel4.setBackground(new java.awt.Color(236, 240, 241));
       
        
        
        /*
         * Container
         */
        jPanel5.setBackground(new java.awt.Color(189, 195, 199));

        numeroLabel1.setText("Média");

        mediaTextField.setEditable(false);
        mediaTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mediaTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mediaTextField.setText("0,00");
        mediaTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        frequenciaTextField.setEditable(false);
        frequenciaTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        frequenciaTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        frequenciaTextField.setText("0,00");
        frequenciaTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        numeroLabel2.setText("Frequência");

        medianaTextField.setEditable(false);
        medianaTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        medianaTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        medianaTextField.setText("0,00");
        medianaTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        numeroLabel3.setText("Mediana");

        modaTextField.setEditable(false);
        modaTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        modaTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        modaTextField.setText("0,00");
        modaTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        numeroLabel4.setText("Moda");

        salvarTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        salvarButton.setBackground(new java.awt.Color(52, 152, 219));
        salvarButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        salvarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/senac/pin/icones/save-16.png"))); // NOI18N
        salvarButton.setText("Salvar");
        salvarButton.setIconTextGap(10);
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
            }
        });

        numeroLabel5.setText("Salvar gráfico como");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numeroLabel1)
                    .addComponent(mediaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numeroLabel2)
                    .addComponent(frequenciaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numeroLabel3)
                    .addComponent(medianaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(numeroLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(salvarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(salvarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numeroLabel4)
                            .addComponent(numeroLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(salvarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(modaTextField)
                            .addComponent(salvarTextField, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(numeroLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(medianaTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(numeroLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(frequenciaTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(numeroLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mediaTextField)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cabecalhoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    )
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(cabecalhoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
               
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }

    //CODE<Numeros> responsavel por receber os valores estatisticos
    	@SuppressWarnings({ "unused", "unchecked" })
		private void adicionarButtonActionPerformed(java.awt.event.ActionEvent evt) {

        String texto = numeroTextField.getText().replace(",", ".").trim();
        if (texto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Número inválido", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            Double numero = Double.parseDouble(texto);
            modelo.addElement(numero);
        } catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(this, "Número inválido", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        numerosJList.setModel(modelo);
        numeroTextField.setText("");

        numeroTextField.requestFocus();
        calcularMedia();
        calcularFrequencia();
        calcularMediana();
        calcularModa();
    }

    @SuppressWarnings("unused")
	private void numeroTextFieldKeyPressed(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            adicionarButton.doClick();
        }
    }

    @SuppressWarnings("unused")
	private void limparButtonActionPerformed(java.awt.event.ActionEvent evt) {
        modelo.clear();
        numerosJList.setModel(modelo);

        numeroTextField.requestFocus();
        calcularMedia();
        calcularFrequencia();
        calcularMediana();
        calcularModa();
    }

    private void excluirButtonActionPerformed(java.awt.event.ActionEvent evt) {
        int indiceDoNumeroSelecionado = numerosJList.getSelectedIndex();
        if (indiceDoNumeroSelecionado == -1) {
            return;
        }

        modelo.remove(indiceDoNumeroSelecionado);
        numerosJList.setModel(modelo);

        numeroTextField.requestFocus();
        calcularMedia();
        calcularFrequencia();
        calcularMediana();
        calcularModa();
    }

    @SuppressWarnings("unused")
	private void formWindowOpened(java.awt.event.WindowEvent evt) {
        numeroTextField.requestFocus();
    }//CODE<Numeros>
    
    //CODE<Salvar>
    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {

        String nomeDoArquivo = String.format("%s.png", salvarTextField.getText());

        ChartRenderingInfo info = new ChartRenderingInfo(new StandardEntityCollection());
        

    }//CODE<Salvar>

    //CODE<GraficoLinhas>
    private void graficoLinhaButtonActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultCategoryDataset dados = new DefaultCategoryDataset();

        for (int i = 0; i < modelo.size(); i++) {
            double numero = Double.parseDouble(String.valueOf(modelo.get(i)));
            dados.addValue(numero, "GRAFICO" ,""+(i+1));
            
        }

        JFreeChart graficoLinha = ChartFactory.createLineChart(
                "Números", "Índice",
                "Valores",
                dados, PlotOrientation.VERTICAL,
                true, true, false);

        ChartPanel painel = new ChartPanel(graficoLinha);
        painel.setPreferredSize(new java.awt.Dimension(graficoPanel.getWidth(), graficoPanel.getHeight()));
        
        graficoPanel.setLayout(new BorderLayout());
        graficoPanel.add(painel, BorderLayout.CENTER);
        graficoPanel.validate();

    }//CODE<GraficoLinhas>

    private void calcularMedia() {
        if (modelo.size() == 0) {
            mediaTextField.setText("0,00");
            return;
        }

        double soma = 0.0;
        for (int i = 0; i < modelo.size(); i++) {
            soma += Double.parseDouble(String.valueOf(modelo.get(i)));
        }

        double media = soma / (double) modelo.size();
        mediaTextField.setText(String.format("%.2f", media));
    }
   
    //CODE<Frequencia>
    	private void calcularFrequencia() {

        if (modelo.size() == 0) {
            frequenciaTextField.setText("0,00");
            return;
        }
    	
        // Calcular a média 
        List<Double> numeros = new ArrayList<>();

        double soma = 0.0;
        for (int i = 0; i < modelo.size(); i++) {
            numeros.add(Double.parseDouble(String.valueOf(modelo.get(i))));
            soma += numeros.get(i);
        }

        double media = soma / (double) modelo.size();

        // Calcular o desvio padrao
        double frequencia = 0;
        for (int i = 0; i < numeros.size(); i++) {
            double aux = numeros.get(i) - media;
            frequencia += aux * aux;
        }

        frequencia = Math.sqrt(frequencia / (double) (numeros.size() - 1));
        frequenciaTextField.setText(String.format("%.2f", frequencia));
    }//CODE<DesvioPadrão> 

    private void calcularMediana() {

        if (modelo.size() == 0) {
            medianaTextField.setText("0,00");
            return;
        }

        List<Double> numeros = new ArrayList<>();
        for (int i = 0; i < modelo.size(); i++) {
            numeros.add(Double.parseDouble(String.valueOf(modelo.get(i))));
        }

        Collections.sort(numeros);

        int resto = numeros.size() % 2;
        double mediana = 0.0;

        if (resto == 1) {
            mediana = numeros.get(((numeros.size() + 1) / 2) - 1);
        } else {
            int meio = numeros.size() / 2;
            mediana = (numeros.get(meio - 1) + numeros.get(meio)) / 2;
        }

        medianaTextField.setText(String.format("%.2f", mediana));
    }

    private void calcularModa() {
        HashMap map = new HashMap();

        Double moda = 0.0;

        Integer numAtual, numMaior = 0;

        List<Double> numeros = new ArrayList<>();
        for (int i = 0; i < modelo.size(); i++) {
            numeros.add(Double.parseDouble(String.valueOf(modelo.get(i))));
        }
        Collections.sort(numeros);

        for (int count = 0; count < numeros.size(); count++) {

            Integer i = (Integer) map.get(new Double(numeros.get(count)));

            if (i == null) {
                map.put(new Double(numeros.get(count)), new Integer(1));
            } else {
                map.put(new Double(numeros.get(count)), new Integer(i.intValue() + 1));
                numAtual = i.intValue() + 1;

                if (numAtual > numMaior) {
                    numMaior = numAtual;
                    moda = new Double(numeros.get(count));
                }
            }
        }

        modaTextField.setText(String.format("%.2f", moda));
    }

    public static void main(String args[]) {
    	LeiaCVS obj = new LeiaCVS();
        obj.run();
    	
		try {
	        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	            if ("Nimbus".equals(info.getName())) {
	                javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                break;
	
	            }
	        }
	    } catch (ClassNotFoundException ex) {
	        java.util.logging.Logger.getLogger(EstatisticaFrame.class
	                .getName()).log(java.util.logging.Level.SEVERE, null, ex);
	
	    } catch (InstantiationException ex) {
	        java.util.logging.Logger.getLogger(EstatisticaFrame.class
	                .getName()).log(java.util.logging.Level.SEVERE, null, ex);
	
	    } catch (IllegalAccessException ex) {
	        java.util.logging.Logger.getLogger(EstatisticaFrame.class
	                .getName()).log(java.util.logging.Level.SEVERE, null, ex);
	
	    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	        java.util.logging.Logger.getLogger(EstatisticaFrame.class
	                .getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    }
	    //</editor-fold>
	
	    /* Create and display the form */
	    java.awt.EventQueue.invokeLater(new Runnable() {
	        public void run() {
	            new EstatisticaFrame().setVisible(true);
	        }
	    });

    }
    
	@SuppressWarnings("rawtypes")
	private DefaultListModel modelo = new DefaultListModel();

    //CODE<Declaração de Variaveis>
    private javax.swing.JButton adicionarButton;
    private javax.swing.JLabel cabecalhoLabel;
    private javax.swing.JPanel cabecalhoPanel;
    private javax.swing.JTextField frequenciaTextField;
    private javax.swing.JButton excluirButton;
    private javax.swing.JButton graficoLinhaButton;
    private javax.swing.JPanel graficoPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limparButton;
    private javax.swing.JTextField mediaTextField;
    private javax.swing.JTextField medianaTextField;
    private javax.swing.JTextField modaTextField;
    private javax.swing.JLabel numeroLabel;
    private javax.swing.JLabel numeroLabel1;
    private javax.swing.JLabel numeroLabel2;
    private javax.swing.JLabel numeroLabel3;
    private javax.swing.JLabel numeroLabel4;
    private javax.swing.JLabel numeroLabel5;
    private javax.swing.JTextField numeroTextField;
    private javax.swing.JList<String> numerosJList;
    private javax.swing.JButton salvarButton;
    private javax.swing.JTextField salvarTextField;
    
}
