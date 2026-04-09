# AplicationWeb - Spring Boot Application

## Descripción
AplicationWeb es una aplicación web desarrollada con Spring Boot que proporciona funcionalidades de gestión de usuarios, parámetros y rutas dinámicas.

---

## Despliegue y Ejecución desde Terminal

### Requisitos Previos
- **Java 11+** instalado en el sistema
- **Maven 3.6+** (incluido con Maven Wrapper)
- Terminal o CMD con acceso a la carpeta del proyecto

---

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

## URLs de Prueba

Una vez ejecutada la aplicación, accede a las siguientes rutas:

| Ruta | Descripción |
|------|-------------|
| `http://localhost:8080/` | Página principal |
| `http://localhost:8080/list` | Lista de usuarios |
| `http://localhost:8080/user` | Formulario de usuario |
| `http://localhost:8080/details` | Detalles del usuario |

---

## Comandos Útiles

### Ver versión de Java
```cmd
java --version
```

### Ver versión de Maven
```cmd
.\mvnw.cmd --version
```

### Limpiar sin empaquetar (solo eliminar target/)
```cmd
.\mvnw.cmd clean
```

### Compilar sin pruebas (más rápido)
```cmd
.\mvnw.cmd compile -DskipTests
```

### Ejecutar solo las pruebas
```cmd
.\mvnw.cmd test
```

### Ver dependencias del proyecto
```cmd
.\mvnw.cmd dependency:tree
```

---

## Solución de Problemas

### Error: "mvnw.cmd no se encuentra"
Verifica que estés en la carpeta raíz del proyecto donde se encuentra el archivo `mvnw.cmd`.

### Error: "Java no se encuentra"
Asegúrate de tener Java instalado y configurado en las variables de entorno (PATH).

### Puerto 8080 ya está en uso
Puedes cambiar el puerto en `application.properties`:
```properties
server.port=8081
```

---

## Información del Proyecto

- **Nombre:** AplicationWeb
- **Versión:** 0.0.1-SNAPSHOT
- **Framework:** Spring Boot 4.0.3
- **Java Mínimo:** 11
- **Build Tool:** Maven

---

