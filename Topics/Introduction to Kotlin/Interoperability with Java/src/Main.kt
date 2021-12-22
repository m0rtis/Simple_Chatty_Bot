// You can experiment here, it won’t be checked
import kotlinx.serialization.json.JSON

fun main(args: Array<String>) {
    var person: object : Object {
        "firstName": "John",
        "lastName": "Smith",
        "age": 35,
        "phoneNumbers": [
            {
                "type": "mobile",
                "number": "123 567-7890"
            }
        ]
    }
    println(JSON.stringify(person))
}
