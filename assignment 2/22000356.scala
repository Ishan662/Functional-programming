var k,i,j =2 
var m,n = 5
var f = 12.0f
var g = 4.0f
var c = 'X'

def preIncrement(x:Int): Double = {
    val incrementValue = x + 1
    print(incrementValue)
    incrementValue
    
}

def postIncrement(x:Int): Double= {
    print(x)
    val incrementValue = x + 1
    incrementValue
}

def preDecrement(x:Int): Double = {
    val decrementValue = x-1
    print(decrementValue)
    decrementValue
}

def postDecrement(x:Int): Double = {
    print(x)
    val decrementValue = x - 1
    decrementValue
}

var a = 2
var b = 3
var C = 4
var d = 5

def salary(x:Int , y:Int ) : Double = {
    val totalSalary = x*250 + y*40
    val tax = 0.88
    totalSalary*tax
}

def profit(ticketPrice : Int, audience : Int ): Double = {
    var totalAmount = ticketPrice * audience 
    var audienceExpence = audience * 3
    var hallCost = 500
    var totalProfit = totalAmount - (audienceExpence + hallCost)
    totalProfit
}