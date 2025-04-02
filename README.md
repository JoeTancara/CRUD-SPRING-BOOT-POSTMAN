🚀 CRUD Spring Boot con Java 17, PostgreSQL 17 y Postman

Spring Boot
Java 17
PostgreSQL 17
Postman

Este proyecto es un sistema CRUD (Create, Read, Update, Delete) para gestión de estudiantes, desarrollado con Spring Boot y Java 17, utilizando PostgreSQL como base de datos y Postman para pruebas de API.

📋 Tabla de Contenidos
Características

Tecnologías Utilizadas

Estructura del Proyecto

Configuración

Endpoints API

Pruebas con Postman

Análisis del Código

Contribuciones

Licencia

🌟 Características
CRUD Completo para gestión de estudiantes

Validación de datos en entidades

Patrón Repository con Spring Data JPA

Configuración simplificada con Spring Boot

Pruebas de API documentadas con Postman

Documentación completa del código

🛠 Tecnologías Utilizadas
Backend: Spring Boot

Lenguaje: Java 17

Base de Datos: PostgreSQL 17

Herramientas de Prueba: Postman

Dependencias Principales:

Spring Web

Spring Data JPA

PostgreSQL Driver


📂 Estructura del Proyecto
crud-spring-boot-postgres/
│
├── src/main/java/com/crud_estudiantes/

│   ├── controller/           # Controladores REST
│   │   └── EstudianteController.java

│   ├── entity/               # Entidades JPA

│   │   └── Estudiante.java

│   ├── repo/                 # Repositorios

│   │   └── EstudianteRepo.java

│   ├── service/              # Lógica de negocio

│   │   └── EstudianteService.java

│   └── CrudEstudiantesApplication.java  # Clase principal

│
├── src/main/resources/

│   ├── application.properties # Configuración de la app

│   └── data.sql              # Datos iniciales (opcional)

│

├── postman/                  # Colección de pruebas

│   └── CRUD_Estudiantes.postman_collection.json

│

├── README.md                 # Este archivo

└── pom.xml                   # Configuración de Maven


⚙ Configuración
Requisitos:

Java 17 JDK

PostgreSQL 15+

Maven 3.8+

Postman (para pruebas)

🔌 Endpoints API

Método	Endpoint	Descripción

GET	/estudiante	Listar todos los estudiantes

GET	/estudiante/{id}	Obtener estudiante por ID

POST	/estudiante	Crear nuevo estudiante

PUT	/estudiante	Actualizar estudiante existente

DELETE	/estudiante/{id}	Eliminar estudiante por ID

ID
🧪 Pruebas con Postman
1. Crear Estudiante (POST)
   
json
Copy
{
  "nombres": "Joel Hernan",

  "apellidos": "Tancara Suñagua",
  
  "cedula": "11548194",
  
  "edad": 25,
  
  "telefono": "69802449",
  
  "fecha_nacimiento": "1998-12-09"
  
}
Respuesta esperada: 201 Created

3. Listar Estudiantes (GET)
Endpoint: GET http://localhost:8080/estudiante

4. Actualizar Estudiante (PUT)
json
Copy
{
  "codigo": 1,

  "nombres": "Joel Hernan",
  
  "apellidos": "Tancara Suñagua",
  
  "cedula": "11548194",
  
  "edad": 26,
  
  "telefono": "69802449",
  
  "fecha_nacimiento": "1998-12-09"
  
}
Respuesta esperada: 200 OK

6. Eliminar Estudiante (DELETE)

Endpoint: DELETE http://localhost:8080/estudiante/1

Respuesta esperada: 204 No Content

📄 Licencia
Este proyecto está bajo la licencia MIT. Ver el archivo LICENSE para más detalles.

👨‍💻 Desarrollado por: Joel Hernan Tancara Suñagua

📧 Contacto: [tancarajoe@gmail.com]

🔗 GitHub: https://github.com/JoeTancara

🔗 Repositorio: https://github.com/JoeTancara/CRUD-SPRING-BOOT-POSTMAN
