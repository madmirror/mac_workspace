//
//  Contact.swift
//  Contact App
//
//  Created by Yong Wang on 6/18/15.
//  Copyright (c) 2015 Yong Wang. All rights reserved.
//

import UIKit

class Contact: NSObject {
    
    var firstName: String
    var lastName: String
    var email: String
    var age: Int
    var milePace: Double
    
   //Initializer
    init(firstName: String, lastName: String, email:String, age: Int, milePace: Double) {
        //set all properties
        
        self.firstName = firstName
        self.lastName = lastName
        self.email = email
        self.age = age
        self.milePace = milePace
        
        super.init()
    }
    
    override var description: String{
        return "first: \(firstName) \(lastName) email: \(email) age:\(age) milePace: \(milePace)"
    }
   
}
