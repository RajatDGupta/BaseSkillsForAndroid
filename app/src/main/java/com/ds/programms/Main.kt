fun main(arr: Array<String>) {
 println(solution(intArrayOf(1, 4, 2, -1, 6, 5)))
}


fun solution(A: IntArray): Int {
    val distinct = mutableSetOf<Int>()
    for (i in A.indices){
        if(A[i]>0)
        distinct.add(A[i])
    }
    var index = 1
    while (true) {
        if (!distinct.contains(index)) {
            return index
        }
        index++
    }
}

