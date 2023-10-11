package com.example.entity;

import com.example.enums.Status;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "payments")
@Data
@NoArgsConstructor
public class Payment extends BaseEntity{

    private BigDecimal amount;
    private LocalDate createdDate;
    private Status paymentStatus;
    @OneToOne(cascade = CascadeType.ALL)
    private PaymentDetail paymentDetail;

    public Payment(BigDecimal amount, LocalDate createdDate, Status paymentStatus) {
        this.amount = amount;
        this.createdDate = createdDate;
        this.paymentStatus = paymentStatus;
    }
}
