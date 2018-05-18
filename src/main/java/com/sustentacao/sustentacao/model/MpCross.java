package com.sustentacao.sustentacao.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "mp_cross")
public class MpCross {

  @EmbeddedId
  private MyKey myKey;

  public void setMyKey(MyKey myKey) {
    this.myKey = myKey;
  }

  public MyKey getMyKey() {
    return myKey;

  }

}
