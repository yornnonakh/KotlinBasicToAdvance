import app.feature.modules.payment.PaymentMethod
import app.feature.modules.services.DateFormatService
import app.feature.modules.services.Services
import app.feature.modules.util.DateFormatUtil

/*
    How to import package in kotlin programing languages
    import for bring any class, function , object to using in main
    function.
 */
fun main(){
    // How to call the class
    // create object

    val dateFormatUtil = DateFormatUtil()
    val dateFormatService = DateFormatService()
    val services = Services(
        "Nona",
        21,
        6465,
        'M'
    )
    val paymentMethod = PaymentMethod()

    // calling the objects
    dateFormatUtil.showedAllTheDateFormatUtil()
    dateFormatService.showedAllTheDateFormatService()
    services.showedTheInfoOfServices()
    paymentMethod.showedAllThePaymentMethod()
}