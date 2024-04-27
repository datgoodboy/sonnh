package com.example.demo.service;

import com.example.demo.data.FakeData;
import com.example.demo.model.Dashboard;
import com.example.demo.model.LLDP;
import com.example.demo.model.Port;
import com.example.demo.model.Vlan;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DashboardService {

  public static List<Vlan> vlans = new ArrayList<>(FakeData.initVlan());
  public List<Dashboard> init() {
    return FakeData.initMemory();
  }

  public List<LLDP> initLLDP() {
    return FakeData.initLLDP();
  }

  public List<Port> initPorts() {
    return FakeData.initPort();
  }

  public List<Vlan> initVlan() {
    return vlans;
  }

  public Vlan updateVlan(Vlan vlan) throws Exception {
    Optional<Vlan> vlanOptional = vlans.stream()
        .filter(item -> item.getIp().equals(vlan.getIp()))
        .findFirst();

    if (vlanOptional.isEmpty()) {
      throw new Exception("vlan not exist!");
    }
    vlanOptional.ifPresent(data -> {
      data.setName(vlan.getName());
      data.setIp(vlan.getIp());
      data.setAdmin(vlan.getAdmin());
      data.setDescript(vlan.getDescript());
      data.setOperational(vlan.getOperational());
    });
    return vlan;
  }


  public Object create(Vlan vlan) throws Exception {
    Optional<Vlan> vlanOptional = vlans.stream()
        .filter(item -> item.getIp().equals(vlan.getIp()))
        .findFirst();
    if (vlanOptional.isPresent()) {
      throw new Exception("vlan existed!");
    }
    vlans.add(vlan);
    return vlan;
  }

  public void deleteVlan(String id) throws Exception {
    Optional<Vlan> vlanOptional = vlans.stream()
        .filter(item -> item.getIp().equals(id))
        .findFirst();
    if (vlanOptional.isEmpty()) {
      throw new Exception("Delete fail!");
    }

    vlans.removeIf(vlan -> vlan.getIp().equals(id));
  }
}
