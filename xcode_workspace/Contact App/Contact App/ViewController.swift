//
//  ViewController.swift
//  Contact App
//
//  Created by Yong Wang on 6/17/15.
//  Copyright (c) 2015 Yong Wang. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var firstNameTextField: UITextField!
     @IBOutlet weak var lastNameTextField: UITextField!
    
    @IBOutlet weak var emailTextField: UITextField!
    
    @IBOutlet weak var ageTextField: UITextField!
    
    @IBOutlet weak var milePaceTextField: UITextField!
    
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        
        var contact = Contact(firstName: "Yong", lastName: "Wang", email: "123@gmail.com", age: 18, milePace: 13.2)
        
        println("contact \(contact)")
        
    }
   

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }

    @IBAction func addContactPressed(sender: AnyObject) {
        println("add contact clicked")
        
//        var contact = createContactFromUI()
//        if contact != nil{
//            println("valid contact")
//        }else{
//            println("error")
//        }
        
        if let contact = createContactFromUI(){
            println("valid")
        }else{
            println("error")
        }
        
    }
    
    func createContactFromUI () -> Contact? {
        var contact: Contact? = nil
       
        if !firstNameTextField.text.isEmpty{
           println("checked")
        }else{
            println("firstName empty")
        }
        return contact
    }
}

