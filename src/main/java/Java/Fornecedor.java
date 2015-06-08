package Java;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "fornecedor")
public class Fornecedor {
  @Id @GeneratedValue private long id;
  
}