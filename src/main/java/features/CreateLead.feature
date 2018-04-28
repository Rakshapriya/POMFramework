Feature: Create a Lead 
@Smoke 
Scenario Outline: Creating a lead with all the mandatory fields

#Given Open the browser
#And loadURL and maximize the browser
#And set timeouts
And enter username as <uName>
And enter password as <pwd>
And click on login button
And click on crmsfa link
And click on leads
And click on create leads
And enter cname as <cname>
And enter fname as <fname>
And enter lname as <lname>
When Click on create lead button
#Then verify lead is created

Examples:
|uName|pwd|cname|fname|lname|
|DemoSalesManager|crmsfa|TestLeaf|Priya|Pri|
|DemoSalesManager|crmsfa|TestLeaf|Priya1|Pri1|


@Sanity
Scenario Outline: Edit Lead

#Given Open the browser
#And loadURL and maximize the browser
#And set timeouts
And enter username as <uName>
And enter password as <pwd>
And click on login button
And click on crmsfa link
And click on leads
And click on Find Leads
And enter fname to find as <fname>
And click on findLeads button
And click first cell
And click on Edit Button
And enter edit fname as <ename>
Then click on EditLead Button

Examples:
|uName|pwd|fname|ename|
|DemoSalesManager|crmsfa|raksha|raksh|
|DemoSalesManager|crmsfa|raksha|raksh|
