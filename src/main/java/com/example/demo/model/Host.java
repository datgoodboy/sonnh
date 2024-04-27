package com.example.demo.model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Host {

  private String hostname;

  private String deviceUp;

  private LocalDateTime systemTime;

  private String deviceType;
}
