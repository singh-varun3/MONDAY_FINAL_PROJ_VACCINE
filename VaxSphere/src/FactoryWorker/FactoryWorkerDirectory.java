/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryWorker;

import java.util.ArrayList;

/**
 *
 * @author akshit verma
 */
public class FactoryWorkerDirectory {
    private ArrayList<FactoryWorker> factoryWorker;
    
    public FactoryWorkerDirectory(){
        factoryWorker = new ArrayList();
    }
    
    public void addFactoryWorker(FactoryWorker fw){
        factoryWorker.add(fw);
    }
    
    public void setFactorWorkerList(ArrayList<FactoryWorker> fwd){
        factoryWorker = fwd;
    }
    
    public ArrayList<FactoryWorker> getFactoryWorkerList(){
        return factoryWorker;
    }
    
}
