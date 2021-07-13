package br.com.alura.rh.service.promocao;

import br.com.alura.rh.exceptions.ValidacaoException;
import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class PromocaoService {

    public void promover(Funcionario funcionario, boolean metaBatida){
        Cargo cargoAtual = funcionario.getCargo();
        if (Cargo.GERENTE == cargoAtual){
            throw new ValidacaoException("Gerentes não podem ser promovidos");
        }
        if (metaBatida){
            Cargo novoCargo = cargoAtual.getProximoCargo();
            funcionario.promover(novoCargo);
        }
    }
}
