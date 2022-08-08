import java.util.List;

public class ListagemUsuarios {
	public static void main(String[] args) {
		Usuario u1 = new Usuario();
		u1.setNome("Gabriel");
		u1.setId(1);
		u1.setModerador(true);
		u1.setPontuacao(4);
		
		Usuario u2 = new Usuario();
		u2.setNome("Vinícius");
		u2.setId(2);
		u2.setModerador(true);
		u2.setPontuacao(5);
		
		Usuario u3 = new Usuario();
		u3.setNome("Zariel");
		u3.setId(3);
		u3.setModerador(false);
		u3.setPontuacao(0);
		
		Usuario u4 = new Usuario();
		u4.setNome("Matheus");
		u4.setId(4);
		u4.setModerador(true);
		u4.setPontuacao(8);
		
		Usuario u5 = new Usuario();
		u5.setNome("Jorge");
		u5.setId(5);
		u5.setModerador(true);
		u5.setPontuacao(10);
		
		List<Usuario> lista = List.of(u1, u2, u3, u4, u5);
		
		lista.forEach(e -> {
			System.out.println("Nome: " + e.getNome());
			System.out.println("ID: " + e.getId());
			System.out.println("Pontuação: " + e.getPontuacao());
			System.out.println("Moderador? " + e.isModerador());
		});
	}
}
