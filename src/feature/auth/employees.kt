package feature.auth

// How to create class

class Employees(
    // create properties
    var name: String,
    var age: Int,
    var gender: Char,
    var id: Int,
){
    // create method
    fun showedTheInfoOfEmployees(){
        println("===[Showed The Info]===")
        println("Name : $name")
        println("Age : $age")
        println("Gender : $gender")
        println("ID : $id")
        println("=======================")
    }
}