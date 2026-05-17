import app.feature.modules.payment.PaymentInfo
import app.feature.modules.payment.PaymentMethod
import app.feature.modules.services.DateFormatService
import app.feature.modules.services.Services
import app.feature.modules.util.DateFormatUtil
import javax.management.relation.RoleStatus

/*
   How to import package in kotlin programing languages
   import for bring any class, function , object to using in main
   function.
*/

    // the main entry point in kotlin is main function
fun main(){
    // How to call the class
    // create object

    //    var score: Unit = 10u
    //        score = -100u They call unaryMinus
    //
    //        println("Score : $score")
    //        println("Unit : ${Unit}")

    val dateFormatUtil = DateFormatUtil()
    val dateFormatService = DateFormatService()
    val services = Services(
        "Nona",
        21,
        6465,
        'M'
    )
    val paymentMethod = PaymentMethod()
    val paymentInfo = PaymentInfo(
        "Nona",
        21,
        'M',
        5334
    )
    // calling the objects
    dateFormatUtil.showedAllTheDateFormatUtil()
    dateFormatService.showedAllTheDateFormatService()
    services.showedTheInfoOfServices()
    paymentMethod.showedAllThePaymentMethod()
    paymentInfo.showedThePaymentInfo()

       val isBoolean: Boolean = false
        val isCompleted: Boolean = true
        // calling the function
        val attendances = ""
        fun getStudentAttendance(status: Boolean){
           return if (status){
                println("Not Abset")

            }else{
                println("Abset")
           }
        }
//        val attendance = getStudentAttendance(status)
}