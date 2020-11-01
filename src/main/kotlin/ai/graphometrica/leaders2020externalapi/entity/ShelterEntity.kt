package ai.graphometrica.leaders2020externalapi.entity

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity(name = "shelter")
class ShelterEntity {
    @Id
    var id = UUID.randomUUID().toString()

    @Column
    var name : String? = null

    @Column
    var address : String? = null

    @Column
    var phone : String? = null

    @Column
    var operatingOrganizationId : String? = null

    @Column
    var districtId : String? = null

    @Column
    var bossEmployeeId : String? = null
}