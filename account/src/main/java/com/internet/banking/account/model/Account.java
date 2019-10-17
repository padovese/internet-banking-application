package com.internet.banking.account.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Account {

  private short agency;
  @Id private int account;
  private byte checkDigit;
}
