package com.example.sd19304.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @NotNull(message = "Khong duoc de trong id")
    // "" khong the paser thanh Integer duoc nen khong dung notblank duoc
    private Integer id;
    @NotBlank(message = "Khong duoc de trong tên")
    private String name;
    @NotNull(message = "Khong duoc de trong tuoi")
    private Integer age;
//    @NotBlank(message = "Khong duoc de trong dia chi")
    private String address;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
