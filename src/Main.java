import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cadastro c1 = new Cadastro();
        Cadastro c2 = new Cadastro();

        c1.setNome("Larissa");
        c1.setCPF("111.111.111-11");
        c1.setDataNascimento(LocalDate.of(1999, 6, 1));
        c1.setSexo(SexoEnum.FEMININO);
        c1.setLogradouro("Rua flores");
        c1.setNumero("321");
        c1.setBairro("Dourado");
        c1.setComplemento("Proximo ao xxxxx");
        c1.setCidade("Itapevi");
        c1.setEstado("São Paulo");
        c1.setEmail("larissa@hotmail.com");
        c1.setTelefone(1141112234L);
        c1.setCelular(11923423456L);
        c1.setCelularWhats(true);
        c1.setProfissao("Desenvolvedora");
        c1.setEmpresa("Coding");
        c1.setSalario(1900.00);
        c1.setEmpregoAtual(false);
        c1.setPretencaoMinima(1900.00);
        c1.setPretencaoMaxima(2300.00);
        c1.setHabilidades("Java");

        c2.setNome("Joao");
        c2.setCPF("111.111.111-11");
        c2.setDataNascimento(LocalDate.of(1997, 2, 1));
        c2.setSexo(SexoEnum.MASCULINO);
        c2.setLogradouro("Rua Joao");
        c2.setNumero("631");
        c2.setBairro("Colonia");
        c2.setComplemento("Proximo ao xxxxx");
        c2.setCidade("São Paulo");
        c2.setEstado("São Paulo");
        c2.setEmail("joao@hotmail.com");
        c2.setTelefone(1141112234L);
        c2.setCelular(11923423456L);
        c2.setCelularWhats(true);
        c2.setProfissao("Desenvolvedor Front-end");
        c2.setEmpresa("Coding");
        c2.setSalario(1700.00);
        c2.setEmpregoAtual(false);
        c2.setPretencaoMinima(1900.00);
        c2.setPretencaoMaxima(2100.00);
        c2.setHabilidades("CSS");

        List<Cadastro> informacaoCandidato = new ArrayList<>();
        informacaoCandidato.add(c1);
        informacaoCandidato.add(c2);

        GerarArquivo gerarArquivo = new GerarArquivo();
        gerarArquivo.conteudo(informacaoCandidato);

    }
}
