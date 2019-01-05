fun main(args: Array<String>){
    for ( x in 1..10){
        println(if(x%2 ==0){
            x
        }else{
            "$x is an odd number"
        });
    }

    for( x in 1..10){
        val str = when(x){
            in 1..5 -> "Small number"
            in 6..10 -> "large number"
            else -> "I don't know this number"
        }
        println("$x is a $str")
    }
}