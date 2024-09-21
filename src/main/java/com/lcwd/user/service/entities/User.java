package com.lcwd.user.service.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="micro_users")
@Getter
@Setter
public class User {

    @Id
    private String userId;
    @Column(name="firstAndLastName",length = 50)
    private String name;
    private String email;
    private String about;

    //other user properties that you want
}
