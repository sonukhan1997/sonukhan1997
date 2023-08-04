package practiceOnly;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class kgfPractice {
@Test
public void rocky() {
	Reporter.log("kgf is controlled by Rockie");
}@Test(enabled = false)
public void reena() {
	Reporter.log("kgf is controlled by Reena");
}@Test
public void garuda() {
	Reporter.log("kgf is controlled by Garuda");	
}@Test(priority = 2,dependsOnMethods = {"vanaram"})
public void adheera() {
	Reporter.log("kgf is controlled by AdheerA");
}@Test(invocationCount = 5)
public void rajendraDesai() {
	Reporter.log("kgf is controlled by RajendraDesai");
}@Test(priority = 1 , dependsOnMethods = {"vanaram" })
public void mumbaiShetty() {
	Reporter.log("kgf is controlled by MumbaiShetty");
}@Test
public void ramikaSen() {
	Reporter.log("kgf is controlled by RamikaSen");
}@Test(enabled = true)
public void vanaram() {
	Reporter.log("kgf is controlled by Vaanaram");
}
}
