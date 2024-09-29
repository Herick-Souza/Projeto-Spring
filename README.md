Este projeto é uma aplicação desenvolvida com Spring Boot , utilizando o Thymeleaf como motor de templates para renderização de páginas HTML.
O sistema permite o gerenciamento de veículos e funcionários, com um banco de dados relacional H2 embutido.

Bug conhecido
Cadastro de Funcionários via Thymeleaf : Atualmente, o cadastro de funcionários por meio da interface Thymeleaf apresenta problemas e não está funcionando corretamente.
Estou investigando a causa e isso será corrigido em futuras atualizações.
No entanto, é possível realizar inserções diretamente pelo console do banco de dados H2 e visualizar ou manipular as tabelas normalmente através do endereço http://localhost:8080/h2-console.

Funcionalidades
Gerenciamento de Veículos : Cadastro, visualização, edição e exclusão de veículos.
Gerenciamento de Funcionários : Cadastro, visualização, edição e exclusão de funcionários (com suporte parcial via Thymeleaf).
Banco de Dados H2 : Console para visualização e manipulação dos dados diretamente.

Dependências
Spring Boot : Framework para simplificação da criação de aplicações Java.
Thymeleaf : Motor de templates para criação de páginas dinâmicas.
Banco de dados H2 : Banco de dados relacionais em memória.
Maven : Ferramenta de gerenciamento de dependências e build.
