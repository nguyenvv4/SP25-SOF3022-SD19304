package com.example.sd19304.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Table(name = "hoc_sinh")
@Entity
public class HocSinh {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @NotBlank(message = "ten khong duoc de trong")
    @Column(name = "name")
    private String name;
    @NotNull(message = "tuoi khong duoc de trong")
    @Column(name = "age")
    private Integer age;
    @Column(name = "status")
    private String status;

    @Override
    public String toString() {
        return "HocSinh{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", status='" + status + '\'' +
                '}';
    }
}
