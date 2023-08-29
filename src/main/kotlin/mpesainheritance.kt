open class MpesaAccount(val phoneNo:String,var balance:Double){
    open fun deposit(amount:Double){
        if (amount>0){
            balance+=amount
            println("Deposited $amount into account $phoneNo. New balance is $balance")

        }else{
            println("Invalid deposit")
        }
    }
    open fun withdraw(amount: Double){
        if (amount>0 && amount<=balance){
            println("Withdraw $amount from account $phoneNo. Balance:$balance")
        }else{
            println("insufficient balance")
        }
    }
}
class checkbalance(phoneNo: String,balance: Double):MpesaAccount(phoneNo,balance){
    fun sendmoney(receiverPhone:String, amount: Double){
        if (amount>0 && amount<=0){
            balance-=amount
            println("Sent $amount to account $receiverPhone. Balane:$balance")
        }else{
            println("insufficient balance")
        }
    }
}

fun main(args: Array<String>) {
    val useraccount=checkbalance("0415541000",124.0)
    val receiveraccount=checkbalance("14510210",1547.5)

    useraccount.deposit(5000.0)
    useraccount.withdraw(12121.5)
    receiveraccount.sendmoney("14510210",50.0)
}
