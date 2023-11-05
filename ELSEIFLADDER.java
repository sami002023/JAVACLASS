 public class ELSEIFLADDER {  
public static void main(String[] args) {  
    int fees = 1200 ;  
      
    if(fees <250){  
        System.out.println("dismissed");  
    }  
    else if(fees>=250 && fees<300){  
        System.out.println("on your way to dismissal");  
    }  
    else if(fees>=300 && fees <400){  
        System.out.println("pay your fees");  
    }  
    else if(fees>=400 && fees<500){  
        System.out.println("You have tried keep paying please");  
    }  
    else if(fees>=500 && fees<700){  
        System.out.println("Thanks for paying but Complete your fees please");  
    }else if(fees>=700 && fees<=1000){  
        System.out.println("Thank you for paying fees we love you !");  
    }else{  
        System.out.println("We adore you ! keep coming to this school! Bring your siblings too");  
    }  
}  
}