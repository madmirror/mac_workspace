//
//  ViewController.swift
//  FirstApp
//
//  Created by Yong Wang on 6/3/15.
//  Copyright (c) 2015 Yong Wang. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var myLabel: UILabel!
    
    @IBAction func buttonPressed(sender: UIButton) {
        
        let title = sender.titleForState(.Normal)!
        
        myLabel.text = "you click the \(title)  button"
        
        
        
    }


}

