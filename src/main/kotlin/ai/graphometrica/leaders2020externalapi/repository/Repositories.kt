package ai.graphometrica.leaders2020externalapi.repository


import ai.graphometrica.leaders2020externalapi.entity.*
import org.springframework.data.repository.CrudRepository


interface AnimalRepository : CrudRepository<AnimalEntity, String> {
    fun findAllByIsSocializedTrue() : Iterable<AnimalEntity>
    fun findAllByDistrictId(districtId: String): Iterable<AnimalEntity>
    fun findAllByShelterId(shelterId: String): Iterable<AnimalEntity>
    fun findAllByOperatingOrganizationId(operatingOrganizationId: String): Iterable<AnimalEntity>

}
interface AnimalMovementRepository : CrudRepository<AnimalMovementEntity, String> {}
interface AnimalTypeRepository : CrudRepository<AnimalTypeEntity, String> { fun getByName(name : String) : AnimalTypeEntity }
interface BreedTypeRepository : CrudRepository<BreedTypeEntity, String> { fun getByName(name : String) : BreedTypeEntity }
interface ColorTypeRepository : CrudRepository<ColorTypeEntity, String> { fun getByName(name : String) : ColorTypeEntity }
interface DeathReasonRepository : CrudRepository<DeathReasonEntity, String> { fun getByName(name : String) : DeathReasonEntity }
interface EarTypeRepository : CrudRepository<EarTypeEntity, String> { fun getByName(name : String) : EarTypeEntity }
interface EmployeeERepository : CrudRepository<EmployeeEntity, String> {}
interface EndoparasitesERepository : CrudRepository<EndoparasitesEntity, String> {}
interface EuthanasiaTypesRepository : CrudRepository<EuthanasiaTypesEntity, String> { fun getByName(name : String) : EuthanasiaTypesEntity }
interface GenderTypeRepository : CrudRepository<GenderTypeEntity, String> { fun getByName(name : String) : GenderTypeEntity }
interface HealthCheckRepository : CrudRepository<HealthCheckEntity, String> {}
interface OperatingOrganizationRepository : CrudRepository<OperatingOrganizationEntity, String> { fun getByName(name : String) : OperatingOrganizationEntity }
interface ShelterERepository : CrudRepository<ShelterEntity, String> {fun getByAddress(address: String) : ShelterEntity}
interface ShelterExitRepository : CrudRepository<ShelterExitReasonEntity, String> { fun getByName(name : String) : ShelterExitReasonEntity }
interface TailTypeRepository : CrudRepository<TailTypeEntity, String> { fun getByName(name : String) : TailTypeEntity }
interface VaccinationERepository : CrudRepository<VaccinationEntity, String> {}
interface WoolTypeRepository : CrudRepository<WoolTypeEntity, String> { fun getByName(name : String) : WoolTypeEntity }
interface DistrictRepository : CrudRepository<DistrictEntity, String> { fun getByName(name : String) : DistrictEntity }