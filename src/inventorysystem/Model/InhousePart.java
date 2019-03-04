/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorysystem.Model;

/**
 *
 * @author anthonyscary
 */
public class InhousePart extends Part {
    private int machineID;

    /**
     * @return the machineID
     */
    public int getMachineID() {
        return machineID;
    }

    /**
     * @param machineID the machineID to set
     */
    public void setMachineID(int machineID) {
        this.machineID = machineID;
    }
}
