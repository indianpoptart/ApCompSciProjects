package com.apcompsci.StringLab;

public class NameFind{
	   public static void main(String[] args) {
	      String strLong = "Psdjsiwnertnantowsefswvdojnsewdfnmlasdfnvlaksdnfwvantnfwealnvcaewnfotntnaatnawrefvljansdvlknalewknrasdglkmnaeasfjnalvkmnlkvmnlkaemrkvpakmervzanyopnaewrtglkangrlkneanantunawefklantonjnawesfnantnnaweflajnwfnngselkirjhglaerfkajnewrfnanewrtnagjhnalkfvklanewrtnaewrntlajnewrklgjnvklahelrvkanlewrnklanvjaklvlanntonalewrknlakenrlgnalkenrnanaynonaynonanyonanytonaewrgfaerlvkajhertaelrvkhaeh";
	      int intIndex = strLong.indexOf("anton");
	      if(intIndex == - 1){
	         System.out.println("Hello not found");
	      }else{
	         System.out.println("Found anton at index " + intIndex);
	      }
	   }
	}
