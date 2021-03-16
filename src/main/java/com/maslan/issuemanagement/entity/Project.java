package com.maslan.issuemanagement.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "project")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Project extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "project_code", length = 200, unique = true)
    private String projectCode;

    @Column(name = "project_name", length = 200)
    private String projectName;

    //optinal=true bir porject nesnesi yaratılırken manager_user_id vermesede olur
    //fetch = FetchType.LAZY bu durmda ise getmanager ile çağırıldığında gelir.
    @JoinColumn(name ="manager_user_id" )
    @ManyToOne(fetch = FetchType.LAZY,optional = true)
    private User manager;
}
