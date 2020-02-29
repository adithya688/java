package com.adithya.sample;


import sun.management.Sensor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
  /*  public static void main(String[] args) {

        List<String> students=new ArrayList<>();
        students.add("Pamod");
        students.add("Saman");
        students.add("Sasindu");
        students.add("Sahan");
        students.add("Dilruk");
        System.out.println(students);
        List<String>filtereddata=students.stream().filter(s->s.length()>5).collect(Collectors.toList());
        System.out.println(filtereddata);

*/
  /*com.adithya.sample.sensor com.adithya.sample.sensor=new com.adithya.sample.sensor();
  com.adithya.sample.sensor.setName("main door");
com.adithya.sample.sensor.setValue(32);*/
  List<sensor>sensors=new ArrayList<>();
  sensor sensor1 =new sensor("Living room",28);
  sensors.add(sensor1);
    sensor sensor1 =new sensor("Living room",29);
  sensors.add(sensor1);
    sensor sensor1 =new sensor("Living room",30);
  sensors.add(sensor1);
    sensor sensor1 =new sensor("Living room",28);
  sensors.add(sensor1);
  List<sensor>hotsensors=sensors.stream()
          .filter(sensor -> sensor.getValue()>28)
          .collect(Collectors.toList());
            System.out.Println(hotsensors);

    }



}
