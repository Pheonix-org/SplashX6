name = template;
description = "";

default = UntitledState2;
    
state UntitledState1 {
    behaviour {    
        
    }
    
    enter {
    
    }
  
    exit {
    
    }
}

state UntitledState2 {
    behaviour { }
}

// Switch based on java predicate.
switch UntitledState1 > UntitledState2 if {  }

// Always switch. Switches back to 1 after executing 2.
switch UntitledState2 > UntitledState1