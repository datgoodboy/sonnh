package com.example.demo.controller;

import com.example.demo.controller.request.LoginRequest;
import com.example.demo.model.User;
import com.example.demo.model.Vlan;
import com.example.demo.service.DashboardService;
import com.example.demo.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/FE")
@RequiredArgsConstructor
@CrossOrigin("*")
public class FakeApiController {

  private final LoginService loginService;
  private final DashboardService dashboardService;

  @PostMapping("/login")
  public ResponseEntity<?> login(@RequestBody LoginRequest request) {
    try {
      User user = loginService.login(request);
      return ResponseEntity.ok("Login success");
    } catch (Exception ex) {
      return ResponseEntity.badRequest().body("Login fail!");
    }
  }

  @GetMapping("/dashboard")
  public ResponseEntity<?> fetchDashboard() {
    return ResponseEntity.ok(dashboardService.init());
  }

  @GetMapping("/LLDP")
  public ResponseEntity<?> fetchLLDP() {
    return ResponseEntity.ok(dashboardService.initLLDP());
  }

  @GetMapping("/monitor/port")
  public ResponseEntity<?> fetchPorts() {
    return ResponseEntity.ok(dashboardService.initPorts());
  }

  @GetMapping("/config/logic/vlan")
  public ResponseEntity<?> fetchVlan() {
    return ResponseEntity.ok(dashboardService.initVlan());
  }

  @PutMapping("/config/logic/vlan")
  public ResponseEntity<?> updateVlan(@RequestBody Vlan vlan) {
    try {
      return ResponseEntity.ok(dashboardService.updateVlan(vlan));
    } catch (Exception ex) {
      return ResponseEntity.badRequest().body(vlan);
    }
  }

  @PostMapping("/config/logic/vlan")
  public ResponseEntity<?> createVlan(@RequestBody Vlan vlan) {
    try {
      return ResponseEntity.ok(dashboardService.create(vlan));
    } catch (Exception ex) {
      return ResponseEntity.badRequest().body(vlan);
    }
  }

  @DeleteMapping("/config/logic/vlan/{id}")
  public ResponseEntity<?> deleteVlan(@PathVariable String id) {
    try {
      dashboardService.deleteVlan(id);
      return ResponseEntity.ok("Delete success!");
    } catch (Exception ex) {
      return ResponseEntity.badRequest().body("Delete fail!");
    }
  }


}
