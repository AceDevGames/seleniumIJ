package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StepDefinitions {

    @Dado("^Acessar o site Google$")
    public void acessarOSiteGoogle() throws Throwable {

    }

    @Quando("^selecionar a caixa de pesquisa$")
    public void selecionarACaixaDePesquisa() throws Throwable {

    }

    @Quando("^Digitar o texto da pesquisa$")
    public void digitarOTextoDaPesquisa() throws Throwable {

    }

    @Quando("^Clicar no botão pesquisar Google$")
    public void clicarNoBotãoPesquisarGoogle() throws Throwable {


    }

    @Então("^Retornar o resultado$")
    public void retornarOResultado() throws Throwable {

    }

    //Cenario 2

    private int contador = 0;

    @Dado("^que o valor do contador é (\\d+)$")
    public void queOValorDoContadorÉ(int arg1) throws Throwable {
        contador = arg1;
    }

    @Quando("^eu incremetar em (\\d+)$")
    public void euIncremetarEm(int arg1) throws Throwable {
        contador = contador + arg1;
    }

    @Então("^o valor do contador sera (\\d+)$")
    public void oValorDoContadorSera(int arg1) throws Throwable {
        Assert.assertTrue(arg1 == contador);
        Assert.assertEquals(arg1,contador);
    }


}
