<div align="center">
  <img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white" alt="Spring Boot" />
  <img src="https://img.shields.io/badge/Java_21-ED8B00?style=for-the-badge&logo=java&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white" alt="MySQL" />
  <img src="https://img.shields.io/badge/MapStruct-FF6600?style=for-the-badge&logo=map-struct&logoColor=white" alt="MapStruct" />
  <img src="https://img.shields.io/badge/Swagger-85EA2D?style=for-the-badge&logo=swagger&logoColor=black" alt="Swagger" />
</div>

<h1 align="center">🛒 Proyecto Modelo - API Backend (Gestión de Supermercado)</h1>

<p align="center">
  API RESTful robusta y estructurada para la gestión del inventario y categorías de un supermercado, construida siguiendo las mejores prácticas de Arquitectura en Capas.
</p>

---

## 🌟 Sobre el Proyecto

El backend del **Proyecto Modelo** funciona como el núcleo central para la gestión del catálogo de productos y su categorización. Está diseñado bajo los principios de diseño de **Domain-Driven Design (DDD) básico** y el patrón **Data Mapper**. La aplicación separa estrictamente la capa de persistencia (Base de Datos) de la capa de dominio (Lógica) y de exposición (API REST) asegurando así escalabilidad y un código limpio.

## ✨ Funcionalidades Principales

El proyecto utiliza una base de datos relacional (**MySQL**) y estructura su información con el ORM de **Spring Data JPA**.

### 🛍️ Módulo de Productos (CRUD Completo)
- **Gestión Total:** Endpoints para crear, obtener, listar y eliminar productos.
- **Consultas Específicas:** Filtros avanzados para buscar productos asociados a una categoría específica o identificar productos con stock bajo (escasos).
- **Mapeo Automático:** Implementación de `MapStruct` para la conversión eficiente y segura entre Entidades JPA y los Objetos de Dominio (DTOs) que se envían al cliente.

### 🗂️ Módulo de Categorías
- **Inventario Relacional:** Relación estable entre productos y categorías (Tecnología, Supermercado, Ropa, etc.) respetando las restricciones de llave foránea de la base de datos.
- **Autollenado Inicial:** Inserción automática de categorías predeterminadas al levantar la aplicación mediante scripts (`data.sql`).

---

## 🛠️ Tecnologías Utilizadas

- **Framework Web:** Spring Boot 3.4+
- **Lenguaje:** Java 21
- **Persistencia & ORM:** Spring Data JPA, Hibernate
- **Base de Datos:** MySQL 8
- **Mapeador de Objetos:** MapStruct
- **Documentación API:** Springdoc OpenAPI (Swagger UI)

---

## 🚀 Despliegue Local (Para Desarrolladores)

Si deseas clonar el proyecto y correr el backend en tu máquina:

1. **Clonar el repositorio:**
```bash
git clone <URL_DEL_REPOSITORIO>
cd ProyectoModelo
```

2. **Configuración de Base de Datos:**
Asegúrate de tener un servidor MySQL local corriendo en el puerto `3306`.
Crea la base de datos necesaria ejecutando la siguiente consulta en tu gestor de base de datos (Workbench/DBeaver):
```sql
CREATE DATABASE market;
```

3. **Variables y Credenciales (application.properties):**
Dirígete a `src/main/resources/application.properties` y ajusta el `username` y `password` para que coincidan con tu servidor MySQL local:
```properties
spring.datasource.username=root
spring.datasource.password=TU_CONTRASEÑA
```

4. **Compilar y Ejecutar:**
Abre una terminal en la raíz del proyecto y usa Maven para limpiar, compilar y ejecutar el proyecto (O simplemente dale al botón "Run" en IntelliJ/Android Studio/Eclipse):
```bash
mvn clean install
mvn spring-boot:run
```
*(Nota: Al iniciar por primera vez, el sistema creará automáticamente las tablas e insertará 10 categorías por defecto gracias al archivo `data.sql`)*.

5. **Abrir la documentación interactiva:**
Una vez el servidor esté corriendo en el puerto 8080, navega a la siguiente URL para interactuar con la API mediante la interfaz visual de Swagger:
```text
http://localhost:8080/swagger-ui/index.html
```