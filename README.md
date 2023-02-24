# Bem vindo à DEVinHouse <img width="180px" alt="Philips" src="ExerciciosM02S04/images/logo-phil.png"/>
## Módulo 02 - Semana 04

Eu desenvolvi um projeto `Java` para a elaboração dos 8 exercícios referentes a essa semana. <br>

Para visualizar o meu projeto, <a href="https://github.com/GeorgeEnriqueBravo/DEVinHouse-Modulo02-Semana04/archive/refs/heads/main.zip" target="_blank">
    clique aqui
</a>
para baixa-lo. <br>

Após o download, abra a pasta "ExerciciosM02S04" utilizando o software `IntelliJ`. Para baixar a última versão grátis do IntelliJ 
<a href="https://www.jetbrains.com/idea/download/download-thanks.html?platform=windows&code=IIC" target="_blank">
    clique aqui
</a>.
  
---

# Lista de exercícios <img width="75px" alt="Philips" src="ExerciciosM02S04/images/lista.png"/>
### [M2S04] Ex 1 - Herança e Polimorfismo

a) Crie a interface **"Operavel"**, com os métodos:

- depositar(double valor)
- sacar(double valor)

b) Crie a classe Abstrata **Conta** com o atributo "saldo" (double) e um método protegido (protected)

- obterSaldoAtual()

c) Crie uma classe **"ContaCorrente"** que implemente a interface Operavel e herde da classe Conta. Faça uma implementação dos métodos herdados.

### [M2S04] Ex 2 - Sobrescrita

a) Crie uma classe '**Funcionario**' com o método público "obterCargo" que retorne uma String com o texto "Sou Funcionário". <br>
b) Crie uma classe **Gerente** que herde de Funcionário, sobrescrevendo o método de obter cargo com o texto "Sou Gerente". <br>
c) Transforme a classe Gerente numa classe que não pode mais ser extendida (ou seja, que não pode ter subclasses). <br>

### [M2S04] Ex 3 - Interfaces

a) Crie uma Interface chamada "**Tributavel**", que tenha o método "calcularValorComImposto". <br>
b) Crie uma classe chamada "**Produto**" que implemente esta interface criada anteriormente. <br>
Nesta classe crie os atributos "valor" e "valor imposto", ambos do tipo double. <br>
No método herdado, retorne a soma dos atributos de valores.

### [M2S04] Ex 4 - Exceções

Escreva um código que pergunte ao usuário (pela linha de comando) sua idade.

Caso seja informado um valor negativo, zero ou maior que cem, lance uma exceção que seja capturada por um bloco de try-catch e imprima no console uma mensagem explicativa para o usuário, e a seguir repita a pergunta para o usuário até que seja informado um valor de idade válido.

Neste exercício é livre para se criar uma exceção própria ou usar alguma exceção já existente na linguagem.

Quando for informado uma idade válida, imprima no console a frase: "Olá, você tem xx anos de idade!"

### [M2S04] Ex 5 - Visibilidade protected

a) Crie uma classe “**Pessoa**“ com os atributos protected “nome” e “sobrenome”. Adicione nesta classe também um método protected “obterNomeCompleto()” que retorna uma String com nome e sobrenome da pessoa concatenados.

b) Crie uma outra classe “**Aluno**” que herde de “Pessoa”, onde tenha o atributo privado “matrícula” do tipo String e um método “registrar()”. Esse método “registrar()” deve retornar uma String contendo a frase: “Sou o <nome + sobrenome> e minha matrícula é <matrícula>”. Use os métodos e/ou atributos da superclasse para implementar este método “registrar()”.

### [M2S04] Ex 6 - Exceções

Crie uma classe de Teste, e nela crie um método “validar” que recebe como argumentos um parâmetro valorCampo do tipo String, e outro parâmetro do tipo tamanhoMaximo do tipo Inteiro.

A assinatura do método deve ser desta forma:

```
public void validar(String valorCampo, Integer valorMaximoCampo)
```

Na sequência, crie uma exceção customizada (própria) chamada “TamanhoInvalidoException”. Esta exceção deve ser ‘checked’, ou seja, extender a classe ‘Exception’.

Na implementação do método ‘validar’, atenda as seguintes situações:

a) Se o conteúdo de algum dos argumentos (valor ou tamanho) forem nulos, ou se o parâmetro de valor for um número negativo, o método deve lançar a exceção **IllegalArgumentException** (do pacote java.lang).

b) Se o tamanho do parâmetro “valorCampo” (nro de caracteres da String) for maior que o número constante no argumento ‘valorMaximoCampo’, o método deve lançar a exceção criada '**TamanhoInvalidoException**'.

c) Caso não tenha estas inconsistências, o método não deve retornar nada.

---

# O que é DEVinHouse?
DEVinhouse é uma jornada de aceleração da carreira com: grade curricular direcionada, professores do mercado, prática constante, interação frequente com as houses parceiras de cada turma, simulação do dia-a-dia DEV e vagas exclusivas que são abertas pelas Houses durante a jornada.

No DEVinHouse você vira um desenvolvedor Fullstack em 9 meses, ao longo de 900 horas de conteúdo, divididas em três módulos de 3 meses cada, com intervalo de uma semana entre cada um. Aproximadamente 25 horas de dedicação por semana entre aulas, atividades e vivências.

__1º módulo:__ Front-End – JavaScript e Angular <br/>
__2º módulo:__ Back-End – Java, Spring e SQL <br/>
__3º módulo:__ Full-Stack – Scrum, DevOps, Clean Code e Design Patterns <br/>
__Ferramentas__ – GitHub, Trello e Slack

---

# Tecnologias Utilizadas <img width="35px" alt="🌐" src="ExerciciosM02S04/images/tag.gif"/>
Nos exercícios dessa semana foram utilizadas as seguintes tecnologias:
<div style="display: inline_block">
    <img align="center" alt="Java" src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"/>
    <img align="center" alt="Trello" src="https://img.shields.io/badge/Trello-0052CC?style=for-the-badge&logo=trello&logoColor=white"/>
    <img align="center" alt="GitHub" src="https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white"/>
</div>
