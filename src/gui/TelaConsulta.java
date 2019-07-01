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
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblPorcentagens = new JLabel("PORCENTAGENS");
		lblPorcentagens.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPorcentagens.setHorizontalAlignment(SwingConstants.CENTER);
		lblPorcentagens.setBounds(0, 11, 590, 50);
		contentPane.add(lblPorcentagens);

		JLabel lblPorcentagemDeIntegrais = new JLabel("Porcentagem de Integrais:");
		lblPorcentagemDeIntegrais.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblPorcentagemDeIntegrais.setBounds(10, 100, 186, 30);
		contentPane.add(lblPorcentagemDeIntegrais);

		JLabel lblPorcentagemDeHoristas = new JLabel("Porcentagem de Horistas:");
		lblPorcentagemDeHoristas.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblPorcentagemDeHoristas.setBounds(10, 150, 200, 30);
		contentPane.add(lblPorcentagemDeHoristas);

		JLabel lblPorcentagemDeDoutores = new JLabel("Porcentagem de Doutores:");
		lblPorcentagemDeDoutores.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblPorcentagemDeDoutores.setBounds(10, 200, 186, 30);
		contentPane.add(lblPorcentagemDeDoutores);

		JLabel lblPorcentagemDeMestres = new JLabel("Porcentagem de Mestres:");
		lblPorcentagemDeMestres.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblPorcentagemDeMestres.setBounds(10, 250, 190, 30);
		contentPane.add(lblPorcentagemDeMestres);

		JLabel lblPorcentagemDeEspecialistas = new JLabel("Porcentagem de Especialistas:");
		lblPorcentagemDeEspecialistas.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblPorcentagemDeEspecialistas.setBounds(10, 300, 200, 30);
		contentPane.add(lblPorcentagemDeEspecialistas);

		labelPrcntIntegral = new JLabel("");
		labelPrcntIntegral.setBounds(250, 100, 70, 30);
		contentPane.add(labelPrcntIntegral);

		labelPrcntHorista = new JLabel("");
		labelPrcntHorista.setBounds(250, 150, 70, 30);
		contentPane.add(labelPrcntHorista);

		labelPrcntDoutor = new JLabel("");
		labelPrcntDoutor.setBounds(250, 200, 70, 30);
		contentPane.add(labelPrcntDoutor);

		labelPrcntMestre = new JLabel("");
		labelPrcntMestre.setBounds(250, 250, 70, 30);
		contentPane.add(labelPrcntMestre);

		labelPrcntEspecialista = new JLabel("");
		labelPrcntEspecialista.setBounds(250, 300, 70, 30);
		contentPane.add(labelPrcntEspecialista);

		btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(450, 350, 100, 30);
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
