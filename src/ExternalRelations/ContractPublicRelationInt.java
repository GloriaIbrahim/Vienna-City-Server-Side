/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExternalRelations;

/**
 *
 * @author glori
 */
public interface ContractPublicRelationInt {
    public void createContract(String t,String d,String e,String s,String des);
    public void removeContract(int id);
    public Contract editContract(int id);
}
