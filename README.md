# pass.in

O pass.in é uma aplicação de **gestão de participantes em eventos presenciais**.

A ferramenta permite que o organizador cadastre um evento e abra uma página pública de inscrição.

Os participantes inscritos podem emitir uma credencial para check-in no dia do evento.

O sistema fará um scan da credencial do participante para permitir a entrada no evento.

## Tecnologias Utilizadas

* Java 17 <img src=".github/java.svg" width="40" alt="Logo do Java" />
* Spring Boot <img src=".github/spring_boot.svg" width="40" alt="Logo do Java" />
* HSQLDB <img src=".github/hsqldb.jpeg" width="40" alt="Logo do Java" />

## Requisitos

### Requisitos funcionais

- [x] O organizador deve poder cadastrar um novo evento;
- [x] O organizador deve poder visualizar dados de um evento;
- [x] O organizador deve poser visualizar a lista de participantes;
- [x] O participante deve poder se inscrever em um evento;
- [x] O participante deve poder visualizar seu crachá de inscrição;
- [x] O participante deve poder realizar check-in no evento;

### Regras de negócio

- [x] O participante só pode se inscrever em um evento uma única vez;
- [x] O participante só pode se inscrever em eventos com vagas disponíveis;
- [x] O participante só pode realizar check-in em um evento uma única vez;

### Requisitos não-funcionais

- [x] O check-in no evento será realizado através de um QRCode;

## Documentação da API (Swagger)

Para documentação da API, acesse o link: https://nlw-unite-nodejs.onrender.com/docs

## Banco de dados

Nessa aplicação vamos utilizar banco de dados relacional (SQL). Para ambiente de desenvolvimento seguiremos com o HSQLDB pela facilidade do ambiente.

### Diagrama ERD

<img src=".github/erd.svg" width="600" alt="Diagrama ERD do banco de dados" />

## Próximos passos

1. Implementar testes unitários;
2. Melhorar os retornos dos fluxos de excessões com mensagens mais apropriadas.
3. Adicionar/implementar o Swagger;
4. Dockerizar (Dockerfile e docker-compose);
5. Modificar conexão com o banco de dados (MySQL ou Postgres);
6. Atualizar o README com as atualizações
