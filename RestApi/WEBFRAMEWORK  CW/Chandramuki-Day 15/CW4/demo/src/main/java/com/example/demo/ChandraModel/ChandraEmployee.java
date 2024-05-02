package com.example.demo.ChandraModel;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChandraEmployee {
    @Id
    private int employeeId;
    private String name;
    private String position;
    @ManyToOne
    private ChandraCompany company;
}
