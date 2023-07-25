class Order (
    var customer: Customer?,
    var pizzas: List<Pizza>
)

class Customer (
    var name: String,
    var address: Address?
)

class Address (
    var street1: String,
    var street2: String?,
    var city: String,
    var state: String,
    var zip: String
)

class Pizza(
    //...
)

fun main(args: Array<String>) {
    val address = Address(
        "123 Main",
        null,
        "Talkeetna",
        "Alaska",
        "99676"
    )

    // Cliente nao possui endereço
    var customer = Customer("Al", null)
    val order = Order(customer, emptyList<Pizza>())
    println("test1: ${order.customer?.address?.street2}")   //null

    // Cliente possui endereço mas não tem 'street2'
    customer.address = address
    println("test2: ${order.customer?.address?.street2}")   //null

}