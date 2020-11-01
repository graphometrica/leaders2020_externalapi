package ai.graphometrica.leaders2020externalapi.web

import ai.graphometrica.leaders2020externalapi.entity.AnimalEntity
import ai.graphometrica.leaders2020externalapi.entity.ShelterEntity
import ai.graphometrica.leaders2020externalapi.repository.AnimalRepository
import ai.graphometrica.leaders2020externalapi.repository.ShelterERepository
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Api(
        value = "Animal info api",
        description = "Api for get info about animals"
)
@CrossOrigin
@RestController
@RequestMapping("/api/v1")
class ExternalApiController(
        val animalRepository: AnimalRepository,
        val shelterERepository: ShelterERepository
) {
    @ApiOperation(
            httpMethod = "GET",
            value = "Get info about all animals how ready for leave shelter",
            response = AnimalEntity::class
    )
    @GetMapping("get-soc-animals")
    fun getSocAnimals() : Iterable<AnimalEntity>{
        return animalRepository.findAllByIsSocializedTrue()
    }

    @ApiOperation(
            httpMethod = "GET",
            value = "Get info about all animals",
            response = AnimalEntity::class
    )
    @GetMapping("get-all-animals")
    fun getAllAnimals() : Iterable<AnimalEntity>{
        return animalRepository.findAllByIsSocializedTrue()
    }

    @ApiOperation(
            httpMethod = "GET",
            value = "Get info about all shelters",
            response = ShelterEntity::class
    )
    @GetMapping("get-all-shelters")
    fun getSheltersAnimals() : Iterable<ShelterEntity>{
        return shelterERepository.findAll()
    }
}