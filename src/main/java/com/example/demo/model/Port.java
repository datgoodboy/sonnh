package com.example.demo.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Port {

  private String name;

  private String status;

  private String vlan;

  private String duplex;

  private String speed;

  private String type;
}
