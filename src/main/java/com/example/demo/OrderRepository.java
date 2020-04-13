package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by uengine on 2020. 4. 13..
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
