# 🛒 ZenkaiX — Full Stack eCommerce Platform

A full-stack eCommerce application built using modern Java technologies, focused on clean architecture, scalability, and real-world backend workflows.

---

## 🚀 Live Demo

🌐 Frontend: Coming Soon  
⚙️ Backend API: Coming Soon  

---

## 📌 Key Highlights

- 🔐 Secure Authentication using JWT  
- 🧱 Layered Architecture (Controller → Service → Repository)  
- 🛒 Complete Cart & Order Management System  
- 📦 Order Placement Flow with real-time stock updates  
- 🔄 Transaction-safe order processing  
- 🌐 RESTful APIs following industry best practices  
- ⚡ Built with modern Java (Java 21)

---

## 🧑‍💻 Tech Stack

### Backend
- Java 21  
- Spring Boot  
- Spring Security + JWT  
- Spring Data JPA (Hibernate)  
- MySQL  

### Frontend (Planned / In Progress)
- React.js  
- Axios  
- Tailwind CSS  

### Dev Tools
- Git & GitHub  
- Maven  
- Postman  
- IntelliJ IDEA  

---

## 🏗️ System Architecture

```
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

```
ecommerce-project/
│
├── backend/
│   ├── controller/    
│   ├── service/       
│   ├── repository/    
│   ├── model/         
│   ├── config/        
│   ├── dto/           # Planned (for cleaner architecture)
│   ├── exception/     
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
- Register & Login (JWT-based)  
- Browse products  
- Add to cart  
- Place orders  
- View order history  

### 👨‍💼 Admin
- Add / Update / Delete products  
- Manage inventory  
- View all orders  

---

## 🔄 Order Flow

Cart → Order → Order Items  

- Validates cart & items  
- Checks stock availability  
- Updates inventory in real-time  
- Converts cart items into order items  
- Stores everything in the database  

---

## 🔌 API Endpoints (Sample)

| Method | Endpoint             | Description         |
|--------|---------------------|---------------------|
| GET    | /api/products       | Get all products    |
| POST   | /api/products       | Add product         |
| GET    | /api/products/{id} | Get product by ID   |
| DELETE | /api/products/{id} | Delete product      |

---

## ⚙️ Setup Instructions

### 🔧 Backend

```bash
git clone https://github.com/Aman-Yati/ZenkaiX.git
cd backend
```

Configure database in `application.properties`

```bash
mvn spring-boot:run
```

---

### 🌐 Frontend

```bash
cd frontend
npm install
npm run dev
```

---

## 📸 Screenshots

_Add screenshots after frontend is ready_

---

## 🌍 Deployment (Planned)

- Backend: Render / Railway  
- Frontend: Vercel  

---

## 📈 Future Enhancements

- 💳 Payment Integration (Razorpay / Stripe)  
- ❤️ Wishlist System  
- ⭐ Product Reviews & Ratings  
- 🔍 Advanced Search & Filters  
- 📧 Email Notifications  
- 🧩 DTO Layer for better abstraction & maintainability  

---

## 🧠 What I Learned

- Designing scalable backend systems  
- Implementing real-world order workflows  
- Managing data consistency & transactions  
- Structuring layered architecture  
- Using Git & GitHub for version control  

---

## 👨‍💼 Author

**Aman Yati**  
Aspiring Java Backend Developer  

---

## ⭐ Support

If you found this project helpful, consider giving it a ⭐ on GitHub!
