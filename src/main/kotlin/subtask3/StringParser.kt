package subtask3

import kotlin.time.measureTime

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {

        val myString = ArrayList<String>()
        for(i in 0..inputString.length-1)
        {
            if(inputString[i]=='(')
            {
                var count = 0
                var s = i+1
                var m = 0
                while (inputString[s]!=')' || m!=0)
                {
                    if(inputString[s] == '(')
                    {
                        m = m + 1
                    }
                    else if(inputString[s] == ')' && m!=0)
                    {
                        m = m-1
                    }
                    count=count+1
                    s = s + 1
                }

                val resultMy = inputString.substring(i+1,i+count+1)
                myString.add(resultMy)
            }
            if(inputString[i]=='[')
            {
                var count = 0
                var s = i+1
                var m = 0
                while (inputString[s]!=']' || m!=0)
                {
                    if(inputString[s] == '[')
                    {
                        m = m + 1
                    }
                    else if(inputString[s] == ']' && m!=0)
                    {
                        m = m-1
                    }
                    count=count+1
                    s = s + 1
                }

                val resultMy2 = inputString.substring(i+1,i+count+1)
                myString.add(resultMy2)
            }
            if(inputString[i]=='<')
            {
                var count = 0
                var s = i + 1
                var m = 0

                while (inputString[s]!='>' || m!=0)
                {
                    if(inputString[s] == '<')
                    {
                        m = m + 1
                    }
                    else if(inputString[s] == '>' && m!=0)
                    {
                        m = m-1
                    }
                    count=count+1
                    s = s + 1
                }

                val resultMy3 = inputString.substring(i+1,i+count+1)
                myString.add(resultMy3)
            }

        }
        return myString.toTypedArray()
    }
}
