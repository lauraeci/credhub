package io.pivotal.security.entity;

import javax.persistence.*;

@Entity
@Table(name = "StringSecret")
@DiscriminatorValue("string_value")
public class NamedStringSecret extends NamedSecret {

  @Column(nullable = false)
  private String value;

  public NamedStringSecret() {
  }

  public NamedStringSecret(String name, String value) {
    super(name);
    this.setValue(value);
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}