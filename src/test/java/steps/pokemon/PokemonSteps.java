package steps.pokemon;

import base.Base;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

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

        //validar o status code
        assertEquals(200, statusCode());

        //validar o json response
        List<Map<String, String>> jsonResponse = response.jsonPath().getList("results");
        System.out.println("List" + jsonResponse);
        assertEquals("bulbasaur", jsonResponse.get(0).get("name"));

    }

    @Entao("o pokemon foi listado")
    public void oPokemonFoiListado() {
        logResponse();
        assertEquals("39", response.path("base_experience").toString());
        assertEquals("shield-dust", response.path("abilities.ability.name[0]").toString());
    }

    @Entao("o pokemon foi pesquisado por area")
    public void oPokemonFoiPesquisadoPorArea() {
        logResponse();
    }

}