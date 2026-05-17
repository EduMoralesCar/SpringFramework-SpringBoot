<div align="center">
  <img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white" alt="Spring Boot" />
  <img src="https://img.shields.io/badge/Java_21-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java 21" />
  <img src="https://img.shields.io/badge/Apache_Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white" alt="Maven" />
  <img src="https://img.shields.io/badge/Visual_Studio_Code-007ACC?style=for-the-badge&logo=visual-studio-code&logoColor=white" alt="VS Code" />
  <img src="https://img.shields.io/badge/IntelliJ_IDEA-000000?style=for-the-badge&logo=intellijidea&logoColor=white" alt="IntelliJ IDEA" />
  <img src="https://img.shields.io/badge/Antigravity-4285F4?style=for-the-badge&logo=google&logoColor=white" alt="Antigravity IDE" />
</div>

<h1 align="center">☕ Spring Framework & Spring Boot</h1>

<p align="center">
  Estructura base, configuración y ciclo de vida de empaquetado para aplicaciones utilizando el ecosistema de Spring y Java moderno.
</p>

---

## 🌟 Sobre el Proyecto

Este repositorio centraliza las configuraciones iniciales, herramientas de automatización de construcción (**Maven Wrapper**) y comandos esenciales para el ciclo de vida de desarrollo en aplicaciones Spring. Está diseñado como plantilla inicial para garantizar un flujo de trabajo unificado en entornos locales y pipelines de desarrollo.

## ⚙️ Tecnologías Utilizadas

- **Lenguaje:** Java 21
- **Framework Core:** Spring Framework 6
- **Ecosistema:** Spring Boot 3
- **Gestor de Dependencias:** Apache Maven (vía `mvnw`)
- **IDEs Recomendados:** Cursor / Visual Studio Code

---

## 🚀 Despliegue Local (Paso a Paso)

Sigue estas instrucciones para clonar, compilar y ejecutar el proyecto en tu máquina utilizando el **Maven Wrapper** incluido (no necesitas tener Maven instalado globalmente).

### 1. Clonar el Repositorio
```bash
git clone [https://github.com/EduMoralesCar/SpringFramework-SpringBoot.git](https://github.com/EduMoralesCar/SpringFramework-SpringBoot.git)
cd SpringFramework-SpringBoot
```

### 2. Ciclo de Construcción y Gestión de Artefactos

#### 🧼 Paso A: Limpiar Artefactos Previos (Clean)
Elimina el directorio `target` y todos los archivos compilados en ejecuciones anteriores.

**Windows (CMD/PowerShell):**
```cmd
.\mvnw.cmd clean
```

**Linux/Mac:**
```bash
./mvnw clean
```

#### 📦 Paso B: Compilar y Empaquetar (Package)
Compila el código fuente, ejecuta las pruebas unitarias y genera el archivo comprimido ejecutable (`.jar`) en la carpeta `target`.

**Windows (CMD/PowerShell):**
```cmd
.\mvnw.cmd package
```

**Linux/Mac:**
```bash
./mvnw package
```

#### 📥 Paso C: Instalar en Repositorio Local (Install)
Empaqueta el proyecto y lo copia en tu repositorio local `.m2` para que pueda ser utilizado como dependencia por otros proyectos locales.

**Windows (CMD/PowerShell):**
```cmd
.\mvnw.cmd install
```

**Linux/Mac:**
```bash
./mvnw install
```

---

## ⚡ Todas las Tareas en Una Sola Línea

Para ejecutar los tres pasos (`clean`, `package`, `install`) en secuencia de forma rápida:

**Windows (CMD/PowerShell):**
```cmd
.\mvnw.cmd clean package install
```

**Linux/Mac:**
```bash
./mvnw clean package install
```

🚀 **Con salto de pruebas (Ejecución más rápida):**

**Windows (CMD/PowerShell):**
```cmd
.\mvnw.cmd clean package install -DskipTests
```

**Linux/Mac:**
```bash
./mvnw clean package install -DskipTests
```

---

## 🏃‍♂️ Ejecución de la Aplicación

Una vez que el proyecto se haya construido correctamente, puedes levantar el servidor de desarrollo mediante cualquiera de las siguientes dos opciones:

### Opción 1: Ejecutar el archivo JAR generado
Ideal para simular el comportamiento de producción.

**Windows (CMD/PowerShell):**
```cmd
java -jar target/AplicationWeb-0.0.1-SNAPSHOT.jar
```

**Linux/Mac:**
```bash
java -jar target/AplicationWeb-0.0.1-SNAPSHOT.jar
```

### Opción 2: Ejecutar directamente con Maven (Spring Boot Plugin)
Ideal para desarrollo en tiempo real con recarga en caliente.

**Windows (CMD/PowerShell):**
```cmd
.\mvnw.cmd spring-boot:run
```

**Linux/Mac:**
```bash
./mvnw spring-boot:run
```
