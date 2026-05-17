package app.feature.modules.payment

class PaymentInfo (
    // create properties
    var name: String,
    var age: Int,
    var gender: Char,
    var id: Int,
){
    // create method
    fun showedThePaymentInfo(){
        println("====[Showed The Info]====")
        println("Name : $name")
        println("Age : $age")
        println("Gender :$gender")
        println("ID : $id")
        println("=========================")
    }
}