package com.UTP.TpIntegrado.market.persistance;

import com.UTP.TpIntegrado.market.domain.Product;
import com.UTP.TpIntegrado.market.domain.repository.ProductRepository;
import com.UTP.TpIntegrado.market.persistance.crud.ProductoCrudRepository;
import com.UTP.TpIntegrado.market.persistance.entity.Producto;
import com.UTP.TpIntegrado.market.persistance.mapper.ProductMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository implements ProductRepository {

    @Autowired
    private ProductoCrudRepository productoCrudRepository;

    // Variable nueva agregada
    @Autowired
    private ProductMapper mapper;

    // Función actualizada
    @Override
    public List<Product> getAll() {

        List<Producto> productos = (List<Producto>) productoCrudRepository.findAll();

        return mapper.toProducts(productos);
    }

    // Función actualizada
    @Override
    public Optional<List<Product>> getByCategory(int categoryId) {

        List<Producto> productos = productoCrudRepository
                .findByIdCategoriaOrderByNombreAsc(categoryId);

        return Optional.of(mapper.toProducts(productos));
    }

    // Función actualizada
    @Override
    public Optional<List<Product>> getScarseProducts(int quantity) {

        Optional<List<Producto>> productos = productoCrudRepository
                .findByCantidadStockLessThanAndEstado(quantity, true);

        return productos.map(prods -> mapper.toProducts(prods));
    }

    // Función actualizada
    @Override
    public Optional<Product> getProduct(int productId) {

        return productoCrudRepository
                .findById(productId)
                .map(producto -> mapper.toProduct(producto));
    }

    // Función actualizada
    @Override
    public Product save(Product product) {

        Producto producto = mapper.toProducto(product);

        return mapper.toProduct(
                productoCrudRepository.save(producto));
    }

    @Override
    public void delete(int idProducto) {
        productoCrudRepository.deleteById(idProducto);
    }
}