package models;

import io.ebean.Model;

import javax.persistence.*;
import java.util.Calendar;

@MappedSuperclass
public class BaseModel extends Model {

    @Id
    public Long id;

}
