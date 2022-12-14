package com.javelin;

import java.io.InputStream;
import java.util.Scanner;

public class Blacksmith {

  private final Scanner scanner;
  private final int rods;

  public Blacksmith(InputStream instructions) {
    this.scanner = new Scanner(instructions);

    // The first line in the instructions defines the number of steel rods.
    this.rods = scanner.nextInt();
  }

  public Javelin create() {
    // The steel rods are listed from the second line onwards.
    Javelin javelin = new Javelin(getSteelRod());
    return extend(javelin);
  }

  private Javelin extend(Javelin javelin) {
    for (int i = 2; i <= rods; i++) {
      javelin.fuse(getSteelRod());
    }

    return javelin;
  }

  private int getSteelRod() {
    return scanner.nextInt();
  }

}
