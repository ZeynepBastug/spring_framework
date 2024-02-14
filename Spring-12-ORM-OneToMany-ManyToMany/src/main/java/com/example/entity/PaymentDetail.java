package com.example.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cglib.core.Local;
import org.springframework.cglib.core.internal.LoadingCache;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "payment_details")
@NoArgsConstructor
public class PaymentDetail extends BaseEntity{

    private BigDecimal commissionAmount;
    private BigDecimal merchantPayoutAmount;
    @Column(columnDefinition = "DATE")
    private LocalDate payout_date;

    @OneToOne(mappedBy = "paymentDetail", cascade = CascadeType.ALL)
//    @JoinColumn(name="payment_id")
    private Payment payment;


    public PaymentDetail(BigDecimal commissionAmount, BigDecimal merchantPayoutAmount, LocalDate payout_date) {
        this.commissionAmount = commissionAmount;
        this.merchantPayoutAmount = merchantPayoutAmount;
        this.payout_date = payout_date;
    }
}
