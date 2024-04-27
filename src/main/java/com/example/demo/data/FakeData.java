package com.example.demo.data;

import com.example.demo.model.*;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class FakeData {

  public static User initUser() {
    return new User("admin", "123456");
  }

  public static List<Dashboard> initMemory() {
    Memory memory = Memory.builder()
        .memoryTotal(771234L)
        .user(2332184l)
        .free(5387272L)
        .commited(300012l)
        .build();

    Host host = Host.builder()
        .hostname("admin")
        .deviceType("SW123")
        .deviceUp("2 days")
        .systemTime(LocalDateTime.now())
        .build();

    Dashboard dashboard = Dashboard.builder()
        .cpu(0l)
        .user(BigDecimal.valueOf(1.5))
        .system(BigDecimal.valueOf(1.4))
        .idle(BigDecimal.valueOf(98.04))
        .memories(Arrays.asList(memory))
        .hosts(Arrays.asList(host))
        .build();

    return Arrays.asList(dashboard);
  }

  public static List<LLDP> initLLDP() {
    return Arrays.asList(
        LLDP.builder()
            .localport("GE2")
            .neighborname("core-sw1")
            .ttl(172l)
            .capability("router switch")
            .platform("linux")
            .build(),
        LLDP.builder()
            .localport("GE3")
            .neighborname("core-sw1")
            .ttl(172l)
            .capability("router switch")
            .platform("linux")
            .build(),
        LLDP.builder()
            .localport("GE4")
            .neighborname("core-sw1")
            .ttl(172l)
            .capability("router switch")
            .platform("linux")
            .build()
    );
  }

  public static List<Port> initPort() {
    return Arrays.asList(
        Port.builder()
            .name("GE1")
            .status("connected")
            .vlan("access")
            .duplex("full")
            .speed("10/10/100")
            .type("10/100/1000base")
            .build(),
        Port.builder()
            .name("GE2")
            .status("connected")
            .vlan("access")
            .duplex("full")
            .speed("10/10/100")
            .type("10/100/1000base")
            .build(),
        Port.builder()
            .name("GE3")
            .status("connected")
            .vlan("access")
            .duplex("full")
            .speed("10/10/100")
            .type("10/100/1000base")
            .build(),
        Port.builder()
            .name("GE4")
            .status("connected")
            .vlan("access")
            .duplex("full")
            .speed("10/10/100")
            .type("10/100/1000base")
            .build()
    );
  }

  public static List<Vlan> initVlan() {
    return Arrays.asList(
        Vlan.builder()
            .name("vlan1")
            .admin("up")
            .operational("enable")
            .ip("10.10.0.186")
            .descript("vlan")
            .build(),
        Vlan.builder()
            .name("vlan2")
            .admin("up")
            .operational("enable")
            .ip("10.10.0.187")
            .descript("vlan")
            .build(),
        Vlan.builder()
            .name("vlan3")
            .admin("up")
            .operational("enable")
            .ip("10.10.0.188")
            .descript("vlan")
            .build(),
        Vlan.builder()
            .name("vlan4")
            .admin("up")
            .operational("enable")
            .ip("10.10.0.189")
            .descript("vlan")
            .build()
    );
  }
}
