package ru.aplana.autotests.entity

import lombok.*
import javax.persistence.*

@NoArgsConstructor @AllArgsConstructor @ToString @Builder
@Entity
@Table(name = "project")
class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null

    @Column
    var name: String? = null


    @ManyToMany
    @JoinTable(name = "project_user",
            joinColumns = arrayOf(JoinColumn(name = "project_id", referencedColumnName = "id")),
            inverseJoinColumns = arrayOf(JoinColumn(name = "user_id", referencedColumnName = "id")))
    var user: Set<User>? = null

}