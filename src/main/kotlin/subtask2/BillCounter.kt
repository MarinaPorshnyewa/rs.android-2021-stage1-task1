package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val billAnn = bill.filterIndexed{index, item -> index!=k}
        val newBill = billAnn.toIntArray()
        if(newBill.sum()/2 == b)
        {
            return "bon appetit"
        }
        else
        {
            val a = (b - (newBill.sum()/2))
            return a.toString()
        }
    }
}
