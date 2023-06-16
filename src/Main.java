import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        GerarArquivo gerarArquivo = new GerarArquivo();

        List<Cadastro> informacaoCandidato = new ArrayList<>();

        Cadastro cadastro = new Cadastro();
    
        Cadastro c1 = new Cadastro();
       
       
        cadastro.setNome("Larissa");
        cadastro.setCPF("111.111.111-11");
        cadastro.setDataNascimento(LocalDate.of(1999, 6, 1));
        cadastro.setSexo(SexoEnum.FEMININO);
        cadastro.setLogradouro("Rua flores");
        cadastro.setNumero("321");
        cadastro.setBairro("Dourado");
        cadastro.setComplemento("Proximo ao xxxxx");
        cadastro.setCidade("Itapevi");
        cadastro.setEstado("São Paulo");
        cadastro.setEmail("larissa@hotmail.com");
        cadastro.setTelefone(1141112234L);
        cadastro.setCelular(11923423456L);
        cadastro.setCelularWhats(true);
        cadastro.setProfissao("Desenvolvedora");
        cadastro.setEmpresa("Coding");
        cadastro.setSalario(1900.00);
        cadastro.setEmpregoAtual(false);
        cadastro.setPretencaoMinima(1900.00);
        cadastro.setPretencaoMaxima(2300.00);
        cadastro.setHabilidades("Java");

        informacaoCandidato.add(cadastro);
        
        c1.setNome("Joao");
        c1.setCPF("111.111.111-11");
        c1.setDataNascimento(LocalDate.of(1999, 6, 1));
        c1.setSexo(SexoEnum.FEMININO);
        c1.setLogradouro("Rua flores");
        c1.setNumero("321");
        c1.setBairro("Dourado");
        c1.setComplemento("Proximo ao xxxxx");
        c1.setCidade("Itapevi");
        c1.setEstado("São Paulo");
        c1.setEmail("joao@hotmail.com");
        c1.setTelefone(1141112234L);
        c1.setCelular(11923423456L);
        c1.setCelularWhats(true);
        c1.setProfissao("Desenvolvedora");
        c1.setEmpresa("Coding");
        c1.setSalario(1900.00);
        c1.setEmpregoAtual(false);
        c1.setPretencaoMinima(1900.00);
        c1.setPretencaoMaxima(2300.00);
        c1.setHabilidades("CSS");
        informacaoCandidato.add(c1);

        gerarArquivo.conteudoArquivo(informacaoCandidato);
        
    }
}
