# Microservices-School 🏫

Este proyecto demuestra la implementación de una arquitectura de microservicios utilizando Spring Boot, enfocándose en la gestión de estudiantes y cursos mediante operaciones CRUD (Crear, Leer, Actualizar, Eliminar). Los datos se almacenan en una base de datos MySQL.

## Descripción del Proyecto 📖

Microservices-School está compuesto por dos microservicios principales:

- **Microservicio de Estudiantes:** Gestiona las operaciones CRUD para los estudiantes.
- **Microservicio de Cursos:** Gestiona las operaciones CRUD para los cursos.

Estos microservicios se comunican entre sí para proporcionar una funcionalidad completa de gestión escolar.

## Tecnologías Utilizadas 🛠️

- [Java](https://www.java.com/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Cloud](https://spring.io/projects/spring-cloud)
- [Eureka](https://spring.io/projects/spring-cloud-netflix)
- [Feign](https://spring.io/projects/spring-cloud-openfeign)
- [MySQL](https://www.mysql.com/) (base de datos)
- [Postman](https://www.postman.com/) (para probar las API)

## Funcionalidades 🚀

- **Gestión de Estudiantes:**
  - Crear un nuevo estudiante
  - Leer información de estudiantes
  - Actualizar datos de estudiantes
  - Eliminar un estudiante

- **Gestión de Cursos:**
  - Crear un nuevo curso
  - Leer información de cursos
  - Actualizar datos de cursos
  - Eliminar un curso

- **Comunicación entre Microservicios:**
  - Los microservicios de estudiantes y cursos se comunican para asociar estudiantes a cursos y viceversa.

## Requisitos 🛠️

- Java JDK 11 o superior
- Maven 3.x para la gestión de dependencias
- MySQL 5.7 o superior
- IDE compatible con Spring Boot (por ejemplo, IntelliJ IDEA, Eclipse)
- Postman (para pruebas de API)

## Instalación y Ejecución ⚙️

1. **Clonar el repositorio:**

   ```sh
   git clone https://github.com/rafapcjs/Microservices-School.git
