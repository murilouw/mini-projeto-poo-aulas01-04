# Mini Projeto POO - Sistema de Funcionários

![Status](https://img.shields.io/badge/Status-Concluído-brightgreen)

## 📖 Descrição
Projeto acadêmico desenvolvido para a disciplina de Programação Orientada a Objetos. O sistema simula o gerenciamento básico de funcionários de uma empresa, permitindo cadastrar e exibir informações de diferentes tipos de colaboradores, como Gerentes e Estagiários, aplicando os conceitos fundamentais de POO.

## ✨ Funcionalidades
* **Cadastro de Funcionários:** Permite a criação de um funcionário base com nome, CPF e salário.
* **Cadastro de Subclasses:**
    * `Gerente`: Herda de `Funcionario` e adiciona um `bonusAnual`.
    * `Estagiario`: Herda de `Funcionario` e adiciona uma `cargaHorariaSemanal`.
* **Polimorfismo:** Utiliza o método `exibirDados()` que é sobrescrito (Override) nas subclasses para mostrar informações específicas de cada cargo.
* **Encapsulamento:** Protege os atributos das classes, usando getters e setters com validações (ex: CPF deve ter 11 dígitos, salário não pode ser negativo).

## 🧠 Conceitos de POO Aplicados
Este projeto foi estruturado para aplicar os seguintes pilares da Programação Orientada a Objetos:

1.  **Abstração:** Criação da classe base `Funcionario` que abstrai os atributos e comportamentos comuns a todos os colaboradores.
2.  **Encapsulamento:** Proteção dos atributos (`private`) e acesso controlado através de métodos `getters` e `setters`, que incluem regras de validação.
3.  **Herança:** Criação das subclasses `Gerente` e `Estagiario` que herdam (`extends`) da superclasse `Funcionario`, reutilizando código e adicionando especializações.
4.  **Polimorfismo (Sobrescrita):** O método `exibirDados()` é definido na classe pai e sobrescrito (`@Override`) nas classes filhas, permitindo que cada tipo de funcionário exiba seus dados de forma específica, mesmo quando tratados como um `Funcionario` genérico.

## 🛠️ Tecnologias Utilizadas
* **Linguagem:** Java (JDK 25)
* **Ferramenta de Build/Execução:** `javac` (compilador) e `java` (runtime)
* **Controle de Versão:** Git & GitHub

## 🚀 Como Executar o Projeto
Este projeto é uma aplicação de console Java pura. Para executá-lo, você precisará ter o **Java Development Kit (JDK)** instalado em sua máquina.

Siga os passos abaixo a partir do seu terminal:

**1. Clone o repositório**
```bash
git clone [https://github.com/murilouw/mini-projeto-poo.git](https://github.com/murilouw/mini-projeto-poo.git)
````

**2. Navegue até a pasta do projeto**

```bash
cd mini-projeto-poo
```

**3. Crie um diretório para os arquivos compilados (Recomendado)**

```bash
mkdir bin
```

**4. Compile os arquivos Java**
Este comando irá compilar todos os arquivos `.java` da pasta `src` e salvar os arquivos `.class` resultantes na pasta `bin`.

```bash
javac -d bin src/*.java
```

**5. Execute o programa**
Este comando irá rodar a classe principal (`EmpresaApp`), que está agora dentro da pasta `bin`.

```bash
java -cp bin EmpresaApp
```

**Saída Esperada:**

```
Iniciando Sistema de Gerenciamento de Funcionários...

--- Exibindo Dados ---
--- Dados do Funcionário ---
Nome: Murilo Coelho
CPF: 12345678901
Salário Base: R$ 15000,00
Cargo: Gerente
Bônus Anual: R$ 5000,00

------------------------

--- Dados do Funcionário ---
Nome: Benjamin Tennyson
CPF: 98765432101
Salário Base: R$ 2500,00
Cargo: Estagiário
Carga Horária: 40h/semana

Sistema finalizado.
```

## 👨‍💻 Autor

  * **Aluno:** Murilo Coelho Souza
  * **Matrícula:** `03355767`
  * **Universidade:** `Uninorte Djalma Batista`
  * **GitHub:** [@murilouw](https://www.google.com/search?q=https://github.com/murilouw)

## 📜 Licença

Este projeto foi desenvolvido especificamente para fins **educacionais** e **didáticos**.
