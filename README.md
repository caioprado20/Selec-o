# 📦 Sistema de Pedidos em Java

Projeto desenvolvido em Java com o objetivo de simular um sistema simples de pedidos, aplicando conceitos de **Programação Orientada a Objetos (POO)**.

---

## 🚀 Funcionalidades

* Cadastro de cliente (NORMAL ou VIP)
* Adição de múltiplos itens ao pedido
* Cálculo automático do valor total
* Definição de status do pedido com base em regras de negócio

---

## 🧠 Regras de Negócio

O sistema aplica as seguintes regras:

* ❌ Pedido sem itens → **REJEITADO**
* ❌ Cliente sem saldo suficiente → **REJEITADO**
* ⭐ Cliente VIP com total até R$2000 → **APROVADO**
* ⏳ Pedido acima de R$1000 → **PENDENTE**
* ✅ Demais casos → **APROVADO**

---

## 🏗️ Estrutura do Projeto

```
src/
 ├── application/
 │    └── Program.java
 └── entities/
      ├── Customer.java
      ├── Item.java
      └── Order.java
```

---

## 📚 Tecnologias utilizadas

* Java
* Eclipse IDE
* Git e GitHub

---

## ▶️ Como executar

1. Clone o repositório:

```
git clone https://github.com/seu-usuario/seu-repositorio.git
```

2. Abra no Eclipse ou outra IDE Java

3. Execute a classe:

```
application.Program
```

---

## 💻 Exemplo de uso

```
Nome do cliente: Caio
Tipo: VIP
Saldo: 1500
Itens:
Mouse - 200 x 2
Teclado - 300 x 2

Total: 1000
Status: APROVADO
```

---

## 📌 Conceitos aplicados

* Encapsulamento
* Classes e Objetos
* List (ArrayList)
* Estruturas condicionais
* Entrada de dados com Scanner

---

## ✨ Autor

Desenvolvido por **Caio Almeida Prado**
