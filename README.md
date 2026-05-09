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

## Script Completo de Despliegue y Ejecución

### Windows - Script Completo

Copia y pega lo siguiente en PowerShell o CMD:

```cmd
@echo off
echo ========================================
echo Iniciando despliegue de AplicationWeb
echo ========================================

echo.
echo [PASO 1] Limpiando artefactos previos...
.\mvnw.cmd clean

echo.
echo [PASO 2] Compilando y empaquetando...
.\mvnw.cmd package

echo.
echo [PASO 3] Instalando en repositorio local...
.\mvnw.cmd install

echo.
echo ========================================
echo Despliegue completado exitosamente
echo ========================================

echo.
echo Iniciando aplicación...
java -jar target/AplicationWeb-0.0.1-SNAPSHOT.jar
```

Guarda esto como `deploy-run.bat` en la raíz del proyecto y ejecuta:
```cmd
deploy-run.bat
```

### Windows PowerShell - Script Completo

Copia y pega lo siguiente en PowerShell:

```powershell
Write-Host "========================================" -ForegroundColor Green
Write-Host "Iniciando despliegue de AplicationWeb" -ForegroundColor Green
Write-Host "========================================" -ForegroundColor Green

Write-Host "`n[PASO 1] Limpiando artefactos previos..." -ForegroundColor Cyan
.\mvnw.cmd clean

Write-Host "`n[PASO 2] Compilando y empaquetando..." -ForegroundColor Cyan
.\mvnw.cmd package

Write-Host "`n[PASO 3] Instalando en repositorio local..." -ForegroundColor Cyan
.\mvnw.cmd install

Write-Host "`n========================================" -ForegroundColor Green
Write-Host "Despliegue completado exitosamente" -ForegroundColor Green
Write-Host "========================================" -ForegroundColor Green

Write-Host "`nIniciando aplicación..." -ForegroundColor Yellow
java -jar target/AplicationWeb-0.0.1-SNAPSHOT.jar
```

---
