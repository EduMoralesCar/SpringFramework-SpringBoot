package com.utp.market.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utp.market.persistence.entity.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}
