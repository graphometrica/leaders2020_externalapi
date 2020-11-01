package ai.graphometrica.leaders2020externalapi.entity

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity(name = "wool_type")
class WoolTypeEntity {
    @Id
    var id = UUID.randomUUID().toString()

    @Column
    var name : String? = null
}