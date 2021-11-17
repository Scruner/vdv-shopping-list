package ru.vdv.vdvshoppinglist.perstst;

import javax.persistence.*;

@Entity
@Table(name = "shopping_items")
public class ShoppingItem {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String nameProduct;

  public ShoppingItem() {}

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNameProduct() {
    return nameProduct;
  }

  public void setNameProduct(String nameProduct) {
    this.nameProduct = nameProduct;
  }
}
