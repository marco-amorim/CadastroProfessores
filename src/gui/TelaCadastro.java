package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class TelaCadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtIdade;
	private JTextField txtMatricula;
	private JComboBox comboBoxTitulo;
	private JComboBox comboBoxContrato;
	private JButton btnCadastrar;
	private JButton btnFinalizar;
	private JButton btnConsulta;

	public TelaCadastro() {
		setTitle("Cadastro de Professores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCadastroDeProfessores = new JLabel("CADASTRO DE PROFESSORES");
		lblCadastroDeProfessores.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCadastroDeProfessores.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroDeProfessores.setBounds(0, 11, 434, 39);
		contentPane.add(lblCadastroDeProfessores);

		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setBounds(10, 61, 48, 14);
		contentPane.add(lblNome);

		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setBounds(10, 101, 48, 14);
		contentPane.add(lblIdade);

		JLabel lblMatricula = new JLabel("Matricula:");
		lblMatricula.setBounds(10, 138, 74, 14);
		contentPane.add(lblMatricula);

		JLabel lblTitulo = new JLabel("Titulo:");
		lblTitulo.setBounds(10, 173, 48, 14);
		contentPane.add(lblTitulo);

		JLabel lblTipoDeContrato = new JLabel("Tipo de Contrato:");
		lblTipoDeContrato.setBounds(10, 208, 103, 14);
		contentPane.add(lblTipoDeContrato);

		txtNome = new JTextField();
		txtNome.setBounds(121, 61, 96, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		txtIdade = new JTextField();
		txtIdade.setBounds(121, 98, 96, 20);
		contentPane.add(txtIdade);
		txtIdade.setColumns(10);

		txtMatricula = new JTextField();
		txtMatricula.setBounds(121, 135, 96, 20);
		contentPane.add(txtMatricula);
		txtMatricula.setColumns(10);

		comboBoxTitulo = new JComboBox();
		comboBoxTitulo.addItem("Doutor");
		comboBoxTitulo.addItem("Especialista");
		comboBoxTitulo.addItem("Mestre");
		comboBoxTitulo.setBounds(121, 167, 96, 26);
		contentPane.add(comboBoxTitulo);

		comboBoxContrato = new JComboBox();
		comboBoxContrato.addItem("Integral");
		comboBoxContrato.addItem("Horista");
		comboBoxContrato.setBounds(121, 202, 96, 26);
		contentPane.add(comboBoxContrato);

		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(325, 152, 103, 23);
		contentPane.add(btnCadastrar);

		btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnFinalizar.setBounds(325, 227, 103, 28);
		contentPane.add(btnFinalizar);

		btnConsulta = new JButton("Consulta");
		btnConsulta.setBounds(324, 187, 104, 28);
		contentPane.add(btnConsulta);
		

	}

	public String getTxtNome() {
		return txtNome.getText();
	}

	public String getTxtIdade() {
		return txtIdade.getText();
	}

	public String getTxtMatricula() {
		return txtMatricula.getText();
	}

	public String getComboBoxTitulo() {
		return comboBoxTitulo.getSelectedItem().toString();
	}

	public String getComboBoxContrato() {
		return comboBoxContrato.getSelectedItem().toString();
	}

	public JButton getBtnCadastrar() {
		return btnCadastrar;
	}

	public JButton getBtnFinalizar() {
		return btnFinalizar;
	}

	public JButton getBtnConsulta() {
		return btnConsulta;
	}

	
}
