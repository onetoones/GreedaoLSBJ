package com.example.greedaolsbj;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * @Creation date
 * @name
 * @Class action
 */
@Entity
public class Bean {
    @Id
    private Long id;
private String name;
@Generated(hash = 417670818)
public Bean(Long id, String name) {
    this.id = id;
    this.name = name;
}
@Generated(hash = 80546095)
public Bean() {
}
public Long getId() {
    return this.id;
}
public void setId(Long id) {
    this.id = id;
}
public String getName() {
    return this.name;
}
public void setName(String name) {
    this.name = name;
}

}
