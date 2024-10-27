/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.AlunoController;
import controller.ControllerFactory;
import controller.InstrutorController;
import javax.swing.JOptionPane;

/**
 *
 * @author 182310018
 */
public class JFNovoCadastro extends javax.swing.JFrame {

    int idedit;

    /**
     * Creates new form JFNovoCadastro
     */
    public JFNovoCadastro() {
        initComponents();

    }

    private void limpaCampo() {
        // Limpa campos do usuário
        NomeUsuario.setText("");
        CPFUsuario.setText("");
        CelularUsuario.setText("");
        EmailUsuario.setText("");
        DataDeNascimentoUsuario.setText("");
        FormaDePagamento.clearSelection(); // Limpa seleção de forma de pagamento
        SenhaUsuario.setText("");
        InfoMedicasUauario.setText("");
        EnderecoAluno.setText("");
        SexoUsuario.setText("");
        // Limpa campos do instrutor
        NomeInstru.setText("");
        CPFInstrutor.setText("");
        CelularInstru.setText("");
        EmailInstrutor.setText("");
        DTNSCInstrutor.setText("");
        SenhaInstrutor.setText("");
        CREAInstrutor.setText("");
        EnderecoInstru.setText("");
    }

    private boolean validainputs() {
        // Validação de campos do usuário
        if (NomeUsuario.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nome do usuário é obrigatório.");
            NomeUsuario.requestFocus();
            return false;
        }

        if (CPFUsuario.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "CPF do usuário é obrigatório.");
            CPFUsuario.requestFocus();
            return false;
        }

        if (CelularUsuario.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Celular do usuário é obrigatório.");
            CelularUsuario.requestFocus();
            return false;
        }

        if (EmailUsuario.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "E-mail do usuário é obrigatório.");
            EmailUsuario.requestFocus();
            return false;
        }

        if (!Pix.isSelected() && !Dinheiro.isSelected() && !Credito.isSelected() && !Debito.isSelected()) {
            JOptionPane.showMessageDialog(this, "Selecione uma forma de pagamento.");
            return false;
        }

        if (DataDeNascimentoUsuario.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Data de nascimento do usuário é obrigatória.");
            DataDeNascimentoUsuario.requestFocus();
            return false;
        }

        if (SenhaUsuario.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Senha do usuário é obrigatória.");
            SenhaUsuario.requestFocus();
            return false;
        }

        if (InfoMedicasUauario.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informações médicas do usuário são obrigatórias.");
            InfoMedicasUauario.requestFocus();
            return false;
        }

        if (EnderecoAluno.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Endereço do aluno é obrigatório.");
            EnderecoAluno.requestFocus();
            return false;
        }

        // Validação de campos do instrutor
        if (NomeInstru.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nome do instrutor é obrigatório.");
            NomeInstru.requestFocus();
            return false;
        }

        if (CPFInstrutor.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "CPF do instrutor é obrigatório.");
            CPFInstrutor.requestFocus();
            return false;
        }

        if (CelularInstru.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Celular do instrutor é obrigatório.");
            CelularInstru.requestFocus();
            return false;
        }

        if (EmailInstrutor.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "E-mail do instrutor é obrigatório.");
            EmailInstrutor.requestFocus();
            return false;
        }

        if (DTNSCInstrutor.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Data de nascimento do instrutor é obrigatória.");
            DTNSCInstrutor.requestFocus();
            return false;
        }

        if (SenhaInstrutor.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Senha do instrutor é obrigatória.");
            SenhaInstrutor.requestFocus();
            return false;
        }

        if (CREAInstrutor.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "CREA do instrutor é obrigatório.");
            CREAInstrutor.requestFocus();
            return false;
        }

        if (EnderecoInstru.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Endereço do instrutor é obrigatório.");
            EnderecoInstru.requestFocus();
            return false;
        }

        return true; // Todos os campos são válidos
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FormaDePagamento = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Instrutor = new javax.swing.JPanel();
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
        Limpar = new javax.swing.JToggleButton();
        instrutorRadioButton = new javax.swing.JRadioButton();
        Aluno = new javax.swing.JPanel();
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
        jLabel16 = new javax.swing.JLabel();
        Pix = new javax.swing.JRadioButton();
        Dinheiro = new javax.swing.JRadioButton();
        Credito = new javax.swing.JRadioButton();
        Debito = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        SenhaUsuario = new javax.swing.JPasswordField();
        Cadastrar = new javax.swing.JButton();
        VoltarLogin = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
<<<<<<< HEAD
        jLabel20 = new javax.swing.JLabel();
        EnderecoAluno = new javax.swing.JTextField();
        LimparA = new javax.swing.JToggleButton();
        usuarioRadioButton = new javax.swing.JRadioButton();
=======
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
>>>>>>> bb6d8ce7b62a30b9b3393245b3901fe2566dd95c

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lohgo.png"))); // NOI18N

        jTabbedPane1.setBackground(new java.awt.Color(0, 0, 0));

<<<<<<< HEAD
        Instrutor.setBackground(new java.awt.Color(0, 0, 0));
        Instrutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InstrutorMouseClicked(evt);
            }
        });

=======
        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Celular");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Data de nascimento");

        CelularUsuario.setBackground(new java.awt.Color(153, 153, 153));
        CelularUsuario.setForeground(new java.awt.Color(153, 153, 153));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CPF");

        SexoUsuario.setBackground(new java.awt.Color(153, 153, 153));
        SexoUsuario.setForeground(new java.awt.Color(153, 153, 153));

        CPFUsuario.setBackground(new java.awt.Color(153, 153, 153));
        CPFUsuario.setForeground(new java.awt.Color(153, 153, 153));

        NomeUsuario.setBackground(new java.awt.Color(153, 153, 153));
        NomeUsuario.setForeground(new java.awt.Color(153, 153, 153));
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

        EmailUsuario.setBackground(new java.awt.Color(153, 153, 153));
        EmailUsuario.setForeground(new java.awt.Color(153, 153, 153));
        EmailUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailUsuarioActionPerformed(evt);
            }
        });

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Sexo");

        DataDeNascimentoUsuario.setBackground(new java.awt.Color(153, 153, 153));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Informações medicas");

        InfoMedicasUauario.setBackground(new java.awt.Color(153, 153, 153));
        InfoMedicasUauario.setForeground(new java.awt.Color(153, 153, 153));
        InfoMedicasUauario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoMedicasUauarioActionPerformed(evt);
            }
        });

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Forma de pagamento");

        Pix.setForeground(new java.awt.Color(255, 255, 255));
        Pix.setText("Pix");

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

        SenhaUsuario.setBackground(new java.awt.Color(153, 153, 153));
        SenhaUsuario.setForeground(new java.awt.Color(153, 153, 153));
        SenhaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenhaUsuarioActionPerformed(evt);
            }
        });

        Cadastrar.setBackground(new java.awt.Color(0, 0, 0));
        Cadastrar.setForeground(new java.awt.Color(255, 255, 255));
        Cadastrar.setText("Cadastrar");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });

        VoltarLogin.setBackground(new java.awt.Color(0, 0, 0));
        VoltarLogin.setForeground(new java.awt.Color(255, 255, 255));
        VoltarLogin.setText("Voltar");
        VoltarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarLoginActionPerformed(evt);
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
                                        .addComponent(jLabel16))
                                    .addComponent(jLabel17))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                                                .addGap(60, 60, 60)
                                                .addComponent(VoltarLogin)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Cadastrar)
                                                .addGap(135, 135, 135))
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
                                        .addComponent(jLabel18)
                                        .addGap(27, 27, 27)
                                        .addComponent(SenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addComponent(jLabel16)
                            .addComponent(Dinheiro)
                            .addComponent(Credito)
                            .addComponent(Debito))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(SenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cadastrar)
                    .addComponent(VoltarLogin))
                .addContainerGap(156, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Aluno", jPanel3);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

>>>>>>> bb6d8ce7b62a30b9b3393245b3901fe2566dd95c
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome Completo");

        NomeInstru.setBackground(new java.awt.Color(153, 153, 153));
<<<<<<< HEAD
        NomeInstru.setForeground(new java.awt.Color(0, 0, 0));
=======
        NomeInstru.setForeground(new java.awt.Color(153, 153, 153));
>>>>>>> bb6d8ce7b62a30b9b3393245b3901fe2566dd95c
        NomeInstru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeInstruActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Endereço");

        EnderecoInstru.setBackground(new java.awt.Color(153, 153, 153));
<<<<<<< HEAD
        EnderecoInstru.setForeground(new java.awt.Color(0, 0, 0));
=======
        EnderecoInstru.setForeground(new java.awt.Color(153, 153, 153));
>>>>>>> bb6d8ce7b62a30b9b3393245b3901fe2566dd95c
        EnderecoInstru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnderecoInstruActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Celular");

        CelularInstru.setBackground(new java.awt.Color(153, 153, 153));
<<<<<<< HEAD
        CelularInstru.setForeground(new java.awt.Color(0, 0, 0));
=======
        CelularInstru.setForeground(new java.awt.Color(153, 153, 153));
>>>>>>> bb6d8ce7b62a30b9b3393245b3901fe2566dd95c

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Data de nascimento");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CREA");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CPF");

        EmailInstrutor.setBackground(new java.awt.Color(153, 153, 153));
<<<<<<< HEAD
        EmailInstrutor.setForeground(new java.awt.Color(0, 0, 0));
=======
        EmailInstrutor.setForeground(new java.awt.Color(153, 153, 153));
>>>>>>> bb6d8ce7b62a30b9b3393245b3901fe2566dd95c
        EmailInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailInstrutorActionPerformed(evt);
            }
        });

        DTNSCInstrutor.setBackground(new java.awt.Color(153, 153, 153));
<<<<<<< HEAD
        DTNSCInstrutor.setForeground(new java.awt.Color(0, 0, 0));

        CREAInstrutor.setBackground(new java.awt.Color(153, 153, 153));
        CREAInstrutor.setForeground(new java.awt.Color(0, 0, 0));
=======
        DTNSCInstrutor.setForeground(new java.awt.Color(153, 153, 153));

        CREAInstrutor.setBackground(new java.awt.Color(153, 153, 153));
        CREAInstrutor.setForeground(new java.awt.Color(153, 153, 153));
>>>>>>> bb6d8ce7b62a30b9b3393245b3901fe2566dd95c
        CREAInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CREAInstrutorActionPerformed(evt);
            }
        });

        CPFInstrutor.setBackground(new java.awt.Color(153, 153, 153));
<<<<<<< HEAD
        CPFInstrutor.setForeground(new java.awt.Color(0, 0, 0));
=======
        CPFInstrutor.setForeground(new java.awt.Color(153, 153, 153));
>>>>>>> bb6d8ce7b62a30b9b3393245b3901fe2566dd95c

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Senha");

        SenhaInstrutor.setBackground(new java.awt.Color(153, 153, 153));
<<<<<<< HEAD
        SenhaInstrutor.setForeground(new java.awt.Color(0, 0, 0));
=======
        SenhaInstrutor.setForeground(new java.awt.Color(153, 153, 153));
>>>>>>> bb6d8ce7b62a30b9b3393245b3901fe2566dd95c

        CadastrarIns.setBackground(new java.awt.Color(0, 0, 0));
        CadastrarIns.setForeground(new java.awt.Color(255, 255, 255));
        CadastrarIns.setText("Cadastrar");
        CadastrarIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarInsActionPerformed(evt);
            }
        });

        VoltarLoginIns.setBackground(new java.awt.Color(0, 0, 0));
        VoltarLoginIns.setForeground(new java.awt.Color(255, 255, 255));
        VoltarLoginIns.setText("Voltar");
        VoltarLoginIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarLoginInsActionPerformed(evt);
            }
        });

        Limpar.setBackground(new java.awt.Color(0, 0, 0));
        Limpar.setForeground(new java.awt.Color(255, 255, 255));
        Limpar.setText("Limpar");
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });

        instrutorRadioButton.setText("Instrutor");
        instrutorRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instrutorRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InstrutorLayout = new javax.swing.GroupLayout(Instrutor);
        Instrutor.setLayout(InstrutorLayout);
        InstrutorLayout.setHorizontalGroup(
            InstrutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InstrutorLayout.createSequentialGroup()
                .addGroup(InstrutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InstrutorLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(InstrutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGroup(InstrutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InstrutorLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(InstrutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(InstrutorLayout.createSequentialGroup()
                                        .addComponent(CelularInstru, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(DTNSCInstrutor, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                                    .addComponent(EnderecoInstru)
                                    .addComponent(EmailInstrutor)
                                    .addComponent(NomeInstru)
                                    .addGroup(InstrutorLayout.createSequentialGroup()
                                        .addComponent(CREAInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CPFInstrutor))))
                            .addGroup(InstrutorLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel19)
                                .addGap(30, 30, 30)
                                .addComponent(SenhaInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(InstrutorLayout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(VoltarLoginIns)
                        .addGap(163, 163, 163)
                        .addComponent(CadastrarIns)))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InstrutorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(InstrutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InstrutorLayout.createSequentialGroup()
                        .addComponent(Limpar)
                        .addGap(332, 332, 332))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InstrutorLayout.createSequentialGroup()
                        .addComponent(instrutorRadioButton)
                        .addGap(316, 316, 316))))
        );
        InstrutorLayout.setVerticalGroup(
            InstrutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InstrutorLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(instrutorRadioButton)
                .addGap(31, 31, 31)
                .addGroup(InstrutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NomeInstru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(InstrutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(EnderecoInstru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(InstrutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CelularInstru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(DTNSCInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(InstrutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(EmailInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(InstrutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(CREAInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(CPFInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(InstrutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(SenhaInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(InstrutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VoltarLoginIns)
                    .addComponent(CadastrarIns))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Limpar)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Instrutor", Instrutor);

        Aluno.setBackground(new java.awt.Color(0, 0, 0));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Celular");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Data de nascimento");

        CelularUsuario.setBackground(new java.awt.Color(153, 153, 153));
        CelularUsuario.setForeground(new java.awt.Color(0, 0, 0));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CPF");

        SexoUsuario.setBackground(new java.awt.Color(153, 153, 153));
        SexoUsuario.setForeground(new java.awt.Color(0, 0, 0));

        CPFUsuario.setBackground(new java.awt.Color(153, 153, 153));
        CPFUsuario.setForeground(new java.awt.Color(0, 0, 0));

        NomeUsuario.setBackground(new java.awt.Color(153, 153, 153));
        NomeUsuario.setForeground(new java.awt.Color(0, 0, 0));
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

        EmailUsuario.setBackground(new java.awt.Color(153, 153, 153));
        EmailUsuario.setForeground(new java.awt.Color(0, 0, 0));
        EmailUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailUsuarioActionPerformed(evt);
            }
        });

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Sexo");

        DataDeNascimentoUsuario.setBackground(new java.awt.Color(153, 153, 153));
        DataDeNascimentoUsuario.setForeground(new java.awt.Color(0, 0, 0));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Informações medicas");

        InfoMedicasUauario.setBackground(new java.awt.Color(153, 153, 153));
        InfoMedicasUauario.setForeground(new java.awt.Color(0, 0, 0));
        InfoMedicasUauario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoMedicasUauarioActionPerformed(evt);
            }
        });

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Forma de pagamento");

        FormaDePagamento.add(Pix);
        Pix.setForeground(new java.awt.Color(255, 255, 255));
        Pix.setText("Pix");

        FormaDePagamento.add(Dinheiro);
        Dinheiro.setForeground(new java.awt.Color(255, 255, 255));
        Dinheiro.setText("Dinheiro");
        Dinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DinheiroActionPerformed(evt);
            }
        });

        FormaDePagamento.add(Credito);
        Credito.setForeground(new java.awt.Color(255, 255, 255));
        Credito.setText("Cartão de crédito ");
        Credito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreditoActionPerformed(evt);
            }
        });

        FormaDePagamento.add(Debito);
        Debito.setForeground(new java.awt.Color(255, 255, 255));
        Debito.setText("Cartão de débito");
        Debito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DebitoActionPerformed(evt);
            }
        });

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Senha");

        SenhaUsuario.setBackground(new java.awt.Color(153, 153, 153));
        SenhaUsuario.setForeground(new java.awt.Color(0, 0, 0));
        SenhaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenhaUsuarioActionPerformed(evt);
            }
        });

        Cadastrar.setBackground(new java.awt.Color(0, 0, 0));
        Cadastrar.setForeground(new java.awt.Color(255, 255, 255));
        Cadastrar.setText("Cadastrar");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });

        VoltarLogin.setBackground(new java.awt.Color(0, 0, 0));
        VoltarLogin.setForeground(new java.awt.Color(255, 255, 255));
        VoltarLogin.setText("Voltar");
        VoltarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarLoginActionPerformed(evt);
            }
        });

        jLabel20.setText("Endereço");

        EnderecoAluno.setBackground(new java.awt.Color(153, 153, 153));
        EnderecoAluno.setForeground(new java.awt.Color(0, 0, 0));

        LimparA.setBackground(new java.awt.Color(0, 0, 0));
        LimparA.setForeground(new java.awt.Color(255, 255, 255));
        LimparA.setText("Limpar");
        LimparA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparAActionPerformed(evt);
            }
        });

        usuarioRadioButton.setText("Aluno");

        javax.swing.GroupLayout AlunoLayout = new javax.swing.GroupLayout(Aluno);
        Aluno.setLayout(AlunoLayout);
        AlunoLayout.setHorizontalGroup(
            AlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlunoLayout.createSequentialGroup()
                .addGroup(AlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AlunoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(AlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AlunoLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CPFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CelularUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AlunoLayout.createSequentialGroup()
                                .addGroup(AlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(AlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel20))
                                    .addComponent(jLabel17))
                                .addGap(18, 18, 18)
                                .addGroup(AlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(AlunoLayout.createSequentialGroup()
                                        .addComponent(DataDeNascimentoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(SexoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(EmailUsuario)
                                    .addComponent(InfoMedicasUauario)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AlunoLayout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(VoltarLogin)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(LimparA)
                                        .addGap(18, 18, 18)
                                        .addComponent(Cadastrar)
                                        .addGap(135, 135, 135))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AlunoLayout.createSequentialGroup()
                                        .addComponent(Pix)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Dinheiro)
                                        .addGap(46, 46, 46)
                                        .addComponent(Credito)
                                        .addGap(34, 34, 34)
                                        .addComponent(Debito))
                                    .addGroup(AlunoLayout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(jLabel18)
                                        .addGap(27, 27, 27)
                                        .addComponent(SenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(EnderecoAluno)))))
                    .addGroup(AlunoLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(NomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AlunoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(usuarioRadioButton)
                .addGap(350, 350, 350))
        );
        AlunoLayout.setVerticalGroup(
            AlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlunoLayout.createSequentialGroup()
                .addGroup(AlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AlunoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel17))
                    .addGroup(AlunoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(usuarioRadioButton)
                        .addGap(27, 27, 27)
                        .addGroup(AlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(20, 20, 20)
                        .addGroup(AlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CelularUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(CPFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(24, 24, 24)
                        .addGroup(AlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(EnderecoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, Short.MAX_VALUE)
                .addGroup(AlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DataDeNascimentoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)
                        .addComponent(SexoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(AlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InfoMedicasUauario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(30, 30, 30)
                .addGroup(AlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pix)
                    .addComponent(jLabel16)
                    .addComponent(Dinheiro)
                    .addComponent(Credito)
                    .addComponent(Debito))
                .addGap(21, 21, 21)
                .addGroup(AlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(SenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(AlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AlunoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(AlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cadastrar)
                            .addComponent(VoltarLogin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AlunoLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(LimparA)))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Aluno", Aluno);

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
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeUsuarioActionPerformed

    private void EmailUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailUsuarioActionPerformed

    private void InfoMedicasUauarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoMedicasUauarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InfoMedicasUauarioActionPerformed

    private void DinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DinheiroActionPerformed
        // TODO add your handling code here:
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
        if (instrutorRadioButton.isSelected()) {
                    // Cadastro de Instrutor
                    JFNovoCadastro novoInstrutor = new JFNovoCadastro();
                    novoInstrutor.setNome(NomeInstru.getText());
                    novoInstrutor.setCPF(CPFInstrutor.getText());
                    novoInstrutor.setTelefone(CelularInstru.getText());
                    novoInstrutor.setEmail(EmailInstrutor.getText());
                    novoInstrutor.setDataDeNascimento(DTNSCInstrutor.getText());
                    novoInstrutor.setSenha(SenhaInstrutor.getText());
                    novoInstrutor.setCREA(CREAInstrutor.getText());
                    novoInstrutor.setEndereco(EnderecoInstru.getText());

                    // Cadastra o novo instrutor no serviço
                    InstrutorController instrutorServicos = ControllerFactory.getInstrutorController();
                    instrutorServicos.cadastrarInstrutor(novoInstrutor);

                    JOptionPane.showMessageDialog(this, "Cadastro de instrutor salvo com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                }
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
        //setVisible(false);
        //JFPrincipal janelaP = new JFPrincipal();
        //janelaP.setVisible(true);
        //janelaP.setDefaultCloseOperation(1);
    }//GEN-LAST:event_VoltarLoginActionPerformed

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        // Verifica se a ação é "salvar" ou "atualizar"
        if (Cadastrar.getText().equals("Cadastrar")) {
            // Valida os campos antes de salvar
            if (validainputs()) {
                if (usuarioRadioButton.isSelected()) {
                    // Cadastro de Usuário
                    JFNovoCadastro novoUsuario = new JFNovoCadastro();
                    novoUsuario.setNome(NomeUsuario.getText());
                    novoUsuario.setCPF(CPFUsuario.getText());
                    novoUsuario.setTelefone(CelularUsuario.getText());
                    novoUsuario.setEmail(EmailUsuario.getText());
                    novoUsuario.setDataDeNascimento(DataDeNascimentoUsuario.getText());
                    novoUsuario.setSenha(SenhaUsuario.getText());
                    novoUsuario.setInfoMedicas(InfoMedicasUauario.getText());
                    novoUsuario.setEndereco(EnderecoAluno.getText());

                    // Define a forma de pagamento selecionada
                    String formaPagamento = "";
                    if (Pix.isSelected()) {
                        formaPagamento = "Pix";
                    } else if (Dinheiro.isSelected()) {
                        formaPagamento = "Dinheiro";
                    } else if (Credito.isSelected()) {
                        formaPagamento = "Crédito";
                    } else if (Debito.isSelected()) {
                        formaPagamento = "Débito";
                    }
                    novoUsuario.setFormaDePagamento(formaPagamento);

                    // Cadastra o novo usuário no serviço
                    AlunoController AlunoController = ControllerFactory.getAlunoController();
                    AlunoController.cadastrarAluno(novoUsuario);

                    JOptionPane.showMessageDialog(this, "Cadastro de usuário salvo com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

                } 
            }
        }
    }//GEN-LAST:event_CadastrarActionPerformed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        limpaCampo();
    }//GEN-LAST:event_LimparActionPerformed

    private void LimparAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparAActionPerformed
        limpaCampo();
    }//GEN-LAST:event_LimparAActionPerformed

    private void InstrutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InstrutorMouseClicked

    }//GEN-LAST:event_InstrutorMouseClicked

    private void instrutorRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instrutorRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_instrutorRadioButtonActionPerformed

    private void VoltarLoginInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarLoginInsActionPerformed
        setVisible(false);
        JFPrincipal janelaP = new JFPrincipal();
        janelaP.setVisible(true);
        janelaP.setDefaultCloseOperation(1);
    }//GEN-LAST:event_VoltarLoginInsActionPerformed

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
    private javax.swing.JPanel Aluno;
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
    private javax.swing.JTextField EnderecoAluno;
    private javax.swing.JTextField EnderecoInstru;
    private javax.swing.ButtonGroup FormaDePagamento;
    private javax.swing.JTextField InfoMedicasUauario;
    private javax.swing.JPanel Instrutor;
    private javax.swing.JToggleButton Limpar;
    private javax.swing.JToggleButton LimparA;
    private javax.swing.JTextField NomeInstru;
    private javax.swing.JTextField NomeUsuario;
    private javax.swing.JRadioButton Pix;
    private javax.swing.JPasswordField SenhaInstrutor;
    private javax.swing.JPasswordField SenhaUsuario;
    private javax.swing.JTextField SexoUsuario;
    private javax.swing.JButton VoltarLogin;
    private javax.swing.JButton VoltarLoginIns;
    private javax.swing.Box.Filler filler1;
<<<<<<< HEAD
    private javax.swing.JRadioButton instrutorRadioButton;
=======
>>>>>>> bb6d8ce7b62a30b9b3393245b3901fe2566dd95c
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton usuarioRadioButton;
    // End of variables declaration//GEN-END:variables

    private void setNome(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setCPF(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setTelefone(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setEmail(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setSenha(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setDataDeNascimento(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setInfoMedicas(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setEndereco(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setFormaDePagamento(String formaPagamento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setCREA(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNome() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getEndereco() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getTelefone() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getData_De_Nascimento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getEmail() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getInfo_Medicas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getCPF() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getSexo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getMatricula() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getSenha() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getCertificadoInstrutor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
