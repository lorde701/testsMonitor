package ru.aplana.autotests.entity

import lombok.*
import javax.persistence.*

@NoArgsConstructor @AllArgsConstructor @ToString @Builder
@Entity
@Table(name = "user")
class User {

    @Id
    @Getter
    @Setter
    var id: Int? = null

    @Getter
    @Setter
    var name: String? = null

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "user")
    var project: Set<Project>? = null

}