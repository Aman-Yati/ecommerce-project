# 🛒 ZenkaiX — Full Stack eCommerce Platform

> A production-ready eCommerce web application built with modern Java full-stack technologies, featuring secure authentication, scalable backend architecture, and responsive frontend UI.

---

## 🚀 Live Demo

* 🌐 Frontend: *Coming Soon*
* ⚙️ Backend API: *Coming Soon*

---

## 📌 Key Highlights

* 🔐 Secure Authentication using JWT
* 🧱 Layered Architecture (Controller → Service → Repository)
* 🛒 Complete Cart & Order Management System
* 👨‍💼 Admin Dashboard for Product Control
* 🌐 RESTful APIs following industry standards
* ⚡ Optimized performance with modern Java (Java 21)

---

## 🧑‍💻 Tech Stack

### Backend

* Java 21
* Spring Boot
* Spring Security + JWT
* Spring Data JPA (Hibernate)
* MySQL

### Frontend

* React.js
* Axios
* CSS / Tailwind (optional)

### Dev Tools

* Git & GitHub
* Maven
* Postman
* IntelliJ IDEA

---

## 🏗️ System Architecture

```id="arch123"
Client (React)
     ↓
REST API (Spring Boot)
     ↓
Service Layer (Business Logic)
     ↓
Repository Layer (JPA)
     ↓
MySQL Database
```

---

## 📂 Project Structure

```id="struct456"
ecommerce-project/
│
├── backend/
│   ├── controller/    # API endpoints
│   ├── service/       # Business logic
│   ├── repository/    # Database access
│   ├── model/         # Entity classes
│   ├── config/        # Security & config
│   ├── dto/           # Data transfer objects
│   ├── exception/     # Global error handling
│
├── frontend/
│   ├── components/
│   ├── pages/
│   ├── context/
│   ├── api/
```

---

## 🔥 Core Features

### 👤 User

* Register & Login (JWT-based)
* Browse & search products
* Add to cart
* Place orders
* View order history

### 👨‍💼 Admin

* Add / Update / Delete products
* Manage inventory
* View all orders

---

## 🔌 API Endpoints

| Method | Endpoint             | Description       |
| ------ | -------------------- | ----------------- |
| GET    | `/api/products`      | Get all products  |
| POST   | `/api/products`      | Add product       |
| GET    | `/api/products/{id}` | Get product by ID |
| DELETE | `/api/products/{id}` | Delete product    |

---

## ⚙️ Setup Instructions

### 🔧 Backend

```id="setup1"
git clone https://github.com/YOUR_USERNAME/ecommerce-project.git
cd backend
```

Configure database in `application.properties`

```id="setup2"
mvn spring-boot:run
```

---

### 🌐 Frontend

```id="setup3"
cd frontend
npm install
npm run dev
```

---

## 📸 Screenshots

> Add UI screenshots here after frontend completion

---

## 🌍 Deployment (Planned)

* Backend: Render / Railway
* Frontend: Vercel

---

## 📈 Future Enhancements

* 💳 Payment Gateway Integration (Razorpay/Stripe)
* ❤️ Wishlist System
* ⭐ Product Reviews & Ratings
* 🔍 Advanced Search & Filters
* 📧 Email Notifications

---

## 🧠 What I Learned

* Building scalable REST APIs
* Implementing secure authentication (JWT)
* Designing database relationships
* Integrating frontend with backend
* Deploying full-stack applications

---

## 👨‍💼 Author

**Aman Yati**

---

## ⭐ Support

If you found this project helpful, consider giving it a ⭐ on GitHub!
