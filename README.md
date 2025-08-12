# Padrões Comportamentais

Bem vindo(a)! Este repositório contém implementações de exemplos para cada um dos padrões comportamentais apresentados na disciplina de **Padrões de Projeto**. Os padrões comportamentais são utilizados para definir como os objetos interagem entre si, garantindo flexibilidade, reutilização de código e separação de responsabilidades. Eles ajudam a controlar o fluxo de comunicação entre os objetos de um sistema, tornando o código mais manutenível, desacoplado e extensível.

## Padrões Implementados

Os seguintes padrões estruturais foram implementados neste repositório:

- **Chain of Responsibility** - Passa requisições por uma cadeia de manipuladores até encontrar aquele que pode processá-la, promovendo desacoplamento.

- **Command** - Encapsula uma solicitação como um objeto, permitindo que ações sejam enfileiradas, desfeitas ou executadas posteriormente.

- **Mediator** - Reduz o acoplamento direto entre objetos, centralizando a comunicação em um mediador.

- **Memento** - Permite salvar e restaurar o estado de um objeto sem violar o encapsulamento, sendo útil para funcionalidades de "desfazer".

## Como Executar

1. Clone este repositório
    ```bash
    git clone https://github.com/JhenniferK/PadroesComportamentais.git
    ```
    
2. Navegue até o diretório do projeto
   ```bash
   cd PadroesComportamentais
   cd src
   ```

3. Compile os arquivos do padrão que deseja executar
   ```bash
   javac -d . Memento/*.java
   ```

4. Execute o código
   ```bash
   java Memento.Game
   ``` 

---

🖤 **Obrigada por visitar este repositório!**
