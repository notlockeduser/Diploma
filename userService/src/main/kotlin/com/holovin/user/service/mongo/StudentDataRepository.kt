package com.holovin.user.service.mongo

import com.holovin.user.service.domain.mongo.StudentData
import org.springframework.data.mongodb.repository.MongoRepository
import java.util.Optional

interface StudentDataRepository : MongoRepository<StudentData, Any> {

    fun findByEmail(email: String): Optional<StudentData>

    fun findAllByGroup(group: String): List<StudentData>
}
