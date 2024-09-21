package com.lcwd.user.service.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

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
    @Transient
    private List<Rating> ratings = new ArrayList<>();
}
