package steps.pokemon;

import base.Base;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class PokemonSteps extends Base {
    String id;

    @Dado("que o usuario queira listar todos os pokemons")
    public void queOUsuarioQueiraListarTodosOsPokemons() {
        params.put("limit", "10");
    }

    @Dado("que o usuario queira pesquisar um pokemon por id")
    public void queOUsuarioQueiraPesquisarUmPokemonPorId() {
        id = "10";
    }

    @Dado("que o usuario queira pesquisar um pokemon por area")
    public void queOUsuarioQueiraPesquisarUmPokemonPorArea() {
        id = "10";
    }

    @Quando("^enviar uma requisicao a api para o path de (.+)")
    public void enviarUmaRequisicaoAApiParaOPathDe(String path) {
        if (path.equals("pokemon")) {
            requestGetWithParams(path, params, 200);
        }
        if (path.equals("pokemon/{id}") || path.equals("pokemon/{id}/encounters")){
            requestGetWithId(path, id, 200);
        }
    }

    @Entao("os pokemons foram listados")
    public void osPokemonsForamListados() {
        logResponse();
    }

    @Entao("o pokemon foi listado")
    public void oPokemonFoiListado() {
        logResponse();
    }

    @Entao("o pokemon foi pesquisado por area")
    public void oPokemonFoiPesquisadoPorArea() {
        logResponse();
    }

}