package com.example.sd19304.repository;

import com.example.sd19304.model.HocSinh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HocSinhRepo extends JpaRepository<HocSinh, Integer> {
    // truy vấn csdl
    // thường sẽ viết native query hoặc HQL
}
// interface =>  bề bên ngoài => khong nhin duoc ben trong no xử lý cái gì
// class => nhìn được các hàm nội tại của class
