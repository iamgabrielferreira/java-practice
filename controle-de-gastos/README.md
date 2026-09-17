# 💰 Controle de Gastos

Meu primeiro projeto em Java: um sistema de controle de gastos via terminal, onde é possível adicionar, listar e somar o total de gastos registrados durante a execução do programa.

## 🎯 Objetivo

Praticar lógica de programação, estruturas de repetição, validação de entrada de dados e organização de código em múltiplas classes — servindo como base antes de projetos com persistência em banco de dados.

## ⚙️ Funcionalidades

- **Adicionar gasto** — registra uma descrição e um valor, com validação (não aceita descrição vazia nem valor menor ou igual a zero)
- **Listar gastos** — exibe todos os gastos cadastrados na sessão atual
- **Ver total de gastos** — soma e exibe o valor total de todos os gastos registrados
- **Sair** — encerra o programa

## 🧠 Conceitos praticados

- `Scanner` para entrada de dados do usuário
- `ArrayList` para armazenamento dinâmico das descrições e valores
- Laços de repetição (`while`, `for`) para validação de entrada e percorrer as listas
- Organização de código em duas classes com responsabilidades separadas:
  - `Menu` — interface com o usuário e controle do fluxo do programa
  - `Projeto` — lógica de negócio (adicionar, listar e somar gastos)
- Métodos `static` chamados entre classes

## 🛠️ Tecnologias

- **Java** (biblioteca padrão, sem frameworks)

## ⚙️ Como rodar

```bash
# Entre na pasta do projeto
cd controle-de-gastos

# Compile os arquivos
javac *.java

# Execute o programa
java Menu
```

## 📚 O que aprendi

Esse projeto foi meu primeiro contato prático com Java fora de exercícios isolados. Aprendi a validar entradas do usuário com laços de repetição, armazenar dados dinamicamente com `ArrayList` e organizar a lógica do programa separando a interface (menu) da regra de negócio (cálculos e manipulação das listas) em classes diferentes.

## 🔮 Próximos passos

- [ ] Adicionar categorias aos gastos
- [ ] Persistir os dados em arquivo ou banco de dados (hoje os gastos somem ao fechar o programa)
- [ ] Tratar exceções de entrada (ex: usuário digitar letras no campo de valor)

## 🔗 Contato

- [LinkedIn](https://www.linkedin.com/in/gabrielferreiradias-ti/)
- [GitHub](https://github.com/iamgabrielferreira)
