# Entrega Projeto "Desenvolvendo um sistema de gerenciamento de pessoas em API REST com Spring Boot"
 Repositório de entrega do Projeto "Desenvolvendo um sistema de gerenciamento de pessoas em API REST com Spring Boot"
 
 ##API de Pessoas
 
 **Melhorias feitas:**

1 - Proteção para retorno amigável para quando tentar enviar uma requisição POST para um cpf já existente.

2 - Uso de banco de dados PostgresSql para persistência dos dados.

3 - Validações como @NotBlank, @Size com mensagens personalizadas para retorno também com tratamento do retorno através de interceptação com @ResponseStatus e  @ExceptionHandler.

4 - Alinhamento entre DTO e Entidade para limitar o tamanho de cada campo de tabela no banco de dados para evitar consumo desnecessário.

5 - Refiz o relacionamento entre a entidade Phone e Person e personalizei o nome das tabelas, colunas e constraints no banco de dados.

6 - Personalização do banner de execução pelo banner.txt.

7 - Uso do YML ao invés do .properties.