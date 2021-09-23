/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastfoodkitchen;

import java.util.ArrayList;

/**
 *this class shows how the many orders are accumulated and what exactly is in the orders.
 * @author Dennis kimani
 */
public class FastFoodKitchen {

private ArrayList<BurgerOrder> orderList = new ArrayList<BurgerOrder>();
   private static int nextOrderNum = 0;
   
   
   //becauase next order number can only be used and called inside this class
   public static int getnextOrderNum(){
       
   return nextOrderNum;
   }
  // public int getNumOrders(){
  // return getNextOrderNum(
   //}
   
   private static void incrementNextOrderNum(){
   nextOrderNum++;
   }   
   
 public  FastFoodKitchen(){
     
        BurgerOrder order1 = new BurgerOrder(3,5,4,10,false,1);
        BurgerOrder order2 = new BurgerOrder(0,0,3,3,true,2);
        BurgerOrder order3 = new BurgerOrder(1,1,0,2,false,3);
        
       orderList.add(order1);
        
       incrementNextOrderNum();
       getnextOrderNum();
       
       orderList.add(order2);
     //  getnextOrderNum();
       incrementNextOrderNum();
       
       orderList.add(order3);
      // getnextOrderNum();
       incrementNextOrderNum();
   }

   // private BurgerOrder BurgerOrder(int i, int i0, int i1, int i2, boolean b, int i3) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }
    /**
     * 
     * @param ham
     * @param cheese
     * @param veggie
     * @param soda
     * @param toGo
     * @return nextOrderNum
     */
    public int addOrder(int ham, int cheese, int veggie, int soda, boolean toGo){
    BurgerOrder order4;
    order4 = new BurgerOrder(ham,cheese,veggie,soda,toGo,getnextOrderNum());
    orderList.add(order4);
    incrementNextOrderNum();
    return getnextOrderNum();
    }
    /**
     * 
     * @return boolean;
     */
    public boolean cancelLastOrder(){
        if (nextOrderNum > 0){
            orderList.remove(orderList.size()-1);
            nextOrderNum--;
        return true;
        }
        return false;
    }
    /**
     * 
     * @return nextOrderNum
     */
    public int getNumOrdersPending(){
        return nextOrderNum;
    }
    
    public boolean cancelOrder(int orderID){
    for(int i =0; i <orderList.size(); i++){
        if(orderID == orderList.get(i).getOrderNum()){
            orderList.remove(i);
            return true;
        } 
        //return false;
    }  return false;
    }
    /**
     * 
     * @param orderID
     * @return k
     * @return -1
     */
    public int findOrderSeq(int orderID){
     for(int k = 0; k < orderList.size()-1; k++){
        if (orderID == orderList.get(k).getOrderNum())
     {
     return k;
     }
     
    }
     return -1;
    }
    /**
     * 
     * @param orderID
     * @return middle
     * return -1
     */
    public int findOrderBin(int orderID){
    int first = 0;
    int last = orderList.size()-1;
        while (first <= last)
        {
            int middle = (last + first) / 2;
            if(orderID < orderList.get(middle).getOrderNum()){
                last = middle -1;
            }
            else if (orderID > orderList.get(middle).getOrderNum()){
                first = middle + 1;
            }else{
                return middle;
            }
        }
    return -1;
    }
    /**
     * the code is used to sort the arraylist out through selsction one by one
    */
    public void selectionSort()
    {
        for(int i = 0; i < orderList.size()-1; i++)
        {
            int minIndex = i;
            for(int j = i + 1; j < orderList.size(); j++){
                if(orderList.get(j).getBurgerTotal() < orderList.get(minIndex).getBurgerTotal()){
                    minIndex = j;
                }
            }
            BurgerOrder temp = orderList.get(i);
            orderList.set(i, orderList.get(minIndex));
            orderList.set(minIndex, temp);
            
        }
    
    }
    /**
     * the code sorts the arraylist by use of insertion 
     */
    public void insertionSort()
    {
        for(int i = 1; i < orderList.size(); i++){
            //BurgerOrder temp = orderList.get(i);
            int possibleIndex = i;
            while(possibleIndex > 0 && orderList.get(possibleIndex).getBurgerTotal() < orderList.get(possibleIndex-1).getBurgerTotal())
            {
               BurgerOrder temp = orderList.get(possibleIndex);
                // orderList.set(possibleIndex, temp) ;
                 orderList.set(possibleIndex, orderList.get(possibleIndex - 1));
                 orderList.set(possibleIndex -1 , orderList.get(possibleIndex-1));
                 possibleIndex--;
            } 
            //orderList.set(orderList.get(possibleIndex).getBurgerTotal(),temp) ;
        }
    }
    
}

