/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers.PageController;

import Controllers.Controller;
import GeneralClass.Customer;
import GeneralClass.Pet;
import Model.RecordModel;
import Pages.Records;
import java.util.LinkedList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pongp
 */
public class RecordsController implements Controller {

    private Records record;
    private RecordModel model;

    public RecordsController() {
        record = new Records(this);
        model = new RecordModel();
        this.setRecordTable();
    }
    
    public void setRecordTable(){
        LinkedList<Customer> customers = model.getCustomers();
        JTable table = record.getJTable1();
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel) table.getModel();
        dtm.setRowCount(0);
        for(int i = 0; i < customers.size(); i++){
            dtm.addRow(new Object[]{i+1, customers.get(i).getFirstName() + " " + customers.get(i).getLastName(), customers.get(i).getPhone(), customers.get(i).getPets().size(), customers.get(i), customers.get(i).getID()});
        }
    }
    
    public void addCustomer(String fname, String lname, String phone){
        model.addCustomer(fname, lname, phone);
        this.setRecordTable();
    }
    
    public void delCustomer(int id){
        model.delCustomer(id);
    }

    public void setPetsTable(Customer customer,JTable table){
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        dtm.setRowCount(0);
        LinkedList<Pet> pets = customer.getPets();
        for(int i = 0; i < pets.size(); i++){
            dtm.addRow(new Object[]{pets.get(i).getId(), pets.get(i).getName(), pets.get(i).getWeight(), pets.get(i).getColor(), pets.get(i).getType(), pets.get(i).getSpecies(), pets.get(i).getId()});
        }
    }
    
    public void addPet(Customer customer, String name, double weight, String color, String type, String species){
        model.addPet(customer.getID(), name, weight, color, type, species);
    }
    
    public void delPet(int id){
        model.delPet(id);
    }
    
    public Records getRecord(){
        return this.record;
    }
    
    public RecordModel getModel(){
        return this.model;
    }
    
    @Override
    public Records getLayout() {
        return this.record;
    }
}
