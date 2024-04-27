package com.example.demo.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LLDP {

  private String localport;

  private String neighborname;

  private Long ttl;

  private String capability;

  private String platform;
}
