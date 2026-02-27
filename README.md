# Bootcamp (POO em Java)

Projeto feito como parte de um **Bootcamp da DIO**, com o objetivo de praticar **Programação Orientada a Objetos** em Java (SDK 24) abstraindo um cenário de *bootcamp*.

## O que tem no projeto

- `Conteudo` (abstrata): base para os conteúdos e cálculo de XP
- `Curso` e `Mentoria`: tipos de conteúdo (cada um calcula XP de um jeito)
- `Bootcamp`: reúne conteúdos e devs inscritos
- `Dev`: faz inscrição, progride nos conteúdos e soma o XP
- `Main`: exemplo de uso (cria conteúdos, inscreve devs e simula a progressão)

## Resumo (POO)

Neste projeto eu pratiquei:

- **Abstração**: modelagem do domínio (Bootcamp, Dev e conteúdos)
- **Encapsulamento**: atributos privados com getters/setters
- **Herança**: `Curso` e `Mentoria` herdam de `Conteudo`
- **Polimorfismo**: cálculo de XP via `Conteudo` (cada tipo implementa seu próprio cálculo)

