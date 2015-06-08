package Java;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "cartao")
public class Cartao {
  @Id @GeneratedValue private long id;

}