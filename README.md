# 🚀 Ecommerce API

Bem-vindo à API de Ecommerce desenvolvida com Java e Spring Boot! Este projeto foi criado para ser uma base robusta, escalável e didática para sistemas de comércio eletrônico, permitindo o gerenciamento completo de clientes, produtos, cupons e pedidos.

---

## 💡 Sobre o Projeto

A Ecommerce API é uma solução RESTful que simula operações essenciais de um e-commerce moderno. Ela foi pensada para facilitar integrações, automações e servir como referência para projetos educacionais e profissionais.

---

## ⚙️ Funcionalidades

- **Clientes:** Cadastro, consulta, atualização e remoção
- **Produtos:** Cadastro, consulta, atualização e remoção
- **Cupons:** Cadastro, consulta, atualização e remoção
- **Pedidos:** Criação, consulta, atualização, remoção e adição de itens
- **Itens do Pedido:** Adição dinâmica de produtos ao pedido
- **Validação e tratamento de erros:** Respostas claras e padronizadas

---

## 🛠️ Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot 3+**
- **Spring Data JPA & Hibernate**
- **Banco de dados relacional** (H2, PostgreSQL, etc.)
- **Maven**

---

## 🚦 Como Executar

1. **Pré-requisitos:**
   - Java JDK 17 ou superior
   - Maven

2. **Configuração do Banco de Dados:**
   - Por padrão, utiliza H2 em memória. Para outro banco, edite `src/main/resources/application.properties`.

3. **Instalação das Dependências:**
   ```cmd
   mvnw.cmd clean install
   ```
   Ou:
   ```cmd
   mvn clean install
   ```

4. **Execução da Aplicação:**
   ```cmd
   mvnw.cmd spring-boot:run
   ```
   Ou:
   ```cmd
   mvn spring-boot:run
   ```

5. **Acesso à API:**
   - URL padrão: `http://localhost:8080`
   - Teste os endpoints com Postman ou Insomnia. Uma collection pronta para Postman está na pasta `Collections`.

---

## 📚 Endpoints Principais

| Recurso    | Endpoint                | Descrição                       |
|------------|------------------------|---------------------------------|
| Clientes   | `/clientes`            | Gerenciamento de clientes       |
| Produtos   | `/produtos`            | Gerenciamento de produtos       |
| Cupons     | `/cupons`              | Gerenciamento de cupons         |
| Pedidos    | `/pedidos`             | Gerenciamento de pedidos/itens  |

---

## 🧪 Testes Automatizados

Execute os testes para garantir a qualidade do projeto:
```cmd
mvn test
```

---

## 📝 Observações Importantes
- Validação de dados com `jakarta.validation` (Spring Boot 3+)
- Tratamento de erros padronizado
- Código limpo e pronto para extensão

---

## 👨‍💻 Autoria & Propósito
Projeto desenvolvido para fins educacionais na Ada Tech, com foco em boas práticas, clareza e escalabilidade.

---

**Explore, contribua e aprenda!**
