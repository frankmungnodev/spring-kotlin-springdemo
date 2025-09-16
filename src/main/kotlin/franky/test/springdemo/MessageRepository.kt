package franky.test.springdemo

import org.springframework.data.repository.CrudRepository

interface MessageRepository : CrudRepository<Message, String>