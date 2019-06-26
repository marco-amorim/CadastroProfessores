package gui;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class TelaConsulta extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private JLabel labelPrcntIntegral;
	private JLabel labelPrcntHorista;
	private JLabel labelPrcntDoutor;
	private JLabel labelPrcntMestre;
	private JLabel labelPrcntEspecialista;
	
	private JButton btnVoltar;

	public TelaConsulta() {
		setTitle("Porcentagens");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblPorcentagens = new JLabel("PORCENTAGENS");
		lblPorcentagens.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPorcentagens.setHorizontalAlignment(SwingConstants.CENTER);
		lblPorcentagens.setBounds(0, 11, 434, 29);
		contentPane.add(lblPorcentagens);

		JLabel lblPorcentagemDeIntegrais = new JLabel("Porcentagem de Integrais:");
		lblPorcentagemDeIntegrais.setBounds(10, 70, 200, 14);
		contentPane.add(lblPorcentagemDeIntegrais);

		JLabel lblPorcentagemDeHoristas = new JLabel("Porcentagem de Horistas:");
		lblPorcentagemDeHoristas.setBounds(10, 100, 200, 14);
		contentPane.add(lblPorcentagemDeHoristas);

		JLabel lblPorcentagemDeDoutores = new JLabel("Porcentagem de Doutores:");
		lblPorcentagemDeDoutores.setBounds(10, 130, 186, 14);
		contentPane.add(lblPorcentagemDeDoutores);

		JLabel lblPorcentagemDeMestres = new JLabel("Porcentagem de Mestres:");
		lblPorcentagemDeMestres.setBounds(10, 160, 186, 14);
		contentPane.add(lblPorcentagemDeMestres);

		JLabel lblPorcentagemDeEspecialistas = new JLabel("Porcentagem de Especialistas:");
		lblPorcentagemDeEspecialistas.setBounds(10, 190, 200, 14);
		contentPane.add(lblPorcentagemDeEspecialistas);

		labelPrcntIntegral = new JLabel("");
		labelPrcntIntegral.setBounds(220, 70, 48, 14);
		contentPane.add(labelPrcntIntegral);

		labelPrcntHorista = new JLabel("");
		labelPrcntHorista.setBounds(220, 100, 48, 14);
		contentPane.add(labelPrcntHorista);

		labelPrcntDoutor = new JLabel("");
		labelPrcntDoutor.setBounds(220, 130, 48, 14);
		contentPane.add(labelPrcntDoutor);

		labelPrcntMestre = new JLabel("");
		labelPrcntMestre.setBounds(220, 160, 48, 14);
		contentPane.add(labelPrcntMestre);

		labelPrcntEspecialista = new JLabel("");
		labelPrcntEspecialista.setBounds(220, 190, 48, 14);
		contentPane.add(labelPrcntEspecialista);

		btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(313, 227, 89, 23);
		contentPane.add(btnVoltar);
	}

	public JLabel getLabelPrcntIntegral() {
		return labelPrcntIntegral;
	}

	public JLabel getLabelPrcntHorista() {
		return labelPrcntHorista;
	}

	public JLabel getLabelPrcntDoutor() {
		return labelPrcntDoutor;
	}

	public JLabel getLabelPrcntMestre() {
		return labelPrcntMestre;
	}

	public JLabel getLabelPrcntEspecialista() {
		return labelPrcntEspecialista;
	}
	
	public JButton getBtnVoltar() {
		return btnVoltar;
	}
	
	

}
