package com.example.demo.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vlan {

  private String name;

  private String admin;

  private String operational;

  private String ip;

  private String descript;

}
