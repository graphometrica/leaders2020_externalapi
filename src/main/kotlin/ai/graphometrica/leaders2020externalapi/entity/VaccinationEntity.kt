package ai.graphometrica.leaders2020externalapi.entity

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity(name = "vaccination")
class VaccinationEntity {
    @Id
    var id = UUID.randomUUID().toString()

    @Column
    var animalId : String? = null

    @Column
    var position : String? = null

    @Column
    var date : Date? = null

    @Column
    var medicationName : String? = null

    @Column
    var serialNumber : String? = null
}