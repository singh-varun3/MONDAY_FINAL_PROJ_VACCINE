/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 package Business.Warehouse;

 import java.util.ArrayList;
 
 /**
  *
  * @author varun
  */
 public class WarehouseDirectory {
     
     private ArrayList<Warehouse> warehouseList;
 
     public WarehouseDirectory() {
         System.out.println("WarehouseDirectory 1st");
         warehouseList = new ArrayList<Warehouse>();
         System.out.println("WarehouseDirectory 2nd");
     }
 
     public ArrayList<Warehouse> getWarehouseList() {
         return warehouseList;
     }
     
     public Warehouse addNewWareHouse(){
         
         Warehouse warehouse = new Warehouse();
         System.out.println("LINE 30 : " + warehouseList.toString());
         warehouseList.add(warehouse);
         return warehouse;
     }
     
     public void initializeList(){
         warehouseList = new ArrayList<Warehouse>();
     }
     
     public void removeWarehouse(Warehouse warehouse){
         
         warehouseList.remove(warehouse);
     }
 
 //    @Override
 //    public String toString() {
 //        return "WarehouseDirectory{" + "warehouseList=" + warehouseList.toString() + '}';
 //    }
     
     
 }
 