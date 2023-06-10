package jogo;

public class jogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BancoDeDados bancoDeDados = new BancoDeDados();
		bancoDeDados.conectar();
		if (bancoDeDados.estaConectado()) {
			bancoDeDados.listarusuarios();
			bancoDeDados.desconectar();
		} else {
			System.out.println("conexao falhou");
		}
	}

}
