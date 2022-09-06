package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarRegistro {
	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Qual Nome você quer alterar: ");
		String nomeAtual = entrada.nextLine();
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = "SELECT * FROM pessoas WHERE nome = lower(?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, nomeAtual);
		ResultSet resultado = stmt.executeQuery();
		
		if(resultado.next()) {
			int codigo = resultado.getInt("codigo");
			System.out.print("Informe o novo nome: ");
			String nomeNovo = entrada.nextLine();

			sql = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
			PreparedStatement stmtUpdate = conexao.prepareStatement(sql);
			// parametro nos metodos abaixo comeca no 1 e depende da ordem na query
			stmtUpdate.setString(1, nomeNovo);
			stmtUpdate.setInt(2, codigo);
			if(stmtUpdate.executeUpdate() > 0) {
				System.out.println("Nome Atualizado com sucesso");				
			};
			stmtUpdate.close();
		} else {
			System.out.println("Pessoa não encontrada.");
		}
		
		entrada.close();
		stmt.close();
		conexao.close();
	}
}
