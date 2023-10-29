# DoctorAppointmentBookingApp
# <h1 align = "center">DoctorApp Spring_Boot & Using  mySql</h1>
___ 
<p align="center">
    ![Screenshot (101)](https://github.com/Deepakkr3/instabackend/assets/115481021/e7b4a0ac-a7b0-479c-b634-cb1355f1148b)
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.1.3-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.0.6-brightgreen.svg" />
</a>
</p>

---

<p align="left">

<!-- Project Description -->
## Overview
<p align="center">This project, named "Doctor App" is a robust Spring Boot application designed for managing user data efficiently. It provides a set of API endpoints that allow you to perform various operations on user records, such as adding, retrieving, updating, and deleting user information. 
</p>

<!-- Table of Contents -->
## Table of Contents
1. [Technologies Used](#technologies-used)
2. [Key Features](#key-features)
3. [Usage](#usage)
4. [API reference](#api-reference)
5. [License](#license)
6. [Acknowledgments](#acknowledgments)
7. [Contact](#contact)

<!-- Technologies Used -->
## Technologies Used
- Java 8
- Spring Boot
- Maven
- Spring Web Dependency
- mysql
-jpa Hibernate





<!-- Key Features -->
## Key Features
- Add Patient
- Get All Patient.
- Get Patient Details By Id.
- Delete Patient By Id.
- Update Patient Id

<!-- Usage -->
## Usage
- Access the application at `http://localhost:8080`.
- Use the provided API endpoints to manage your Doctor App

### Controller:
- It consists of a class named APIController which basically controls the flow of data.
- @RestController annotation is used to make the APIController as a controller layer.
- We perform the CRUD operations such as @PostMapping , @GetMapping , @PutMapping , @DeleteMapping.

### API Reference

### Patient Controller
     @PostMapping("patient/signup")

     @PostMapping("patient/signIn")

     @DeleteMapping("patient/signOut")

     @PostMapping("patient/appointment/schedule")

     @DeleteMapping("patient/appointment/{appointmentId}/cancel")

    @GetMapping("doctors/qualification/{qual}/or/specialization/{spec}")

### Admin Controller
      
    @GetMapping("patients")

    @PostMapping("doctor")

    @GetMapping("patients/bloodGroup/{bloodGroup}")


### doctor Controller

          @GetMapping("doctors")

          @GetMapping("doctor/{id}")

     

 <!-- Acknowledgments -->
## Acknowledgments
- Thank you to the Spring Boot and Java communities for providing excellent tools and resources.

<!-- Contact -->
## Contact
For questions or feedback, please contact : Deepak kumar singh   -
- Maild Id : deepakbaitha7905@gmail.com

<h1 align="center">Thank You...<h1>
<h3 align = "center"> ***********************************************************<h3>
