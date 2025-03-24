package com.gameleira.model;

/**
 * <h1>Classe Carro</h1>
 * Representa um carro com modelo e quilometragem percorrida.
 * 
 * @author GABRIEL GAMELEIRA DOS SANTOS
 * @version 1.0
 * @since 24/03/2025
 */
public class Car {
  
  private String model;
  private double kilometersTraveled;
  
  public Car(String model, double kilometersTraveled) {
    this.model = model;
    this.kilometersTraveled = kilometersTraveled;
  }
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }
  public double getKilometersTraveled() {
    return kilometersTraveled;
  }
  public void setKilometersTraveled(double kilometersTraveled) {
    this.kilometersTraveled = kilometersTraveled;
  }

  @Override
  public String toString() {
    return "Car [model=" + model + ", kilometersTraveled=" + kilometersTraveled + "]";
  }

}
