package Java;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "estacao")
public class Estacao {
  @Id @GeneratedValue private long id;

}