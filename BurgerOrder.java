 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastfoodkitchen;

import static fastfoodkitchen.FastFoodKitchen.getnextOrderNum;

/**
 *this class contains methods on how the fast food orders are accumulated
 * @author User-PC
 */
public class BurgerOrder {
    private int numHamburgers = 0;
    private int numCheeseBurgers = 0;
    private int numVeggieBurgers = 0;
    private int numSodas = 0;
    private boolean orderToGO = false;
    private int orderNum = 0;
    
  public  BurgerOrder(int numB, int numC, int numV, int numS, boolean orderT, int orderN){
        numHamburgers = numB;
        numCheeseBurgers = numC;
        numVeggieBurgers = numV;
        numSodas = numS;
        orderToGO = orderT;
        orderNum = orderN;
    }
    //get number of ham burgers
    public int getnumHamBurgers()
{
    return numHamburgers;
}
    //sets the number of ham burgers
    public void setnumHamBurgers(int num)
    {
        if(num < 0) {
            System.out.println("Error");
        }
       else {
            num = numHamburgers;
        } 
    }
    
   //get the number of cheese Burgers
        public int getnumCheeseBurgers()
{
    return numCheeseBurgers;
}
        //set the number of Cheese Burgers
     public void setnumCheeseBurgers(int num)
    {
        if(num < 0) {
            System.out.println("Error");
        }
        else{
            num = numCheeseBurgers;
        } 
    } 
     
     //get the number of veggie burgers
      public int getnumVeggieBurgers()
{
    return numVeggieBurgers;
}
      //set the number of CheeseBurgers
      public void setnumVeggieBurgers(int num)
    {
        if(num < 0) {
            System.out.println("Error");
        }
        else{
            num = numVeggieBurgers;
        } 
    } 
      
      //get the number of sodas 
       public int getnumSodas()
{
    return numSodas;
}
       //set the number of sodas
      public void setnumSodas(int num)
    {
        if(num < 0) {
            System.out.println("Error");
        }
        if (num > 0){
            num = numSodas;
        } 
    }
       //getter for the order 
    public boolean isOrderToGo(){
        return orderToGO;
    }
    //set the order 
    public void setorderToGo(boolean order){
        order = orderToGO; 
    }
    
    //getter for order number
   public int getOrderNum(){  
    return orderNum;
}
   
   //set the order number 
   public void isOrderNum(int num){
       num = orderNum;
   }
   
   public int getBurgerTotal(){
   int total = getnumHamBurgers() + getnumCheeseBurgers()+getnumVeggieBurgers();
   return total;
   }
    @Override
    public String toString() {
        return "BurgerOrder{" + "numHamburgers=" + numHamburgers + ", numCheeseBurgers=" + numCheeseBurgers + ", numVeggieBurgers=" + numVeggieBurgers + ", numSodas=" + numSodas + ", orderToGO=" + orderToGO + ", orderNum=" + orderNum + '}';
    }

   
      
}

