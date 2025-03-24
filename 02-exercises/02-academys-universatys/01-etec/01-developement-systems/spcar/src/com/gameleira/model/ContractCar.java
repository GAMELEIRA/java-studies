package com.gameleira.model;

/**
 * <h1>Contrato de Aluguel de Carro</h1>
 * Classe que representa um contrato de aluguel de um carro,
 * incluindo os custos diários e taxas baseadas na quilometragem percorrida.
 * 
 * @author GABRIEL GAMELEIRA DOS SANTOS
 * @version 1.0
 * @since 24/03/2025
 */
public class ContractCar {

  private Car car;
  private double valueDiary;
  private int quantityDaysOfContract;
  private double taxByKilometersTraveled = 0.20;
  private double valueTotalOfContract = 0.0;

  public ContractCar(Car car, double valueDiary, int quantityDaysOfContract) {
    this.car = car;
    this.valueDiary = valueDiary;
    this.quantityDaysOfContract = quantityDaysOfContract;
  }

  public Car getCar() {
    return car;
  }

  public void setCar(Car car) {
    this.car = car;
  }

  public double getValueDiary() {
    return valueDiary;
  }

  public void setValueDiary(double valueDiary) {
    this.valueDiary = valueDiary;
  }

  public int getQuantityDaysOfContract() {
    return quantityDaysOfContract;
  }

  public void setQuantityDaysOfContract(int quantityDaysOfContract) {
    this.quantityDaysOfContract = quantityDaysOfContract;
  }

  public double getTaxByKilometersTraveled() {
    return taxByKilometersTraveled;
  }

  public double getValueTotalOfContract() {
    this.setValueTotalOfContract();
    return this.valueTotalOfContract;
  }

  private void setValueTotalOfContract() {
    double valueTotalOfTax = this.car.getKilometersTraveled() * this.taxByKilometersTraveled;
    double valueTotalOfDiary = this.valueDiary * this.quantityDaysOfContract;
    this.valueTotalOfContract = valueTotalOfDiary + valueTotalOfTax; 
  }

}
