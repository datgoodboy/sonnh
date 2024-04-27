package com.example.demo.model;

import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Dashboard {

  private Long cpu;

  private BigDecimal user;

  private BigDecimal system;

  private BigDecimal idle;

  private List<Memory> memories;

  private List<Host> hosts;


}
