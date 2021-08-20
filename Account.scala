class Account ( id:String , n: Int , b : Double){

    val NIC : String = id
    val accountNumber : Int = n
    var balance : Double = b

    def withdraw( amount : Double ) = this.balance = this.balance - amount

    def deposit ( amount : Double ) = this.balance = this.balance + amount

    def transfer( amount : Double , that : Account ): Unit = {
        this.balance =  this.balance - amount
        that.balance = that.balance + amount
    }


    @Override
    override def toString() : String = "NIC : " + this.NIC + "\n Account Number : " + this.accountNumber + "\n Balance : " + this.balance

}