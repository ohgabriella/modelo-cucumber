package steps.pokemon;

import base.Base;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class PokemonSteps extends Base {

    @Dado("que o usuario queira pesquisar pokemons")
    public void queOUsuarioQueiraPesquisarPokemons() {
        params.put("limit", "10");
    }

    @Quando("^enviar uma requisicao a api para o path de (.+)")
    public void enviarUmaRequisicaoAApiParaOPathDe(String path) {
        requestGetWithParams(path, params, 200);
    }

    @Entao("os pokemons foram listados")
    public void osPokemonsForamListados() {
        logResponse();
    }
}
