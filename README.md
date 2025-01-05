# Blog API - Projeto Pessoal

Bem-vindo ao repositório da API para um blog simples, desenvolvida em **Java** utilizando o framework **Spring Boot**. Este projeto foi criado com o objetivo de estudo e prática no desenvolvimento de APIs RESTful, e inclui persistência de dados em um banco de dados relacional.

---

## 📋 Funcionalidades

A API permite:
- Gerenciar usuários do blog (CRUD).
- Criar, visualizar, editar e excluir postagens de blog.
- Gerenciar comentários nas postagens.

---

## 🚀 Tecnologias Utilizadas

- **Java 17**
- **Spring Boot** (versão 3+)
- **Spring Data JPA**
- **H2 Database** (ambiente local)
- **Maven** (gerenciador de dependências)

---

## 📚 Rotas Disponíveis

### **Usuários**
- `GET /users` - Listar todos os usuários.
- `GET /users/{id}` - Buscar um usuário pelo ID.
- `POST /users` - Criar um novo usuário.
- `PUT /users/{id}` - Atualizar um usuário existente.
- `DELETE /users/{id}` - Remover um usuário.

### **Postagens**
- `GET /posts` - Listar todas as postagens.
- `GET /posts/{id}` - Buscar uma postagem pelo ID.
- `POST /posts` - Criar uma nova postagem.
- `PUT /posts/{id}` - Atualizar uma postagem existente.
- `DELETE /posts/{id}` - Remover uma postagem.

### **Comentários**
- `GET /comments` - Listar todos os comentários.
- `GET /comments/{id}` - Buscar um comentário pelo ID.
- `POST /comments` - Criar um novo comentário.
- `PUT /comments/{id}` - Atualizar um comentário existente.
- `DELETE /comments/{id}` - Remover um comentário.
