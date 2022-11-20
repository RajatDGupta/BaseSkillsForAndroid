fun main(arr : Array<String>) {
  val inputString="hello"
  var reverseString=""
  for(i in inputString.length-1 downTo 0)  {
     reverseString=reverseString.plus(inputString[i])
  }
    println(reverseString)
}