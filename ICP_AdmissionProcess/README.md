This is an OOP project to stimulate and admission process, in ibadan city polytechnic.

1. WAEC.java

Here the user is prompted for it grade. <br>
If the user passes the 5 major subjects(courses), without any failed subject, it procede to the UtmeJamb.java,
else user failed and cannot proced to the next point.
<br>

2. UtmeJamb.java
This extend WAEC.java, it build on it. <br>
If the user has 5 credit, this class is activated, which then validates the user grade, which is <br>
aggregate = (Total Jamb Score / 8) + (Utme /2)<br>
if aggreage is over 50% user passed, else failed.
<br>

3. HostelAllocation.java
Upon WAEC, Jamb and UtmeJamb are passed, the user gets to be given an hostel upon admission.<br>
Criteria for hostel allocation is school fee.<br>
If user fees has been paid and hostel allocation, which is then based on gender.<br>
Female student gets a female hostel, vice-versa.

