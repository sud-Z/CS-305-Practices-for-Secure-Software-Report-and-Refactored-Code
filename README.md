# CS-305-Practices-for-Secure-Software-Report-and-Refactored-Code
<h3> Briefly summarize your client, Artemis Financial, and their software requirements. Who was the client? What issue did they want you to address? </h3>

Artemis Financial is a financial consulting company. They wanted to add a file verification step to their digital communications and evaluate the general security of their web application. 

<h3> What did you do particularly well in identifying their software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall wellbeing? </h3>

I would say that I handled the vulnerability report the best. Many of the dependencies that were used in their web  application were very out of date. I recommended that they update their tools to the latest versions to minimize possible vulnerabilities. Coding securely is important as it protects both your own and your customer's data from prying eyes. Good Software Security ensures that a trust exists between you and your customers. Without this trust, many customers may choose to do business with someone else. It is very important to a company's success to avoid data breaches.

<h3> What about the process of working through the vulnerability assessment did you find challenging or helpful? </h3>

I found the dependency check to be very helpful in identifying possible vulnerabilities. Although, because the tools used were so out of date, the sheer amount of vulnerabilities that needed to be sorted through was a bit overwhelming. The ability to suppress false positives made things a bit better. 

<h3> How did you approach the need to increase layers of security? What techniques or strategies would you use in the future to assess vulnerabilities and determine mitigation techniques? </h3>

I added the checksum functionality as they requested and made further recommendations to increase security. In the future, I would first manually review code, then run a dependency check. From there, I would review options for mitigation techniques and implement the best options.

<h3> How did you ensure the code and software application were functional and secure? After refactoring code, how did you check to see whether you introduced new vulnerabilities? </h3>

I ensured that I did not add any new vulnerabilities by running another dependency check to look for any new vulnerabilities. 

<h3> What resources, tools, or coding practices did you employ that you might find helpful in future assignments or tasks? </h3>

The OWASP Dependency Check was the most helpful tool that I used in this project. However, knowing common insecure coding techniques that can leave your user's data is very important. In the future, when using an API or just programming in general. I will be sure to review the best practices for the tools that I am using to ensure that I am not making any silly mistakes. 

<h3> Employers sometimes ask for examples of work that you have successfully completed to demonstrate your skills, knowledge, and experience. What from this particular assignment might you want to showcase to a future employer? </h3>

I would primarily like to showcase my familiarity with the OWASP Dependency Check. Also, depending on the work I would be doing, RESTful systems. 
