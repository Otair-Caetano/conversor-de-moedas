# Conversor de Moedas

Este é um **Conversor de Moedas** desenvolvido como parte de um projeto educacional proposto pela **Alura**, durante o curso de Java para iniciantes.
O objetivo principal é aplicar conceitos de programação orientada a objetos, manipulação de APIs, e integração de funcionalidades com uma interface de usuário, 
aprendendo boas práticas de desenvolvimento de software.

## Funcionalidades

O Conversor de Moedas permite realizar as seguintes operações:
- Conversão de Dólar (USD) para Peso Argentino (ARS)
- Conversão de Peso Argentino (ARS) para Dólar (USD)
- Conversão de Dólar (USD) para Real Brasileiro (BRL)
- Conversão de Real Brasileiro (BRL) para Dólar (USD)
- Conversão de Dólar (USD) para Peso Colombiano (COP)
- Conversão de Peso Colombiano (COP) para Dólar (USD)
- Atualização das taxas de câmbio usando a **ExchangeRate-API**

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal do projeto.
- **IntelliJ IDEA**: Ambiente de Desenvolvimento Integrado (IDE) utilizado para desenvolver o projeto.
- **API ExchangeRate-API**: Serviço de API utilizado para obter cotações de moedas em tempo real.
- **JSON**: Formato de dados para manipulação de respostas da API.

## Como Executar o Projeto

1. Clone este repositório para sua máquina local:
    ```bash
    git clone https://github.com/Otair-Caetano/conversor-de-moedas.git
    ```
2. Abra o projeto no IntelliJ IDEA.
3. Adicione sua chave da **ExchangeRate-API** no código, na classe `Cambio`:
    ```java
    String apiKey = "SUA_CHAVE_API_AQUI"; // Substitua pela sua chave da API
    ```
4. Compile e execute a classe `Principal` para iniciar o conversor de moedas no console.

## Estrutura do Projeto

- **src/main/java**
  - **br.com.meuconversor.moedas**: Contém a classe `Moedas` que define as principais moedas usadas na aplicação.
  - **br.com.meucambio.cambio**: Contém a classe `Cambio` responsável por buscar as cotações atuais através da API.
  - **principal**: Contém a classe `Principal`, que executa o aplicativo e interage com o usuário.

## Contribuição

Este é um projeto educacional, mas se quiser contribuir, fique à vontade para abrir issues e pull requests para melhorias ou correções.

## Sobre a Alura

Este projeto foi desenvolvido como parte de uma série de cursos da **Alura**, uma plataforma de aprendizado online que oferece cursos de tecnologia, programação, design, marketing e muito mais.
Para saber mais, visite [alura.com.br](https://www.alura.com.br).

## Licença

Este projeto é aberto para fins educacionais e não deve ser usado comercialmente sem permissão explícita.

