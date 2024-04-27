package com.example.demo.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Memory {

  private Long memoryTotal;

  private Long user;

  private Long free;

  private Long commited;

}
