# Teste de Software

## Definição
O teste de software é o processo de avaliar um sistema ou aplicação para identificar defeitos, garantir que ele atenda aos requisitos especificados e validar seu funcionamento. O objetivo é detectar e corrigir erros antes da entrega ao usuário final, garantindo qualidade, desempenho e segurança.

## Importância do Teste de Software
- **Garantia de Qualidade** – Testes ajudam a garantir que o software funcione conforme esperado e atenda aos requisitos do usuário.
- **Redução de Custos** – Identificar e corrigir bugs no início do desenvolvimento é mais barato do que depois da implantação.
- **Segurança** – Testes ajudam a identificar vulnerabilidades que podem ser exploradas por hackers.
- **Melhoria na Experiência do Usuário** – Um software bem testado proporciona uma experiência fluida e sem erros.
- **Conformidade com Requisitos** – Garante que todas as funcionalidades essenciais estejam operacionais e atendam às especificações.
- **Facilidade de Manutenção** – Softwares testados e bem estruturados são mais fáceis de atualizar e corrigir no futuro.

## Defeito, Erro, Falha
### Erro
🔹 Um **erro** ocorre quando um desenvolvedor comete um engano ao escrever o código, projetar a arquitetura ou definir os requisitos do sistema.  
🔹 Esses erros são humanos e podem ser causados por falta de atenção, má interpretação dos requisitos ou até falhas na comunicação entre equipe.

### Defeito
🔹 Um **defeito** é o resultado de um erro no código-fonte ou no design do software.  
🔹 Ele ocorre dentro do sistema e pode permanecer oculto até que seja identificado durante testes ou em produção.

### Falha
🔹 Uma **falha** ocorre quando um defeito se manifesta durante a execução do software, resultando em um comportamento inesperado ou incorreto.  
🔹 Nem todos os defeitos resultam em falhas imediatamente, mas quando um defeito é acionado, ele pode afetar a experiência do usuário.

## Validação e Verificação
### Verificação – *"Está sendo construído corretamente?"*
🔹 A **verificação** foca em garantir que o software está sendo desenvolvido corretamente de acordo com as especificações e requisitos.  
🔹 Envolve atividades como revisões, inspeções, walkthroughs e testes estáticos.

💡 **Exemplo:** Revisar o código para garantir que ele segue as boas práticas e padrões definidos no projeto.

✅ **Objetivo:** Assegurar que o produto atende às especificações antes da execução.  
📌 **Técnicas utilizadas:** Revisão de código, análise estática, inspeção de requisitos.

### Validação – *"O produto correto está sendo construído?"*
🔹 A **validação** verifica se o software atende às necessidades do usuário e ao propósito esperado.  
🔹 Ocorre no ambiente de testes ou produção, executando o software para avaliar seu funcionamento.

💡 **Exemplo:** Testar um sistema de e-commerce para confirmar que o fluxo de compra funciona conforme esperado.

✅ **Objetivo:** Assegurar que o software atende às necessidades reais do usuário.  
📌 **Técnicas utilizadas:** Testes funcionais, testes de aceitação, testes de usabilidade.

## Níveis de Testes
### Unidade
🔹 O **teste de unidade** verifica o funcionamento correto de componentes individuais do software, como funções, métodos e classes.
🔹 Normalmente é realizado por desenvolvedores durante a fase de codificação.

💡 **Exemplo:** Testar uma função que calcula o desconto de um produto para garantir que ela retorna o valor correto.

✅ **Objetivo:** Garantir que cada unidade de código funcione corretamente de forma isolada.
📌 **Técnicas utilizadas:** Testes automatizados, mocks, stubs.

### Integração
🔹 O **teste de integração** verifica a comunicação e interação entre diferentes módulos ou componentes do software.
🔹 É realizado após os testes de unidade para garantir que os módulos funcionam corretamente juntos.

💡 **Exemplo:** Testar a integração entre um módulo de login e um banco de dados para garantir que o usuário pode acessar o sistema corretamente.

✅ **Objetivo:** Identificar falhas na comunicação entre módulos.
📌 **Técnicas utilizadas:** Testes de API, testes de banco de dados, testes de contrato.

### Sistema
🔹 O **teste de sistema** avalia o software como um todo para garantir que ele atenda aos requisitos especificados.
🔹 É realizado em um ambiente semelhante ao de produção para verificar a funcionalidade completa do sistema.

💡 **Exemplo:** Testar um aplicativo de compras online para garantir que o usuário pode navegar, adicionar produtos ao carrinho e finalizar a compra sem erros.

✅ **Objetivo:** Validar o comportamento do sistema como um todo.
📌 **Técnicas utilizadas:** Testes funcionais, testes de desempenho, testes de segurança.

### Regressão
🔹 O **teste de regressão** verifica se novas alterações no código não introduziram defeitos em funcionalidades já existentes.
🔹 Pode ser realizado de forma manual ou automatizada sempre que houver atualizações no software.

💡 **Exemplo:** Após adicionar um novo método de pagamento em um e-commerce, testar se os métodos de pagamento antigos ainda funcionam corretamente.

✅ **Objetivo:** Garantir que alterações no código não impactaram negativamente funcionalidades existentes.
📌 **Técnicas utilizadas:** Testes automatizados, testes exploratórios, testes de repetição.
