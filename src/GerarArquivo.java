import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

public class GerarArquivo {
    
    public void conteudoArquivo(List<Cadastro> cadastro){

        StringBuilder conteudoBuilder = new StringBuilder();

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        for(Cadastro candidato : cadastro){
            conteudoBuilder.append(candidato.getNome() != null ? candidato.getNome() : "").append(";");
            conteudoBuilder.append(candidato.getCPF()+ ";");
            conteudoBuilder.append(candidato.getDataNascimento().format(formatoData)+ ";");
            conteudoBuilder.append(candidato.getSexo()+";");
			conteudoBuilder.append(candidato.getLogradouro()+";");
			conteudoBuilder.append(candidato.getNumero()+";");
			conteudoBuilder.append(candidato.getBairro()+";");
			conteudoBuilder.append(candidato.getComplemento()+";");
			conteudoBuilder.append(candidato.getCidade()+";");
			conteudoBuilder.append(candidato.getBairro()+";");
			conteudoBuilder.append(candidato.getEmail()+";");
			conteudoBuilder.append(candidato.getTelefone()+";");
			conteudoBuilder.append(candidato.getCelular()+";");
			conteudoBuilder.append(candidato.isCelularWhats()+";");
			conteudoBuilder.append(candidato.getProfissao()+";");
			conteudoBuilder.append(candidato.getEmpresa()+";");
			conteudoBuilder.append(String.format(Locale.US, "%.2f", candidato.getSalario())+";");
			conteudoBuilder.append(candidato.isEmpregoAtual()+";");
			conteudoBuilder.append(String.format(Locale.US, "%.2f", candidato.getPretencaoMinima())+";");
			conteudoBuilder.append(String.format(Locale.US, "%.2f", candidato.getPretencaoMaxima())+";");
			conteudoBuilder.append(candidato.getHabilidades()+";");
            conteudoBuilder.append("\n");
        }

        geraCSV(conteudoBuilder);

    }

    public void geraCSV(StringBuilder conteudoBuilder){

        Path arquivoDestino = Paths.get("C:\\jobby\\files\\cadastro.csv");
        
        try {
            Files.write(arquivoDestino, conteudoBuilder.toString().getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
