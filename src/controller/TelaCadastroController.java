package controller;

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
			prof.setNome(tlc.getTxtNome());
			prof.setIdade(Integer.parseInt(tlc.getTxtIdade()));
			prof.setMatricula(tlc.getTxtMatricula());
			prof.setTitulo(tlc.getComboBoxTitulo());
			prof.setTipoContrato(tlc.getComboBoxContrato());
			dao.incluiProfessor(prof);
		});
	}
	
	
}
