🛍️ Ecommerce API – Sistema Completo de Vendas Online

💻 API RESTful desenvolvida em Java + Spring Boot, com arquitetura limpa e integração de múltiplos módulos de negócio: clientes, produtos, cupons e pedidos.
Ideal para aprendizado de back-end moderno e boas práticas de desenvolvimento com o ecossistema Spring.

✨ Visão Geral

Esta API permite o gerenciamento completo de um e-commerce, abrangendo:

👥 Clientes – Cadastro, atualização, consulta e exclusão

📦 Produtos – Controle de estoque e informações

🎟️ Cupons de desconto – Criação, listagem e aplicação

🧾 Pedidos – Criação, listagem, atualização, remoção e adição de itens

⚙️ Tecnologias e Ferramentas

🚀 Back-end Principal

☕ Java 17+

🌱 Spring Boot 3+

🗄️ Spring Data JPA / Hibernate

📘 Jakarta Validation

💾 Banco de Dados

🧠 H2 (memória) – padrão

🐘 PostgreSQL (opcional)

🧰 Build & Dependências

📦 Maven

🧪 Testes

🧱 JUnit / Spring Boot Test

🏗️ Como Executar o Projeto
🔧 1. Pré-requisitos

☕ Java JDK 17+

🧩 Maven instalado (ou use o wrapper mvnw.cmd)

⚙️ 2. Configuração do Banco de Dados

O projeto usa o H2 Database como padrão (em memória).
Para alterar para outro banco (ex: PostgreSQL), edite o arquivo:

src/main/resources/application.properties

📦 3. Instalar Dependências

No terminal da raiz do projeto, execute:

mvnw.cmd clean install
# ou
mvn clean install

▶️ 4. Executar a Aplicação

Inicie o servidor com:

mvnw.cmd spring-boot:run
# ou
mvn spring-boot:run


Após iniciar, acesse:
🌐 http://localhost:8080

💡 Dica: Utilize Postman ou Insomnia para testar os endpoints.
Uma collection pronta para Postman está disponível na pasta Collections.

🌐 Principais Endpoints
Método	Endpoint	Descrição
GET	/clientes	Lista todos os clientes
POST	/clientes	Cadastra um novo cliente
GET	/produtos	Lista todos os produtos
POST	/produtos	Cadastra um novo produto
GET	/cupons	Lista todos os cupons
POST	/cupons	Cadastra um novo cupom
GET	/pedidos	Lista pedidos cadastrados
POST	/pedidos	Cria um novo pedido
🧪 Rodando os Testes

Para executar os testes automatizados:

mvn test

💡 Boas Práticas Adotadas

✅ Arquitetura limpa e modular

🧱 Camadas bem definidas: Controller → Service → Repository → Entity

🧩 Uso de DTOs e validação com Jakarta Validation

⚠️ Tratamento centralizado de exceções

🧠 Código comentado e fácil de manter

🧠 Exemplo de Arquitetura
src/
 ┣ 📁 main
 ┃ ┣ 📁 java/com/ecommerce
 ┃ ┃ ┣ 📁 controller
 ┃ ┃ ┣ 📁 service
 ┃ ┃ ┣ 📁 repository
 ┃ ┃ ┗ 📁 model
 ┃ ┗ 📁 resources
 ┃   ┗ 📄 application.properties
 ┗ 📁 test

👨‍💻 Autor

📌 Desenvolvido por: Eric Morales
🎓 Projeto educacional – Ada Tech
💬 “Aprender na prática é o melhor caminho para dominar o código.”

🏷️ Licença

Este projeto foi desenvolvido para fins educacionais e pode ser utilizado livremente para estudo e aprimoramento técnico.
