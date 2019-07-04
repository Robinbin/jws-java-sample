package com.jws.samples.graphql.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Computer {
    String name;
    Cpu cpu;
    List<Memory> memoryList;
}
