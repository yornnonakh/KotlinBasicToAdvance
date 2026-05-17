package app.feature.modules.services

class Services (
    // create properties using var it can the values
    var name: String,
    var age: Int,
    var id: Int,
    var gender: Char,
){
    // create  method
    fun showedTheInfoOfServices(){
        println("=====[Showed All The Info]=====")
        println("Name : $name")
        println("Age : $age")
        println("ID : $id")
        println("Gender : $gender")
        println("===============================")
    }
}