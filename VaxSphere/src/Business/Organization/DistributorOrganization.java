/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 package Business.Organization;

 import Business.Role.DistributorRole;
 import Business.Role.Role;
 import Business.Warehouse.Warehouse;
 import Business.Warehouse.WarehouseDirectory;
 import java.util.ArrayList;
 
 /**
  *
  * @author varun
  */
 public class DistributorOrganization extends Organization{
     
     private WarehouseDirectory warehouseDirectory;
     
     public DistributorOrganization() {
         super(OrganizationType.DistributorOrg.getValue());
         System.out.println("DistributorOrganization 1st");
         warehouseDirectory = new WarehouseDirectory();
         System.out.println("DistributorOrganization initialized, warehouseDirectory created.");
         System.out.println("warehouseDirectory: " + warehouseDirectory.getWarehouseList());
     }
 
     public WarehouseDirectory getWarehouseDir() {
         System.out.println("GET WAREHOUSE");
 //        System.out.println("warehouseDirectory : " + warehouseDirectory.toString();
         return warehouseDirectory;
     }
     
     public WarehouseDirectory initializeDir(){
         if(warehouseDirectory == null){
             return warehouseDirectory = new WarehouseDirectory();
         }else{
             return warehouseDirectory;
         }
         
     }
 
     
     
     
     @Override
     public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roles = new ArrayList<>();
         roles.add(new DistributorRole());
         return roles;
     }
     
 }
 