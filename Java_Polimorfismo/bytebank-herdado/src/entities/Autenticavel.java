package entities;

// contrato Autenticavel
	// quem assina o contrato precisa implementar
		//metodo setSenha
		//autentica

public abstract interface Autenticavel {
	
	public abstract void setSenha(int senha) ;
	
	public abstract boolean autentica(int senha);

}
