<h1 align="center">Jobby</h1>
Plataforma destinada ao armazenamento de dados pessoais e profissionais para em seguida proporcionar uma listagem de profissionais, suas experiências e habilidades destinadas para auxilar no processo de recrutamento e seleção de uma empresa de tecnologia.

# Escopo Inicial
![image](https://github.com/lariandrade/mjv-java-school-jobby/assets/44838761/0267c53d-c472-4c55-9622-08e506b002ab)
Créditos da imagem: [Gleyson Sampaio](https://sintaxe.netlify.app/topicos/aproposta)

O objetivo desta primeira etapa do projeto é criar um programa simples que permita ao candidato preencher seus dados. 
Esses dados serão coletados pelo sistema e usados para gerar um arquivo com layout delimitado.
O programa deve permitir que o candidato insira as seguintes informações:

- Dados Pessoais: Nome, CPF, Data Nascimento, Sexo
- Dados Endereço: Logradouro, Número, Complemento, Bairro, Cidade, Estado
- Dados Contato: E-mail, Telefone, Celular, Se celular for WhatsApp
- Dados Profissionais: Profissão, Empresa, Salário, Emprego Atual
- Habilidades: Uma lista de habilidades
- Pretenção Salarial: Valor Mínimo, Valor Máximo

**Observação:** eu criei apenas a classe Cadastro para seguir o diagrama disponibilizado anteriormente. Entretanto, sei que futuramente posso dividir essa classe em várias partes para tornar o código mais legível e organizado.

# Arquivo CSV
Para gerar o conteúdo do arquivo CSV, utilizei a classe StringBuilder.

```
 StringBuilder conteudoBuilder = new StringBuilder();
```
Em seguida, percorri a lista do tipo "Cadastro" utilizando um laço foreach e fui adicionando as informações à string utilizando o método `.append().`

Para a geração do arquivo CSV, utilizei a biblioteca java.nio.

Nessa etapa, tomei o cuidado de verificar se os diretórios `jobby` e `files`, bem como o arquivo `cadastro.csv`, existem. Caso não existam, o código cria automaticamente esses diretórios e arquivos antes de realizar a escrita dos dados. Isso garante que o processo de geração do arquivo CSV ocorra de forma correta, evitando erros relacionados à falta de permissões ou à inexistência dos diretórios/arquivos necessários.
