package com.maslan.issuemanagement.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class User extends BaseEntity {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    //@JsonIgnore //Bu nesne Json a yazılmayacak ve bu property e dahil edilemyecek demektir
    @Column(name = "uname", unique = true, length = 100)
    private String username;
    @Column(name = "pwd", length = 200)
    private String password;
    @Column(name = "name_surname", length = 200)
    private String nameSurname;
    @Column(name = "email", length = 200)
    private String email;
    @JoinColumn(name = "assignee_user_id")
    @OneToMany(fetch = FetchType.LAZY)
    private List<Issue> issues;

}
