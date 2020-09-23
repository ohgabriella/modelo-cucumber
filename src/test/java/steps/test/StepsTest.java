package steps.test;

import base.Base;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class StepsTest extends Base {

    @Dado("que o usuario queira verificar que o cucumber esta funcionando")
    public void queOUsuarioQueiraVerificarQueOCucumberEstaFuncionando() {
        params.put("limit", "10");
    }

    @Quando("rodar o runner test")
    public void rodarORunnerTest() {
        requestGetWithParams("pokemon", params, 200);
    }

    @Entao("devera aparecer no console o que sera escrito nos steps")
    public void deveraAparecerNoConsoleOQueSeraEscritoNosSteps() {
        logResponse();
    }

}