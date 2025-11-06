🛒 Ecommerce API

🚀 Uma API RESTful desenvolvida em Java + Spring Boot, projetada para gerenciar um sistema de E-Commerce completo.
Ela permite o cadastro e gerenciamento de clientes, produtos, cupons e pedidos, incluindo a adição de itens aos pedidos e aplicação de cupons de desconto.

⚙️ Funcionalidades Principais

✅ Clientes – Cadastro, consulta, atualização e exclusão
✅ Produtos – Gerenciamento completo de produtos
✅ Cupons – Criação e aplicação de descontos
✅ Pedidos – Criação, consulta, atualização, remoção e adição de itens

🧰 Tecnologias Utilizadas
Tecnologia	Descrição
☕ Java 17+	Linguagem principal
🌱 Spring Boot 3+	Framework para criação da API
🗄️ Spring Data JPA / Hibernate	Persistência e mapeamento objeto-relacional
💾 Banco de Dados	H2 (padrão), PostgreSQL ou outro relacional
📦 Maven	Gerenciamento de dependências e build
🏗️ Como Executar o Projeto
🪄 1. Pré-requisitos

☕ Java JDK 17+ instalado

🧩 Maven instalado (ou use o wrapper mvnw.cmd)

⚙️ 2. Configuração do Banco de Dados

Por padrão, o projeto usa o H2 (em memória).
Se desejar outro banco (como PostgreSQL), edite o arquivo:

src/main/resources/application.properties

📦 3. Instalação das Dependências

Abra o terminal na raiz do projeto e execute:

# Usando o Maven Wrapper
mvnw.cmd clean install

# Ou, se preferir, o Maven local
mvn clean install

▶️ 4. Executando a Aplicação
# Via Maven Wrapper
mvnw.cmd spring-boot:run

# Ou via Maven
mvn spring-boot:run


Após a execução, acesse:
👉 http://localhost:8080

Use ferramentas como Postman ou Insomnia para testar os endpoints.
💡 Uma collection pronta para Postman está disponível na pasta Collections.

🌐 Endpoints Principais
Rota	Descrição
/clientes	Gerenciamento de clientes
/produtos	Gerenciamento de produtos
/cupons	Gerenciamento de cupons de desconto
/pedidos	Criação e controle de pedidos e itens
🧪 Testes

Execute os testes automatizados com:

mvn test

💡 Boas Práticas e Observações

✅ Segue padrões de validação e tratamento de erros.

🧱 Utiliza jakarta.validation para validações (compatível com Spring Boot 3+).

🧩 Estrutura modular e clara para fácil manutenção e expansão.

👨‍💻 Autor

Projeto desenvolvido com 💙 para fins educacionais na Ada Tech.

“Aprender na prática é o melhor caminho para dominar o código.”
