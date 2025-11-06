🛒 Ecommerce API

🚀 API RESTful desenvolvida em Java + Spring Boot para gerenciar um sistema completo de E-Commerce.
Permite o cadastro e gerenciamento de clientes, produtos, cupons e pedidos, incluindo a adição de itens aos pedidos e aplicação de cupons de desconto.

⚙️ Funcionalidades

👥 Cadastro, consulta, atualização e exclusão de clientes

📦 Cadastro, consulta, atualização e exclusão de produtos

🎟️ Gerenciamento e aplicação de cupons de desconto

🧾 Criação, consulta, atualização, remoção e adição de itens aos pedidos

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

🧩 Maven instalado (ou utilize o mvnw.cmd)

⚙️ 2. Configuração do Banco de Dados

Por padrão, o projeto utiliza o H2 (em memória).
Para usar outro banco (ex: PostgreSQL), edite o arquivo:
src/main/resources/application.properties

📦 3. Instalar Dependências

Abra o terminal na raiz do projeto e execute:

mvnw.cmd clean install
# ou
mvn clean install

▶️ 4. Executar a Aplicação
mvnw.cmd spring-boot:run
# ou
mvn spring-boot:run


Após a execução, acesse 👉 http://localhost:8080

💡 Utilize Postman ou Insomnia para testar os endpoints.
Uma collection pronta para Postman está disponível na pasta Collections.

🌐 Endpoints Principais
Rota	Descrição
/clientes	Gerenciamento de clientes
/produtos	Gerenciamento de produtos
/cupons	Gerenciamento de cupons
/pedidos	Gerenciamento de pedidos e itens
🧪 Testes

Para rodar os testes automatizados, execute:

mvn test

💡 Observações

✅ Segue boas práticas de validação e tratamento de erros

🧱 Utiliza o pacote jakarta.validation (compatível com Spring Boot 3+)

🧩 Estrutura modular, limpa e de fácil manutenção

👨‍💻 Autor: Eric Morales

Projeto desenvolvido com 💙 para fins educacionais na Ada Tech.

“Aprender na prática é o melhor caminho para dominar o código.”
