# Spring Framework & Spring Boot

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
