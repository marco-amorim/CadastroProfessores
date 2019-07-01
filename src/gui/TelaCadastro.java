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
	private JComboBox<String> comboBoxTitulo;
	private JComboBox<String> comboBoxContrato;
	private JButton btnCadastrar;
	private JButton btnFinalizar;
	private JButton btnConsulta;

	public TelaCadastro() {
		setTitle("Cadastro de Professores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCadastroDeProfessores = new JLabel("CADASTRO DE PROFESSORES");
		lblCadastroDeProfessores.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCadastroDeProfessores.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroDeProfessores.setBounds(0, 11, 586, 50);
		contentPane.add(lblCadastroDeProfessores);

		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblNome.setBounds(10, 100, 48, 14);
		contentPane.add(lblNome);

		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblIdade.setBounds(10, 150, 83, 25);
		contentPane.add(lblIdade);

		JLabel lblMatricula = new JLabel("Matricula:");
		lblMatricula.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblMatricula.setBounds(10, 200, 100, 25);
		contentPane.add(lblMatricula);

		JLabel lblTitulo = new JLabel("Titulo:");
		lblTitulo.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblTitulo.setBounds(10, 250, 100, 28);
		contentPane.add(lblTitulo);

		JLabel lblTipoDeContrato = new JLabel("Tipo de Contrato:");
		lblTipoDeContrato.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblTipoDeContrato.setBounds(10, 300, 122, 28);
		contentPane.add(lblTipoDeContrato);

		txtNome = new JTextField();
		txtNome.setBounds(150, 100, 100, 25);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		txtIdade = new JTextField();
		txtIdade.setBounds(150, 150, 100, 25);
		contentPane.add(txtIdade);
		txtIdade.setColumns(10);

		txtMatricula = new JTextField();
		txtMatricula.setBounds(150, 200, 100, 25);
		contentPane.add(txtMatricula);
		txtMatricula.setColumns(10);

		comboBoxTitulo = new JComboBox<String>();
		comboBoxTitulo.addItem("Doutor");
		comboBoxTitulo.addItem("Especialista");
		comboBoxTitulo.addItem("Mestre");
		comboBoxTitulo.setBounds(150, 250, 100, 25);
		contentPane.add(comboBoxTitulo);

		comboBoxContrato = new JComboBox<String>();
		comboBoxContrato.addItem("Integral");
		comboBoxContrato.addItem("Horista");
		comboBoxContrato.setBounds(150, 300, 100, 25);
		contentPane.add(comboBoxContrato);

		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(450, 250, 100, 30);
		contentPane.add(btnCadastrar);

		btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnFinalizar.setBounds(450, 350, 100, 30);
		contentPane.add(btnFinalizar);

		btnConsulta = new JButton("Consulta");
		btnConsulta.setBounds(450, 300, 100, 30);
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
