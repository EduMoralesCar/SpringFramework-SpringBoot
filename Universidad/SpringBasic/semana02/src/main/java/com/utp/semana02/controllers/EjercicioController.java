package com.utp.semana02.controllers;

import com.utp.semana02.models.Estudiante;
import com.utp.semana02.models.Producto;
import org.springframework.web.bind.annotation.*;

@RestController
public class EjercicioController {

    // Ejercicio 1
    @GetMapping("/saludo")
    public String saludo(@RequestParam(defaultValue = "Mundo") String nombre) {
        return "Hola " + nombre + "!";
    }

    // Ejercicio 2
    @GetMapping("/sumar")
    public String sumar(@RequestParam int a, @RequestParam int b) {
        return "Resultado: " + (a + b);
    }

    // Ejercicio 3
    @GetMapping("/edad-futura/{edad}")
    public String edadFutura(@PathVariable int edad) {
        return "En 5 años tendrás " + (edad + 5) + " años.";
    }

    // Ejercicio 4
    @GetMapping("/fruta")
    public String equipoA(@RequestParam String nombre) {
        return "La fruta " + nombre + " es rica en fibra.";
    }

    // Ejercicio 5
    @GetMapping("/tabla/{numero}")
    public String tabla(@PathVariable int numero) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            sb.append(numero).append(" x ").append(i).append(" = ").append(numero * i).append("\n");
        }
        return sb.toString();
    }

    // Ejercicio 6
    @GetMapping("/producto-info")
    public String productoInfo(@RequestParam String nombre, @RequestParam double precio, @RequestParam int stock) {
        return "Producto: " + nombre + " | Precio: " + precio + " | Stock: " + stock;
    }

    // Ejercicio 7
    @PostMapping("/producto")
    public Producto guardarProducto(@RequestBody Producto producto) {
        return producto;
    }

    // Ejercicio 8
    @PostMapping("/inventario/total")
    public String inventarioTotal(@RequestBody Producto producto) {
        double total = producto.getPrecio() * producto.getStock();
        return "Valor total del inventario: " + total;
    }

    // Ejercicio 9
    @PostMapping("/matricula")
    public String matricular(@RequestParam String curso, @RequestBody Estudiante estudiante) {
        return "El estudiante " + estudiante.getNombre() + " fue matriculado en el curso " + curso + ".";
    }

    // Ejercicio 10
    @PostMapping("/pedido/{id}")
    public String pedidoCompleto(
            @PathVariable int id,
            @RequestParam String cliente,
            @RequestBody Producto producto) {
        return "Pedido " + id + " registrado para " + cliente + " con el producto " + producto.getNombre() + ".";
    }
}