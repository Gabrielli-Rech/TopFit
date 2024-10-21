/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.AlunoController;
import controller.ControllerFactory;
import javax.swing.JOptionPane;
import model.Aluno;

/**
 *
 * @author 182310018
 */
public class JFNovoCadastro extends javax.swing.JFrame {

    /**
     * Creates new form JFNovoCadastro
     */
    public JFNovoCadastro() {
        initComponents();
    }

    private void limpaCampo() {
        NomeUsuario.setText("");
        NomeInstru.setText("");
        CPFUsuario.setText("");
        CPFInstrutor.setText("");
        CelularUsuario.setText("");
        CelularInstru.setText("");
        EmailUsuario.setText("");
        EmailInstrutor.setText("");
        DataDeNascimentoUsuario.setText("");
        DTNSCInstrutor.setText("");
        InfoMedicasUauario.setText("");
        CREAInstrutor.setText("");
        SenhaUsuario.setText("");
        SenhaInstrutor.setText("");
        FormaDePagamento.clearSelection();

    }

    private boolean validainputs() {
        if (NomeUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "nome");
            NomeUsuario.requestFocus();
            return false;
        }

        if (NomeInstru.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "nome");
            NomeInstru.requestFocus();
            return false;
        }

        if (CPFUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "CPF");
            CPFUsuario.requestFocus();
            return false;
        }

        if (CPFInstrutor.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "CPF");
            CPFInstrutor.requestFocus();
            return false;
        }
        if (CelularUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "CelularUsuario");
            CelularUsuario.requestFocus();;
            return false;
        }
        if (CelularInstru.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Celularinstru");
            CelularInstru.requestFocus();
            return false;
        }
        if (EmailUsuario.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Email");
            EmailUsuario.requestFocus();
            return false;
        }

        //if (!jtfFemininoLadrao.isSelected() && !jtfMasculinoLadrao.isSelected()) {
        //JOptionPane.showMessageDialog(this, "selecionar sexo");
        //return false;
        //}
        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FormaDePagamento = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        CelularUsuario = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        SexoUsuario = new javax.swing.JTextField();
        CPFUsuario = new javax.swing.JTextField();
        NomeUsuario = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        EmailUsuario = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        DataDeNascimentoUsuario = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        InfoMedicasUauario = new javax.swing.JTextField();
        Formadepagamento = new javax.swing.JLabel();
        Pix = new javax.swing.JRadioButton();
        Dinheiro = new javax.swing.JRadioButton();
        Credito = new javax.swing.JRadioButton();
        Debito = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        SenhaUsuario = new javax.swing.JPasswordField();
        Cadastrar = new javax.swing.JButton();
        VoltarLogin = new javax.swing.JButton();
        LimparUsu = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        NomeInstru = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        EnderecoInstru = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CelularInstru = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        EmailInstrutor = new javax.swing.JTextField();
        DTNSCInstrutor = new javax.swing.JTextField();
        CREAInstrutor = new javax.swing.JTextField();
        CPFInstrutor = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        SenhaInstrutor = new javax.swing.JPasswordField();
        CadastrarIns = new javax.swing.JButton();
        VoltarLoginIns = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lohgo.png"))); // NOI18N

        jTabbedPane1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Celular");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Data de nascimento");

        CelularUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CelularUsuarioActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CPF");

        SexoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SexoUsuarioActionPerformed(evt);
            }
        });

        CPFUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPFUsuarioActionPerformed(evt);
            }
        });

        NomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeUsuarioActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Nome Completo");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Email");

        EmailUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailUsuarioActionPerformed(evt);
            }
        });

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Sexo");

        DataDeNascimentoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataDeNascimentoUsuarioActionPerformed(evt);
            }
        });

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Informações medicas");

        InfoMedicasUauario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoMedicasUauarioActionPerformed(evt);
            }
        });

        Formadepagamento.setForeground(new java.awt.Color(255, 255, 255));
        Formadepagamento.setText("Forma de pagamento");

        Pix.setForeground(new java.awt.Color(255, 255, 255));
        Pix.setText("Pix");
        Pix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PixActionPerformed(evt);
            }
        });

        Dinheiro.setForeground(new java.awt.Color(255, 255, 255));
        Dinheiro.setText("Dinheiro");
        Dinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DinheiroActionPerformed(evt);
            }
        });

        Credito.setForeground(new java.awt.Color(255, 255, 255));
        Credito.setText("Cartão de crédito ");
        Credito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreditoActionPerformed(evt);
            }
        });

        Debito.setForeground(new java.awt.Color(255, 255, 255));
        Debito.setText("Cartão de débito");
        Debito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DebitoActionPerformed(evt);
            }
        });

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Senha");

        SenhaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenhaUsuarioActionPerformed(evt);
            }
        });

        Cadastrar.setForeground(new java.awt.Color(255, 255, 255));
        Cadastrar.setText("Cadastrar");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });

        VoltarLogin.setForeground(new java.awt.Color(255, 255, 255));
        VoltarLogin.setText("Voltar");
        VoltarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarLoginActionPerformed(evt);
            }
        });

        LimparUsu.setForeground(new java.awt.Color(255, 255, 255));
        LimparUsu.setText("Limpar");
        LimparUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparUsuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CPFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CelularUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel10)
                                        .addComponent(Formadepagamento))
                                    .addComponent(jLabel17))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(DataDeNascimentoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(36, 36, 36)
                                                .addComponent(jLabel14)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(SexoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(EmailUsuario)
                                            .addComponent(InfoMedicasUauario)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(Pix)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Dinheiro)
                                                .addGap(46, 46, 46)
                                                .addComponent(Credito)
                                                .addGap(34, 34, 34)
                                                .addComponent(Debito))))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel18)
                                                .addGap(27, 27, 27)
                                                .addComponent(SenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(VoltarLogin)
                                                .addGap(37, 37, 37)
                                                .addComponent(LimparUsu)
                                                .addGap(36, 36, 36)
                                                .addComponent(Cadastrar))))))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(NomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CelularUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(CPFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DataDeNascimentoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)
                        .addComponent(SexoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InfoMedicasUauario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pix)
                    .addComponent(Formadepagamento)
                    .addComponent(Dinheiro)
                    .addComponent(Credito)
                    .addComponent(Debito))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(SenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cadastrar)
                    .addComponent(VoltarLogin)
                    .addComponent(LimparUsu))
                .addGap(84, 156, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Aluno", jPanel3);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome Completo");

        NomeInstru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeInstruActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Endereço");

        EnderecoInstru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnderecoInstruActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Celular");

        CelularInstru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CelularInstruActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Data de nascimento");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CREA");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CPF");

        EmailInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailInstrutorActionPerformed(evt);
            }
        });

        DTNSCInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DTNSCInstrutorActionPerformed(evt);
            }
        });

        CREAInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CREAInstrutorActionPerformed(evt);
            }
        });

        CPFInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPFInstrutorActionPerformed(evt);
            }
        });

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Senha");

        SenhaInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenhaInstrutorActionPerformed(evt);
            }
        });

        CadastrarIns.setForeground(new java.awt.Color(255, 255, 255));
        CadastrarIns.setText("Cadastrar");
        CadastrarIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarInsActionPerformed(evt);
            }
        });

        VoltarLoginIns.setForeground(new java.awt.Color(255, 255, 255));
        VoltarLoginIns.setText("Voltar");
        VoltarLoginIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarLoginInsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(CelularInstru, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(DTNSCInstrutor, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                                    .addComponent(EnderecoInstru)
                                    .addComponent(EmailInstrutor)
                                    .addComponent(NomeInstru)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(CREAInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CPFInstrutor))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel19)
                                .addGap(30, 30, 30)
                                .addComponent(SenhaInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(VoltarLoginIns)
                        .addGap(163, 163, 163)
                        .addComponent(CadastrarIns)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NomeInstru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(EnderecoInstru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CelularInstru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(DTNSCInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(EmailInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(CREAInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(CPFInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(SenhaInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VoltarLoginIns)
                    .addComponent(CadastrarIns))
                .addContainerGap(164, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Instrutor", jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeUsuarioActionPerformed

    }//GEN-LAST:event_NomeUsuarioActionPerformed

    private void EmailUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailUsuarioActionPerformed

    }//GEN-LAST:event_EmailUsuarioActionPerformed

    private void InfoMedicasUauarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoMedicasUauarioActionPerformed

    }//GEN-LAST:event_InfoMedicasUauarioActionPerformed

    private void DinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DinheiroActionPerformed

    }//GEN-LAST:event_DinheiroActionPerformed

    private void CreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreditoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreditoActionPerformed

    private void DebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DebitoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DebitoActionPerformed

    private void SenhaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SenhaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SenhaUsuarioActionPerformed

    private void CadastrarInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarInsActionPerformed
        String nome = NomeUsuario.getText();
        String email = EmailUsuario.getText();
        String senha = new String(SenhaUsuario.getPassword());
        String cpf = CPFUsuario.getText();
        String celular = CelularUsuario.getText();
        String Data_de_nascimento = DataDeNascimentoUsuario.getText();
        String Info_medicas = InfoMedicasUauario.getText();
        String Sexo = SexoUsuario.getText();
        int Forma_de_Pagamento = FormaDePagamento.getButtonCount();
        JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!\n"
                + "Nome: " + nome + "\nEmail: " + email + "\nCPF: " + cpf + "\nCelular: " + celular + "senha" 
                + senha + "Data_de_nascimento" + Data_de_nascimento + "Info_medicas"
                + Info_medicas + "sexo" + Sexo + "Forma_de_Pagamento" + Forma_de_Pagamento);

    }//GEN-LAST:event_CadastrarInsActionPerformed

    private void CREAInstrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CREAInstrutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CREAInstrutorActionPerformed

    private void EmailInstrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailInstrutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailInstrutorActionPerformed

    private void EnderecoInstruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnderecoInstruActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnderecoInstruActionPerformed

    private void NomeInstruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeInstruActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeInstruActionPerformed

    private void VoltarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarLoginActionPerformed
        // TODO add your handling code here:
        JFPrincipal janelaP = new JFPrincipal();
        janelaP.setVisible(true);
        janelaP.setDefaultCloseOperation(1);

    }//GEN-LAST:event_VoltarLoginActionPerformed

    private void CPFUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPFUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPFUsuarioActionPerformed

    private void CelularUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CelularUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CelularUsuarioActionPerformed

    private void DataDeNascimentoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataDeNascimentoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataDeNascimentoUsuarioActionPerformed

    private void SexoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SexoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SexoUsuarioActionPerformed

    private void PixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PixActionPerformed

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed

    }//GEN-LAST:event_CadastrarActionPerformed

    private void CelularInstruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CelularInstruActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CelularInstruActionPerformed

    private void DTNSCInstrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DTNSCInstrutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DTNSCInstrutorActionPerformed

    private void CPFInstrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPFInstrutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPFInstrutorActionPerformed

    private void SenhaInstrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SenhaInstrutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SenhaInstrutorActionPerformed

    private void VoltarLoginInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarLoginInsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VoltarLoginInsActionPerformed

    private void LimparUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparUsuActionPerformed
        limpaCampo();
    }//GEN-LAST:event_LimparUsuActionPerformed

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
            java.util.logging.Logger.getLogger(JFNovoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFNovoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFNovoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFNovoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFNovoCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CPFInstrutor;
    private javax.swing.JTextField CPFUsuario;
    private javax.swing.JTextField CREAInstrutor;
    private javax.swing.JButton Cadastrar;
    private javax.swing.JButton CadastrarIns;
    private javax.swing.JTextField CelularInstru;
    private javax.swing.JTextField CelularUsuario;
    private javax.swing.JRadioButton Credito;
    private javax.swing.JTextField DTNSCInstrutor;
    private javax.swing.JTextField DataDeNascimentoUsuario;
    private javax.swing.JRadioButton Debito;
    private javax.swing.JRadioButton Dinheiro;
    private javax.swing.JTextField EmailInstrutor;
    private javax.swing.JTextField EmailUsuario;
    private javax.swing.JTextField EnderecoInstru;
    private javax.swing.ButtonGroup FormaDePagamento;
    private javax.swing.JLabel Formadepagamento;
    private javax.swing.JTextField InfoMedicasUauario;
    private javax.swing.JButton LimparUsu;
    private javax.swing.JTextField NomeInstru;
    private javax.swing.JTextField NomeUsuario;
    private javax.swing.JRadioButton Pix;
    private javax.swing.JPasswordField SenhaInstrutor;
    private javax.swing.JPasswordField SenhaUsuario;
    private javax.swing.JTextField SexoUsuario;
    private javax.swing.JButton VoltarLogin;
    private javax.swing.JButton VoltarLoginIns;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
