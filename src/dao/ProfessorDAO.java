package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import db.DB;
import entities.Porcentagem;
import entities.Professor;

public class ProfessorDAO {

	Connection conn = null;

	public void incluiProfessor(Professor prof) {

		try {
			if (conn == null || conn.isClosed()) {
				conn = DB.getConnection();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			PreparedStatement st = null;
			st = conn.prepareStatement(
					"INSERT INTO professor (matricula, nome, titulo, idade, tipoContrato)" + "VALUES(?, ?, ?, ?, ?)");
			st.setString(1, prof.getMatricula());
			st.setString(2, prof.getNome());
			st.setString(3, prof.getTitulo());
			st.setInt(4, prof.getIdade());
			st.setString(5, prof.getTipoContrato());

			st.executeUpdate();

			JOptionPane.showMessageDialog(null, "Inclusão realizada com sucesso!", "Cadastro no Banco de Dados",
					JOptionPane.INFORMATION_MESSAGE);

			DB.closeStatement(st);
		} catch (SQLException e1) {

		}

	}

	public Porcentagem consultaProfessores() {

		try {
			if (conn == null || conn.isClosed()) {
				conn = DB.getConnection();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			PreparedStatement st = null;
			st = conn.prepareStatement("SELECT * FROM professor");

			ResultSet rs = st.executeQuery();
			int qntdProfessores = 0, qntdHorista = 0, qntdIntegral = 0, qntdDoutor = 0, qntdMestre = 0,
					qntdEspecialista = 0;

			while (rs.next()) {
				qntdProfessores++;

				String titulo = rs.getString("titulo");

				if (titulo.equalsIgnoreCase("Doutor")) {
					qntdDoutor++;
				} else if (titulo.equalsIgnoreCase("Mestre")) {
					qntdMestre++;
				} else if (titulo.equalsIgnoreCase("Especialista")) {
					qntdEspecialista++;
				}

				String tipoContrato = rs.getString("tipoContrato");

				if (tipoContrato.equalsIgnoreCase("Horista")) {
					qntdHorista++;
				} else if (tipoContrato.equalsIgnoreCase("Integral")) {
					qntdIntegral++;
				}

			}

			Porcentagem porcentagem = new Porcentagem();
			porcentagem.setPorcentagemDoutor((qntdDoutor * 100) / qntdProfessores);
			porcentagem.setPorcentagemEspecialista((qntdEspecialista * 100) / qntdProfessores);
			porcentagem.setPorcentagemHorista((qntdHorista * 100) / qntdProfessores);
			porcentagem.setPorcentagemMestre((qntdMestre * 100) / qntdProfessores);
			porcentagem.setPorcentagemIntegral((qntdIntegral * 100) / qntdProfessores);

			DB.closeStatement(st);

			return porcentagem;
		} catch (SQLException e1) {
			return null;
		}
	}

}
