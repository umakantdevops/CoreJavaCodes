package com.learning.a2zcj.basic.tasks;

import java.util.Scanner;

public class ElecticityBill {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		float minimumChargeForDomestic=10f;
		float minimumChargeForCommercial=100f;
		float minimumChargeForIndustrial=500f;
		float serviceChargePercentage=5.0f;
		System.out.println("Enter Customer Type :");
		int customerType=sc.nextInt();
		System.out.println("Enter Service ID :");
		String serviceID=sc.next();
		System.out.println("Enter Customer Name :");
		String customerName=sc.next();
		System.out.println("Enter Current reading :");
		int currentReading=sc.nextInt();
		System.out.println("Enter Pre Reading unit : ");
		int prereading=sc.nextInt();
		
		int consumedUnit=ElecticityBill.calculateConsumedUnit(currentReading, prereading);
		float netbill=ElecticityBill.calculateNetBill(consumedUnit, customerType, prereading, currentReading);
		float serviceChargeAmount=ElecticityBill.calculateServiceCharge(netbill, serviceChargePercentage, customerType);
		
		System.out.println("TS / AP Transco");
		switch(customerType)
		{
		case 1:
			System.out.println("Customer Type  :  Domestic");
			break;
		case 2:
			System.out.println("Customer Type  :  Commercial");
			break;
		case 3:
			System.out.println("Customer Type  :  Industrial");
			break;
		default:
			System.out.println("Enter valid consumer type number...!");
		}
		
		System.out.println("Service ID : "+serviceID);
		System.out.println("Customer Name : "+customerName);
		System.out.println("Current Reading : "+currentReading);
		System.out.println("Pre reading : "+prereading);
		System.out.println("Units consumed : "+consumedUnit);
		System.out.println("Net Bill : "+netbill);
		System.out.println("Service Charges : "+serviceChargeAmount);
		
		if(netbill==0)
		{
			switch(customerType)
			{
			case 1:
				System.out.println("Total Bill  :"+(minimumChargeForDomestic+serviceChargeAmount));
				break;
			case 2:
				System.out.println("Total Bill  :"+(minimumChargeForCommercial+serviceChargeAmount));
				break;
			case 3:
				System.out.println("Total Bill  :"+(minimumChargeForIndustrial+serviceChargeAmount));
				break;
			default:
				System.out.println("Enter valid consumer type number...!");
			}
		}else	
		{
		System.out.println("Total Bill  :"+(netbill+serviceChargeAmount));
		}
	}
	
	
	public static float calculateNetBill(int consumedUnit, int consumercode,int pr,int cr)
	{
		float netamount = 0;
		switch(consumercode)
		{
		case 1:
			if(pr==cr)
			{
				return (float) (10.00);
			}
			else
			{
				if(consumedUnit>0 && consumedUnit<50)
				{
					return netamount=49*0;
				}else if(consumedUnit>49 && consumedUnit<100)
				{
					return netamount=(49*0)+((consumedUnit-49)*3);
				}else if (consumedUnit>99 && consumedUnit<500)
				{
					return netamount=(49*0)+(50*3)+((consumedUnit-99)*4);
				}else
				{
					return netamount=(49*0)+(50*3)+(400*4)+((consumedUnit-499)*5);
				}
				
			}
		case 2:
			if(pr==cr)
			{
				return (float) (100.00);
			}
			else
			{
				if(consumedUnit>0 && consumedUnit<50)
				{
					return netamount=49*3;
				}else if(consumedUnit>49 && consumedUnit<100)
				{
					return netamount=(49*3)+((consumedUnit-49)*5);
				}else if (consumedUnit>99 && consumedUnit<500)
				{
					return netamount=(49*3)+(50*5)+((consumedUnit-99)*6);
				}else
				{
					return netamount=(49*3)+(50*5)+(400*6)+((consumedUnit-499)*7);
				}
			}
		case 3:
			if(pr==cr)
			{
				return (float) (500.00);
			}
			else
			{
				if(consumedUnit>0 && consumedUnit<50)
				{
					return netamount=49*4;
				}else if(consumedUnit>49 && consumedUnit<100)
				{
					return netamount=(49*4)+((consumedUnit-49)*6);
				}else if (consumedUnit>99 && consumedUnit<500)
				{
					return netamount=(49*4)+(50*6)+((consumedUnit-99)*7);
				}else
				{
					return netamount=(49*4)+(50*6)+(400*7)+((consumedUnit-499)*8);
				}
			}
		default:
			System.out.println("Enter valid consumer type number...!");
		}
		
		return netamount;
	}
	public static int calculateConsumedUnit(int cr,int pr)
	{
		
		return (cr-pr);
	}

	public static float calculateServiceCharge(float netamount,float serviceChargesInPercentage,int customerCode)
	{
		if(netamount==0)
		{
			switch(customerCode)
			{
			case 1:
				return (serviceChargesInPercentage/100)*10;
				
			case 2:
				return (serviceChargesInPercentage/100)*100;
				
			case 3:
				return (serviceChargesInPercentage/100)*500;
				
			default:
				System.out.println("Enter valid consumer type number...!");
			}
			
		}else {
			return (float) (serviceChargesInPercentage/100)*(netamount);
		}
		return (float) (serviceChargesInPercentage/100)*(netamount);
		
	}
}
