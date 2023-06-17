import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class GerarArquivo {

    public void conteudo(List<Cadastro> cadastro) {

        StringBuilder conteudoBuilder = new StringBuilder();

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        for (Cadastro candidato : cadastro) {
            conteudoBuilder.append(candidato.getNome() + ";");
            conteudoBuilder.append(candidato.getCPF() + ";");
            conteudoBuilder.append(candidato.getDataNascimento().format(formatoData) + ";");
            conteudoBuilder.append(candidato.getSexo() + ";");
            conteudoBuilder.append(candidato.getLogradouro() + ";");
            conteudoBuilder.append(candidato.getNumero() + ";");
            conteudoBuilder.append(candidato.getBairro() + ";");
            conteudoBuilder.append(candidato.getComplemento() + ";");
            conteudoBuilder.append(candidato.getCidade() + ";");
            conteudoBuilder.append(candidato.getBairro() + ";");
            conteudoBuilder.append(candidato.getEmail() + ";");
            conteudoBuilder.append(candidato.getTelefone() + ";");
            conteudoBuilder.append(candidato.getCelular() + ";");
            conteudoBuilder.append(candidato.isCelularWhats() + ";");
            conteudoBuilder.append(candidato.getProfissao() + ";");
            conteudoBuilder.append(candidato.getEmpresa() + ";");
            conteudoBuilder.append(String.format("%.2f", candidato.getSalario()) + ";");
            conteudoBuilder.append(candidato.isEmpregoAtual() + ";");
            conteudoBuilder.append(String.format("%.2f", candidato.getPretencaoMinima()) + ";");
            conteudoBuilder.append(String.format("%.2f", candidato.getPretencaoMaxima()) + ";");
            conteudoBuilder.append(candidato.getHabilidades() + ";");
            conteudoBuilder.append("\n");
        }

        geraCSV(conteudoBuilder);

    }

    public void geraCSV(StringBuilder conteudoBuilder) {

        String caminhoDiretorio = "C:\\jobby\\files\\";
        String nomeArquivo = "cadastro.csv";

        String destino = verificaCaminho(caminhoDiretorio, nomeArquivo);

        Path arquivoDestino = Paths.get(destino.toString());

        try {
            Files.write(arquivoDestino, conteudoBuilder.toString().getBytes(StandardCharsets.UTF_8),
                    StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * Verifica se os diretórios especificados existem. Se não existirem, cria-os.
     * 
     * @param caminho O caminho dos diretórios.
     * @param nome    O nome do arquivo.
     * @return O caminho completo, incluindo o nome do arquivo.
     * @throws IOException Se ocorrer um erro ao criar os diretórios.
     */
    public String verificaCaminho(String caminho, String nome) {

        Path diretorioPath = Paths.get(caminho);
        Path arquivoPath = diretorioPath.resolve(nome);

        if (!Files.exists(diretorioPath)) {
            try {
                Files.createDirectories(diretorioPath.getParent());
                Files.createDirectories(diretorioPath);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (!Files.exists(arquivoPath)) {
            try {
                Files.createFile(arquivoPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return arquivoPath.toString();
    }

}
