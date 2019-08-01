package ru.aplana.autotests.entities

import lombok.Getter
import lombok.Setter
import javax.persistence.*


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

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "users")
    @Getter
    @Setter
    private var project: Set<Project>? = null

//    fun getUsers(): Set<Project>? {
//        return user
//    }
//
//    fun setUsers(users: Set<Project>) {
//        this.user = users
//    }


}