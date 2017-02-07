//: Playground - noun: a place where people can play

import UIKit

var str = "Hello, playground"

var a = 2
let c = 3
var d:Int

d=5

println("advc\(str)")
/*
Int
String Double Float Bool
*/
func add(a:Int, b:Int) -> Int{
    return a+b
}

add(2,a)

var nums = [2,3,4]

var sum = 0
for sc in nums{
    sum+=sc
}

sum

for(var i=0; i<30; ++i){
    sum+=i
}

sum

var names = [

    "1" : "...",
    "2" : "...2"
]

for(k,v) in names{
    print(k)
}

var sum2 = 0
for i in 0...3{
    sum2+=i;
}
sum2
var cc = true
if cc {sum2++}

sum2

class Car {
    var gas = 10
    func honk (){
        
    }
    
    func setGas(gas:Int){
        self.gas = gas
    }
}

var myCar = Car();
myCar.gas
myCar.setGas(40)
myCar.gas








