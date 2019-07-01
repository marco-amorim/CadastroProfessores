package controller;

import javax.swing.JOptionPane;

import dao.ProfessorDAO;
import entities.Professor;
import gui.TelaCadastro;

public class TelaCadastroController {

	TelaCadastro tlc;
	ProfessorDAO dao;

	public TelaCadastroController() {
		dao = new ProfessorDAO();
		tlc = new TelaCadastro();
		tlc.setVisible(true);
		tlc.setLocationRelativeTo(null);
		botaoCadastrar();
		botaoConsulta();
	}

	public void botaoConsulta() {
		tlc.getBtnConsulta().addActionListener(e -> {
			tlc.dispose();
			new TelaConsultaController();
		});
	}

	public void botaoCadastrar() {
		tlc.getBtnCadastrar().addActionListener(e -> {
			Professor prof = new Professor();

			try {
				prof.setNome(tlc.getTxtNome());
				prof.setIdade(Integer.parseInt(tlc.getTxtIdade()));
				prof.setMatricula(tlc.getTxtMatricula());
				prof.setTitulo(tlc.getComboBoxTitulo());
				prof.setTipoContrato(tlc.getComboBoxContrato());

			} catch (NumberFormatException e1) {
				JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos corretamente!",
						"Campos incorretos", JOptionPane.WARNING_MESSAGE);
			}
			dao.incluiProfessor(prof);
		});
	}

}
