package com.rasacode.carrental.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "date_returned")
    private Date dateReturned;

    @Column(name = "total_price")
    private Double totalPrice;

    //@OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "car_id")
    //private Car car;
}
