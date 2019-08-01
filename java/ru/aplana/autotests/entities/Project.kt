package ru.aplana.autotests.entities

import lombok.Getter
import lombok.Setter
import javax.persistence.*


@Entity
@Table(name = "project")
class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    var id: Int? = null

    @Column
    @Getter
    @Setter
    var name: String? = null


    @ManyToMany
    @Getter
    @Setter
    @JoinTable(name = "project_user", joinColumns = [JoinColumn(name = "project_id", referencedColumnName = "id")], inverseJoinColumns = arrayOf(JoinColumn(name = "user_id", referencedColumnName = "id")))
    private var user: Set<User>? = null

//    fun getBooks(): Set<Users>? {
//        return users
//    }
//
//    fun setBooks(books: Set<Users>) {
//        this.users = users
//    }

//    Projects()
//
//        @Id
//        private Integer id;
//
//        @Column(name = "name")
//        private String name;
//
//        @Column(name = "last_name")
//        private String lastName;
//
//        public Author() {
//        }
//
//        public Integer getId() {
//            return id;
//        }
//
//        public void setId(Integer id) {
//            this.id = id;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public String getLastName() {
//            return lastName;
//        }
//
//        public void setLastName(String lastName) {
//            this.lastName = lastName;
//        }
//    }


}