//
//  main.swift
//  demo1
//
//  Created by Yong Wang on 6/3/15.
//  Copyright (c) 2015 Yong Wang. All rights reserved.
//

//import Foundation

println("Hello, World!")

func fn(first a:Int, second b:Int){
    println(a,b)
}

fn(first: 2, second: 3);

func fn2(#c:Int, #d:Int){
    println(c+d)
}

fn2(c: 3, d: 4)

func fn3 (#c:Int, d:Int = 4){
    println(c+d)
}

fn3(c: 3)


func fn4 (nums: Int...){
    var sum = 0
    println(nums)
    for i in nums{
        sum+=i
    }
    println(sum);
}

fn4(1,2,3,4,5)

func fn5(nums: Int...) ->(Int) -> Int{
    func inner(b:Int) ->Int{
        var sum=0
        for i in nums{
            sum+=i
        }
        println(sum+b)
        return sum+b
    }
    
    return inner
}

var fnx = fn5(1,2,3,4,5)
println(fnx)
fnx(13)

func addi (a:Int,b:Int)->Int{
    return a+b
}
func addMaker (fni:(Int, Int) -> Int, a:Int, b:Int) -> Int{
    return fni(a,b)
}

var r = addMaker(addi,1,2)
println(r);

