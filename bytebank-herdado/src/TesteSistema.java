
public class TesteSistema {

	public static void main(String[] args) {
		
		Autenticavel g = new Gerente();
		g.setSenha(2222);
		
		
		Autenticavel adm = new Administrador();
		adm.setSenha(3333);
		
		SistemaInterno si = new  SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
	}

}
