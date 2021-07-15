package leilao.service;


import br.com.alura.leilao.dao.LeilaoDao;
import br.com.alura.leilao.model.Lance;
import br.com.alura.leilao.model.Leilao;
import br.com.alura.leilao.model.Usuario;


import br.com.alura.leilao.service.EnviadorDeEmails;
import br.com.alura.leilao.service.FinalizarLeilaoService;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class FinalizarLeilaoServiceTest {

    private FinalizarLeilaoService service;

    @Mock
    private LeilaoDao leilaoDao;

    @Mock
    private EnviadorDeEmails enviadorDeEmails;

    @BeforeEach
    public void beforeEach(){
        MockitoAnnotations.initMocks(this);
        this.service = new FinalizarLeilaoService(leilaoDao, enviadorDeEmails);
    }

    @Test
    void deveriaFinalizarUmLeilao(){
        List<Leilao> leiloes = leiloes();
        // manipulando o funcionamento do mock ao executar o método buscarLeiloesExpirados
        Mockito.when(leilaoDao.buscarLeiloesExpirados()).thenReturn(leiloes);

        service.finalizarLeiloesExpirados();

        Leilao leilao = leiloes.get(0);
        Assertions.assertTrue(leilao.isFechado());
        Assertions.assertEquals(new BigDecimal("900"), leilao.getLanceVencedor().getValor());

        // Verificar se um método do mock foi executado
        Mockito.verify(leilaoDao).salvar(leilao);
    }

    @Test
    void deveriaEnviarEmailParaVencedorDoLeilao(){
        List<Leilao> leiloes = leiloes();
        // manipulando o funcionamento do mock ao executar o método buscarLeiloesExpirados
        Mockito.when(leilaoDao.buscarLeiloesExpirados()).thenReturn(leiloes);

        service.finalizarLeiloesExpirados();

        Leilao leilao = leiloes.get(0);
        Lance lanceVencedor = leilao.getLanceVencedor();

        // Verificar se um método do mock foi executado
        Mockito.verify(enviadorDeEmails).enviarEmailVencedorLeilao(lanceVencedor);
    }

    @Test
    void naoDeveriaEnviarEmailParaVencedorDoLeilaoEmCasoDeErroAoEncerrarOLeilao(){
        List<Leilao> leiloes = leiloes();

        // manipulando o funcionamento do mock ao executar o método buscarLeiloesExpirados
        Mockito.when(leilaoDao.buscarLeiloesExpirados()).thenReturn(leiloes);

        // Configurando para o mockito retornar uma exception ao executar um método
        // O "any" é para qualquer parâmetro recebido no método salvar
        Mockito.when(leilaoDao.salvar(Mockito.any())).thenThrow(RuntimeException.class);

        try{
            service.finalizarLeiloesExpirados();
            // Verificar se um método NÃO foi chamado
            Mockito.verifyNoInteractions(enviadorDeEmails);
        } catch (Exception e){

        }


    }



    private List<Leilao> leiloes(){
        List<Leilao> lista = new ArrayList<>();

        Leilao leilao = new Leilao("Celular",
                new BigDecimal("500"),
                new Usuario("Fulano"));

        Lance primeiro = new Lance(new Usuario("Beltrano"),
                new BigDecimal("600"));
        Lance segundo = new Lance(new Usuario("Ciclano"),
                new BigDecimal("900"));

        leilao.propoe(primeiro);
        leilao.propoe(segundo);

        lista.add(leilao);

        return lista;
    }
}
