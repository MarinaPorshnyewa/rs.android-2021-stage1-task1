package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        val sadArray = sadArray.filterIndexed{index, item -> (index==0 || index==sadArray.lastIndex || item<(sadArray[index-1]+sadArray[index+1]))}
     for(i in 1 until (sadArray.toIntArray().size-1))
     {
         while (sadArray.toIntArray()[i]>(sadArray[i-1]+sadArray[i+1]))
         {
             return convertToHappy(sadArray.toIntArray())
         }
     }
        return sadArray.toIntArray()
    }
}

