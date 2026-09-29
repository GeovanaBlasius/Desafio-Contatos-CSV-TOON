# Desafio · Contatos em CSV e TOON

Gerenciador de contatos em Java que importa dados de um CSV e salva e lê os contatos no formato TOON.

**Disciplina:** Programação Orientada a Objetos I · desafio  
**Tecnologias:** Java

## Funcionalidades

- Importa contatos de `contatos.csv` (id, nome, e-mail, telefone e data de nascimento)
- Converte e salva a lista em `contatos.toon`
- Carrega os contatos de volta a partir do arquivo TOON

## Estrutura

| Classe | Responsabilidade |
|---|---|
| `Contato` | Modelo do contato |
| `CarregarCSV` / `CsvService` | Leitura do CSV |
| `ToonService` | Escrita e leitura no formato TOON |
| `ContatoService` | Operações sobre a lista de contatos |
| `Main` | Ponto de entrada |

## Como executar

Abra no IntelliJ e rode `src/service/Main.java` (os arquivos de dados ficam na raiz do projeto).

---

Desenvolvido por [Geovana Blasius](https://github.com/GeovanaBlasius) · Ciência da Computação, IFC Campus Rio do Sul
