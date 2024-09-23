fun main() {
    val phoneBook = mapOf("Alice" to "+1234567890", "Bob" to "+79123456789")
    val countryCode = "+7"
    val filteredContacts = phoneBook.filterValues { it.startsWith(countryCode) }
    println(filteredContacts)
}