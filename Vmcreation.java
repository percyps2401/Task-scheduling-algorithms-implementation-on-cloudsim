
import java.util.ArrayList;

import java.util.List;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

import org.cloudbus.cloudsim.Cloudlet;
import org.cloudbus.cloudsim.CloudletSchedulerSpaceShared;
import org.cloudbus.cloudsim.CloudletSchedulerTimeShared;
import org.cloudbus.cloudsim.Datacenter;
import org.cloudbus.cloudsim.DatacenterBroker;
import org.cloudbus.cloudsim.DatacenterCharacteristics;
import org.cloudbus.cloudsim.Host;
import org.cloudbus.cloudsim.Log;
import org.cloudbus.cloudsim.Pe;
import org.cloudbus.cloudsim.Storage;
import org.cloudbus.cloudsim.UtilizationModel;
import org.cloudbus.cloudsim.UtilizationModelFull;
import org.cloudbus.cloudsim.Vm;
import org.cloudbus.cloudsim.VmAllocationPolicySimple;
import org.cloudbus.cloudsim.VmSchedulerTimeShared;
import org.cloudbus.cloudsim.core.CloudSim;
import org.cloudbus.cloudsim.provisioners.BwProvisionerSimple;
import org.cloudbus.cloudsim.provisioners.PeProvisionerSimple;
import org.cloudbus.cloudsim.provisioners.RamProvisionerSimple;


public class Vmcreation

{
	private static List<Vm> createVm(int userID, int no)
	{
		
		ArrayList<Vm> vmList = new ArrayList<Vm>();
		int vmid =0; //first vm ki id
		int mips=1000;//har vm ki capacity
		long size =10000;
		int ram =512;
		long bw = 1000;//bandwidth
		int pesNumber =1;//no of cpus you want
		String vmm = "Xen";
		
		Vm[] vm = new Vm[no];
		for(int i=0;i<no;i++)
		{
			vm[i]= new Vm(i,userID,mips,pesNumber,ram , bw,size,vmm, new CloudletSchedulerSpaceShared());
			vmList.add(vm[i]);
		}
		System.out.println("hi");
		return vmList;
		
		
		
	}
	public static void main( String[] args)
	{
		createVm(7,32);
	}
}