<div align="center">
  <img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white" alt="Spring Boot" />
  <img src="https://img.shields.io/badge/Java_21-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java 21" />
  <img src="https://img.shields.io/badge/Apache_Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white" alt="Maven" />
  <img src="https://img.shields.io/badge/Visual_Studio_Code-007ACC?style=for-the-badge&logo=visual-studio-code&logoColor=white" alt="VS Code" />
  <img src="https://img.shields.io/badge/Cursor-000000?style=for-the-badge&logo=cursor&logoColor=white" alt="Cursor IDE" />
</div>

<h1 align="center">☕ Spring Framework & Spring Boot - Base Repository</h1>

## ⚙️ Tecnologías utilizadas
- Java 21
- Spring Framework 5
- Spring Boot 3
- Maven
- IDE: Cursor/Visual Studio Code

## 🚀 Ejecución del proyecto
1. Clonar el repositorio:
   ```bash
   git clone https://github.com/EduMoralesCar/SpringFramework-SpringBoot.git
   # Acceder a la ruta
   cd SpringFramework-SpringBoot
   ```
## Pasos de Despliegue

### 1. Limpiar Artefactos Previos (Clean)
Este comando elimina los archivos compilados y generados anteriormente.

**Windows (CMD/PowerShell):**
```cmd
.\mvnw.cmd clean
```

**Linux/Mac:**
```bash
./mvnw clean
```
### 2. Compilar y Empaquetar (Package)
Este comando compila el código, ejecuta pruebas (si las hay) y genera el archivo JAR.

**Windows (CMD/PowerShell):**
```cmd
.\mvnw.cmd package
```

**Linux/Mac:**
```bash
./mvnw package
```

### 3. Instalar en Repositorio Local (Install)
Este comando instala el artefacto compilado en el repositorio Maven local.

**Windows (CMD/PowerShell):**
```cmd
.\mvnw.cmd install
```

**Linux/Mac:**
```bash
./mvnw install
```

---

## Todas las Tareas en Una Sola Línea

Para ejecutar los tres pasos (clean, package, install) en secuencia:

**Windows (CMD/PowerShell):**
```cmd
.\mvnw.cmd clean package install
```

**Linux/Mac:**
```bash
./mvnw clean package install
```

**Con salto de pruebas (más rápido):**
```cmd
.\mvnw.cmd clean package install -DskipTests
```

---

## Ejecución de la Aplicación

### Opción 1: Ejecutar el JAR Generado

Una vez compilado el proyecto, ejecuta:

**Windows (CMD/PowerShell):**
```cmd
java -jar target/AplicationWeb-0.0.1-SNAPSHOT.jar
```

**Linux/Mac:**
```bash
java -jar target/AplicationWeb-0.0.1-SNAPSHOT.jar
```

### Opción 2: Ejecutar Directamente con Maven (Spring Boot Plugin)

**Windows (CMD/PowerShell):**
```cmd
.\mvnw.cmd spring-boot:run
```

**Linux/Mac:**
```bash
./mvnw spring-boot:run
```

---
